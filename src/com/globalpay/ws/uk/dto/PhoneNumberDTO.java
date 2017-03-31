package com.globalpay.ws.uk.dto;


public class PhoneNumberDTO {
	private String phoneNumber;
	private String fieldType;

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public PhoneNumberDTO() {
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
