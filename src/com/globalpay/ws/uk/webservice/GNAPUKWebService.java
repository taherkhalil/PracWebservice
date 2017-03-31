package com.globalpay.ws.uk.webservice;

import java.net.SocketException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.csl.globalpay.ipm.msgprdfreply.MsgPRDFReply;
import com.globalpay.ws.uk.beans.Address;
import com.globalpay.ws.uk.beans.Name;
import com.globalpay.ws.uk.beans.PhoneNumber;
import com.globalpay.ws.uk.beans.UpdateMerchantInfo;
import com.globalpay.ws.uk.beans.UpdateMerchantResponse;
import com.globalpay.ws.uk.dao.B24interface;
import com.globalpay.ws.uk.dto.AddressDTO;
import com.globalpay.ws.uk.dto.NameDTO;
import com.globalpay.ws.uk.dto.PhoneNumberDTO;
import com.globalpay.ws.uk.dto.MerchantInfoDTO;
import com.globalpay.ws.uk.dto.StatusDetailsDTO;
import com.globalpay.ws.uk.exception.ConnectionFailedException;
import com.globalpay.ws.uk.exception.ConnectionFileInvalidException;
import com.globalpay.ws.uk.exception.InvalidRequestException;
import com.globalpay.ws.uk.exception.MandatoryFieldNotFoundException;
import com.globalpay.ws.uk.exception.NoBufferSpaceException;
import com.globalpay.ws.uk.exception.NoCBSpaceException;
import com.globalpay.ws.uk.exception.NoIOBufSpaceException;
import com.globalpay.ws.uk.exception.NoIOCBSpaceException;
import com.globalpay.ws.uk.exception.NoIOPhysMemException;
import com.globalpay.ws.uk.exception.NoPhysMemException;
import com.globalpay.ws.uk.exception.NoPoolSpaceException;
import com.globalpay.ws.uk.exception.RetailerFileException;
import com.globalpay.ws.uk.exception.RetailerNotFoundException;
import com.globalpay.ws.uk.exception.StatusTimeoutException;
import com.globalpay.ws.uk.service.GNAPService;
import com.globalpay.ws.uk.util.Constant;
import com.globalpay.ws.uk.util.Utility;

@Path("/merchant")
public class GNAPUKWebService {

	final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(GNAPUKWebService.class);

	// final static Logger logger = Logger.getLogger(GNAPUKWebService.class);

	@Autowired
	GNAPService gnapService;

	@Context
	private HttpServletRequest request;

	@GET
	public String hello() {
		logger.debug("GNAPUKWebService updateMerchantInfo method started");
		return "Hello Merchant";
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateMerchantInfo(UpdateMerchantInfo updateMerchantInfo)
			throws ConnectionFailedException, SocketException,
			RetailerNotFoundException, MandatoryFieldNotFoundException,
			InvalidRequestException, ConnectionFileInvalidException,
			NoBufferSpaceException, NoCBSpaceException, NoIOBufSpaceException,
			NoIOCBSpaceException, NoIOPhysMemException, NoPhysMemException,
			NoPoolSpaceException, StatusTimeoutException,
			RetailerFileException, Exception {

		logger.debug("GNAPUKWebService updateMerchantInfo method started");

		UpdateMerchantResponse merchantResponse = new UpdateMerchantResponse();
		/**
		 * As discussed with Neela, Except for the mandatory field ie MID,
		 * everything should be optional. So you can get null value for any of
		 * the fields.So not validating request(below method is commented).
		 */
		// boolean flag = Utility.validateRequest(updateMerchantInfo
		// .getMerchantInfo());

		/**
		 * As discussed with Neela, For tech fields/ logging requirement, we
		 * will pass the requestId, userId, correlation id.. you should not have
		 * any check on these, but just log these fields in your logs
		 * (irrespective of whether they are populated or not), and send back in
		 * response.
		 */
		String requestID = updateMerchantInfo.getRequestId();
		String userID = updateMerchantInfo.getUserId();
		// String correlationID = updateMerchantInfo.getCorrelationId();

		// if (requestID != null) {
		merchantResponse.setRequestID(requestID);
		request.setAttribute(Constant.REQUEST_ID.getConstantValue(), requestID);
		logger.info("Request Id : " + requestID);
		// }
		// if (userID != null) {
		merchantResponse.setUserId(userID);
		request.setAttribute(Constant.USER_ID.getConstantValue(), userID);
		logger.info("User Id : " + userID);
		// }
		
		String validatedMerchant = Utility.validateMerchant(updateMerchantInfo
				.getMerchantInfo().getMerchantId());

		updateMerchantInfo.getMerchantInfo().setMerchantId(validatedMerchant);
		// if (flag) {
		MerchantInfoDTO merchantDTO = Utility.mapDTO(updateMerchantInfo);
		// merchantDTO.setMerchantId(validatedMerchant);

		MsgPRDFReply prdfReply2 = null;
		if (merchantDTO != null) {

			

			StatusDetailsDTO statusDetails = gnapService
					.updateMerchantInfo(merchantDTO);
			merchantResponse.setCode(statusDetails.getCode());
			merchantResponse.setDescription(statusDetails.getDescription());

		}
		
		logger.debug("GNAPUKWebService updateMerchantInfo method end");
		return Response.status(200).entity(merchantResponse).build();
	}
}
