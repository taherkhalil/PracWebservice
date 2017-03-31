package com.globalpay.ws.uk.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.csl.globalpay.ipm.msgprdfreply.MsgPRDFReply;
import com.csl.globalpay.ipm.msgprdfreq.MsgPRDFReq;
import com.globalpay.ws.uk.beans.StatusCode;
import com.globalpay.ws.uk.dao.B24interface;
import com.globalpay.ws.uk.dto.AddressDTO;
import com.globalpay.ws.uk.dto.MerchantInfoDTO;
import com.globalpay.ws.uk.dto.NameDTO;
import com.globalpay.ws.uk.dto.PhoneNumberDTO;
import com.globalpay.ws.uk.dto.StatusDetailsDTO;
import com.globalpay.ws.uk.util.Constant;
import com.globalpay.ws.uk.util.ObjectMapper;
import com.globalpay.ws.uk.util.Utility;

@Service("gnapService")
public class GNAPService {
	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(GNAPService.class);

	public StatusDetailsDTO updateMerchantInfo(MerchantInfoDTO merchantDTO)
			throws Exception {
		logger.debug("GNAPService updateMerchantInfo method started");
		B24interface b24interface = new B24interface();
		StatusDetailsDTO statusDetails = new StatusDetailsDTO();

		// try {

		MsgPRDFReply prdfReply = b24interface.ReadPRDFRecord(merchantDTO
				.getMerchantId());
		MsgPRDFReply prdfReply2 = null;
		if (prdfReply != null) {
			logger.debug("--------------Readig PRDF records-----------");
			logger.debug("prdfReply add1 object : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getAddr());
			logger.debug("prdfReply add2 object : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getAddrExt());
			logger.debug("prdfReply city object : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getCity());
			logger.debug("prdfReply cntry object : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getCntry());
			logger.debug("prdfReply zip object : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getPostalCde());
			logger.debug("prdfReply state object : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getSt());

			logger.debug("prdfReply before setting name object : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getName());
			logger.debug("prdfReply phone object : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getPhone());

			Short errorCode = prdfReply.getMsgprdf().getMsgHeader()
					.getErrStatus().getErrCde();
			// statusDetails.setCode(errorCode);
			// statusDetails.setDescription(prdfReply.getMsgprdf()
			// .getMsgHeader().getErrTxt());
			// statusDetails.setTranCde(prdfReply.getMsgprdf().getMsgHeader()
			// .getTranCde());
			// }

			if (StatusCode.STATUS_SUCCESS.getStatusCode() == errorCode) {
				MsgPRDFReq prdfReq = copyPRDFReplyToReq(prdfReply);

				prdfReq = processB24Req(merchantDTO, prdfReq);

				if (prdfReq != null) {
					prdfReply2 = b24interface.updatePRDFRecord(prdfReq);

					if (prdfReply2 != null) {

						if (StatusCode.STATUS_SUCCESS.getStatusCode() == errorCode) {

							logger.debug("--------------Update PRDF records-----------");
							logger.debug("prdfReply2 add1 object : "
									+ prdfReply2.getMsgprdf().getRecImage()
											.getPrdfRecImage().getRetailer()
											.getAddr());
							logger.debug("prdfReply2 add2 object : "
									+ prdfReply2.getMsgprdf().getRecImage()
											.getPrdfRecImage().getRetailer()
											.getAddrExt());
							logger.debug("prdfReply2 city object : "
									+ prdfReply2.getMsgprdf().getRecImage()
											.getPrdfRecImage().getRetailer()
											.getCity());
							logger.debug("prdfReply2 cntry object : "
									+ prdfReply2.getMsgprdf().getRecImage()
											.getPrdfRecImage().getRetailer()
											.getCntry());
							logger.debug("prdfReply2 zip object : "
									+ prdfReply2.getMsgprdf().getRecImage()
											.getPrdfRecImage().getRetailer()
											.getPostalCde());
							logger.debug("prdfReply2 state object : "
									+ prdfReply2.getMsgprdf().getRecImage()
											.getPrdfRecImage().getRetailer()
											.getSt());

							logger.debug("prdfReply2 before setting name object : "
									+ prdfReply2.getMsgprdf().getRecImage()
											.getPrdfRecImage().getRetailer()
											.getName());
							logger.debug("prdfReply2 phone object : "
									+ prdfReply2.getMsgprdf().getRecImage()
											.getPrdfRecImage().getRetailer()
											.getPhone());

							Short updateCode = prdfReply2.getMsgprdf()
									.getMsgHeader().getErrStatus().getErrCde();

							statusDetails.setCode(updateCode);
							statusDetails
									.setDescription("Retailer is successfully updated");
							// statusDetails.setTranCde(prdfReply.getMsgprdf()
							// .getMsgHeader().getTranCde());
						}
					} else {
						throw new Exception(prdfReply.getMsgprdf()
								.getMsgHeader().getErrTxt());
					}
				}
			}

		}
		logger.debug("update Merchant info method end");

		return statusDetails;
	}

	private MsgPRDFReq processB24Req(MerchantInfoDTO merchantDTO,
			MsgPRDFReq prdfReq) {

		logger.debug("processB24XMLReq method start");
		// String merchantID = merchantDTO.getMerchantId();
		List<AddressDTO> addressList = merchantDTO.getAddresses();
		List<NameDTO> namesList = merchantDTO.getNames();
		List<PhoneNumberDTO> phoneNumberList = merchantDTO.getPhoneNumbers();

		// boolean merchantFlag = isNotNullOrEmpty(merchantID);
		// if (merchantFlag) {
		// // flag = true;
		// }
		if (prdfReq != null) {

			if (Utility.validateString(merchantDTO.getMerchantId()).length() > 0) {
				prdfReq.getMsgprdf().getRecImage().getPrdfRecImage().getRkey()
						.setRetailerId(merchantDTO.getMerchantId());

			}
			if (addressList != null && addressList.size() > 0) {
				AddressDTO dbaAddress = addressList.get(0);
				if (Constant.DBA_ADDRESS.getConstantValue().equalsIgnoreCase(
						dbaAddress.getFieldType().trim())) {

					if (Utility.validateString(dbaAddress.getAddress1())
							.length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setAddr(dbaAddress.getAddress1());
					}
					if (Utility.validateString(dbaAddress.getAddress2())
							.length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setAddrExt(dbaAddress.getAddress2());
					}
					if (Utility.validateString(dbaAddress.getCity()).length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().setCity(dbaAddress.getCity());

					}

					if (Utility.validateString(dbaAddress.getCountry())
							.length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setCntry(dbaAddress.getCountry());
					}

					if (Utility.validateString(dbaAddress.getZip()).length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setPostalCde(dbaAddress.getZip());
					}

					if (Utility.validateString(dbaAddress.getState()).length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().setSt(dbaAddress.getState());
					}
				}
			}
			if (namesList != null && namesList.size() > 0) {

				NameDTO dbaName = namesList.get(0);
				if (Constant.DBA_NAME.getConstantValue().equalsIgnoreCase(
						dbaName.getFieldType().trim())) {

					if (Utility.validateString(dbaName.getName()).length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().setName(dbaName.getName());
					}
				}
			}
			if (phoneNumberList != null && phoneNumberList.size() > 0) {
				PhoneNumberDTO dbaPhoneNumber = phoneNumberList.get(0);
				if (Constant.DBA_PHONE_NUMBER.getConstantValue()
						.equalsIgnoreCase(dbaPhoneNumber.getFieldType().trim())) {
					if (Utility.validateString(dbaPhoneNumber.getPhoneNumber())
							.length() > 0) {
						prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer()
								.setPhone(dbaPhoneNumber.getPhoneNumber());
					}
				}
			}

			logger.debug("copyreq00 : "
					+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getAcct().getAcctNum());

		}
		/**
		 * In Current Scenario, We only have one record for each of above
		 * fields. So, If I will use iterator then last value will always
		 * overwrite before values .
		 */

		// Iterator<DBAAddressDTO> itAdd = addressList.iterator();
		//
		// while (itAdd.hasNext()) {
		// // DBAAddressDTO dbaAddress = (DBAAddressDTO) itAdd.next();
		// // if (isNotNullOrEmpty(dbaAddress.getAddress1())
		// // && isNotNullOrEmpty(dbaAddress.getAddress2())
		// // && isNotNullOrEmpty(dbaAddress.getCity())
		// // && isNotNullOrEmpty(dbaAddress.getCountry())
		// // && isNotNullOrEmpty(dbaAddress.getZip())) {
		// // // flag = true;
		// // }
		// // As discussed with Neela, Attention and address3 field is not in
		// // GNAP . But for consistency map them to blank.
		// dbaAddress.getAddress3();
		// dbaAddress.getAttention();
		// }

		// Iterator<DBANameDTO> itName = namesList.iterator();
		//
		// while (itName.hasNext()) {
		// DBANameDTO dbaName = (DBANameDTO) itName.next();
		// // if (isNotNullOrEmpty(dbaName.getName())) {
		// // // flag = true;
		// // }
		// }

		// Iterator<DBAPhoneNumberDTO> itPhnNum = phoneNumberList.iterator();
		//
		// while (itPhnNum.hasNext()) {
		// DBAPhoneNumberDTO dbaPhoneNumber = (DBAPhoneNumberDTO) itPhnNum
		// .next();
		// // if (isNotNullOrEmpty(dbaPhoneNumber.getPhoneNumber())) {
		// // flag = true;
		// // }
		// }

		return prdfReq;
	}

	private MsgPRDFReq copyPRDFReplyToReq(MsgPRDFReply prdfReply) {
		MsgPRDFReq prdfRequest = null;
		logger.debug("copy PRDF reply object to PRDF request object");

		if (prdfReply != null) {
			logger.debug("replyacctNbr121 : "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getAcct().getAcctNum());
			prdfRequest = ObjectMapper.map(prdfReply, MsgPRDFReq.class);

			if (prdfRequest != null) {

				/**
				 * While updating the PRDF records we are facing problem, ACCT
				 * NUM is also getting updated with empty values So Chris
				 * suggested to put accnt nmbr value in panImage Char array
				 * 
				 */
				String accntNbr = prdfReply.getMsgprdf().getRecImage()
						.getPrdfRecImage().getRetailer().getAcct().getAcctNum();

				if (Utility.validateString(accntNbr).length() > 0) {
					String[] panImageCharArray = prdfReply.getMsgprdf()
							.getRecImage().getPanImage().getPanImageChar();
					// String[] panImageCharArray = new String[25];

					char[] accntNbrArray = accntNbr.toCharArray();
					for (int j = 0; j < accntNbrArray.length; j++) {
						panImageCharArray[j] = "" + accntNbrArray[j];
					}
					for (int i = 0; i < panImageCharArray.length; i++) {
						logger.debug(i
								+ " panImageCharArray "
								+ prdfReply.getMsgprdf().getRecImage()
										.getPanImage().getPanImageChar(i));
					}
					prdfRequest.getMsgprdf().getRecImage().getPanImage()
							.setPanImageChar(panImageCharArray);

				}

				for (int i = 0; i <= 2; i++) {

					short ltTran = prdfReply.getMsgprdf().getRecImage()
							.getPrdfRecImage().getLastTran().getLtTimestamp(i);

					prdfRequest.getMsgprdf().getRecImage().getPrdfRecImage()
							.getLastTran().setLtTimestamp(i, ltTran);

				}

				for (int i = 0; i <= 2; i++) {

					short fmTran = prdfReply.getMsgprdf().getRecImage()
							.getPrdfRecImage().getLastFm2().getFmTimestamp(i);

					prdfRequest.getMsgprdf().getRecImage().getPrdfRecImage()
							.getLastFm2().setFmTimestamp(i, fmTran);

				}

				// SRVINFODATA
				for (int i = 0; i <= 1290 - 1; i++) {

					String srvInfo = prdfReply.getMsgprdf().getRecImage()
							.getPrdfRecImage().getSrvInfo().getSrvInfoData(i);
					prdfRequest.getMsgprdf().getRecImage().getPrdfRecImage()
							.getSrvInfo().setSrvInfoData(i, srvInfo);

				}

				for (int i = 0; i <= 15 - 1; i++) {

					com.csl.globalpay.ipm.msgprdfreply.msgprdf.WsService1 wsService1 = prdfReply
							.getMsgprdf().getRecImage().getWsService()
							.getWsService1(i);
					com.csl.globalpay.ipm.msgprdfreq.msgprdf.WsService1 svcReq = ObjectMapper
							.map(wsService1,
									com.csl.globalpay.ipm.msgprdfreq.msgprdf.WsService1.class);
					prdfRequest.getMsgprdf().getRecImage().getWsService()
							.setWsService1(i, svcReq);
				}

				for (int i = 0; i <= 15 - 1; i++) {

					com.csl.globalpay.ipm.msgprdfreply.msgprdf.WsService2 wsService2 = prdfReply
							.getMsgprdf().getRecImage().getWsService()
							.getWsService2(i);
					com.csl.globalpay.ipm.msgprdfreq.msgprdf.WsService2 svcReq = ObjectMapper
							.map(wsService2,
									com.csl.globalpay.ipm.msgprdfreq.msgprdf.WsService2.class);
					prdfRequest.getMsgprdf().getRecImage().getWsService()
							.setWsService2(i, svcReq);

				}
			}

		}
		return prdfRequest;
	}
	
}
