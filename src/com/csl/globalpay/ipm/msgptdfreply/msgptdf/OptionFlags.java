/*
 * @(#)OptionFlags.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>OptionFlags</code>
 *  
 */
public class	OptionFlags implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String unsolicitedMsg;
   protected String termComplUnsolicitedMsg;
   protected String termComplStoredMsg;
   protected String timoutRespToTerm;
   protected String posNegConfirmations;
   protected String scrollThru;
   protected String ofstReset;
   protected String filler;

   /** <code>OptionFlags</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public OptionFlags(String characterEncoding)
   {
      setUnsolicitedMsg(new String());
      setTermComplUnsolicitedMsg(new String());
      setTermComplStoredMsg(new String());
      setTimoutRespToTerm(new String());
      setPosNegConfirmations(new String());
      setScrollThru(new String());
      setOfstReset(new String());
      setFiller(new String());
   }

   /** <code>OptionFlags</code>
    *  Constructor
    */ 
   public OptionFlags()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * UnsolicitedMsg is a text String of1 bytes.
    * </code>
    */
   public String getUnsolicitedMsg()
   {
      return unsolicitedMsg;
   }

   /**
    * <code>
    * UnsolicitedMsg is a text String of1 bytes.
    * </code>
    */
   public void setUnsolicitedMsg(String theUnsolicitedMsg)
   {
       unsolicitedMsg = theUnsolicitedMsg;
   }

   /**
    * <code>
    * TermComplUnsolicitedMsg is a text String of1 bytes.
    * </code>
    */
   public String getTermComplUnsolicitedMsg()
   {
      return termComplUnsolicitedMsg;
   }

   /**
    * <code>
    * TermComplUnsolicitedMsg is a text String of1 bytes.
    * </code>
    */
   public void setTermComplUnsolicitedMsg(String theTermComplUnsolicitedMsg)
   {
       termComplUnsolicitedMsg = theTermComplUnsolicitedMsg;
   }

   /**
    * <code>
    * TermComplStoredMsg is a text String of1 bytes.
    * </code>
    */
   public String getTermComplStoredMsg()
   {
      return termComplStoredMsg;
   }

   /**
    * <code>
    * TermComplStoredMsg is a text String of1 bytes.
    * </code>
    */
   public void setTermComplStoredMsg(String theTermComplStoredMsg)
   {
       termComplStoredMsg = theTermComplStoredMsg;
   }

   /**
    * <code>
    * TimoutRespToTerm is a text String of1 bytes.
    * </code>
    */
   public String getTimoutRespToTerm()
   {
      return timoutRespToTerm;
   }

   /**
    * <code>
    * TimoutRespToTerm is a text String of1 bytes.
    * </code>
    */
   public void setTimoutRespToTerm(String theTimoutRespToTerm)
   {
       timoutRespToTerm = theTimoutRespToTerm;
   }

   /**
    * <code>
    * PosNegConfirmations is a text String of1 bytes.
    * </code>
    */
   public String getPosNegConfirmations()
   {
      return posNegConfirmations;
   }

   /**
    * <code>
    * PosNegConfirmations is a text String of1 bytes.
    * </code>
    */
   public void setPosNegConfirmations(String thePosNegConfirmations)
   {
       posNegConfirmations = thePosNegConfirmations;
   }

   /**
    * <code>
    * ScrollThru is a text String of1 bytes.
    * </code>
    */
   public String getScrollThru()
   {
      return scrollThru;
   }

   /**
    * <code>
    * ScrollThru is a text String of1 bytes.
    * </code>
    */
   public void setScrollThru(String theScrollThru)
   {
       scrollThru = theScrollThru;
   }

   /**
    * <code>
    * OfstReset is a text String of1 bytes.
    * </code>
    */
   public String getOfstReset()
   {
      return ofstReset;
   }

   /**
    * <code>
    * OfstReset is a text String of1 bytes.
    * </code>
    */
   public void setOfstReset(String theOfstReset)
   {
       ofstReset = theOfstReset;
   }

   /**
    * <code>
    * Name=FILLER;CSL Type=cslString;
    * </code>
    */
   public String getFiller()
   {
      return filler;
   }

   /**
    * <code>
    * Name=FILLER;CSL Type=cslString;
    * </code>
    */
   public void setFiller(String theFiller)
   {
       filler = theFiller;
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
      out.writeString(getUnsolicitedMsg(),1, CSLTypes.PICX);
      out.writeString(getTermComplUnsolicitedMsg(),1, CSLTypes.PICX);
      out.writeString(getTermComplStoredMsg(),1, CSLTypes.PICX);
      out.writeString(getTimoutRespToTerm(),1, CSLTypes.PICX);
      out.writeString(getPosNegConfirmations(),1, CSLTypes.PICX);
      out.writeString(getScrollThru(),1, CSLTypes.PICX);
      out.writeString(getOfstReset(),1, CSLTypes.PICX);
      out.writeString(getFiller(),1, CSLTypes.PICX);
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
      setUnsolicitedMsg(in.readString(1));
      setTermComplUnsolicitedMsg(in.readString(1));
      setTermComplStoredMsg(in.readString(1));
      setTimoutRespToTerm(in.readString(1));
      setPosNegConfirmations(in.readString(1));
      setScrollThru(in.readString(1));
      setOfstReset(in.readString(1));
      setFiller(in.readString(1));
   } 
}
