/*
 * @(#)MailData.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.MailMsg;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.OptionFlags;

/** <code>MailData</code>
 *  
 */
public class	MailData implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected OptionFlags optionFlags;
   protected String mailProNam;
   protected MailMsg mailMsg;

   /** <code>MailData</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public MailData(String characterEncoding)
   {
      setOptionFlags(new OptionFlags());
      setMailProNam(new String());
      setMailMsg(new MailMsg());
   }

   /** <code>MailData</code>
    *  Constructor
    */ 
   public MailData()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=OPTION-FLAGS;
    * </code>
    */
   public OptionFlags getOptionFlags()
   {
      return optionFlags;
   }

   /**
    * <code>
    * Name=OPTION-FLAGS;
    * </code>
    */
   public void setOptionFlags(OptionFlags theOptionFlags)
   {
       optionFlags = theOptionFlags;
   }

   /**
    * <code>
    * MailProNam is a text String of16 bytes.
    * </code>
    */
   public String getMailProNam()
   {
      return mailProNam;
   }

   /**
    * <code>
    * MailProNam is a text String of16 bytes.
    * </code>
    */
   public void setMailProNam(String theMailProNam)
   {
       mailProNam = theMailProNam;
   }

   /**
    * <code>
    * Name=MAIL-MSG;
    * </code>
    */
   public MailMsg getMailMsg()
   {
      return mailMsg;
   }

   /**
    * <code>
    * Name=MAIL-MSG;
    * </code>
    */
   public void setMailMsg(MailMsg theMailMsg)
   {
       mailMsg = theMailMsg;
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
      getOptionFlags().write(out);
      out.writeString(getMailProNam(),16, CSLTypes.PICX);
      getMailMsg().write(out);
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
      getOptionFlags().read(in);
      setMailProNam(in.readString(16));
      getMailMsg().read(in);
   } 
}
