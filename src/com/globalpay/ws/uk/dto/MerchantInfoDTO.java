package com.globalpay.ws.uk.dto;

import java.util.List;

public class MerchantInfoDTO {

	private String merchantId;

	private List<PhoneNumberDTO> phoneNumbers;
	private List<NameDTO> names;
	private List<AddressDTO> addresses;

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<PhoneNumberDTO> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<NameDTO> getNames() {
		return names;
	}

	public void setNames(List<NameDTO> names) {
		this.names = names;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

}
