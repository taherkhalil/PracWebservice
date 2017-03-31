/*
 * @(#)EncrKeys2.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>EncrKeys</code>
 *  
 */
public class	EncrKeys2 implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String masKey;
   protected String macKey;

   /** <code>EncrKeys</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public EncrKeys2(String characterEncoding)
   {
      setMasKey(new String());
      setMacKey(new String());
   }

   /** <code>EncrKeys</code>
    *  Constructor
    */ 
   public EncrKeys2()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * MasKey is a text String of16 bytes.
    * </code>
    */
   public String getMasKey()
   {
      return masKey;
   }

   /**
    * <code>
    * MasKey is a text String of16 bytes.
    * </code>
    */
   public void setMasKey(String theMasKey)
   {
       masKey = theMasKey;
   }

   /**
    * <code>
    * MacKey is a text String of16 bytes.
    * </code>
    */
   public String getMacKey()
   {
      return macKey;
   }

   /**
    * <code>
    * MacKey is a text String of16 bytes.
    * </code>
    */
   public void setMacKey(String theMacKey)
   {
       macKey = theMacKey;
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
      out.writeString(getMasKey(),16, CSLTypes.PICX);
      out.writeString(getMacKey(),16, CSLTypes.PICX);
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
      setMasKey(in.readString(16));
      setMacKey(in.readString(16));
   } 
}
