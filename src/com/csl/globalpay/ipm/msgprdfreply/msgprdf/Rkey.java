/*
 * @(#)Rkey.java
 * Created by CSL Studio (definition-schema) on 14/11/2016 03:38:34 PM
 */
package com.csl.globalpay.ipm.msgprdfreply.msgprdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Rkey</code>
 *  
 */
public class	Rkey implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String fiid;
   protected String grp;
   protected String regn;
   protected String retailerId;

   /** <code>Rkey</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Rkey(String characterEncoding)
   {
      setFiid(new String());
      setGrp(new String());
      setRegn(new String());
      setRetailerId(new String());
   }

   /** <code>Rkey</code>
    *  Constructor
    */ 
   public Rkey()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Fiid is a text String of4 bytes.
    * </code>
    */
   public String getFiid()
   {
      return fiid;
   }

   /**
    * <code>
    * Fiid is a text String of4 bytes.
    * </code>
    */
   public void setFiid(String theFiid)
   {
       fiid = theFiid;
   }

   /**
    * <code>
    * Grp is a text String of4 bytes.
    * </code>
    */
   public String getGrp()
   {
      return grp;
   }

   /**
    * <code>
    * Grp is a text String of4 bytes.
    * </code>
    */
   public void setGrp(String theGrp)
   {
       grp = theGrp;
   }

   /**
    * <code>
    * Regn is a text String of4 bytes.
    * </code>
    */
   public String getRegn()
   {
      return regn;
   }

   /**
    * <code>
    * Regn is a text String of4 bytes.
    * </code>
    */
   public void setRegn(String theRegn)
   {
       regn = theRegn;
   }

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

   /** <code>write</code>
    * @param out
    * @throws java.io.IOException,
    */
   public void write(CSLOutputStream out) throws IOException
   {
      /* write all attribute values into out */
      String help1 = null;
      String help2 = null;
      out.writeString(getFiid(),4, CSLTypes.PICX);
      out.writeString(getGrp(),4, CSLTypes.PICX);
      out.writeString(getRegn(),4, CSLTypes.PICX);
      out.writeString(getRetailerId(),19, CSLTypes.PICX);
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
      setFiid(in.readString(4));
      setGrp(in.readString(4));
      setRegn(in.readString(4));
      setRetailerId(in.readString(19));
   } 
}
