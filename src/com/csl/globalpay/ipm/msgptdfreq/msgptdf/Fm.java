/*
 * @(#)Fm.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.UserId;

/** <code>Fm</code>
 *  
 */
public class	Fm implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Long afmTs;
   protected Short updtTyp;
   protected UserId userId;
   protected String termNam;

   /** <code>Fm</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Fm(String characterEncoding)
   {
      setAfmTs(new Long((long)0));
      setUpdtTyp(new Short((short)0));
      setUserId(new UserId());
      setTermNam(new String());
   }

   /** <code>Fm</code>
    *  Constructor
    */ 
   public Fm()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=AFM-TS;CSL Type=cslLong;
    * </code>
    */
   public Long getAfmTs()
   {
      return afmTs;
   }

   /**
    * <code>
    * Name=AFM-TS;CSL Type=cslLong;
    * </code>
    */
   public void setAfmTs(Long theAfmTs)
   {
       afmTs = theAfmTs;
   }

   /**
    * <code>
    * Name=UPDT-TYP;CSL Type=cslShort;
    * </code>
    */
   public Short getUpdtTyp()
   {
      return updtTyp;
   }

   /**
    * <code>
    * Name=UPDT-TYP;CSL Type=cslShort;
    * </code>
    */
   public void setUpdtTyp(Short theUpdtTyp)
   {
       updtTyp = theUpdtTyp;
   }

   /**
    * <code>
    * Name=USER-ID;
    * </code>
    */
   public UserId getUserId()
   {
      return userId;
   }

   /**
    * <code>
    * Name=USER-ID;
    * </code>
    */
   public void setUserId(UserId theUserId)
   {
       userId = theUserId;
   }

   /**
    * <code>
    * TermNam is a text String of24 bytes.
    * </code>
    */
   public String getTermNam()
   {
      return termNam;
   }

   /**
    * <code>
    * TermNam is a text String of24 bytes.
    * </code>
    */
   public void setTermNam(String theTermNam)
   {
       termNam = theTermNam;
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
      out.writeLong(getAfmTs().longValue());
      out.writeShort(getUpdtTyp().shortValue());
      getUserId().write(out);
      out.writeString(getTermNam(),24, CSLTypes.PICX);
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
      setAfmTs(new Long(in.readLong()));
      setUpdtTyp(new Short(in.readShort()));
      getUserId().read(in);
      setTermNam(in.readString(24));
   } 
}
