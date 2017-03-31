
/*
 * @(#)MsgPRDFReq2.java
 * Created by CSL Studio (message-schema) on 14/11/2016 03:38:34 PM

 */


package com.csl.globalpay.ipm.msgprdfreq;
		
import java.io.IOException;

import com.comforte.csl.cslapi.CSLIOOptions;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
	
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.Msgprdf;


/**
 * <code>MsgPRDFReq</code>
 *
 * 
 */
public class MsgPRDFReq implements com.comforte.csl.cslapi.CSLLongMessageStreamable {

	/*
	 * attributes
	 */	
	 	protected Msgprdf msgprdf;

	private int ddlSize = 4548;
	
	/**
	 * <code>MsgPRDFReq</code>
	 * 
	 * @param characterEncoding this is for setting strings with CSLBaseData
	 */
	public MsgPRDFReq(String ce) {
	
	setMsgprdf(new  Msgprdf(ce));

		/*
		 * initialize selected input message fields with default values
		 */
				
	}
	
	/**
	 * <code>MsgPRDFReq</code>
	 * default encoding
	 */
	public MsgPRDFReq() {
		this(CSLIOOptions.ISO_8859_1); // 
	}	
	
	/*
	 * getter and setter
	 */


	
	/**
	 * <code>getMsgprdf</code>
	 * 
	 */	
	 public Msgprdf    getMsgprdf() { 
	 	return msgprdf;
	}

	
	/**
	 * <code>setMsgprdf</code>
	 * 
	 */	
	 public void setMsgprdf(Msgprdf theMsgprdf) { 
	 	msgprdf = theMsgprdf;
	}
	
	
	/**
	 * <code>write</code>
	 * 
	 * @param out
	 * @throws java.io.IOException, 
	 */
	public void write(CSLOutputStream out) throws IOException {
		/* write all attribute values into out */
			
	getMsgprdf().write(out);
		
	}

	/**
	 * <code>read</code>
	 * 
	 * @param in
	 * @throws java.io.IOException, 
	 */
	public void read(CSLInputStream in) throws IOException {
		/* read all attribute values*/
	
	getMsgprdf().read(in);
		
	}
	
	/**
	 * <code>getDdlSize</code>
	 *
	 */
	 public int	getDdlSize() {
	 	return ddlSize;
	 }

}
