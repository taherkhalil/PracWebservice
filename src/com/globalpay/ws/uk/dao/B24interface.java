package com.globalpay.ws.uk.dao;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.URL;

import org.slf4j.LoggerFactory;

import com.comforte.csl.cslapi.CSLConnection;
import com.comforte.csl.cslapi.CSLException;
import com.comforte.csl.cslapi.CSLSession;
import com.comforte.csl.service.ServiceException;
import com.csl.globalpay.ipm.SvcPRDF_UK_1111;
import com.csl.globalpay.ipm.msgprdfreply.MsgPRDFReply;
import com.csl.globalpay.ipm.msgprdfreq.MsgPRDFReq;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.ErrStatus;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.LastFm;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.MsgHeader;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.Msgprdf;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.PrdfRecImage;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.RecImage;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.Rkey;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.UserData;
import com.globalpay.ws.uk.beans.ConnectionTypes;
import com.globalpay.ws.uk.beans.MsgHeaderInfo;
import com.globalpay.ws.uk.beans.StatusCode;
import com.globalpay.ws.uk.exception.ConnectionFailedException;
import com.globalpay.ws.uk.exception.ConnectionFileInvalidException;
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
import com.globalpay.ws.uk.parsed.beans.BASE24;
import com.globalpay.ws.uk.parsed.beans.CurrentConnection;
import com.globalpay.ws.uk.util.Constant;
import com.globalpay.ws.uk.util.Utility;

public class B24interface {

	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(B24interface.class);

	
	private static CSLConnection connect = null;
	private static MsgHeaderInfo msgHeader = new MsgHeaderInfo();

	private static CSLConnection getConnectionInstance()
			throws ConnectionFileInvalidException, ConnectionFailedException {
		logger.debug("B24interface getConnectionInstance method started");

		try {
			String currentConnection = readCurrentConnection();
			// if (currentConnection != null
			// && currentConnection.trim().length() > 0) {

			String connectionFile = getConnectionFile(currentConnection);
			logger.debug("B24interface trying to connect to CSL");
			connect = new CSLConnection(connectionFile);

			logger.info("Succesfully estabilished connection with  "
					+ currentConnection);
			
		} catch (CSLException e) {

			logger.error("Connection failed : " + e.getMessage());
			throw new ConnectionFailedException("Connection failed : "
					+ e.getMessage());
		}
		logger.debug("B24interface getConnectionInstance method end");
		return connect;
	}

	private static String readCurrentConnection()
			throws ConnectionFileInvalidException {
		logger.debug("B24interface readCurrentConnection method started");

		InputStream in = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("/CurrentConnection.xml");
	

		CurrentConnection currentConnection = Utility.parseRecord(in,
				CurrentConnection.class);


		if (currentConnection != null && currentConnection.getCurrent() != null
				&& currentConnection.getCurrent().trim().length() > 0) {
			logger.info("Current connection is "
					+ currentConnection.getCurrent());
			logger.debug("B24interface readCurrentConnection method end");
			return currentConnection.getCurrent();
		} else {
			throw new ConnectionFileInvalidException(
					"The connection file contains an invalid connection option - '"
							+ currentConnection
							+ "', valid options are sccgp and mccgp.");
		}

	}

