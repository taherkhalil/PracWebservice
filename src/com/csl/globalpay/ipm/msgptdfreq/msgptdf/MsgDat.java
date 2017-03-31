/*
 * @(#)MsgDat.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>MsgDat</code>
 *  
 */
public class	MsgDat implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String yy;
   protected String mm;
   protected String dd;

   /** <code>MsgDat</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public MsgDat(String characterEncoding)
   {
      setYy(new String());
      setMm(new String());
      setDd(new String());
   }

   /** <code>MsgDat</code>
    *  Constructor
    */ 
   public MsgDat()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Yy is a text String of2 bytes.
    * </code>
    */
   public String getYy()
   {
      return yy;
   }

   /**
    * <code>
    * Yy is a text String of2 bytes.
    * </code>
    */
   public void setYy(String theYy)
   {
       yy = theYy;
   }

   /**
    * <code>
    * Mm is a text String of2 bytes.
    * </code>
    */
   public String getMm()
   {
      return mm;
   }

   /**
    * <code>
    * Mm is a text String of2 bytes.
    * </code>
    */
   public void setMm(String theMm)
   {
       mm = theMm;
   }

   /**
    * <code>
    * Dd is a text String of2 bytes.
    * </code>
    */
   public String getDd()
   {
      return dd;
   }

   /**
    * <code>
    * Dd is a text String of2 bytes.
    * </code>
    */
   public void setDd(String theDd)
   {
       dd = theDd;
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
      out.writeString(getYy(),2, CSLTypes.PICX);
      out.writeString(getMm(),2, CSLTypes.PICX);
      out.writeString(getDd(),2, CSLTypes.PICX);
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
      setYy(in.readString(2));
      setMm(in.readString(2));
      setDd(in.readString(2));
   } 
}
