package com.zosh.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	
	public String getMessage() {
		return message;
	}
	public ApiResponse() {
		super();
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	private String message;
	private boolean status;
	public ApiResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	

}
