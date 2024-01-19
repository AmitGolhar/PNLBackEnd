package com.punenightlife.controllers;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.punenightlife.config.RazorPayClientConfig;
import com.punenightlife.dto.ApiResponse;
import com.punenightlife.dto.OrderRequest;
import com.punenightlife.dto.OrderResponse;
import com.punenightlife.dto.PaymentResponse;
import com.razorpay.Order;
import com.punenightlife.services.OrderService;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;


@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1")
public class OrderController {

	private RazorpayClient client;

	private RazorPayClientConfig razorPayClientConfig;

	@Autowired
	private OrderService orderService;

	@Autowired
	public OrderController(RazorPayClientConfig razorpayClientConfig) throws RazorpayException {
		this.razorPayClientConfig = razorpayClientConfig;
		this.client = new RazorpayClient(razorpayClientConfig.getKey(), razorpayClientConfig.getSecret());
	}

	@PostMapping("/order")
	public ResponseEntity<?> createOrder(@RequestBody OrderRequest orderRequest ) {
		
		System.out.println("OrdeRequest:" + orderRequest);
		OrderResponse razorPay = null;
		try {
			// The transaction amount is expressed in the currency subunit, such
			// as paise (in case of INR)
			String amountInPaise = convertRupeeToPaise(orderRequest.getAmount());
			// Create an order in RazorPay and get the order id
			Order order = createRazorPayOrder(amountInPaise);
			System.out.println("order:" + order);
			razorPay = getOrderResponse((String) order.get("id"), amountInPaise);
			System.out.println("RozarpayID:" + razorPay.getRazorpayOrderId());
			// Save order in the database
			orderService.saveOrder(razorPay.getRazorpayOrderId(), orderRequest.getID());
		} catch (RazorpayException e) {
			//log.error("Exception while create payment order", e);
			return new ResponseEntity<>(new ApiResponse(false, "Error while create payment order: " + e.getMessage()), HttpStatus.EXPECTATION_FAILED);
		}
		return ResponseEntity.ok(razorPay);
	}

	@PutMapping("/order")
	public ResponseEntity<?> updateOrder(@RequestBody PaymentResponse paymentResponse) {
		String errorMsg = orderService.validateAndUpdateOrder(paymentResponse.getRazorpayOrderId(), paymentResponse.getRazorpayPaymentId(), paymentResponse.getRazorpaySignature(),
				"l5ZAJovDfIoIyJgRj7wDOROf");
		if (errorMsg != null) {
			return new ResponseEntity<>(new ApiResponse(false, errorMsg), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok(new ApiResponse(true, paymentResponse.getRazorpayPaymentId()));
	}

	private OrderResponse getOrderResponse(String orderId, String amountInPaise) {
		OrderResponse razorPay = new OrderResponse();
		razorPay.setApplicationFee(amountInPaise);
		razorPay.setRazorpayOrderId(orderId);
		razorPay.setSecretKey(razorPayClientConfig.getKey());
		return razorPay;
	}

	private Order createRazorPayOrder(String amount) throws RazorpayException {
		
 
		
		RazorpayClient razorpay = new RazorpayClient("rzp_live_0qDEWiqjtWStZh", "l5ZAJovDfIoIyJgRj7wDOROf");

		JSONObject orderRequest = new JSONObject();
		orderRequest.put("amount", amount); // amount in the smallest currency unit
		orderRequest.put("currency", "INR");
		orderRequest.put("receipt", "Guest List Booking Order");
		
		Order order = razorpay.orders.create(orderRequest);
		return order;
		 
		
	}

	private String convertRupeeToPaise(String paise) {
		BigDecimal b = new BigDecimal(paise);
		BigDecimal value = b.multiply(new BigDecimal("100"));
		return value.setScale(0, RoundingMode.UP).toString();
	}
}