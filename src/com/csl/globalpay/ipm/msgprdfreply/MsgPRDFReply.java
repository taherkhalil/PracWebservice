
/*
 * @(#)MsgPRDFReply2.java
 * Created by CSL Studio (message-schema) on 14/11/2016 03:38:34 PM

 */


package com.csl.globalpay.ipm.msgprdfreply;
		
import java.io.IOException;

import com.comforte.csl.cslapi.CSLIOOptions;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
	
import com.csl.globalpay.ipm.msgprdfreply.msgprdf.Msgprdf;


/**
 * <code>MsgPRDFReply</code>
 *
 * 
 */
public class MsgPRDFReply implements com.comforte.csl.cslapi.CSLLongMessageStreamable {

	/*
	 * attributes
	 */	
	 	protected Msgprdf msgprdf;

	private int ddlSize = 4548;
	
	/**
	 * <code>MsgPRDFReply</code>
	 * 
	 * @param characterEncoding this is for setting strings with CSLBaseData
	 */
	public MsgPRDFReply(String ce) {
	
	setMsgprdf(new  Msgprdf(ce));

		/*
		 * initialize selected input message fields with default values
		 */
				
	}
	
	/**
	 * <code>MsgPRDFReply</code>
	 * default encoding
	 */
	public MsgPRDFReply() {
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
