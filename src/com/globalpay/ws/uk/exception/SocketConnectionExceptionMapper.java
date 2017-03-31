package com.globalpay.ws.uk.exception;

import java.net.SocketException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.hamcrest.core.IsNot;
import org.springframework.beans.factory.annotation.Autowired;

import com.globalpay.ws.uk.beans.ErrorCode;
import com.globalpay.ws.uk.beans.UpdateMerchantResponse;
import com.globalpay.ws.uk.util.Utility;

@Provider
public class SocketConnectionExceptionMapper implements
		ExceptionMapper<SocketException> {

	@Context
	private HttpServletRequest request;

	@Override
	public Response toResponse(SocketException arg0) {
		UpdateMerchantResponse merchantResponse = new UpdateMerchantResponse();
		merchantResponse.setCode(ErrorCode.ERROR_SOCKET_CONNECTION.getError());
		merchantResponse.setDescription(arg0.getMessage());
		String requestID = (String) request.getAttribute("requestId");
		if (Utility.isNotNullOrEmpty(requestID)) {
			System.out.println("request id - " + requestID);
			merchantResponse.setRequestID(requestID);
		}
		return Response.status(Status.BAD_REQUEST).entity(merchantResponse)
				.build();
	}

}
