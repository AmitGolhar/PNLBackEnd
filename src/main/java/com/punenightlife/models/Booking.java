package com.punenightlife.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest_list1")
public class Booking {

	@Id
	int userID;
	
	@Column(name = "bookingID")
	private int bookingID;
	

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

	@Column(name = "date")
	private String date;

	@Column(name = "guestListClsoingTime")
	private String guestListClsoingTime;

	@Column(name = "punchStatus")
	private String punchStatus;

	@Column(name = "bookingStatus")
	private String bookingStatus;

	@Column(name = "razorpay_order_id")
	private String razorpay_order_id;
 
	

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
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

	public String getRazorpay_order_id() {
		return razorpay_order_id;
	}

	public void setRazorpay_order_id(String razorpay_order_id) {
		this.razorpay_order_id = razorpay_order_id;
	}
	
	

 

	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", userID=" + userID + ", guest1Name=" + guest1Name + ", guest2Name="
				+ guest2Name + ", bookingType=" + bookingType + ", clubName=" + clubName + ", email=" + email
				+ ", date=" + date + ", guestListClsoingTime=" + guestListClsoingTime + ", punchStatus=" + punchStatus
				+ ", bookingStatus=" + bookingStatus + ", razorpay_order_id=" + razorpay_order_id + "]";
	}

}
