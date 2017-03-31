/*
 * @(#)LkDataPkg.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:53 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.EmvTermCap2;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.LogTotals;

/** <code>LkDataPkg</code>
 *  
 */
public class	LkDataPkg implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Short typeCnt1;
   protected Short typeCnt2;
   protected Short typeCnt3;
   protected Short newPgNum;
   protected Short numOfDecimals;
   protected String scrnDeactivateFlg;
   protected String scrnAdjLmtAmt;
   protected String scrnReturnLmtAmt;
   protected LogTotals logTotals;
   protected String scrnMKeyChkValue;
   protected String scrnMasKeyChkValue;
   protected EmvTermCap2 emvTermCap2;

   /** <code>LkDataPkg</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public LkDataPkg(String characterEncoding)
   {
      setTypeCnt1(new Short((short)0));
      setTypeCnt2(new Short((short)0));
      setTypeCnt3(new Short((short)0));
      setNewPgNum(new Short((short)0));
      setNumOfDecimals(new Short((short)0));
      setScrnDeactivateFlg(new String());
      setScrnAdjLmtAmt(new String());
      setScrnReturnLmtAmt(new String());
      setLogTotals(new LogTotals());
      setScrnMKeyChkValue(new String());
      setScrnMasKeyChkValue(new String());
      setEmvTermCap2(new EmvTermCap2());
   }

   /** <code>LkDataPkg</code>
    *  Constructor
    */ 
   public LkDataPkg()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=TYPE-CNT-1;CSL Type=cslShort;
    * </code>
    */
   public Short getTypeCnt1()
   {
      return typeCnt1;
   }

   /**
    * <code>
    * Name=TYPE-CNT-1;CSL Type=cslShort;
    * </code>
    */
   public void setTypeCnt1(Short theTypeCnt1)
   {
       typeCnt1 = theTypeCnt1;
   }

   /**
    * <code>
    * Name=TYPE-CNT-2;CSL Type=cslShort;
    * </code>
    */
   public Short getTypeCnt2()
   {
      return typeCnt2;
   }

   /**
    * <code>
    * Name=TYPE-CNT-2;CSL Type=cslShort;
    * </code>
    */
   public void setTypeCnt2(Short theTypeCnt2)
   {
       typeCnt2 = theTypeCnt2;
   }

   /**
    * <code>
    * Name=TYPE-CNT-3;CSL Type=cslShort;
    * </code>
    */
   public Short getTypeCnt3()
   {
      return typeCnt3;
   }

   /**
    * <code>
    * Name=TYPE-CNT-3;CSL Type=cslShort;
    * </code>
    */
   public void setTypeCnt3(Short theTypeCnt3)
   {
       typeCnt3 = theTypeCnt3;
   }

   /**
    * <code>
    * Name=NEW-PG-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getNewPgNum()
   {
      return newPgNum;
   }

   /**
    * <code>
    * Name=NEW-PG-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setNewPgNum(Short theNewPgNum)
   {
       newPgNum = theNewPgNum;
   }

   /**
    * <code>
    * Name=NUM-OF-DECIMALS;CSL Type=cslShort;
    * </code>
    */
   public Short getNumOfDecimals()
   {
      return numOfDecimals;
   }

   /**
    * <code>
    * Name=NUM-OF-DECIMALS;CSL Type=cslShort;
    * </code>
    */
   public void setNumOfDecimals(Short theNumOfDecimals)
   {
       numOfDecimals = theNumOfDecimals;
   }

   /**
    * <code>
    * ScrnDeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public String getScrnDeactivateFlg()
   {
      return scrnDeactivateFlg;
   }

   /**
    * <code>
    * ScrnDeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public void setScrnDeactivateFlg(String theScrnDeactivateFlg)
   {
       scrnDeactivateFlg = theScrnDeactivateFlg;
   }

   /**
    * <code>
    * ScrnAdjLmtAmt is a text String of16 bytes.
    * </code>
    */
   public String getScrnAdjLmtAmt()
   {
      return scrnAdjLmtAmt;
   }

   /**
    * <code>
    * ScrnAdjLmtAmt is a text String of16 bytes.
    * </code>
    */
   public void setScrnAdjLmtAmt(String theScrnAdjLmtAmt)
   {
       scrnAdjLmtAmt = theScrnAdjLmtAmt;
   }

   /**
    * <code>
    * ScrnReturnLmtAmt is a text String of16 bytes.
    * </code>
    */
   public String getScrnReturnLmtAmt()
   {
      return scrnReturnLmtAmt;
   }

   /**
    * <code>
    * ScrnReturnLmtAmt is a text String of16 bytes.
    * </code>
    */
   public void setScrnReturnLmtAmt(String theScrnReturnLmtAmt)
   {
       scrnReturnLmtAmt = theScrnReturnLmtAmt;
   }

   /**
    * <code>
    * Name=LOG-TOTALS;
    * </code>
    */
   public LogTotals getLogTotals()
   {
      return logTotals;
   }

   /**
    * <code>
    * Name=LOG-TOTALS;
    * </code>
    */
   public void setLogTotals(LogTotals theLogTotals)
   {
       logTotals = theLogTotals;
   }

   /**
    * <code>
    * ScrnMKeyChkValue is a text String of4 bytes.
    * </code>
    */
   public String getScrnMKeyChkValue()
   {
      return scrnMKeyChkValue;
   }

   /**
    * <code>
    * ScrnMKeyChkValue is a text String of4 bytes.
    * </code>
    */
   public void setScrnMKeyChkValue(String theScrnMKeyChkValue)
   {
       scrnMKeyChkValue = theScrnMKeyChkValue;
   }

   /**
    * <code>
    * ScrnMasKeyChkValue is a text String of4 bytes.
    * </code>
    */
   public String getScrnMasKeyChkValue()
   {
      return scrnMasKeyChkValue;
   }

   /**
    * <code>
    * ScrnMasKeyChkValue is a text String of4 bytes.
    * </code>
    */
   public void setScrnMasKeyChkValue(String theScrnMasKeyChkValue)
   {
       scrnMasKeyChkValue = theScrnMasKeyChkValue;
   }

   /**
    * <code>
    * Name=EMV-TERM-CAP;
    * </code>
    */
   public EmvTermCap2 getEmvTermCap2()
   {
      return emvTermCap2;
   }

   /**
    * <code>
    * Name=EMV-TERM-CAP;
    * </code>
    */
   public void setEmvTermCap2(EmvTermCap2 theEmvTermCap2)
   {
       emvTermCap2 = theEmvTermCap2;
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
      out.writeShort(getTypeCnt1().shortValue());
      out.writeShort(getTypeCnt2().shortValue());
      out.writeShort(getTypeCnt3().shortValue());
      out.writeShort(getNewPgNum().shortValue());
      out.writeShort(getNumOfDecimals().shortValue());
      out.writeString(getScrnDeactivateFlg(),1, CSLTypes.PICX);
      out.writeString(getScrnAdjLmtAmt(),16, CSLTypes.PICX);
      out.writeString(getScrnReturnLmtAmt(),16, CSLTypes.PICX);
      getLogTotals().write(out);
      out.writeString(getScrnMKeyChkValue(),4, CSLTypes.PICX);
      out.writeString(getScrnMasKeyChkValue(),4, CSLTypes.PICX);
      getEmvTermCap2().write(out);
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
      setTypeCnt1(new Short(in.readShort()));
      setTypeCnt2(new Short(in.readShort()));
      setTypeCnt3(new Short(in.readShort()));
      setNewPgNum(new Short(in.readShort()));
      setNumOfDecimals(new Short(in.readShort()));
      setScrnDeactivateFlg(in.readString(1));
      setScrnAdjLmtAmt(in.readString(16));
      setScrnReturnLmtAmt(in.readString(16));
      getLogTotals().read(in);
      setScrnMKeyChkValue(in.readString(4));
      setScrnMasKeyChkValue(in.readString(4));
      getEmvTermCap2().read(in);
   } 
}
