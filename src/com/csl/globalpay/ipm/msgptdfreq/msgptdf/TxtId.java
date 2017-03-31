/*
 * @(#)TxtId.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.MsgDat;

/** <code>TxtId</code>
 *  
 */
public class	TxtId implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected MsgDat msgDat;
   protected String msgId;

   /** <code>TxtId</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public TxtId(String characterEncoding)
   {
      setMsgDat(new MsgDat());
      setMsgId(new String());
   }

   /** <code>TxtId</code>
    *  Constructor
    */ 
   public TxtId()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=MSG-DAT;
    * </code>
    */
   public MsgDat getMsgDat()
   {
      return msgDat;
   }

   /**
    * <code>
    * Name=MSG-DAT;
    * </code>
    */
   public void setMsgDat(MsgDat theMsgDat)
   {
       msgDat = theMsgDat;
   }

   /**
    * <code>
    * MsgId is a text String of4 bytes.
    * </code>
    */
   public String getMsgId()
   {
      return msgId;
   }

   /**
    * <code>
    * MsgId is a text String of4 bytes.
    * </code>
    */
   public void setMsgId(String theMsgId)
   {
       msgId = theMsgId;
   }

   /** <code>write</code>
    * @param out
    * @throws java.io.IOException,
    */
   public void write(CSLOutputStream out) throws IOException
   {
      /* write all attribute values into out */
      String help1 = null;
      String help2 = null;
      getMsgDat().write(out);
      out.writeString(getMsgId(),4, CSLTypes.PICX);
   }

   /** <code>read</code>
    * @param in
    * @throws java.io.IOException
    */
   public void read(CSLInputStream in) throws IOException
   {
      /* read all attribute values*/
      String help1 = null;
      String help2 = null;
      getMsgDat().read(in);
      setMsgId(in.readString(4));
   } 
}