	private static String getConnectionFile(String currentConnection) {
		logger.debug("B24interface getConnectionFile method started");
		String connectionFile = "";
	
		InputStream msgHdr = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("/MsgHeader.xml");
		BASE24 base24 = Utility.parseRecord(msgHdr, BASE24.class);

		try {
			if (msgHdr != null)
				msgHdr.close();
			logger.info("Inputstream closed successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (ConnectionTypes.CONNECTIONTYPE_SCCGP.getConnectionType()
				.equalsIgnoreCase(currentConnection)) {
			logger.info("The connection file contains connection option - '"
					+ currentConnection + "'");
			URL url = Thread.currentThread().getContextClassLoader()
					.getResource("/sccgp.INI");
			connectionFile = url.getPath();
			
			BASE24.MSGHEADER.SCCGP sccgp = base24.getMSGHEADER().getSCCGP();

			msgHeader.setBrch(Utility.validateString(sccgp.getBRCH()));
			logger.info("SCCGP BRNCH ---> "+sccgp.getBRCH());
			msgHeader.setErrcde(new Integer(sccgp.getERRCDE()).shortValue());
			msgHeader.setErrsubcde(new Integer(sccgp.getERRSUBCDE())
					.shortValue());
			msgHeader.setFiid(Utility.validateString(sccgp.getFIID()));
			msgHeader.setFrmtcde(Utility.validateString(String.valueOf(sccgp
					.getFRMTCDE())));
			msgHeader
					.setLconfname(Utility.validateString(sccgp.getLCONFNAME()));
			msgHeader.setLn(Utility.validateString(sccgp.getLN()));
			msgHeader
					.setOmfaudit(new Integer(sccgp.getOMFAUDIT()).shortValue());
			msgHeader.setPathmon(Utility.validateString(sccgp.getPATHMON()));
			msgHeader
					.setPinserver(Utility.validateString(sccgp.getPINSERVER()));
			msgHeader
					.setPtdserver(Utility.validateString(sccgp.getPTDSERVER()));
			msgHeader
					.setRdfserver(Utility.validateString(sccgp.getRDFSERVER()));
			msgHeader.setRegn(Utility.validateString(sccgp.getREGN()));
			msgHeader.setReplcde(sccgp.getREPLCDE());
			msgHeader.setSiteprodind(sccgp.getSITEPRODIND());
			logger.info("sccgp SITEPRODIND() ---> "+sccgp.getSITEPRODIND());
			msgHeader.setTermid(Utility.validateString(sccgp.getTERMID()));
			msgHeader.setUsergrp(new Integer(sccgp.getUSERGRP()).shortValue());
			msgHeader.setUsernum(sccgp.getUSERNUM());
			msgHeader.setSystem(Utility.validateString(sccgp.getSYSTEM()));

		} else if (ConnectionTypes.CONNECTIONTYPE_MCCGP.getConnectionType()
				.equalsIgnoreCase(currentConnection)) {

			logger.info("The connection file contains connection option - '"
					+ currentConnection + "'");
			URL url = Thread.currentThread().getContextClassLoader()
					.getResource("/mccgp.INI");
			connectionFile = url.getPath();

			BASE24.MSGHEADER.MCCGP mccgp = base24.getMSGHEADER().getMCCGP();

			msgHeader.setBrch(Utility.validateString(mccgp.getBRCH()));
			msgHeader.setErrcde(new Integer(mccgp.getERRCDE()).shortValue());
			msgHeader.setErrsubcde(new Integer(mccgp.getERRSUBCDE())
					.shortValue());
			msgHeader.setFiid(Utility.validateString(mccgp.getFIID()));
			msgHeader.setFrmtcde(Utility.validateString(String.valueOf(mccgp
					.getFRMTCDE())));
			msgHeader
					.setLconfname(Utility.validateString(mccgp.getLCONFNAME()));
			msgHeader.setLn(Utility.validateString(mccgp.getLN()));
			msgHeader
					.setOmfaudit(new Integer(mccgp.getOMFAUDIT()).shortValue());
			msgHeader.setPathmon(Utility.validateString(mccgp.getPATHMON()));
			msgHeader
					.setPinserver(Utility.validateString(mccgp.getPINSERVER()));
			msgHeader
					.setPtdserver(Utility.validateString(mccgp.getPTDSERVER()));
			msgHeader
					.setRdfserver(Utility.validateString(mccgp.getRDFSERVER()));
			msgHeader.setRegn(Utility.validateString(mccgp.getREGN()));
			msgHeader.setReplcde(mccgp.getREPLCDE());
			msgHeader.setSiteprodind(mccgp.getSITEPRODIND());
			msgHeader.setTermid(Utility.validateString(mccgp.getTERMID()));
			msgHeader.setUsergrp(new Integer(mccgp.getUSERGRP()).shortValue());
			msgHeader.setUsernum(mccgp.getUSERNUM());
			msgHeader.setSystem(Utility.validateString(mccgp.getSYSTEM()));

		} else {
			logger.info("The connection file contains an invalid connection option - '"
					+ currentConnection
					+ "', valid options are sccgp and mccgp.");
		}
		logger.debug("The Connection File path is : " + connectionFile);
		logger.debug("B24interface getConnectionFile method end");
		return connectionFile;
	}



	/***
	 * 
	 * 
	 * 
	 * 
	 * @param merchantId
	 * @return
	 * @throws ConnectionFailedException
	 * @throws SocketException
	 * @throws RetailerNotFoundException
	 * @throws ConnectionFileInvalidException
	 * @throws NoBufferSpaceException
	 * @throws NoCBSpaceExceptionconnect
	 * @throws NoIOBufSpaceException
	 * @throws NoIOCBSpaceException
	 * @throws NoIOPhysMemException
	 * @throws NoPhysMemException
	 * @throws NoPoolSpaceException
	 * @throws StatusTimeoutException
	 * @throws RetailerFileException
	 */
	public MsgPRDFReply ReadPRDFRecord(String merchantId)
			throws ConnectionFailedException, SocketException,
			RetailerNotFoundException, ConnectionFileInvalidException,
			NoBufferSpaceException, NoCBSpaceException, NoIOBufSpaceException,
			NoIOCBSpaceException, NoIOPhysMemException, NoPhysMemException,
			NoPoolSpaceException, StatusTimeoutException, RetailerFileException {

		logger.debug("B24Interface ReadPRDFRecord  method start  ");
		logger.debug("gnapuk456");
		CSLSession session = null;
		MsgPRDFReply prdfReply = null;
		try {

			connect = getConnectionInstance();
			session = new CSLSession(connect);
			session.beginSession();
			prdfReply = new MsgPRDFReply();

			SvcPRDF_UK_1111 svc = new SvcPRDF_UK_1111(connect);
			svc.setServer(msgHeader.getRdfserver());
			svc.setPathmon(msgHeader.getPathmon());
			svc.setSystem(msgHeader.getSystem());

			MsgPRDFReq prdfReq = new MsgPRDFReq();
			Msgprdf msgprdf = new Msgprdf();
			MsgHeader hdr = new MsgHeader();
			//
			hdr.setApplCde(Constant.APPL_CDE.getConstantValue());
			hdr.setTranCde(Constant.READ_TRAN_CDE.getConstantValue());

			hdr.setReplCde(msgHeader.getReplcde().shortValue());
			hdr.setTermId(msgHeader.getTermid());
			hdr.setOmfAudit(String.valueOf(msgHeader.getOmfaudit()));
			hdr.setFrmtCde(msgHeader.getFrmtcde());
			hdr.setLconfName(msgHeader.getLconfname());
			hdr.setSiteProdInd(String.valueOf(msgHeader.getSiteprodind()));
//			hdr.setSiteProdInd("10100000000000000000001000000000");
			hdr.setErrNum("");
			hdr.setErrTxt("");

			// // ERROR Status
			ErrStatus errStatus = new ErrStatus();
			errStatus.setErrCde(msgHeader.getErrcde());
			errStatus.setErrSubCde(msgHeader.getErrsubcde());
			hdr.setErrStatus(errStatus);

			// User Data
			UserData userData = new UserData();
			userData.setLn(msgHeader.getLn());
			userData.setFiid(msgHeader.getFiid());
			userData.setRegn(msgHeader.getRegn());
			userData.setBrch(msgHeader.getBrch());
			// short s = 255;
			userData.setUserGrp(msgHeader.getUsergrp());
			userData.setUserNum(new Integer(msgHeader.getUsernum()));
			hdr.setUserData(userData);

			// Last FM
			LastFm lastFm = new LastFm();
			// lastFm.setFiller(theFiller);
			lastFm.setFmTimestamp("");
			lastFm.setFmUserGrp(msgHeader.getUsergrp());
			lastFm.setFmUserNum(msgHeader.getUsernum());
			lastFm.setStaNum("");
			lastFm.setUpdtTyp("");

			RecImage recImage = new RecImage();
			PrdfRecImage prdfRecImage = new PrdfRecImage();
			Rkey rkey = new Rkey();
			rkey.setFiid(msgHeader.getFiid());
			rkey.setRetailerId(merchantId);

			prdfRecImage.setRkey(rkey);
			recImage.setPrdfRecImage(prdfRecImage);

			msgprdf.setMsgHeader(hdr);
			msgprdf.setLastFm(lastFm);
			msgprdf.setRecImage(recImage);
			prdfReq.setMsgprdf(msgprdf);

			logger.debug("Reading Retailer record from B24 for retailer ID "
					+ rkey.getRetailerId()
					+ " for usergrp "
					+ prdfReq.getMsgprdf().getMsgHeader().getUserData()
							.getUserGrp()
					+ " and usernum "
					+ prdfReq.getMsgprdf().getMsgHeader().getUserData()
							.getUserNum());

			prdfReply = svc.opDoPRDF(prdfReq);

			logger.info("Read Retailer record from B24 completed for retailer ID "
					+ rkey.getRetailerId());

			if (prdfReply != null) {
				logger.debug("We got response from read operation");

				Short errorCode = prdfReply.getMsgprdf().getMsgHeader()
						.getErrStatus().getErrCde();

				logger.info("Response text"
						+ prdfReply.getMsgprdf().getMsgHeader().getErrTxt()
						+ "Response Code " + errorCode);

				
				logger.debug("*****Read Data for Merchant "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRkey().getRetailerId()
						+ "*****");
				logger.debug("prdfReply add1 object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getAddr());
				logger.debug("prdfReply add2 object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getAddrExt());
				logger.debug("prdfReply city object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getCity());
				logger.debug("prdfReply cntry object : "
						+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().getCntry());
				logger.debug("prdfReply zip object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getPostalCde());
				logger.debug("prdfReply state object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getSt());
				logger.debug("prdfReply cntry object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getCntry());
				logger.debug("prdfReply AftHrsPhone object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer()
								.getAftHrsPhone());
				logger.debug("prdfReply ChkRtgGrp object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getChkRtgGrp());
				logger.debug("prdfReply ChkMrchntId object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getChkMrchntId());
				logger.debug("prdfReply after setting name object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getName());
				logger.debug("prdfReply phone object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getPhone());
				
				
				if (StatusCode.STATUS_SUCCESS.getStatusCode() == errorCode) {
				} else if (StatusCode.STATUS_NOT_FOUND.getStatusCode() == errorCode) {
					throw new RetailerNotFoundException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_BFR_SPC.getStatusCode() == errorCode) {
					throw new NoBufferSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_CB_SPACE.getStatusCode() == errorCode) {
					throw new NoCBSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_BUF_SPACE.getStatusCode() == errorCode) {
					throw new NoIOBufSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_CB_SPACE.getStatusCode() == errorCode) {
					throw new NoIOCBSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_PHYS_MEM.getStatusCode() == errorCode) {
					throw new NoIOPhysMemException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_PHYS_MEM.getStatusCode() == errorCode) {
					throw new NoPhysMemException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_POOL_SPACE.getStatusCode() == errorCode) {
					throw new NoPoolSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_TIMEDOUT.getStatusCode() == errorCode) {
					throw new StatusTimeoutException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());

				} else {
					System.out.println("ERRRCDE "
							+ prdfReply.getMsgprdf().getMsgHeader()
									.getErrStatus().getErrCde());
					throw new RetailerFileException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				}

			} else {

				logger.debug(" We didnt get any response from read operation");
				throw new ConnectionFailedException();
			}

		} catch (SocketException e1) {
			logger.error("Socket Connection : " + e1);
			throw new SocketException("Socket Connection : " + e1);
		} catch (IOException | CSLException | ConnectionFailedException
				| ServiceException e) {
			logger.error("Connection failed : ", e);
			throw new ConnectionFailedException("Connection failed : " + e);
		} finally {
			logger.debug("session finished");
			if (session.isAlive()) {
				session.finishSession();
			}
		}
		return prdfReply;
	}

	public MsgPRDFReply updatePRDFRecord(MsgPRDFReq prdfReq)
			throws SocketException, ConnectionFailedException,
			RetailerNotFoundException, ConnectionFileInvalidException,
			StatusTimeoutException, NoPoolSpaceException, NoPhysMemException,
			NoIOPhysMemException, NoIOCBSpaceException, NoIOBufSpaceException,
			NoCBSpaceException, NoBufferSpaceException, RetailerFileException {

		logger.debug("updatePRDFRecord method start");
		CSLSession session = null;
		MsgPRDFReply prdfReply = null;

		try {
			connect = getConnectionInstance();
			session = new CSLSession(connect);
			session.beginSession();

			SvcPRDF_UK_1111 svc = new SvcPRDF_UK_1111(connect);
			svc.setServer(msgHeader.getRdfserver());
			svc.setPathmon(msgHeader.getPathmon());
			svc.setSystem(msgHeader.getSystem());

			prdfReq.getMsgprdf().getMsgHeader()
					.setApplCde(Constant.APPL_CDE.getConstantValue());
			prdfReq.getMsgprdf().getMsgHeader()
					.setTranCde(Constant.UPDATE_TRAN_CDE.getConstantValue());

			logger.debug("updating PRDF record into B24 for retailer ID : "
					+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRkey().getRetailerId()
					+ " account Number "
					+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getAcct().getAcctNum()
					+ " for usergrp "
					+ prdfReq.getMsgprdf().getMsgHeader().getUserData()
							.getUserGrp()
					+ " and usernum "
					+ prdfReq.getMsgprdf().getMsgHeader().getUserData()
							.getUserNum());

			prdfReply = svc.opDoPRDF(prdfReq);

			logger.debug("updated PRDF record into B24 for retailer ID : "
					+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRkey().getRetailerId());

			if (prdfReply != null) {
				logger.debug(" We got response from update operation");
				Short errorCode = prdfReply.getMsgprdf().getMsgHeader()
						.getErrStatus().getErrCde();

				logger.info("Response text"
						+ prdfReply.getMsgprdf().getMsgHeader().getErrTxt()
						+ "Response Code " + errorCode);

				logger.debug("***************************After updated data for Merchant "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRkey().getRetailerId()
						+ "*****");
				logger.debug("prdfReply add1 object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getAddr());
				logger.debug("prdfReply add2 object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getAddrExt());
				logger.debug("prdfReply city object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getCity());
				logger.debug("prdfReply cntry object : "
						+ prdfReq.getMsgprdf().getRecImage().getPrdfRecImage()
								.getRetailer().getCntry());
				logger.debug("prdfReply zip object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getPostalCde());
				logger.debug("prdfReply state object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getSt());
				logger.debug("prdfReply cntry object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getCntry());
				logger.debug("prdfReply AftHrsPhone object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer()
								.getAftHrsPhone());
				logger.debug("prdfReply ChkRtgGrp object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getChkRtgGrp());
				logger.debug("prdfReply ChkMrchntId object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getChkMrchntId());
				logger.debug("prdfReply after setting name object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getName());
				logger.debug("prdfReply phone object : "
						+ prdfReply.getMsgprdf().getRecImage()
								.getPrdfRecImage().getRetailer().getPhone());
				
				if (StatusCode.STATUS_SUCCESS.getStatusCode() == errorCode) {
				} else if (StatusCode.STATUS_NOT_FOUND.getStatusCode() == errorCode) {
					throw new RetailerNotFoundException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_BFR_SPC.getStatusCode() == errorCode) {
					throw new NoBufferSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_CB_SPACE.getStatusCode() == errorCode) {
					throw new NoCBSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_BUF_SPACE.getStatusCode() == errorCode) {
					throw new NoIOBufSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_CB_SPACE.getStatusCode() == errorCode) {
					throw new NoIOCBSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_IO_PHYS_MEM.getStatusCode() == errorCode) {
					throw new NoIOPhysMemException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_PHYS_MEM.getStatusCode() == errorCode) {
					throw new NoPhysMemException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_NO_POOL_SPACE.getStatusCode() == errorCode) {
					throw new NoPoolSpaceException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				} else if (StatusCode.STATUS_TIMEDOUT.getStatusCode() == errorCode) {
					throw new StatusTimeoutException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());

				} else {
					throw new RetailerFileException(prdfReply.getMsgprdf()
							.getMsgHeader().getErrTxt());
				}

			} else {
				logger.debug(" We didnt get response from update operation");
			}

		} catch (SocketException e1) {
			logger.error("Socket Connection : " + e1);
			throw new SocketException("Socket Connection : " + e1);
		} catch (IOException | CSLException | /** ConnectionFailedException | **/
		ServiceException e) {
			logger.error("Connection failed : " + e.getMessage());
			throw new ConnectionFailedException("Connection failed : "
					+ e.getMessage());
		} finally {
			logger.debug("session finished");
			if (session.isAlive()) {
				session.finishSession();
			}
		}

		return prdfReply;

	}
}
