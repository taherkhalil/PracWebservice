/*
 * @(#)EmvTermCap.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>EmvTermCap</code>
 *  
 */
public class	EmvTermCap implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String crdDataInput;
   protected String cvm;
   protected String sec;
   protected String userFld1EmvTermCap;

   /** <code>EmvTermCap</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public EmvTermCap(String characterEncoding)
   {
      setCrdDataInput(new String());
      setCvm(new String());
      setSec(new String());
      setUserFld1EmvTermCap(new String());
   }

   /** <code>EmvTermCap</code>
    *  Constructor
    */ 
   public EmvTermCap()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * CrdDataInput is a text String of1 bytes.
    * </code>
    */
   public String getCrdDataInput()
   {
      return crdDataInput;
   }

   /**
    * <code>
    * CrdDataInput is a text String of1 bytes.
    * </code>
    */
   public void setCrdDataInput(String theCrdDataInput)
   {
       crdDataInput = theCrdDataInput;
   }

   /**
    * <code>
    * Cvm is a text String of1 bytes.
    * </code>
    */
   public String getCvm()
   {
      return cvm;
   }

   /**
    * <code>
    * Cvm is a text String of1 bytes.
    * </code>
    */
   public void setCvm(String theCvm)
   {
       cvm = theCvm;
   }

   /**
    * <code>
    * Sec is a text String of1 bytes.
    * </code>
    */
   public String getSec()
   {
      return sec;
   }

   /**
    * <code>
    * Sec is a text String of1 bytes.
    * </code>
    */
   public void setSec(String theSec)
   {
       sec = theSec;
   }

   /**
    * <code>
    * UserFld1EmvTermCap is a text String of1 bytes.
    * </code>
    */
   public String getUserFld1EmvTermCap()
   {
      return userFld1EmvTermCap;
   }

   /**
    * <code>
    * UserFld1EmvTermCap is a text String of1 bytes.
    * </code>
    */
   public void setUserFld1EmvTermCap(String theUserFld1EmvTermCap)
   {
       userFld1EmvTermCap = theUserFld1EmvTermCap;
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
      out.writeString(getCrdDataInput(),1, CSLTypes.PICX);
      out.writeString(getCvm(),1, CSLTypes.PICX);
      out.writeString(getSec(),1, CSLTypes.PICX);
      out.writeString(getUserFld1EmvTermCap(),1, CSLTypes.PICX);
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
      setCrdDataInput(in.readString(1));
      setCvm(in.readString(1));
      setSec(in.readString(1));
      setUserFld1EmvTermCap(in.readString(1));
   } 
}
