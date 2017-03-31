package com.globalpay.ws.uk.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import com.globalpay.ws.uk.beans.ErrorCode;
import com.globalpay.ws.uk.beans.UpdateMerchantResponse;

public class InvalidRequestExceptionMapper implements
		ExceptionMapper<InvalidRequestException> {

	@Override
	public Response toResponse(InvalidRequestException arg0) {
		UpdateMerchantResponse merchantResponse = new UpdateMerchantResponse();
		merchantResponse.setCode(ErrorCode.ERROR_PARM_INVALID.getError());
		merchantResponse.setDescription(arg0.getMessage());
		return Response.status(Status.BAD_REQUEST).entity(merchantResponse)
				.build();
	}

}
