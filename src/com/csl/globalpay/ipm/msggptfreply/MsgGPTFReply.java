
/*
 * @(#)MsgGPTFReply2.java
 * Created by CSL Studio (message-schema) on 11/11/2016 01:31:00 PM

 */


package com.csl.globalpay.ipm.msggptfreply;
		
import java.io.IOException;

import com.comforte.csl.cslapi.CSLIOOptions;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
	
import com.csl.globalpay.ipm.msggptfreply.msggptdf.Msggptdf;


/**
 * <code>MsgGPTFReply</code>
 *
 * 
 */
public class MsgGPTFReply implements com.comforte.csl.cslapi.CSLLongMessageStreamable {

	/*
	 * attributes
	 */	
	 	protected Msggptdf msggptdf;

	private int ddlSize = 1476;
	
	/**
	 * <code>MsgGPTFReply</code>
	 * 
	 * @param characterEncoding this is for setting strings with CSLBaseData
	 */
	public MsgGPTFReply(String ce) {
	
	setMsggptdf(new  Msggptdf(ce));

		/*
		 * initialize selected input message fields with default values
		 */
				
	}
	
	/**
	 * <code>MsgGPTFReply</code>
	 * default encoding
	 */
	public MsgGPTFReply() {
		this(CSLIOOptions.ISO_8859_1); // 
	}	
	
	/*
	 * getter and setter
	 */


	
	/**
	 * <code>getMsggptdf</code>
	 * 
	 */	
	 public Msggptdf    getMsggptdf() { 
	 	return msggptdf;
	}

	
	/**
	 * <code>setMsggptdf</code>
	 * 
	 */	
	 public void setMsggptdf(Msggptdf theMsggptdf) { 
	 	msggptdf = theMsggptdf;
	}
	
	
	/**
	 * <code>write</code>
	 * 
	 * @param out
	 * @throws java.io.IOException, 
	 */
	public void write(CSLOutputStream out) throws IOException {
		/* write all attribute values into out */
			
	getMsggptdf().write(out);
		
	}

	/**
	 * <code>read</code>
	 * 
	 * @param in
	 * @throws java.io.IOException, 
	 */
	public void read(CSLInputStream in) throws IOException {
		/* read all attribute values*/
	
	getMsggptdf().read(in);
		
	}
	
	/**
	 * <code>getDdlSize</code>
	 *
	 */
	 public int	getDdlSize() {
	 	return ddlSize;
	 }

}
