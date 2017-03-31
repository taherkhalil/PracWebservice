/*
 * @(#)Prikey.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:26:25 PM
 */
package com.csl.globalpay.ipm.msgmcfreq.msgmcf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Prikey</code>
 *  
 */
public class	Prikey implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String retailerId;
   protected String crncyCde;

   /** <code>Prikey</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Prikey(String characterEncoding)
   {
      setRetailerId(new String());
      setCrncyCde(new String());
   }

   /** <code>Prikey</code>
    *  Constructor
    */ 
   public Prikey()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * RetailerId is a text String of19 bytes.
    * </code>
    */
   public String getRetailerId()
   {
      return retailerId;
   }

   /**
    * <code>
    * RetailerId is a text String of19 bytes.
    * </code>
    */
   public void setRetailerId(String theRetailerId)
   {
       retailerId = theRetailerId;
   }

   /**
    * <code>
    * CrncyCde is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public String getCrncyCde()
   {
      return crncyCde;
   }

   /**
    * <code>
    * CrncyCde is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public void setCrncyCde(String theCrncyCde)
   {
       crncyCde = theCrncyCde;
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
      out.writeString(getRetailerId(),19, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getCrncyCde(), 3, 0, 0);
      out.writeString(help1, help1.length());
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
      setRetailerId(in.readString(19));
      help1 = in.readString(3);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 3, 0, 0);
      setCrncyCde(help2);
   } 
}
