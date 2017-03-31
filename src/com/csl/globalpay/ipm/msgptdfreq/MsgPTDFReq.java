
/*
 * @(#)MsgPTDFReq2.java
 * Created by CSL Studio (message-schema) on 11/11/2016 01:06:52 PM

 */


package com.csl.globalpay.ipm.msgptdfreq;
		
import java.io.IOException;

import com.comforte.csl.cslapi.CSLIOOptions;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
	
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.Msgptdf;


/**
 * <code>MsgPTDFReq</code>
 *
 * 
 */
public class MsgPTDFReq implements com.comforte.csl.cslapi.CSLLongMessageStreamable {

	/*
	 * attributes
	 */	
	 	protected Msgptdf msgptdf;

	private int ddlSize = 7960;
	
	/**
	 * <code>MsgPTDFReq</code>
	 * 
	 * @param characterEncoding this is for setting strings with CSLBaseData
	 */
	public MsgPTDFReq(String ce) {
	
	setMsgptdf(new  Msgptdf(ce));

		/*
		 * initialize selected input message fields with default values
		 */
				
	}
	
	/**
	 * <code>MsgPTDFReq</code>
	 * default encoding
	 */
	public MsgPTDFReq() {
		this(CSLIOOptions.ISO_8859_1); // 
	}	
	
	/*
	 * getter and setter
	 */


	
	/**
	 * <code>getMsgptdf</code>
	 * 
	 */	
	 public Msgptdf    getMsgptdf() { 
	 	return msgptdf;
	}

	
	/**
	 * <code>setMsgptdf</code>
	 * 
	 */	
	 public void setMsgptdf(Msgptdf theMsgptdf) { 
	 	msgptdf = theMsgptdf;
	}
	
	
	/**
	 * <code>write</code>
	 * 
	 * @param out
	 * @throws java.io.IOException, 
	 */
	public void write(CSLOutputStream out) throws IOException {
		/* write all attribute values into out */
			
	getMsgptdf().write(out);
		
	}

	/**
	 * <code>read</code>
	 * 
	 * @param in
	 * @throws java.io.IOException, 
	 */
	public void read(CSLInputStream in) throws IOException {
		/* read all attribute values*/
	
	getMsgptdf().read(in);
		
	}
	
	/**
	 * <code>getDdlSize</code>
	 *
	 */
	 public int	getDdlSize() {
	 	return ddlSize;
	 }

}
