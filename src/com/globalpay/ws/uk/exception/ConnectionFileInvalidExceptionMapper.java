package com.globalpay.ws.uk.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.globalpay.ws.uk.beans.ErrorCode;
import com.globalpay.ws.uk.beans.UpdateMerchantResponse;

@Provider
public class ConnectionFileInvalidExceptionMapper implements
		ExceptionMapper<ConnectionFileInvalidException> {

	@Override
	public Response toResponse(ConnectionFileInvalidException arg0) {
		UpdateMerchantResponse merchantResponse = new UpdateMerchantResponse();
		merchantResponse.setCode(ErrorCode.ERROR_CONNECTION_FILE_INVALID
				.getError());
		merchantResponse.setDescription(arg0.getMessage());
		return Response.status(Status.BAD_REQUEST).entity(merchantResponse)
				.build();
	}

}
