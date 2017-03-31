
/*
 * @(#)MsgMCFReply2.java
 * Created by CSL Studio (message-schema) on 11/11/2016 01:26:25 PM

 */


package com.csl.globalpay.ipm.msgmcfreply;
		
import java.io.IOException;

import com.comforte.csl.cslapi.CSLIOOptions;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
	
import com.csl.globalpay.ipm.msgmcfreply.msgmcf.Msgmcf;


/**
 * <code>MsgMCFReply</code>
 *
 * 
 */
public class MsgMCFReply implements com.comforte.csl.cslapi.CSLLongMessageStreamable {

	/*
	 * attributes
	 */	
	 	protected Msgmcf msgmcf;

	private int ddlSize = 1476;
	
	/**
	 * <code>MsgMCFReply</code>
	 * 
	 * @param characterEncoding this is for setting strings with CSLBaseData
	 */
	public MsgMCFReply(String ce) {
	
	setMsgmcf(new  Msgmcf(ce));

		/*
		 * initialize selected input message fields with default values
		 */
				
	}
	
	/**
	 * <code>MsgMCFReply</code>
	 * default encoding
	 */
	public MsgMCFReply() {
		this(CSLIOOptions.ISO_8859_1); // 
	}	
	
	/*
	 * getter and setter
	 */


	
	/**
	 * <code>getMsgmcf</code>
	 * 
	 */	
	 public Msgmcf    getMsgmcf() { 
	 	return msgmcf;
	}

	
	/**
	 * <code>setMsgmcf</code>
	 * 
	 */	
	 public void setMsgmcf(Msgmcf theMsgmcf) { 
	 	msgmcf = theMsgmcf;
	}
	
	
	/**
	 * <code>write</code>
	 * 
	 * @param out
	 * @throws java.io.IOException, 
	 */
	public void write(CSLOutputStream out) throws IOException {
		/* write all attribute values into out */
			
	getMsgmcf().write(out);
		
	}

	/**
	 * <code>read</code>
	 * 
	 * @param in
	 * @throws java.io.IOException, 
	 */
	public void read(CSLInputStream in) throws IOException {
		/* read all attribute values*/
	
	getMsgmcf().read(in);
		
	}
	
	/**
	 * <code>getDdlSize</code>
	 *
	 */
	 public int	getDdlSize() {
	 	return ddlSize;
	 }

}
