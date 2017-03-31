/*
 * @(#)Srv.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Srv</code>
 *  
 */
public class	Srv implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String typ;
   protected Integer npFlrLmt;
   protected Integer caFlrLmt;
   protected Integer moFlrLmt;
   protected Integer tranLmt;
   protected Short dbCnt;
   protected Long db;
   protected Short crCnt;
   protected Long cr;
   protected Short adjCnt;
   protected Long adj;
   protected String tranProfile;
   protected String elecFollowup;

   /** <code>Srv</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Srv(String characterEncoding)
   {
      setTyp(new String());
      setNpFlrLmt(new Integer(0));
      setCaFlrLmt(new Integer(0));
      setMoFlrLmt(new Integer(0));
      setTranLmt(new Integer(0));
      setDbCnt(new Short((short)0));
      setDb(new Long((long)0));
      setCrCnt(new Short((short)0));
      setCr(new Long((long)0));
      setAdjCnt(new Short((short)0));
      setAdj(new Long((long)0));
      setTranProfile(new String());
      setElecFollowup(new String());
   }

   /** <code>Srv</code>
    *  Constructor
    */ 
   public Srv()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Typ is a text String of2 bytes.
    * </code>
    */
   public String getTyp()
   {
      return typ;
   }

   /**
    * <code>
    * Typ is a text String of2 bytes.
    * </code>
    */
   public void setTyp(String theTyp)
   {
       typ = theTyp;
   }

   /**
    * <code>
    * Name=NP-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getNpFlrLmt()
   {
      return npFlrLmt;
   }

   /**
    * <code>
    * Name=NP-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public void setNpFlrLmt(Integer theNpFlrLmt)
   {
       npFlrLmt = theNpFlrLmt;
   }

   /**
    * <code>
    * Name=CA-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getCaFlrLmt()
   {
      return caFlrLmt;
   }

   /**
    * <code>
    * Name=CA-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public void setCaFlrLmt(Integer theCaFlrLmt)
   {
       caFlrLmt = theCaFlrLmt;
   }

   /**
    * <code>
    * Name=MO-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getMoFlrLmt()
   {
      return moFlrLmt;
   }

   /**
    * <code>
    * Name=MO-FLR-LMT;CSL Type=cslInteger;
    * </code>
    */
   public void setMoFlrLmt(Integer theMoFlrLmt)
   {
       moFlrLmt = theMoFlrLmt;
   }

   /**
    * <code>
    * Name=TRAN-LMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getTranLmt()
   {
      return tranLmt;
   }

   /**
    * <code>
    * Name=TRAN-LMT;CSL Type=cslInteger;
    * </code>
    */
   public void setTranLmt(Integer theTranLmt)
   {
       tranLmt = theTranLmt;
   }

   /**
    * <code>
    * Name=DB-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getDbCnt()
   {
      return dbCnt;
   }

   /**
    * <code>
    * Name=DB-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setDbCnt(Short theDbCnt)
   {
       dbCnt = theDbCnt;
   }

   /**
    * <code>
    * Name=DB;CSL Type=cslLong;
    * </code>
    */
   public Long getDb()
   {
      return db;
   }

   /**
    * <code>
    * Name=DB;CSL Type=cslLong;
    * </code>
    */
   public void setDb(Long theDb)
   {
       db = theDb;
   }

   /**
    * <code>
    * Name=CR-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getCrCnt()
   {
      return crCnt;
   }

   /**
    * <code>
    * Name=CR-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setCrCnt(Short theCrCnt)
   {
       crCnt = theCrCnt;
   }

   /**
    * <code>
    * Name=CR;CSL Type=cslLong;
    * </code>
    */
   public Long getCr()
   {
      return cr;
   }

   /**
    * <code>
    * Name=CR;CSL Type=cslLong;
    * </code>
    */
   public void setCr(Long theCr)
   {
       cr = theCr;
   }

   /**
    * <code>
    * Name=ADJ-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getAdjCnt()
   {
      return adjCnt;
   }

   /**
    * <code>
    * Name=ADJ-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setAdjCnt(Short theAdjCnt)
   {
       adjCnt = theAdjCnt;
   }

   /**
    * <code>
    * Name=ADJ;CSL Type=cslLong;
    * </code>
    */
   public Long getAdj()
   {
      return adj;
   }

   /**
    * <code>
    * Name=ADJ;CSL Type=cslLong;
    * </code>
    */
   public void setAdj(Long theAdj)
   {
       adj = theAdj;
   }

   /**
    * <code>
    * TranProfile is a text String of1 bytes.
    * </code>
    */
   public String getTranProfile()
   {
      return tranProfile;
   }

   /**
    * <code>
    * TranProfile is a text String of1 bytes.
    * </code>
    */
   public void setTranProfile(String theTranProfile)
   {
       tranProfile = theTranProfile;
   }

   /**
    * <code>
    * ElecFollowup is a text String of1 bytes.
    * </code>
    */
   public String getElecFollowup()
   {
      return elecFollowup;
   }

   /**
    * <code>
    * ElecFollowup is a text String of1 bytes.
    * </code>
    */
   public void setElecFollowup(String theElecFollowup)
   {
       elecFollowup = theElecFollowup;
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
      out.writeString(getTyp(),2, CSLTypes.PICX);
      out.writeInt(getNpFlrLmt().intValue());
      out.writeInt(getCaFlrLmt().intValue());
      out.writeInt(getMoFlrLmt().intValue());
      out.writeInt(getTranLmt().intValue());
      out.writeShort(getDbCnt().shortValue());
      out.writeLong(getDb().longValue());
      out.writeShort(getCrCnt().shortValue());
      out.writeLong(getCr().longValue());
      out.writeShort(getAdjCnt().shortValue());
      out.writeLong(getAdj().longValue());
      out.writeString(getTranProfile(),1, CSLTypes.PICX);
      out.writeString(getElecFollowup(),1, CSLTypes.PICX);
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
      setTyp(in.readString(2));
      setNpFlrLmt(new Integer(in.readInt()));
      setCaFlrLmt(new Integer(in.readInt()));
      setMoFlrLmt(new Integer(in.readInt()));
      setTranLmt(new Integer(in.readInt()));
      setDbCnt(new Short(in.readShort()));
      setDb(new Long(in.readLong()));
      setCrCnt(new Short(in.readShort()));
      setCr(new Long(in.readLong()));
      setAdjCnt(new Short(in.readShort()));
      setAdj(new Long(in.readLong()));
      setTranProfile(in.readString(1));
      setElecFollowup(in.readString(1));
   } 
}
