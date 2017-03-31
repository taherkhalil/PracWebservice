package com.globalpay.ws.uk.beans;

public enum ConnectionTypes {
	CONNECTIONTYPE_SCCGP("sccgp"), CONNECTIONTYPE_MCCGP("mccgp");

	private String connectionType;

	ConnectionTypes(String ot) {
		connectionType = ot;
	}

	public String getConnectionType() {
		return connectionType;
	}

}
