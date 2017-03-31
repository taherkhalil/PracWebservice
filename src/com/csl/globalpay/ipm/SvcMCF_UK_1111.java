
/*
* @(#)SvcMCF_UK_1111.java
 * Created by CSL Studio (java-service-schema) on 11/11/2016 01:26:25 PM

*/  		


package com.csl.globalpay.ipm;

	
import java.io.IOException;

import com.comforte.csl.cslapi.CSLException;
import com.comforte.csl.cslapi.CSLErrorException;
import com.comforte.csl.cslapi.CSLConnection;

import com.comforte.csl.service.CSLService;
import com.comforte.csl.service.CSLLocalTransaction;
import com.comforte.csl.service.ServiceException;


/**
 * <code>SvcMCF_UK_1111</code>
 *
 * 
 */
 	
	public class SvcMCF_UK_1111 extends CSLService {
	/*
	 * default values for
	 * pathmon, system, server
	 */
	final public static String PATHMON = "$CSLP";
	final public static String SYSTEM = "\\GPDEV";
	final public static String SERVER = "SERVER-MCF";

	/*
	 * default TMF values
	 */
	final public static String 	TRANSACTION_VALUES = "";		
	final public static short	TRANSACTION_MODE = CSLService.NO_TMF;
					

	/**
	* <code>PathwayServerClass.java</code>
	*/
	   public class PathwayServerClass
   {
     String system;
     String pathmon;
     String serverclass;
     public PathwayServerClass()
     {
       system = "\\GPDEV";
       pathmon = "$CSLP";
       serverclass = "SERVER-MCF";
     }
     public String getSystem ()
     {
       return system; 
			}
     public void setSystem (String value)
     {
       system = value; 
			}
     public String getPathmon ()
     {
       return pathmon; 
			}
     public void setPathmon (String value)
     {
       pathmon = value; 
			}
     public String getServerClass ()
     {
       return serverclass; 
			}
     public void setServerClass (String value)
     {
       serverclass = value; 
			}
   }

	/**
	 * <code>SvcMCF_UK_1111</code>
	 * 
	 * @param connection
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcMCF_UK_1111
	(CSLConnection connection)
	throws CSLException, IOException {

		super(connection);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}

	/**
	 * <code>SvcMCF_UK_1111</code>
	 * 
	 * @param localTransaction
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcMCF_UK_1111
	(CSLLocalTransaction localTransaction)
	throws CSLException, IOException {

		super(localTransaction);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}

	/**
	 * <code>SvcMCF_UK_1111</code>
	 * 
	 * @param path
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcMCF_UK_1111
	()
	throws CSLException, IOException {

		this(null,null,null);

	}

	/**
	 * <code>SvcMCF_UK_1111</code>
	 * 
	 * @param path
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcMCF_UK_1111
	(String path)
	throws CSLException, IOException {

		this(path,null,null);

	}

	/**
	 * <code>SvcMCF_UK_1111</code>
	 * 
	 * @param path
	 * @param user
	 * @param password
	 * @throws  com.comforte.csl.cslapi.CSLException,
	 *			java.io.IOException	
	 */
	public SvcMCF_UK_1111
	(String path, String user, String password)
	throws CSLException, IOException {

		super(path,user,password);

		setPathmon(PATHMON);
		setSystem(SYSTEM);
		setServer(SERVER);

		setTmfMode(TRANSACTION_MODE);
	}
	
	
	/**
	 * <code>doOpMCF</code>
	 * 
	 * @param request
	 * @return
	 * @throws java.io.IOException, 
	 *         javax.resource.ResourceException,
	 *         com.comforte.csl.cslapi.CSLException
	 *         com.comforte.csl.service.ServiceException
	 */

	

	public com.csl.globalpay.ipm.msgmcfreq.MsgMCFReq doOpMCF
	(com.csl.globalpay.ipm.msgmcfreq.MsgMCFReq request)
	throws IOException, CSLException, ServiceException {

	com.csl.globalpay.ipm.msgmcfreq.MsgMCFReq reply = new com.csl.globalpay.ipm.msgmcfreq.MsgMCFReq();

		/*
		 * do some specific settings in request
		 */
			
		 
		/*
		 * TMF settings
		 */				 
		
		setTmfMode(TRANSACTION_MODE);
		setTmfValues(TRANSACTION_VALUES);
			
		/*
		 * EVALUATION settings
		 */
		
		/*
		 * send the request
		 */
		

		try { 
			execute(request,reply,getPathmon(),getSystem(),getServer());
		} catch (CSLErrorException e) {
			/*
			 * do some error handling
			 */
			ServiceException serviceException = null; 
					
			serviceException = new ServiceException(e, null);
				
			throw serviceException;
		}

		return reply;
	}
	/**
	* <code>doOpMCF</code>
	* @param pathwayServerClass
	* @param request
	* @return
	* @throws java.io.IOException, 
	*         javax.resource.ResourceException,
	*         com.comforte.csl.cslapi.CSLException
	*         com.comforte.csl.service.ServiceException
	*/
	public com.csl.globalpay.ipm.msgmcfreq.MsgMCFReq doOpMCF
	(PathwayServerClass pathwayServerClass, com.csl.globalpay.ipm.msgmcfreq.MsgMCFReq request)
	throws IOException, CSLException, ServiceException {
	com.csl.globalpay.ipm.msgmcfreq.MsgMCFReq reply = new com.csl.globalpay.ipm.msgmcfreq.MsgMCFReq();
	/*
	* do some specific settings in request
	*/
		
	/*
	* TMF settings
	*/				 
	
			setTmfMode(TRANSACTION_MODE);
			setTmfValues(TRANSACTION_VALUES);
		
	/*
	* EVALUATION settings
	*/
	
	/*
	* send the request
	*/
		try { 
	execute(request,reply,pathwayServerClass.getPathmon(), pathwayServerClass.getSystem(), pathwayServerClass.getServerClass());
	} catch (CSLErrorException e) {
	/*
	* do some error handling
	*/
	ServiceException serviceException = null; 
			
			serviceException = new ServiceException(e, null);
		
	throw serviceException;
	}
	return reply;
	}


}

