/*
 * @(#)PtdfBuf.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.Afs;

/** <code>PtdfBuf</code>
 *  
 */
public class	PtdfBuf implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String ddd;
   protected String gpuk;
   protected Short crdsRet;
   protected String reconcileMode;
   protected String custBalDspy;
   protected Integer begTranCntlNum;
   protected Integer endTranCntlNum;
   protected java.util.Vector allowedTrans;
   protected Short batchCutoverCnt;
   protected Afs afs;
   protected String altMerchId;
   protected String userFldPtdfBuf;

   /** <code>PtdfBuf</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public PtdfBuf(String characterEncoding)
   {
      setDdd(new String());
      setGpuk(new String());
      setCrdsRet(new Short((short)0));
      setReconcileMode(new String());
      setCustBalDspy(new String());
      setBegTranCntlNum(new Integer(0));
      setEndTranCntlNum(new Integer(0));
       allowedTrans = new java.util.Vector();
      {
         int maxIndex = 30;
         for (int i=0; i < maxIndex; i++) {
            addAllowedTrans(new String());
         }
      }
      setBatchCutoverCnt(new Short((short)0));
      setAfs(new Afs());
      setAltMerchId(new String());
      setUserFldPtdfBuf(new String());
   }

   /** <code>PtdfBuf</code>
    *  Constructor
    */ 
   public PtdfBuf()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Ddd is a text String of900 bytes.
    * </code>
    */
   public String getDdd()
   {
      return ddd;
   }

   /**
    * <code>
    * Ddd is a text String of900 bytes.
    * </code>
    */
   public void setDdd(String theDdd)
   {
       ddd = theDdd;
   }

   /**
    * <code>
    * Gpuk is a text String of1300 bytes.
    * </code>
    */
   public String getGpuk()
   {
      return gpuk;
   }

   /**
    * <code>
    * Gpuk is a text String of1300 bytes.
    * </code>
    */
   public void setGpuk(String theGpuk)
   {
       gpuk = theGpuk;
   }

   /**
    * <code>
    * Name=CRDS-RET;CSL Type=cslShort;
    * </code>
    */
   public Short getCrdsRet()
   {
      return crdsRet;
   }

   /**
    * <code>
    * Name=CRDS-RET;CSL Type=cslShort;
    * </code>
    */
   public void setCrdsRet(Short theCrdsRet)
   {
       crdsRet = theCrdsRet;
   }

   /**
    * <code>
    * ReconcileMode is a text String of1 bytes.
    * </code>
    */
   public String getReconcileMode()
   {
      return reconcileMode;
   }

   /**
    * <code>
    * ReconcileMode is a text String of1 bytes.
    * </code>
    */
   public void setReconcileMode(String theReconcileMode)
   {
       reconcileMode = theReconcileMode;
   }

   /**
    * <code>
    * CustBalDspy is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getCustBalDspy()
   {
      return custBalDspy;
   }

   /**
    * <code>
    * CustBalDspy is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setCustBalDspy(String theCustBalDspy)
   {
       custBalDspy = theCustBalDspy;
   }

   /**
    * <code>
    * Name=BEG-TRAN-CNTL-NUM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getBegTranCntlNum()
   {
      return begTranCntlNum;
   }

   /**
    * <code>
    * Name=BEG-TRAN-CNTL-NUM;CSL Type=cslInteger;
    * </code>
    */
   public void setBegTranCntlNum(Integer theBegTranCntlNum)
   {
       begTranCntlNum = theBegTranCntlNum;
   }

   /**
    * <code>
    * Name=END-TRAN-CNTL-NUM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getEndTranCntlNum()
   {
      return endTranCntlNum;
   }

   /**
    * <code>
    * Name=END-TRAN-CNTL-NUM;CSL Type=cslInteger;
    * </code>
    */
   public void setEndTranCntlNum(Integer theEndTranCntlNum)
   {
       endTranCntlNum = theEndTranCntlNum;
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public String[] getAllowedTrans()
   {
       String[] retval = new String[allowedTrans.size()];
       allowedTrans.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public void setAllowedTrans(String[] values)
   {
       allowedTrans = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addAllowedTrans(values[i]);
      }
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public String getAllowedTrans(int i)
   {
      return (String)allowedTrans.elementAt(i);
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public void setAllowedTrans(int i, String value)
   {
       allowedTrans.setElementAt(value, i);
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public void addAllowedTrans(String value)
   {
       allowedTrans.addElement(value);
   }

   /**
    * <code>
    * AllowedTrans is a text String of1 bytes.
    * </code>
    */
   public void removeAllowedTrans(String value)
   {
       allowedTrans.removeElement(value);
   }

   /**
    * <code>
    * Name=BATCH-CUTOVER-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getBatchCutoverCnt()
   {
      return batchCutoverCnt;
   }

   /**
    * <code>
    * Name=BATCH-CUTOVER-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setBatchCutoverCnt(Short theBatchCutoverCnt)
   {
       batchCutoverCnt = theBatchCutoverCnt;
   }

   /**
    * <code>
    * Name=AFS;
    * </code>
    */
   public Afs getAfs()
   {
      return afs;
   }

   /**
    * <code>
    * Name=AFS;
    * </code>
    */
   public void setAfs(Afs theAfs)
   {
       afs = theAfs;
   }

   /**
    * <code>
    * AltMerchId is a text String of10 bytes.
    * </code>
    */
   public String getAltMerchId()
   {
      return altMerchId;
   }

   /**
    * <code>
    * AltMerchId is a text String of10 bytes.
    * </code>
    */
   public void setAltMerchId(String theAltMerchId)
   {
       altMerchId = theAltMerchId;
   }

   /**
    * <code>
    * UserFldPtdfBuf is a text String of1673 bytes.
    * </code>
    */
   public String getUserFldPtdfBuf()
   {
      return userFldPtdfBuf;
   }

   /**
    * <code>
    * UserFldPtdfBuf is a text String of1673 bytes.
    * </code>
    */
   public void setUserFldPtdfBuf(String theUserFldPtdfBuf)
   {
       userFldPtdfBuf = theUserFldPtdfBuf;
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
      out.writeString(getDdd(),900, CSLTypes.PICX);
      out.writeString(getGpuk(),1300, CSLTypes.PICX);
      out.writeShort(getCrdsRet().shortValue());
      out.writeString(getReconcileMode(),1, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getCustBalDspy(), 1, 0, 0);
      out.writeString(help1, help1.length());
      out.writeInt(getBegTranCntlNum().intValue());
      out.writeInt(getEndTranCntlNum().intValue());
      {
         int maxIndex = 30;
         int index = 0;
         java.util.Enumeration objects = allowedTrans.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            String toWrite = (String) objects.nextElement();
         out.writeString(toWrite, 1, CSLTypes.PICX);
            index++;
         }
      }
      out.writeShort(getBatchCutoverCnt().shortValue());
      getAfs().write(out);
      out.writeString(getAltMerchId(),10, CSLTypes.PICX);
      out.writeString(getUserFldPtdfBuf(),1673, CSLTypes.PICX);
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
      setDdd(in.readString(900));
      setGpuk(in.readString(1300));
      setCrdsRet(new Short(in.readShort()));
      setReconcileMode(in.readString(1));
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setCustBalDspy(help2);
      setBegTranCntlNum(new Integer(in.readInt()));
      setEndTranCntlNum(new Integer(in.readInt()));
      {
         int maxIndex = 30;
         int index = 0;
       allowedTrans = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            toRead = in.readString(1);
            addAllowedTrans(toRead); 
            index++;
         }
      }
      setBatchCutoverCnt(new Short(in.readShort()));
      getAfs().read(in);
      setAltMerchId(in.readString(10));
      setUserFldPtdfBuf(in.readString(1673));
   } 
}
