package com.punenightlife.dto;

import lombok.Value;

@Value
public class ApiResponse {
	 public Boolean success;
	 public String message;
	
	
	public ApiResponse(Boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}