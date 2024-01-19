package com.punenightlife.controllers;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
 

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/v1")
public class PaymentController {
	
	@Autowired
	private Environment env;
	
	@RequestMapping(value = {"/payment"}, method = RequestMethod.GET)
	public String payment(Model model){
	    model.addAttribute("rzp_key_id", env.getProperty("rzp_key_id"));
	    model.addAttribute("rzp_currency", env.getProperty("rzp_currency"));
	    model.addAttribute("rzp_company_name", env.getProperty("rzp_company_name"));
	    return "users/payment";
	}
	
	@GetMapping("/payment/createOrderId/{amount}")
	@ResponseBody
	public String createPaymentOrderId(@PathVariable String amount) {
	    String orderId=null;
	    try {
	        RazorpayClient razorpay = new RazorpayClient(env.getProperty("rzp_key_id"), env.getProperty("rzp_key_secret"));
	        JSONObject orderRequest = new JSONObject();
	        orderRequest.put("amount", amount); // amount in the smallest currency unit
	        orderRequest.put("currency", env.getProperty("rzp_currency"));
	        orderRequest.put("receipt", "order_rcptid_11");

	        Order order = razorpay.orders.create(orderRequest);
	        orderId = order.get("id");
	    } catch (RazorpayException e) {
	        // Handle Exception
	        System.out.println(e.getMessage());
	    }
	    return orderId;
	}
}
