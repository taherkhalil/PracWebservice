/*
 * @(#)MacData.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.EncrKeys2;

/** <code>MacData</code>
 *  
 */
public class	MacData implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String macEncryptTyp;
   protected EncrKeys2 encrKeys2;

   /** <code>MacData</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public MacData(String characterEncoding)
   {
      setMacEncryptTyp(new String());
      setEncrKeys2(new EncrKeys2());
   }

   /** <code>MacData</code>
    *  Constructor
    */ 
   public MacData()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * MacEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public String getMacEncryptTyp()
   {
      return macEncryptTyp;
   }

   /**
    * <code>
    * MacEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public void setMacEncryptTyp(String theMacEncryptTyp)
   {
       macEncryptTyp = theMacEncryptTyp;
   }

   /**
    * <code>
    * Name=ENCR-KEYS;
    * </code>
    */
   public EncrKeys2 getEncrKeys2()
   {
      return encrKeys2;
   }

   /**
    * <code>
    * Name=ENCR-KEYS;
    * </code>
    */
   public void setEncrKeys2(EncrKeys2 theEncrKeys2)
   {
       encrKeys2 = theEncrKeys2;
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
      out.writeString(getMacEncryptTyp(),2, CSLTypes.PICX);
      getEncrKeys2().write(out);
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
      setMacEncryptTyp(in.readString(2));
      getEncrKeys2().read(in);
   } 
}
