package com.punenightlife.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest_list")
public class AddTOGuestList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingID;

	@Column(name = "clubID")
	String clubID;

	@Column(name = "guest1Name")
	String guest1Name;

	@Column(name = "guest2Name")
	String guest2Name;

	@Column(name = "bookingType")
	String bookingType;

	@Column(name = "clubName")
	String clubName;

	@Column(name = "email")
	private String email;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;

	@Column(name = "date")
	private String date;

	@Column(name = "guestListClsoingTime")
	private String guestListClsoingTime;

	@Column(name = "punchStatus")
	private String punchStatus;

	@Column(name = "bookingStatus")
	private String bookingStatus;

	@Column(name = "userID")
	int userID;

	@Column(name = "razorpay_order_id")
	private String razorpay_order_id;

	@Column(name = "razorpay_payment_id")
	private String razorpay_payment_id;

	@Column(name = "razorpay_signature")
	private String razorpay_signature;

	@Column(name = "status_code")
	private String status_code;

	@Column(name = "remember")
	private String remember;
	
	@Column(name = "offers")
	private String offers;
	
	public AddTOGuestList() {
		super();
		// TODO Auto-generated constructor stub
	}

 

	public AddTOGuestList(int bookingID, String clubID, String guest1Name, String guest2Name, String bookingType,
			String clubName, String email, String latitude, String longitude, String date, String guestListClsoingTime,
			String punchStatus, String bookingStatus, int userID, String razorpay_order_id, String razorpay_payment_id,
			String razorpay_signature, String status_code, String remember, String offers) {
		super();
		this.bookingID = bookingID;
		this.clubID = clubID;
		this.guest1Name = guest1Name;
		this.guest2Name = guest2Name;
		this.bookingType = bookingType;
		this.clubName = clubName;
		this.email = email;
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.guestListClsoingTime = guestListClsoingTime;
		this.punchStatus = punchStatus;
		this.bookingStatus = bookingStatus;
		this.userID = userID;
		this.razorpay_order_id = razorpay_order_id;
		this.razorpay_payment_id = razorpay_payment_id;
		this.razorpay_signature = razorpay_signature;
		this.status_code = status_code;
		this.remember = remember;
		this.offers = offers;
	}



	public String getRemember() {
		return remember;
	}



	public void setRemember(String remember) {
		this.remember = remember;
	}



	public String getOffers() {
		return offers;
	}



	public void setOffers(String offers) {
		this.offers = offers;
	}



	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public String getClubID() {
		return clubID;
	}

	public void setClubID(String clubID) {
		this.clubID = clubID;
	}

	public String getGuest1Name() {
		return guest1Name;
	}

	public void setGuest1Name(String guest1Name) {
		this.guest1Name = guest1Name;
	}

	public String getGuest2Name() {
		return guest2Name;
	}

	public void setGuest2Name(String guest2Name) {
		this.guest2Name = guest2Name;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getGuestListClsoingTime() {
		return guestListClsoingTime;
	}

	public void setGuestListClsoingTime(String guestListClsoingTime) {
		this.guestListClsoingTime = guestListClsoingTime;
	}

	public String getPunchStatus() {
		return punchStatus;
	}

	public void setPunchStatus(String punchStatus) {
		this.punchStatus = punchStatus;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getRazorpay_order_id() {
		return razorpay_order_id;
	}

	public void setRazorpay_order_id(String razorpay_order_id) {
		this.razorpay_order_id = razorpay_order_id;
	}

	public String getRazorpay_payment_id() {
		return razorpay_payment_id;
	}

	public void setRazorpay_payment_id(String razorpay_payment_id) {
		this.razorpay_payment_id = razorpay_payment_id;
	}

	public String getRazorpay_signature() {
		return razorpay_signature;
	}

	public void setRazorpay_signature(String razorpay_signature) {
		this.razorpay_signature = razorpay_signature;
	}

	public String getStatus_code() {
		return status_code;
	}

	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

}
