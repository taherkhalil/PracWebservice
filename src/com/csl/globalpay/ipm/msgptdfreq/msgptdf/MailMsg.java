/*
 * @(#)MailMsg.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.Inbound;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.Outbound;

/** <code>MailMsg</code>
 *  
 */
public class	MailMsg implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Inbound inbound;
   protected Outbound outbound;

   /** <code>MailMsg</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public MailMsg(String characterEncoding)
   {
      setInbound(new Inbound());
      setOutbound(new Outbound());
   }

   /** <code>MailMsg</code>
    *  Constructor
    */ 
   public MailMsg()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=INBOUND;
    * </code>
    */
   public Inbound getInbound()
   {
      return inbound;
   }

   /**
    * <code>
    * Name=INBOUND;
    * </code>
    */
   public void setInbound(Inbound theInbound)
   {
       inbound = theInbound;
   }

   /**
    * <code>
    * Name=OUTBOUND;
    * </code>
    */
   public Outbound getOutbound()
   {
      return outbound;
   }

   /**
    * <code>
    * Name=OUTBOUND;
    * </code>
    */
   public void setOutbound(Outbound theOutbound)
   {
       outbound = theOutbound;
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
      getInbound().write(out);
      getOutbound().write(out);
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
      getInbound().read(in);
      getOutbound().read(in);
   } 
}
