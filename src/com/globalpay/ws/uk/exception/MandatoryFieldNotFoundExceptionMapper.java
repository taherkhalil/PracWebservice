package com.globalpay.ws.uk.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import com.globalpay.ws.uk.beans.ErrorCode;
import com.globalpay.ws.uk.beans.UpdateMerchantResponse;

public class MandatoryFieldNotFoundExceptionMapper implements
		ExceptionMapper<MandatoryFieldNotFoundException> {

	@Override
	public Response toResponse(MandatoryFieldNotFoundException arg0) {
		UpdateMerchantResponse merchantResponse = new UpdateMerchantResponse();
		merchantResponse.setCode(ErrorCode.ERROR_MANDATORY_FIELD_MISSING
				.getError());
		merchantResponse.setDescription(arg0.getMessage());
		return Response.status(Status.BAD_REQUEST).entity(merchantResponse)
				.build();
	}

}
