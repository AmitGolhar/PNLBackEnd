package com.punenightlife.dto;

import lombok.Data;

@Data
public class OrderRequest {
	private long ID;
	private String customerName;
	private String email;
	private String phoneNumber;
	private String amount;
	
	
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "OrderRequest [ID=" + ID + ", customerName=" + customerName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", amount=" + amount + "]";
	}
	
	
	
	
	
}