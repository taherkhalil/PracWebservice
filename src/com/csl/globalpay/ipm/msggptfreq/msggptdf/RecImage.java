/*
 * @(#)RecImage.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:31:00 PM
 */
package com.csl.globalpay.ipm.msggptfreq.msggptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msggptfreq.msggptdf.LastFm2;
import com.csl.globalpay.ipm.msggptfreq.msggptdf.Prikey;

/** <code>RecImage</code>
 *  
 */
public class	RecImage implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Prikey prikey;
   protected String equipValue;
   protected String ownerValue;
   protected String manufactureName;
   protected String productName;
   protected String subBureau;
   protected String userFld1;
   protected LastFm2 lastFm2;

   /** <code>RecImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public RecImage(String characterEncoding)
   {
      setPrikey(new Prikey());
      setEquipValue(new String());
      setOwnerValue(new String());
      setManufactureName(new String());
      setProductName(new String());
      setSubBureau(new String());
      setUserFld1(new String());
      setLastFm2(new LastFm2());
   }

   /** <code>RecImage</code>
    *  Constructor
    */ 
   public RecImage()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=PRIKEY;
    * </code>
    */
   public Prikey getPrikey()
   {
      return prikey;
   }

   /**
    * <code>
    * Name=PRIKEY;
    * </code>
    */
   public void setPrikey(Prikey thePrikey)
   {
       prikey = thePrikey;
   }

   /**
    * <code>
    * EquipValue is a text String of15 bytes.
    * </code>
    */
   public String getEquipValue()
   {
      return equipValue;
   }

   /**
    * <code>
    * EquipValue is a text String of15 bytes.
    * </code>
    */
   public void setEquipValue(String theEquipValue)
   {
       equipValue = theEquipValue;
   }

   /**
    * <code>
    * OwnerValue is a text String of15 bytes.
    * </code>
    */
   public String getOwnerValue()
   {
      return ownerValue;
   }

   /**
    * <code>
    * OwnerValue is a text String of15 bytes.
    * </code>
    */
   public void setOwnerValue(String theOwnerValue)
   {
       ownerValue = theOwnerValue;
   }

   /**
    * <code>
    * ManufactureName is a text String of20 bytes.
    * </code>
    */
   public String getManufactureName()
   {
      return manufactureName;
   }

   /**
    * <code>
    * ManufactureName is a text String of20 bytes.
    * </code>
    */
   public void setManufactureName(String theManufactureName)
   {
       manufactureName = theManufactureName;
   }

   /**
    * <code>
    * ProductName is a text String of25 bytes.
    * </code>
    */
   public String getProductName()
   {
      return productName;
   }

   /**
    * <code>
    * ProductName is a text String of25 bytes.
    * </code>
    */
   public void setProductName(String theProductName)
   {
       productName = theProductName;
   }

   /**
    * <code>
    * SubBureau is a text String of25 bytes.
    * </code>
    */
   public String getSubBureau()
   {
      return subBureau;
   }

   /**
    * <code>
    * SubBureau is a text String of25 bytes.
    * </code>
    */
   public void setSubBureau(String theSubBureau)
   {
       subBureau = theSubBureau;
   }

   /**
    * <code>
    * UserFld1 is a text String of26 bytes.
    * </code>
    */
   public String getUserFld1()
   {
      return userFld1;
   }

   /**
    * <code>
    * UserFld1 is a text String of26 bytes.
    * </code>
    */
   public void setUserFld1(String theUserFld1)
   {
       userFld1 = theUserFld1;
   }

   /**
    * <code>
    * Name=LAST-FM;
    * </code>
    */
   public LastFm2 getLastFm2()
   {
      return lastFm2;
   }

   /**
    * <code>
    * Name=LAST-FM;
    * </code>
    */
   public void setLastFm2(LastFm2 theLastFm2)
   {
       lastFm2 = theLastFm2;
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
      getPrikey().write(out);
      out.writeString(getEquipValue(),15, CSLTypes.PICX);
      out.writeString(getOwnerValue(),15, CSLTypes.PICX);
      out.writeString(getManufactureName(),20, CSLTypes.PICX);
      out.writeString(getProductName(),25, CSLTypes.PICX);
      out.writeString(getSubBureau(),25, CSLTypes.PICX);
      out.writeString(getUserFld1(),26, CSLTypes.PICX);
      getLastFm2().write(out);
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
      getPrikey().read(in);
      setEquipValue(in.readString(15));
      setOwnerValue(in.readString(15));
      setManufactureName(in.readString(20));
      setProductName(in.readString(25));
      setSubBureau(in.readString(25));
      setUserFld1(in.readString(26));
      getLastFm2().read(in);
   } 
}
