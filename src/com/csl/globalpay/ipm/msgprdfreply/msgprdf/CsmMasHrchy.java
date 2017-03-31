/*
 * @(#)CsmMasHrchy.java
 * Created by CSL Studio (definition-schema) on 14/11/2016 03:38:34 PM
 */
package com.csl.globalpay.ipm.msgprdfreply.msgprdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>CsmMasHrchy</code>
 *  
 */
public class	CsmMasHrchy implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String corporate;
   protected String region;
   protected String principle;
   protected String associate;
   protected String chain;

   /** <code>CsmMasHrchy</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public CsmMasHrchy(String characterEncoding)
   {
      setCorporate(new String());
      setRegion(new String());
      setPrinciple(new String());
      setAssociate(new String());
      setChain(new String());
   }

   /** <code>CsmMasHrchy</code>
    *  Constructor
    */ 
   public CsmMasHrchy()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Corporate is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public String getCorporate()
   {
      return corporate;
   }

   /**
    * <code>
    * Corporate is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public void setCorporate(String theCorporate)
   {
       corporate = theCorporate;
   }

   /**
    * <code>
    * Region is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public String getRegion()
   {
      return region;
   }

   /**
    * <code>
    * Region is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public void setRegion(String theRegion)
   {
       region = theRegion;
   }

   /**
    * <code>
    * Principle is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public String getPrinciple()
   {
      return principle;
   }

   /**
    * <code>
    * Principle is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public void setPrinciple(String thePrinciple)
   {
       principle = thePrinciple;
   }

   /**
    * <code>
    * Associate is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public String getAssociate()
   {
      return associate;
   }

   /**
    * <code>
    * Associate is a numeric String of
							3 digits with 0 decimal places.
    * </code>
    */
   public void setAssociate(String theAssociate)
   {
       associate = theAssociate;
   }

   /**
    * <code>
    * Chain is a text String of3 bytes.
    * </code>
    */
   public String getChain()
   {
      return chain;
   }

   /**
    * <code>
    * Chain is a text String of3 bytes.
    * </code>
    */
   public void setChain(String theChain)
   {
       chain = theChain;
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
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getCorporate(), 3, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getRegion(), 3, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getPrinciple(), 3, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getAssociate(), 3, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getChain(),3, CSLTypes.PICX);
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
      help1 = in.readString(3);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 3, 0, 0);
      setCorporate(help2);
      help1 = in.readString(3);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 3, 0, 0);
      setRegion(help2);
      help1 = in.readString(3);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 3, 0, 0);
      setPrinciple(help2);
      help1 = in.readString(3);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 3, 0, 0);
      setAssociate(help2);
      setChain(in.readString(3));
   } 
}
