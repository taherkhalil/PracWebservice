/*
 * @(#)Outbound.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.TxtId;

/** <code>Outbound</code>
 *  
 */
public class	Outbound implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String complCde;
   protected String deliveryMde;
   protected String categoryNam;
   protected TxtId txtId;
   protected String statusFlg;
   protected String filler;

   /** <code>Outbound</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Outbound(String characterEncoding)
   {
      setComplCde(new String());
      setDeliveryMde(new String());
      setCategoryNam(new String());
      setTxtId(new TxtId());
      setStatusFlg(new String());
      setFiller(new String());
   }

   /** <code>Outbound</code>
    *  Constructor
    */ 
   public Outbound()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * ComplCde is a text String of2 bytes.
    * </code>
    */
   public String getComplCde()
   {
      return complCde;
   }

   /**
    * <code>
    * ComplCde is a text String of2 bytes.
    * </code>
    */
   public void setComplCde(String theComplCde)
   {
       complCde = theComplCde;
   }

   /**
    * <code>
    * DeliveryMde is a text String of1 bytes.
    * </code>
    */
   public String getDeliveryMde()
   {
      return deliveryMde;
   }

   /**
    * <code>
    * DeliveryMde is a text String of1 bytes.
    * </code>
    */
   public void setDeliveryMde(String theDeliveryMde)
   {
       deliveryMde = theDeliveryMde;
   }

   /**
    * <code>
    * CategoryNam is a text String of16 bytes.
    * </code>
    */
   public String getCategoryNam()
   {
      return categoryNam;
   }

   /**
    * <code>
    * CategoryNam is a text String of16 bytes.
    * </code>
    */
   public void setCategoryNam(String theCategoryNam)
   {
       categoryNam = theCategoryNam;
   }

   /**
    * <code>
    * Name=TXT-ID;
    * </code>
    */
   public TxtId getTxtId()
   {
      return txtId;
   }

   /**
    * <code>
    * Name=TXT-ID;
    * </code>
    */
   public void setTxtId(TxtId theTxtId)
   {
       txtId = theTxtId;
   }

   /**
    * <code>
    * StatusFlg is a text String of1 bytes.
    * </code>
    */
   public String getStatusFlg()
   {
      return statusFlg;
   }

   /**
    * <code>
    * StatusFlg is a text String of1 bytes.
    * </code>
    */
   public void setStatusFlg(String theStatusFlg)
   {
       statusFlg = theStatusFlg;
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
      out.writeString(getComplCde(),2, CSLTypes.PICX);
      out.writeString(getDeliveryMde(),1, CSLTypes.PICX);
      out.writeString(getCategoryNam(),16, CSLTypes.PICX);
      getTxtId().write(out);
      out.writeString(getStatusFlg(),1, CSLTypes.PICX);
      out.writeString(getFiller(),8, CSLTypes.PICX);
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
      setComplCde(in.readString(2));
      setDeliveryMde(in.readString(1));
      setCategoryNam(in.readString(16));
      getTxtId().read(in);
      setStatusFlg(in.readString(1));
      setFiller(in.readString(8));
   } 
}
