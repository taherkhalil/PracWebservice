/*
 * @(#)EncrKeys.java
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
public class	EncrKeys implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String mKey;
   protected String pKey;

   /** <code>EncrKeys</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public EncrKeys(String characterEncoding)
   {
      setMKey(new String());
      setPKey(new String());
   }

   /** <code>EncrKeys</code>
    *  Constructor
    */ 
   public EncrKeys()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * MKey is a text String of16 bytes.
    * </code>
    */
   public String getMKey()
   {
      return mKey;
   }

   /**
    * <code>
    * MKey is a text String of16 bytes.
    * </code>
    */
   public void setMKey(String theMKey)
   {
       mKey = theMKey;
   }

   /**
    * <code>
    * PKey is a text String of16 bytes.
    * </code>
    */
   public String getPKey()
   {
      return pKey;
   }

   /**
    * <code>
    * PKey is a text String of16 bytes.
    * </code>
    */
   public void setPKey(String thePKey)
   {
       pKey = thePKey;
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
      out.writeString(getMKey(),16, CSLTypes.PICX);
      out.writeString(getPKey(),16, CSLTypes.PICX);
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
      setMKey(in.readString(16));
      setPKey(in.readString(16));
   } 
}
