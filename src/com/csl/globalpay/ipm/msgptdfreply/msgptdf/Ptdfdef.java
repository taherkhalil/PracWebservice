/*
 * @(#)Ptdfdef.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:53 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.Batch;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.BatchDc;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.ClerkTots;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.CurNet;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.CurNetDc;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.Daily;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.DailyDc;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.DynLastAfm;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.EmvTermCap;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.EncrPin;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.ErrInfo;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.LastTran;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.LkDataPkg;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.MacData;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.MailData;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.MultThreadSpdh;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.PostDat;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.PreNet;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.PreNetDc;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.PtdfBuf;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.Shift;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.ShiftDc;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.Srv;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.SrvRep;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.StatLastAfm;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.Term;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.TermCitySt;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.TermId;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.TermOwner;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.TermPhone;

/** <code>Ptdfdef</code>
 *  
 */
public class	Ptdfdef implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected TermId termId;
   protected String dhProName;
   protected TermOwner termOwner;
   protected String userFld1;
   protected MultThreadSpdh multThreadSpdh;
   protected DynLastAfm dynLastAfm;
   protected StatLastAfm statLastAfm;
   protected LastTran lastTran;
   protected Short dynCoreLgth;
   protected Short dynDevInfoOfst;
   protected Short dynDevInfoLgth;
   protected Short dynDevDataOfst;
   protected Short dynDevDataLgth;
   protected Short staticCoreLgth;
   protected Short staticDevInfoOfst;
   protected Short staticDevInfoLgth;
   protected Short staticDevDataOfst;
   protected Short staticDevDataLgth;
   protected String rttn;
   protected String termGrp;
   protected String termTyp;
   protected String pinPadChar;
   protected EncrPin encrPin;
   protected String keyLgth;
   protected MacData macData;
   protected java.util.Vector desWorkArea;
   protected String mKeyChkValue;
   protected String masKeyChkValue;
   protected String crncyCde;
   protected String deactivateFlg;
   protected Short timOfst;
   protected Long tranSeqNum;
   protected Short numSrv;
   protected java.util.Vector srv;
   protected PostDat postDat;
   protected String balFlg;
   protected String authEstFlg;
   protected Integer lastSetlDat;
   protected Short lastSetlTim;
   protected String clerkId;
   protected String billingInfo;
   protected ClerkTots clerkTots;
   protected Batch batch;
   protected BatchDc batchDc;
   protected Shift shift;
   protected ShiftDc shiftDc;
   protected Daily daily;
   protected DailyDc dailyDc;
   protected CurNet curNet;
   protected CurNetDc curNetDc;
   protected PreNet preNet;
   protected PreNetDc preNetDc;
   protected String termCutoverTc;
   protected String dualSiteInd;
   protected Short numShifts;
   protected Term term;
   protected Short numBatches;
   protected Short shiftNum;
   protected Short batchNum;
   protected Short seqNum;
   protected String logTotals;
   protected String waitConfirmFlg;
   protected MailData mailData;
   protected String statRsnCde;
   protected String macPendingFlg;
   protected String pinPendingFlg;
   protected String dataPendingFlg;
   protected String dataEncryptTyp;
   protected String relNum;
   protected String loadFilNam;
   protected Short logRtCde;
   protected String termNamLoc;
   protected TermCitySt termCitySt;
   protected String cntryCde;
   protected String acqTxnPrfl;
   protected String termOwnerNam;
   protected String termSicCde;
   protected SrvRep srvRep;
   protected String multCrncyTtl;
   protected Short preAuthHld;
   protected Integer preAuthDftAmt;
   protected String dfltChkId;
   protected String dfltTc;
   protected Short apprvCdeLgth;
   protected Short adjLmtCnt;
   protected Long adjLmtAmt;
   protected Short returnLmtCnt;
   protected Long returnLmtAmt;
   protected String preAuthLessAmtFlg;
   protected String adjFlg;
   protected String salesDftFlg;
   protected String termProto;
   protected String balSupport;
   protected String tknRetrvOpt;
   protected Short languageInd;
   protected Short clerkFlag;
   protected String postalCde;
   protected TermPhone termPhone;
   protected String rteGrp;
   protected String completeTrack2Data;
   protected String mailPoSicCde;
   protected String cityExt;
   protected String clerkTtlFlg;
   protected String sftwrRel;
   protected Short preCommFlrLmt;
   protected Short postCommFlrLmt;
   protected String preCommLmtFlg;
   protected String postCommLmtFlg;
   protected EmvTermCap emvTermCap;
   protected String keydGrp;
   protected String dpcNum;
   protected String rcnclEnt;
   protected String enhncPreAuthFlg;
   protected String preAuthChrgbckFlg;
   protected String balRtrnFlg;
   protected String termAttendInd;
   protected String termLocInd;
   protected String crdCaptrInd;
   protected String crdhldrActvtTermInd;
   protected String termInputCapInd;
   protected String termOutputCapInd;
   protected String crdhldrAuthnCapInd;
   protected String ctlsInputCapInd;
   protected String pmntFacilitatorId;
   protected String subMrchId;
   protected PtdfBuf ptdfBuf;
   protected ErrInfo errInfo;
   protected java.util.Vector errPosnInd;
   protected String funcKey;
   protected String scrnAccessInfoLgnt;
   protected LkDataPkg lkDataPkg;
   protected String tblLookUpGrp;

   /** <code>Ptdfdef</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Ptdfdef(String characterEncoding)
   {
      setTermId(new TermId());
      setDhProName(new String());
      setTermOwner(new TermOwner());
      setUserFld1(new String());
      setMultThreadSpdh(new MultThreadSpdh());
      setDynLastAfm(new DynLastAfm());
      setStatLastAfm(new StatLastAfm());
      setLastTran(new LastTran());
      setDynCoreLgth(new Short((short)0));
      setDynDevInfoOfst(new Short((short)0));
      setDynDevInfoLgth(new Short((short)0));
      setDynDevDataOfst(new Short((short)0));
      setDynDevDataLgth(new Short((short)0));
      setStaticCoreLgth(new Short((short)0));
      setStaticDevInfoOfst(new Short((short)0));
      setStaticDevInfoLgth(new Short((short)0));
      setStaticDevDataOfst(new Short((short)0));
      setStaticDevDataLgth(new Short((short)0));
      setRttn(new String());
      setTermGrp(new String());
      setTermTyp(new String());
      setPinPadChar(new String());
      setEncrPin(new EncrPin());
      setKeyLgth(new String());
      setMacData(new MacData());
       desWorkArea = new java.util.Vector();
      {
         int maxIndex = 52;
         for (int i=0; i < maxIndex; i++) {
            addDesWorkArea(new Short((short)0));
         }
      }
      setMKeyChkValue(new String());
      setMasKeyChkValue(new String());
      setCrncyCde(new String());
      setDeactivateFlg(new String());
      setTimOfst(new Short((short)0));
      setTranSeqNum(new Long((long)0));
      setNumSrv(new Short((short)0));
       srv = new java.util.Vector();
      {
         int maxIndex = 30;
         for (int i=0; i < maxIndex; i++) {
            addSrv(new Srv());
         }
      }
      setPostDat(new PostDat());
      setBalFlg(new String());
      setAuthEstFlg(new String());
      setLastSetlDat(new Integer(0));
      setLastSetlTim(new Short((short)0));
      setClerkId(new String());
      setBillingInfo(new String());
      setClerkTots(new ClerkTots());
      setBatch(new Batch());
      setBatchDc(new BatchDc());
      setShift(new Shift());
      setShiftDc(new ShiftDc());
      setDaily(new Daily());
      setDailyDc(new DailyDc());
      setCurNet(new CurNet());
      setCurNetDc(new CurNetDc());
      setPreNet(new PreNet());
      setPreNetDc(new PreNetDc());
      setTermCutoverTc(new String());
      setDualSiteInd(new String());
      setNumShifts(new Short((short)0));
      setTerm(new Term());
      setNumBatches(new Short((short)0));
      setShiftNum(new Short((short)0));
      setBatchNum(new Short((short)0));
      setSeqNum(new Short((short)0));
      setLogTotals(new String());
      setWaitConfirmFlg(new String());
      setMailData(new MailData());
      setStatRsnCde(new String());
      setMacPendingFlg(new String());
      setPinPendingFlg(new String());
      setDataPendingFlg(new String());
      setDataEncryptTyp(new String());
      setRelNum(new String());
      setLoadFilNam(new String());
      setLogRtCde(new Short((short)0));
      setTermNamLoc(new String());
      setTermCitySt(new TermCitySt());
      setCntryCde(new String());
      setAcqTxnPrfl(new String());
      setTermOwnerNam(new String());
      setTermSicCde(new String());
      setSrvRep(new SrvRep());
      setMultCrncyTtl(new String());
      setPreAuthHld(new Short((short)0));
      setPreAuthDftAmt(new Integer(0));
      setDfltChkId(new String());
      setDfltTc(new String());
      setApprvCdeLgth(new Short((short)0));
      setAdjLmtCnt(new Short((short)0));
      setAdjLmtAmt(new Long((long)0));
      setReturnLmtCnt(new Short((short)0));
      setReturnLmtAmt(new Long((long)0));
      setPreAuthLessAmtFlg(new String());
      setAdjFlg(new String());
      setSalesDftFlg(new String());
      setTermProto(new String());
      setBalSupport(new String());
      setTknRetrvOpt(new String());
      setLanguageInd(new Short((short)0));
      setClerkFlag(new Short((short)0));
      setPostalCde(new String());
      setTermPhone(new TermPhone());
      setRteGrp(new String());
      setCompleteTrack2Data(new String());
      setMailPoSicCde(new String());
      setCityExt(new String());
      setClerkTtlFlg(new String());
      setSftwrRel(new String());
      setPreCommFlrLmt(new Short((short)0));
      setPostCommFlrLmt(new Short((short)0));
      setPreCommLmtFlg(new String());
      setPostCommLmtFlg(new String());
      setEmvTermCap(new EmvTermCap());
      setKeydGrp(new String());
      setDpcNum(new String());
      setRcnclEnt(new String());
      setEnhncPreAuthFlg(new String());
      setPreAuthChrgbckFlg(new String());
      setBalRtrnFlg(new String());
      setTermAttendInd(new String());
      setTermLocInd(new String());
      setCrdCaptrInd(new String());
      setCrdhldrActvtTermInd(new String());
      setTermInputCapInd(new String());
      setTermOutputCapInd(new String());
      setCrdhldrAuthnCapInd(new String());
      setCtlsInputCapInd(new String());
      setPmntFacilitatorId(new String());
      setSubMrchId(new String());
      setPtdfBuf(new PtdfBuf());
      setErrInfo(new ErrInfo());
       errPosnInd = new java.util.Vector();
      {
         int maxIndex = 45;
         for (int i=0; i < maxIndex; i++) {
            addErrPosnInd(new Short((short)0));
         }
      }
      setFuncKey(new String());
      setScrnAccessInfoLgnt(new String());
      setLkDataPkg(new LkDataPkg());
      setTblLookUpGrp(new String());
   }

   /** <code>Ptdfdef</code>
    *  Constructor
    */ 
   public Ptdfdef()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=TERM-ID;
    * </code>
    */
   public TermId getTermId()
   {
      return termId;
   }

   /**
    * <code>
    * Name=TERM-ID;
    * </code>
    */
   public void setTermId(TermId theTermId)
   {
       termId = theTermId;
   }

   /**
    * <code>
    * DhProName is a text String of16 bytes.
    * </code>
    */
   public String getDhProName()
   {
      return dhProName;
   }

   /**
    * <code>
    * DhProName is a text String of16 bytes.
    * </code>
    */
   public void setDhProName(String theDhProName)
   {
       dhProName = theDhProName;
   }

   /**
    * <code>
    * Name=TERM-OWNER;
    * </code>
    */
   public TermOwner getTermOwner()
   {
      return termOwner;
   }

   /**
    * <code>
    * Name=TERM-OWNER;
    * </code>
    */
   public void setTermOwner(TermOwner theTermOwner)
   {
       termOwner = theTermOwner;
   }

   /**
    * <code>
    * UserFld1 is a text String of1 bytes.
    * </code>
    */
   public String getUserFld1()
   {
      return userFld1;
   }

   /**
    * <code>
    * UserFld1 is a text String of1 bytes.
    * </code>
    */
   public void setUserFld1(String theUserFld1)
   {
       userFld1 = theUserFld1;
   }

   /**
    * <code>
    * Name=MULT-THREAD-SPDH;
    * </code>
    */
   public MultThreadSpdh getMultThreadSpdh()
   {
      return multThreadSpdh;
   }

   /**
    * <code>
    * Name=MULT-THREAD-SPDH;
    * </code>
    */
   public void setMultThreadSpdh(MultThreadSpdh theMultThreadSpdh)
   {
       multThreadSpdh = theMultThreadSpdh;
   }

   /**
    * <code>
    * Name=DYN-LAST-AFM;
    * </code>
    */
   public DynLastAfm getDynLastAfm()
   {
      return dynLastAfm;
   }

   /**
    * <code>
    * Name=DYN-LAST-AFM;
    * </code>
    */
   public void setDynLastAfm(DynLastAfm theDynLastAfm)
   {
       dynLastAfm = theDynLastAfm;
   }

   /**
    * <code>
    * Name=STAT-LAST-AFM;
    * </code>
    */
   public StatLastAfm getStatLastAfm()
   {
      return statLastAfm;
   }

   /**
    * <code>
    * Name=STAT-LAST-AFM;
    * </code>
    */
   public void setStatLastAfm(StatLastAfm theStatLastAfm)
   {
       statLastAfm = theStatLastAfm;
   }

   /**
    * <code>
    * Name=LAST-TRAN;
    * </code>
    */
   public LastTran getLastTran()
   {
      return lastTran;
   }

   /**
    * <code>
    * Name=LAST-TRAN;
    * </code>
    */
   public void setLastTran(LastTran theLastTran)
   {
       lastTran = theLastTran;
   }

   /**
    * <code>
    * Name=DYN-CORE-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getDynCoreLgth()
   {
      return dynCoreLgth;
   }

   /**
    * <code>
    * Name=DYN-CORE-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setDynCoreLgth(Short theDynCoreLgth)
   {
       dynCoreLgth = theDynCoreLgth;
   }

   /**
    * <code>
    * Name=DYN-DEV-INFO-OFST;CSL Type=cslShort;
    * </code>
    */
   public Short getDynDevInfoOfst()
   {
      return dynDevInfoOfst;
   }

   /**
    * <code>
    * Name=DYN-DEV-INFO-OFST;CSL Type=cslShort;
    * </code>
    */
   public void setDynDevInfoOfst(Short theDynDevInfoOfst)
   {
       dynDevInfoOfst = theDynDevInfoOfst;
   }

   /**
    * <code>
    * Name=DYN-DEV-INFO-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getDynDevInfoLgth()
   {
      return dynDevInfoLgth;
   }

   /**
    * <code>
    * Name=DYN-DEV-INFO-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setDynDevInfoLgth(Short theDynDevInfoLgth)
   {
       dynDevInfoLgth = theDynDevInfoLgth;
   }

   /**
    * <code>
    * Name=DYN-DEV-DATA-OFST;CSL Type=cslShort;
    * </code>
    */
   public Short getDynDevDataOfst()
   {
      return dynDevDataOfst;
   }

   /**
    * <code>
    * Name=DYN-DEV-DATA-OFST;CSL Type=cslShort;
    * </code>
    */
   public void setDynDevDataOfst(Short theDynDevDataOfst)
   {
       dynDevDataOfst = theDynDevDataOfst;
   }

   /**
    * <code>
    * Name=DYN-DEV-DATA-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getDynDevDataLgth()
   {
      return dynDevDataLgth;
   }

   /**
    * <code>
    * Name=DYN-DEV-DATA-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setDynDevDataLgth(Short theDynDevDataLgth)
   {
       dynDevDataLgth = theDynDevDataLgth;
   }

   /**
    * <code>
    * Name=STATIC-CORE-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getStaticCoreLgth()
   {
      return staticCoreLgth;
   }

   /**
    * <code>
    * Name=STATIC-CORE-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setStaticCoreLgth(Short theStaticCoreLgth)
   {
       staticCoreLgth = theStaticCoreLgth;
   }

   /**
    * <code>
    * Name=STATIC-DEV-INFO-OFST;CSL Type=cslShort;
    * </code>
    */
   public Short getStaticDevInfoOfst()
   {
      return staticDevInfoOfst;
   }

   /**
    * <code>
    * Name=STATIC-DEV-INFO-OFST;CSL Type=cslShort;
    * </code>
    */
   public void setStaticDevInfoOfst(Short theStaticDevInfoOfst)
   {
       staticDevInfoOfst = theStaticDevInfoOfst;
   }

   /**
    * <code>
    * Name=STATIC-DEV-INFO-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getStaticDevInfoLgth()
   {
      return staticDevInfoLgth;
   }

   /**
    * <code>
    * Name=STATIC-DEV-INFO-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setStaticDevInfoLgth(Short theStaticDevInfoLgth)
   {
       staticDevInfoLgth = theStaticDevInfoLgth;
   }

   /**
    * <code>
    * Name=STATIC-DEV-DATA-OFST;CSL Type=cslShort;
    * </code>
    */
   public Short getStaticDevDataOfst()
   {
      return staticDevDataOfst;
   }

   /**
    * <code>
    * Name=STATIC-DEV-DATA-OFST;CSL Type=cslShort;
    * </code>
    */
   public void setStaticDevDataOfst(Short theStaticDevDataOfst)
   {
       staticDevDataOfst = theStaticDevDataOfst;
   }

   /**
    * <code>
    * Name=STATIC-DEV-DATA-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getStaticDevDataLgth()
   {
      return staticDevDataLgth;
   }

   /**
    * <code>
    * Name=STATIC-DEV-DATA-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setStaticDevDataLgth(Short theStaticDevDataLgth)
   {
       staticDevDataLgth = theStaticDevDataLgth;
   }

   /**
    * <code>
    * Rttn is a numeric String of
							11 digits with 0 decimal places.
    * </code>
    */
   public String getRttn()
   {
      return rttn;
   }

   /**
    * <code>
    * Rttn is a numeric String of
							11 digits with 0 decimal places.
    * </code>
    */
   public void setRttn(String theRttn)
   {
       rttn = theRttn;
   }

   /**
    * <code>
    * TermGrp is a text String of4 bytes.
    * </code>
    */
   public String getTermGrp()
   {
      return termGrp;
   }

   /**
    * <code>
    * TermGrp is a text String of4 bytes.
    * </code>
    */
   public void setTermGrp(String theTermGrp)
   {
       termGrp = theTermGrp;
   }

   /**
    * <code>
    * TermTyp is a text String of2 bytes.
    * </code>
    */
   public String getTermTyp()
   {
      return termTyp;
   }

   /**
    * <code>
    * TermTyp is a text String of2 bytes.
    * </code>
    */
   public void setTermTyp(String theTermTyp)
   {
       termTyp = theTermTyp;
   }

   /**
    * <code>
    * PinPadChar is a text String of1 bytes.
    * </code>
    */
   public String getPinPadChar()
   {
      return pinPadChar;
   }

   /**
    * <code>
    * PinPadChar is a text String of1 bytes.
    * </code>
    */
   public void setPinPadChar(String thePinPadChar)
   {
       pinPadChar = thePinPadChar;
   }

   /**
    * <code>
    * Name=ENCR-PIN;
    * </code>
    */
   public EncrPin getEncrPin()
   {
      return encrPin;
   }

   /**
    * <code>
    * Name=ENCR-PIN;
    * </code>
    */
   public void setEncrPin(EncrPin theEncrPin)
   {
       encrPin = theEncrPin;
   }

   /**
    * <code>
    * KeyLgth is a text String of1 bytes.
    * </code>
    */
   public String getKeyLgth()
   {
      return keyLgth;
   }

   /**
    * <code>
    * KeyLgth is a text String of1 bytes.
    * </code>
    */
   public void setKeyLgth(String theKeyLgth)
   {
       keyLgth = theKeyLgth;
   }

   /**
    * <code>
    * Name=MAC-DATA;
    * </code>
    */
   public MacData getMacData()
   {
      return macData;
   }

   /**
    * <code>
    * Name=MAC-DATA;
    * </code>
    */
   public void setMacData(MacData theMacData)
   {
       macData = theMacData;
   }

   /**
    * <code>
    * Name=DES-WORK-AREA;CSL Type=cslShort;
    * </code>
    */
   public Short[] getDesWorkArea()
   {
       Short[] retval = new Short[desWorkArea.size()];
       desWorkArea.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=DES-WORK-AREA;CSL Type=cslShort;
    * </code>
    */
   public void setDesWorkArea(Short[] values)
   {
       desWorkArea = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addDesWorkArea(values[i]);
      }
   }

   /**
    * <code>
    * Name=DES-WORK-AREA;CSL Type=cslShort;
    * </code>
    */
   public Short getDesWorkArea(int i)
   {
      return (Short)desWorkArea.elementAt(i);
   }

   /**
    * <code>
    * Name=DES-WORK-AREA;CSL Type=cslShort;
    * </code>
    */
   public void setDesWorkArea(int i, Short value)
   {
       desWorkArea.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=DES-WORK-AREA;CSL Type=cslShort;
    * </code>
    */
   public void addDesWorkArea(Short value)
   {
       desWorkArea.addElement(value);
   }

   /**
    * <code>
    * Name=DES-WORK-AREA;CSL Type=cslShort;
    * </code>
    */
   public void removeDesWorkArea(Short value)
   {
       desWorkArea.removeElement(value);
   }

   /**
    * <code>
    * MKeyChkValue is a text String of3 bytes.
    * </code>
    */
   public String getMKeyChkValue()
   {
      return mKeyChkValue;
   }

   /**
    * <code>
    * MKeyChkValue is a text String of3 bytes.
    * </code>
    */
   public void setMKeyChkValue(String theMKeyChkValue)
   {
       mKeyChkValue = theMKeyChkValue;
   }

   /**
    * <code>
    * MasKeyChkValue is a text String of3 bytes.
    * </code>
    */
   public String getMasKeyChkValue()
   {
      return masKeyChkValue;
   }

   /**
    * <code>
    * MasKeyChkValue is a text String of3 bytes.
    * </code>
    */
   public void setMasKeyChkValue(String theMasKeyChkValue)
   {
       masKeyChkValue = theMasKeyChkValue;
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

   /**
    * <code>
    * DeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public String getDeactivateFlg()
   {
      return deactivateFlg;
   }

   /**
    * <code>
    * DeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public void setDeactivateFlg(String theDeactivateFlg)
   {
       deactivateFlg = theDeactivateFlg;
   }

   /**
    * <code>
    * Name=TIM-OFST;CSL Type=cslShort;
    * </code>
    */
   public Short getTimOfst()
   {
      return timOfst;
   }

   /**
    * <code>
    * Name=TIM-OFST;CSL Type=cslShort;
    * </code>
    */
   public void setTimOfst(Short theTimOfst)
   {
       timOfst = theTimOfst;
   }

   /**
    * <code>
    * Name=TRAN-SEQ-NUM;CSL Type=cslLong;
    * </code>
    */
   public Long getTranSeqNum()
   {
      return tranSeqNum;
   }

   /**
    * <code>
    * Name=TRAN-SEQ-NUM;CSL Type=cslLong;
    * </code>
    */
   public void setTranSeqNum(Long theTranSeqNum)
   {
       tranSeqNum = theTranSeqNum;
   }

   /**
    * <code>
    * Name=NUM-SRV;CSL Type=cslShort;
    * </code>
    */
   public Short getNumSrv()
   {
      return numSrv;
   }

   /**
    * <code>
    * Name=NUM-SRV;CSL Type=cslShort;
    * </code>
    */
   public void setNumSrv(Short theNumSrv)
   {
       numSrv = theNumSrv;
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public Srv[] getSrv()
   {
       Srv[] retval = new Srv[srv.size()];
       srv.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public void setSrv(Srv[] values)
   {
       srv = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addSrv(values[i]);
      }
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public Srv getSrv(int i)
   {
      return (Srv)srv.elementAt(i);
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public void setSrv(int i, Srv value)
   {
       srv.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public void addSrv(Srv value)
   {
       srv.addElement(value);
   }

   /**
    * <code>
    * Name=SRV;
    * </code>
    */
   public void removeSrv(Srv value)
   {
       srv.removeElement(value);
   }

   /**
    * <code>
    * Name=POST-DAT;
    * </code>
    */
   public PostDat getPostDat()
   {
      return postDat;
   }

   /**
    * <code>
    * Name=POST-DAT;
    * </code>
    */
   public void setPostDat(PostDat thePostDat)
   {
       postDat = thePostDat;
   }

   /**
    * <code>
    * BalFlg is a text String of1 bytes.
    * </code>
    */
   public String getBalFlg()
   {
      return balFlg;
   }

   /**
    * <code>
    * BalFlg is a text String of1 bytes.
    * </code>
    */
   public void setBalFlg(String theBalFlg)
   {
       balFlg = theBalFlg;
   }

   /**
    * <code>
    * AuthEstFlg is a text String of1 bytes.
    * </code>
    */
   public String getAuthEstFlg()
   {
      return authEstFlg;
   }

   /**
    * <code>
    * AuthEstFlg is a text String of1 bytes.
    * </code>
    */
   public void setAuthEstFlg(String theAuthEstFlg)
   {
       authEstFlg = theAuthEstFlg;
   }

   /**
    * <code>
    * Name=LAST-SETL-DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getLastSetlDat()
   {
      return lastSetlDat;
   }

   /**
    * <code>
    * Name=LAST-SETL-DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setLastSetlDat(Integer theLastSetlDat)
   {
       lastSetlDat = theLastSetlDat;
   }

   /**
    * <code>
    * Name=LAST-SETL-TIM;CSL Type=cslShort;
    * </code>
    */
   public Short getLastSetlTim()
   {
      return lastSetlTim;
   }

   /**
    * <code>
    * Name=LAST-SETL-TIM;CSL Type=cslShort;
    * </code>
    */
   public void setLastSetlTim(Short theLastSetlTim)
   {
       lastSetlTim = theLastSetlTim;
   }

   /**
    * <code>
    * ClerkId is a text String of6 bytes.
    * </code>
    */
   public String getClerkId()
   {
      return clerkId;
   }

   /**
    * <code>
    * ClerkId is a text String of6 bytes.
    * </code>
    */
   public void setClerkId(String theClerkId)
   {
       clerkId = theClerkId;
   }

   /**
    * <code>
    * BillingInfo is a text String of10 bytes.
    * </code>
    */
   public String getBillingInfo()
   {
      return billingInfo;
   }

   /**
    * <code>
    * BillingInfo is a text String of10 bytes.
    * </code>
    */
   public void setBillingInfo(String theBillingInfo)
   {
       billingInfo = theBillingInfo;
   }

   /**
    * <code>
    * Name=CLERK-TOTS;
    * </code>
    */
   public ClerkTots getClerkTots()
   {
      return clerkTots;
   }

   /**
    * <code>
    * Name=CLERK-TOTS;
    * </code>
    */
   public void setClerkTots(ClerkTots theClerkTots)
   {
       clerkTots = theClerkTots;
   }

   /**
    * <code>
    * Name=BATCH;
    * </code>
    */
   public Batch getBatch()
   {
      return batch;
   }

   /**
    * <code>
    * Name=BATCH;
    * </code>
    */
   public void setBatch(Batch theBatch)
   {
       batch = theBatch;
   }

   /**
    * <code>
    * Name=BATCH-DC;
    * </code>
    */
   public BatchDc getBatchDc()
   {
      return batchDc;
   }

   /**
    * <code>
    * Name=BATCH-DC;
    * </code>
    */
   public void setBatchDc(BatchDc theBatchDc)
   {
       batchDc = theBatchDc;
   }

   /**
    * <code>
    * Name=SHIFT;
    * </code>
    */
   public Shift getShift()
   {
      return shift;
   }

   /**
    * <code>
    * Name=SHIFT;
    * </code>
    */
   public void setShift(Shift theShift)
   {
       shift = theShift;
   }

   /**
    * <code>
    * Name=SHIFT-DC;
    * </code>
    */
   public ShiftDc getShiftDc()
   {
      return shiftDc;
   }

   /**
    * <code>
    * Name=SHIFT-DC;
    * </code>
    */
   public void setShiftDc(ShiftDc theShiftDc)
   {
       shiftDc = theShiftDc;
   }

   /**
    * <code>
    * Name=DAILY;
    * </code>
    */
   public Daily getDaily()
   {
      return daily;
   }

   /**
    * <code>
    * Name=DAILY;
    * </code>
    */
   public void setDaily(Daily theDaily)
   {
       daily = theDaily;
   }

   /**
    * <code>
    * Name=DAILY-DC;
    * </code>
    */
   public DailyDc getDailyDc()
   {
      return dailyDc;
   }

   /**
    * <code>
    * Name=DAILY-DC;
    * </code>
    */
   public void setDailyDc(DailyDc theDailyDc)
   {
       dailyDc = theDailyDc;
   }

   /**
    * <code>
    * Name=CUR-NET;
    * </code>
    */
   public CurNet getCurNet()
   {
      return curNet;
   }

   /**
    * <code>
    * Name=CUR-NET;
    * </code>
    */
   public void setCurNet(CurNet theCurNet)
   {
       curNet = theCurNet;
   }

   /**
    * <code>
    * Name=CUR-NET-DC;
    * </code>
    */
   public CurNetDc getCurNetDc()
   {
      return curNetDc;
   }

   /**
    * <code>
    * Name=CUR-NET-DC;
    * </code>
    */
   public void setCurNetDc(CurNetDc theCurNetDc)
   {
       curNetDc = theCurNetDc;
   }

   /**
    * <code>
    * Name=PRE-NET;
    * </code>
    */
   public PreNet getPreNet()
   {
      return preNet;
   }

   /**
    * <code>
    * Name=PRE-NET;
    * </code>
    */
   public void setPreNet(PreNet thePreNet)
   {
       preNet = thePreNet;
   }

   /**
    * <code>
    * Name=PRE-NET-DC;
    * </code>
    */
   public PreNetDc getPreNetDc()
   {
      return preNetDc;
   }

   /**
    * <code>
    * Name=PRE-NET-DC;
    * </code>
    */
   public void setPreNetDc(PreNetDc thePreNetDc)
   {
       preNetDc = thePreNetDc;
   }

   /**
    * <code>
    * TermCutoverTc is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getTermCutoverTc()
   {
      return termCutoverTc;
   }

   /**
    * <code>
    * TermCutoverTc is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setTermCutoverTc(String theTermCutoverTc)
   {
       termCutoverTc = theTermCutoverTc;
   }

   /**
    * <code>
    * DualSiteInd is a text String of1 bytes.
    * </code>
    */
   public String getDualSiteInd()
   {
      return dualSiteInd;
   }

   /**
    * <code>
    * DualSiteInd is a text String of1 bytes.
    * </code>
    */
   public void setDualSiteInd(String theDualSiteInd)
   {
       dualSiteInd = theDualSiteInd;
   }

   /**
    * <code>
    * Name=NUM-SHIFTS;CSL Type=cslShort;
    * </code>
    */
   public Short getNumShifts()
   {
      return numShifts;
   }

   /**
    * <code>
    * Name=NUM-SHIFTS;CSL Type=cslShort;
    * </code>
    */
   public void setNumShifts(Short theNumShifts)
   {
       numShifts = theNumShifts;
   }

   /**
    * <code>
    * Name=TERM;
    * </code>
    */
   public Term getTerm()
   {
      return term;
   }

   /**
    * <code>
    * Name=TERM;
    * </code>
    */
   public void setTerm(Term theTerm)
   {
       term = theTerm;
   }

   /**
    * <code>
    * Name=NUM-BATCHES;CSL Type=cslShort;
    * </code>
    */
   public Short getNumBatches()
   {
      return numBatches;
   }

   /**
    * <code>
    * Name=NUM-BATCHES;CSL Type=cslShort;
    * </code>
    */
   public void setNumBatches(Short theNumBatches)
   {
       numBatches = theNumBatches;
   }

   /**
    * <code>
    * Name=SHIFT-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getShiftNum()
   {
      return shiftNum;
   }

   /**
    * <code>
    * Name=SHIFT-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setShiftNum(Short theShiftNum)
   {
       shiftNum = theShiftNum;
   }

   /**
    * <code>
    * Name=BATCH-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getBatchNum()
   {
      return batchNum;
   }

   /**
    * <code>
    * Name=BATCH-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setBatchNum(Short theBatchNum)
   {
       batchNum = theBatchNum;
   }

   /**
    * <code>
    * Name=SEQ-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getSeqNum()
   {
      return seqNum;
   }

   /**
    * <code>
    * Name=SEQ-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setSeqNum(Short theSeqNum)
   {
       seqNum = theSeqNum;
   }

   /**
    * <code>
    * LogTotals is a text String of1 bytes.
    * </code>
    */
   public String getLogTotals()
   {
      return logTotals;
   }

   /**
    * <code>
    * LogTotals is a text String of1 bytes.
    * </code>
    */
   public void setLogTotals(String theLogTotals)
   {
       logTotals = theLogTotals;
   }

   /**
    * <code>
    * WaitConfirmFlg is a text String of1 bytes.
    * </code>
    */
   public String getWaitConfirmFlg()
   {
      return waitConfirmFlg;
   }

   /**
    * <code>
    * WaitConfirmFlg is a text String of1 bytes.
    * </code>
    */
   public void setWaitConfirmFlg(String theWaitConfirmFlg)
   {
       waitConfirmFlg = theWaitConfirmFlg;
   }

   /**
    * <code>
    * Name=MAIL-DATA;
    * </code>
    */
   public MailData getMailData()
   {
      return mailData;
   }

   /**
    * <code>
    * Name=MAIL-DATA;
    * </code>
    */
   public void setMailData(MailData theMailData)
   {
       mailData = theMailData;
   }

   /**
    * <code>
    * StatRsnCde is a text String of2 bytes.
    * </code>
    */
   public String getStatRsnCde()
   {
      return statRsnCde;
   }

   /**
    * <code>
    * StatRsnCde is a text String of2 bytes.
    * </code>
    */
   public void setStatRsnCde(String theStatRsnCde)
   {
       statRsnCde = theStatRsnCde;
   }

   /**
    * <code>
    * MacPendingFlg is a text String of1 bytes.
    * </code>
    */
   public String getMacPendingFlg()
   {
      return macPendingFlg;
   }

   /**
    * <code>
    * MacPendingFlg is a text String of1 bytes.
    * </code>
    */
   public void setMacPendingFlg(String theMacPendingFlg)
   {
       macPendingFlg = theMacPendingFlg;
   }

   /**
    * <code>
    * PinPendingFlg is a text String of1 bytes.
    * </code>
    */
   public String getPinPendingFlg()
   {
      return pinPendingFlg;
   }

   /**
    * <code>
    * PinPendingFlg is a text String of1 bytes.
    * </code>
    */
   public void setPinPendingFlg(String thePinPendingFlg)
   {
       pinPendingFlg = thePinPendingFlg;
   }

   /**
    * <code>
    * DataPendingFlg is a text String of1 bytes.
    * </code>
    */
   public String getDataPendingFlg()
   {
      return dataPendingFlg;
   }

   /**
    * <code>
    * DataPendingFlg is a text String of1 bytes.
    * </code>
    */
   public void setDataPendingFlg(String theDataPendingFlg)
   {
       dataPendingFlg = theDataPendingFlg;
   }

   /**
    * <code>
    * DataEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public String getDataEncryptTyp()
   {
      return dataEncryptTyp;
   }

   /**
    * <code>
    * DataEncryptTyp is a text String of2 bytes.
    * </code>
    */
   public void setDataEncryptTyp(String theDataEncryptTyp)
   {
       dataEncryptTyp = theDataEncryptTyp;
   }

   /**
    * <code>
    * RelNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getRelNum()
   {
      return relNum;
   }

   /**
    * <code>
    * RelNum is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setRelNum(String theRelNum)
   {
       relNum = theRelNum;
   }

   /**
    * <code>
    * LoadFilNam is a text String of35 bytes.
    * </code>
    */
   public String getLoadFilNam()
   {
      return loadFilNam;
   }

   /**
    * <code>
    * LoadFilNam is a text String of35 bytes.
    * </code>
    */
   public void setLoadFilNam(String theLoadFilNam)
   {
       loadFilNam = theLoadFilNam;
   }

   /**
    * <code>
    * Name=LOG-RT-CDE;CSL Type=cslShort;
    * </code>
    */
   public Short getLogRtCde()
   {
      return logRtCde;
   }

   /**
    * <code>
    * Name=LOG-RT-CDE;CSL Type=cslShort;
    * </code>
    */
   public void setLogRtCde(Short theLogRtCde)
   {
       logRtCde = theLogRtCde;
   }

   /**
    * <code>
    * TermNamLoc is a text String of25 bytes.
    * </code>
    */
   public String getTermNamLoc()
   {
      return termNamLoc;
   }

   /**
    * <code>
    * TermNamLoc is a text String of25 bytes.
    * </code>
    */
   public void setTermNamLoc(String theTermNamLoc)
   {
       termNamLoc = theTermNamLoc;
   }

   /**
    * <code>
    * Name=TERM-CITY-ST;
    * </code>
    */
   public TermCitySt getTermCitySt()
   {
      return termCitySt;
   }

   /**
    * <code>
    * Name=TERM-CITY-ST;
    * </code>
    */
   public void setTermCitySt(TermCitySt theTermCitySt)
   {
       termCitySt = theTermCitySt;
   }

   /**
    * <code>
    * CntryCde is a text String of2 bytes.
    * </code>
    */
   public String getCntryCde()
   {
      return cntryCde;
   }

   /**
    * <code>
    * CntryCde is a text String of2 bytes.
    * </code>
    */
   public void setCntryCde(String theCntryCde)
   {
       cntryCde = theCntryCde;
   }

   /**
    * <code>
    * AcqTxnPrfl is a text String of16 bytes.
    * </code>
    */
   public String getAcqTxnPrfl()
   {
      return acqTxnPrfl;
   }

   /**
    * <code>
    * AcqTxnPrfl is a text String of16 bytes.
    * </code>
    */
   public void setAcqTxnPrfl(String theAcqTxnPrfl)
   {
       acqTxnPrfl = theAcqTxnPrfl;
   }

   /**
    * <code>
    * TermOwnerNam is a text String of22 bytes.
    * </code>
    */
   public String getTermOwnerNam()
   {
      return termOwnerNam;
   }

   /**
    * <code>
    * TermOwnerNam is a text String of22 bytes.
    * </code>
    */
   public void setTermOwnerNam(String theTermOwnerNam)
   {
       termOwnerNam = theTermOwnerNam;
   }

   /**
    * <code>
    * TermSicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public String getTermSicCde()
   {
      return termSicCde;
   }

   /**
    * <code>
    * TermSicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public void setTermSicCde(String theTermSicCde)
   {
       termSicCde = theTermSicCde;
   }

   /**
    * <code>
    * Name=SRV-REP;
    * </code>
    */
   public SrvRep getSrvRep()
   {
      return srvRep;
   }

   /**
    * <code>
    * Name=SRV-REP;
    * </code>
    */
   public void setSrvRep(SrvRep theSrvRep)
   {
       srvRep = theSrvRep;
   }

   /**
    * <code>
    * MultCrncyTtl is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getMultCrncyTtl()
   {
      return multCrncyTtl;
   }

   /**
    * <code>
    * MultCrncyTtl is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setMultCrncyTtl(String theMultCrncyTtl)
   {
       multCrncyTtl = theMultCrncyTtl;
   }

   /**
    * <code>
    * Name=PRE-AUTH-HLD;CSL Type=cslShort;
    * </code>
    */
   public Short getPreAuthHld()
   {
      return preAuthHld;
   }

   /**
    * <code>
    * Name=PRE-AUTH-HLD;CSL Type=cslShort;
    * </code>
    */
   public void setPreAuthHld(Short thePreAuthHld)
   {
       preAuthHld = thePreAuthHld;
   }

   /**
    * <code>
    * Name=PRE-AUTH-DFT-AMT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getPreAuthDftAmt()
   {
      return preAuthDftAmt;
   }

   /**
    * <code>
    * Name=PRE-AUTH-DFT-AMT;CSL Type=cslInteger;
    * </code>
    */
   public void setPreAuthDftAmt(Integer thePreAuthDftAmt)
   {
       preAuthDftAmt = thePreAuthDftAmt;
   }

   /**
    * <code>
    * DfltChkId is a text String of2 bytes.
    * </code>
    */
   public String getDfltChkId()
   {
      return dfltChkId;
   }

   /**
    * <code>
    * DfltChkId is a text String of2 bytes.
    * </code>
    */
   public void setDfltChkId(String theDfltChkId)
   {
       dfltChkId = theDfltChkId;
   }

   /**
    * <code>
    * DfltTc is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public String getDfltTc()
   {
      return dfltTc;
   }

   /**
    * <code>
    * DfltTc is a numeric String of
							2 digits with 0 decimal places.
    * </code>
    */
   public void setDfltTc(String theDfltTc)
   {
       dfltTc = theDfltTc;
   }

   /**
    * <code>
    * Name=APPRV-CDE-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getApprvCdeLgth()
   {
      return apprvCdeLgth;
   }

   /**
    * <code>
    * Name=APPRV-CDE-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setApprvCdeLgth(Short theApprvCdeLgth)
   {
       apprvCdeLgth = theApprvCdeLgth;
   }

   /**
    * <code>
    * Name=ADJ-LMT-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getAdjLmtCnt()
   {
      return adjLmtCnt;
   }

   /**
    * <code>
    * Name=ADJ-LMT-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setAdjLmtCnt(Short theAdjLmtCnt)
   {
       adjLmtCnt = theAdjLmtCnt;
   }

   /**
    * <code>
    * Name=ADJ-LMT-AMT;CSL Type=cslLong;
    * </code>
    */
   public Long getAdjLmtAmt()
   {
      return adjLmtAmt;
   }

   /**
    * <code>
    * Name=ADJ-LMT-AMT;CSL Type=cslLong;
    * </code>
    */
   public void setAdjLmtAmt(Long theAdjLmtAmt)
   {
       adjLmtAmt = theAdjLmtAmt;
   }

   /**
    * <code>
    * Name=RETURN-LMT-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getReturnLmtCnt()
   {
      return returnLmtCnt;
   }

   /**
    * <code>
    * Name=RETURN-LMT-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setReturnLmtCnt(Short theReturnLmtCnt)
   {
       returnLmtCnt = theReturnLmtCnt;
   }

   /**
    * <code>
    * Name=RETURN-LMT-AMT;CSL Type=cslLong;
    * </code>
    */
   public Long getReturnLmtAmt()
   {
      return returnLmtAmt;
   }

   /**
    * <code>
    * Name=RETURN-LMT-AMT;CSL Type=cslLong;
    * </code>
    */
   public void setReturnLmtAmt(Long theReturnLmtAmt)
   {
       returnLmtAmt = theReturnLmtAmt;
   }

   /**
    * <code>
    * PreAuthLessAmtFlg is a text String of1 bytes.
    * </code>
    */
   public String getPreAuthLessAmtFlg()
   {
      return preAuthLessAmtFlg;
   }

   /**
    * <code>
    * PreAuthLessAmtFlg is a text String of1 bytes.
    * </code>
    */
   public void setPreAuthLessAmtFlg(String thePreAuthLessAmtFlg)
   {
       preAuthLessAmtFlg = thePreAuthLessAmtFlg;
   }

   /**
    * <code>
    * AdjFlg is a text String of1 bytes.
    * </code>
    */
   public String getAdjFlg()
   {
      return adjFlg;
   }

   /**
    * <code>
    * AdjFlg is a text String of1 bytes.
    * </code>
    */
   public void setAdjFlg(String theAdjFlg)
   {
       adjFlg = theAdjFlg;
   }

   /**
    * <code>
    * SalesDftFlg is a text String of1 bytes.
    * </code>
    */
   public String getSalesDftFlg()
   {
      return salesDftFlg;
   }

   /**
    * <code>
    * SalesDftFlg is a text String of1 bytes.
    * </code>
    */
   public void setSalesDftFlg(String theSalesDftFlg)
   {
       salesDftFlg = theSalesDftFlg;
   }

   /**
    * <code>
    * TermProto is a text String of1 bytes.
    * </code>
    */
   public String getTermProto()
   {
      return termProto;
   }

   /**
    * <code>
    * TermProto is a text String of1 bytes.
    * </code>
    */
   public void setTermProto(String theTermProto)
   {
       termProto = theTermProto;
   }

   /**
    * <code>
    * BalSupport is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getBalSupport()
   {
      return balSupport;
   }

   /**
    * <code>
    * BalSupport is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setBalSupport(String theBalSupport)
   {
       balSupport = theBalSupport;
   }

   /**
    * <code>
    * TknRetrvOpt is a text String of1 bytes.
    * </code>
    */
   public String getTknRetrvOpt()
   {
      return tknRetrvOpt;
   }

   /**
    * <code>
    * TknRetrvOpt is a text String of1 bytes.
    * </code>
    */
   public void setTknRetrvOpt(String theTknRetrvOpt)
   {
       tknRetrvOpt = theTknRetrvOpt;
   }

   /**
    * <code>
    * Name=LANGUAGE-IND;CSL Type=cslShort;
    * </code>
    */
   public Short getLanguageInd()
   {
      return languageInd;
   }

   /**
    * <code>
    * Name=LANGUAGE-IND;CSL Type=cslShort;
    * </code>
    */
   public void setLanguageInd(Short theLanguageInd)
   {
       languageInd = theLanguageInd;
   }

   /**
    * <code>
    * Name=CLERK-FLAG;CSL Type=cslShort;
    * </code>
    */
   public Short getClerkFlag()
   {
      return clerkFlag;
   }

   /**
    * <code>
    * Name=CLERK-FLAG;CSL Type=cslShort;
    * </code>
    */
   public void setClerkFlag(Short theClerkFlag)
   {
       clerkFlag = theClerkFlag;
   }

   /**
    * <code>
    * PostalCde is a text String of10 bytes.
    * </code>
    */
   public String getPostalCde()
   {
      return postalCde;
   }

   /**
    * <code>
    * PostalCde is a text String of10 bytes.
    * </code>
    */
   public void setPostalCde(String thePostalCde)
   {
       postalCde = thePostalCde;
   }

   /**
    * <code>
    * Name=TERM-PHONE;
    * </code>
    */
   public TermPhone getTermPhone()
   {
      return termPhone;
   }

   /**
    * <code>
    * Name=TERM-PHONE;
    * </code>
    */
   public void setTermPhone(TermPhone theTermPhone)
   {
       termPhone = theTermPhone;
   }

   /**
    * <code>
    * RteGrp is a text String of11 bytes.
    * </code>
    */
   public String getRteGrp()
   {
      return rteGrp;
   }

   /**
    * <code>
    * RteGrp is a text String of11 bytes.
    * </code>
    */
   public void setRteGrp(String theRteGrp)
   {
       rteGrp = theRteGrp;
   }

   /**
    * <code>
    * CompleteTrack2Data is a text String of1 bytes.
    * </code>
    */
   public String getCompleteTrack2Data()
   {
      return completeTrack2Data;
   }

   /**
    * <code>
    * CompleteTrack2Data is a text String of1 bytes.
    * </code>
    */
   public void setCompleteTrack2Data(String theCompleteTrack2Data)
   {
       completeTrack2Data = theCompleteTrack2Data;
   }

   /**
    * <code>
    * MailPoSicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public String getMailPoSicCde()
   {
      return mailPoSicCde;
   }

   /**
    * <code>
    * MailPoSicCde is a numeric String of
							4 digits with 0 decimal places.
    * </code>
    */
   public void setMailPoSicCde(String theMailPoSicCde)
   {
       mailPoSicCde = theMailPoSicCde;
   }

   /**
    * <code>
    * CityExt is a text String of5 bytes.
    * </code>
    */
   public String getCityExt()
   {
      return cityExt;
   }

   /**
    * <code>
    * CityExt is a text String of5 bytes.
    * </code>
    */
   public void setCityExt(String theCityExt)
   {
       cityExt = theCityExt;
   }

   /**
    * <code>
    * ClerkTtlFlg is a text String of1 bytes.
    * </code>
    */
   public String getClerkTtlFlg()
   {
      return clerkTtlFlg;
   }

   /**
    * <code>
    * ClerkTtlFlg is a text String of1 bytes.
    * </code>
    */
   public void setClerkTtlFlg(String theClerkTtlFlg)
   {
       clerkTtlFlg = theClerkTtlFlg;
   }

   /**
    * <code>
    * SftwrRel is a text String of8 bytes.
    * </code>
    */
   public String getSftwrRel()
   {
      return sftwrRel;
   }

   /**
    * <code>
    * SftwrRel is a text String of8 bytes.
    * </code>
    */
   public void setSftwrRel(String theSftwrRel)
   {
       sftwrRel = theSftwrRel;
   }

   /**
    * <code>
    * Name=PRE-COMM-FLR-LMT;CSL Type=cslShort;
    * </code>
    */
   public Short getPreCommFlrLmt()
   {
      return preCommFlrLmt;
   }

   /**
    * <code>
    * Name=PRE-COMM-FLR-LMT;CSL Type=cslShort;
    * </code>
    */
   public void setPreCommFlrLmt(Short thePreCommFlrLmt)
   {
       preCommFlrLmt = thePreCommFlrLmt;
   }

   /**
    * <code>
    * Name=POST-COMM-FLR-LMT;CSL Type=cslShort;
    * </code>
    */
   public Short getPostCommFlrLmt()
   {
      return postCommFlrLmt;
   }

   /**
    * <code>
    * Name=POST-COMM-FLR-LMT;CSL Type=cslShort;
    * </code>
    */
   public void setPostCommFlrLmt(Short thePostCommFlrLmt)
   {
       postCommFlrLmt = thePostCommFlrLmt;
   }

   /**
    * <code>
    * PreCommLmtFlg is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getPreCommLmtFlg()
   {
      return preCommLmtFlg;
   }

   /**
    * <code>
    * PreCommLmtFlg is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setPreCommLmtFlg(String thePreCommLmtFlg)
   {
       preCommLmtFlg = thePreCommLmtFlg;
   }

   /**
    * <code>
    * PostCommLmtFlg is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getPostCommLmtFlg()
   {
      return postCommLmtFlg;
   }

   /**
    * <code>
    * PostCommLmtFlg is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setPostCommLmtFlg(String thePostCommLmtFlg)
   {
       postCommLmtFlg = thePostCommLmtFlg;
   }

   /**
    * <code>
    * Name=EMV-TERM-CAP;
    * </code>
    */
   public EmvTermCap getEmvTermCap()
   {
      return emvTermCap;
   }

   /**
    * <code>
    * Name=EMV-TERM-CAP;
    * </code>
    */
   public void setEmvTermCap(EmvTermCap theEmvTermCap)
   {
       emvTermCap = theEmvTermCap;
   }

   /**
    * <code>
    * KeydGrp is a text String of4 bytes.
    * </code>
    */
   public String getKeydGrp()
   {
      return keydGrp;
   }

   /**
    * <code>
    * KeydGrp is a text String of4 bytes.
    * </code>
    */
   public void setKeydGrp(String theKeydGrp)
   {
       keydGrp = theKeydGrp;
   }

   /**
    * <code>
    * DpcNum is a text String of4 bytes.
    * </code>
    */
   public String getDpcNum()
   {
      return dpcNum;
   }

   /**
    * <code>
    * DpcNum is a text String of4 bytes.
    * </code>
    */
   public void setDpcNum(String theDpcNum)
   {
       dpcNum = theDpcNum;
   }

   /**
    * <code>
    * RcnclEnt is a text String of1 bytes.
    * </code>
    */
   public String getRcnclEnt()
   {
      return rcnclEnt;
   }

   /**
    * <code>
    * RcnclEnt is a text String of1 bytes.
    * </code>
    */
   public void setRcnclEnt(String theRcnclEnt)
   {
       rcnclEnt = theRcnclEnt;
   }

   /**
    * <code>
    * EnhncPreAuthFlg is a text String of1 bytes.
    * </code>
    */
   public String getEnhncPreAuthFlg()
   {
      return enhncPreAuthFlg;
   }

   /**
    * <code>
    * EnhncPreAuthFlg is a text String of1 bytes.
    * </code>
    */
   public void setEnhncPreAuthFlg(String theEnhncPreAuthFlg)
   {
       enhncPreAuthFlg = theEnhncPreAuthFlg;
   }

   /**
    * <code>
    * PreAuthChrgbckFlg is a text String of1 bytes.
    * </code>
    */
   public String getPreAuthChrgbckFlg()
   {
      return preAuthChrgbckFlg;
   }

   /**
    * <code>
    * PreAuthChrgbckFlg is a text String of1 bytes.
    * </code>
    */
   public void setPreAuthChrgbckFlg(String thePreAuthChrgbckFlg)
   {
       preAuthChrgbckFlg = thePreAuthChrgbckFlg;
   }

   /**
    * <code>
    * BalRtrnFlg is a text String of1 bytes.
    * </code>
    */
   public String getBalRtrnFlg()
   {
      return balRtrnFlg;
   }

   /**
    * <code>
    * BalRtrnFlg is a text String of1 bytes.
    * </code>
    */
   public void setBalRtrnFlg(String theBalRtrnFlg)
   {
       balRtrnFlg = theBalRtrnFlg;
   }

   /**
    * <code>
    * TermAttendInd is a text String of1 bytes.
    * </code>
    */
   public String getTermAttendInd()
   {
      return termAttendInd;
   }

   /**
    * <code>
    * TermAttendInd is a text String of1 bytes.
    * </code>
    */
   public void setTermAttendInd(String theTermAttendInd)
   {
       termAttendInd = theTermAttendInd;
   }

   /**
    * <code>
    * TermLocInd is a text String of1 bytes.
    * </code>
    */
   public String getTermLocInd()
   {
      return termLocInd;
   }

   /**
    * <code>
    * TermLocInd is a text String of1 bytes.
    * </code>
    */
   public void setTermLocInd(String theTermLocInd)
   {
       termLocInd = theTermLocInd;
   }

   /**
    * <code>
    * CrdCaptrInd is a text String of1 bytes.
    * </code>
    */
   public String getCrdCaptrInd()
   {
      return crdCaptrInd;
   }

   /**
    * <code>
    * CrdCaptrInd is a text String of1 bytes.
    * </code>
    */
   public void setCrdCaptrInd(String theCrdCaptrInd)
   {
       crdCaptrInd = theCrdCaptrInd;
   }

   /**
    * <code>
    * CrdhldrActvtTermInd is a text String of1 bytes.
    * </code>
    */
   public String getCrdhldrActvtTermInd()
   {
      return crdhldrActvtTermInd;
   }

   /**
    * <code>
    * CrdhldrActvtTermInd is a text String of1 bytes.
    * </code>
    */
   public void setCrdhldrActvtTermInd(String theCrdhldrActvtTermInd)
   {
       crdhldrActvtTermInd = theCrdhldrActvtTermInd;
   }

   /**
    * <code>
    * TermInputCapInd is a text String of1 bytes.
    * </code>
    */
   public String getTermInputCapInd()
   {
      return termInputCapInd;
   }

   /**
    * <code>
    * TermInputCapInd is a text String of1 bytes.
    * </code>
    */
   public void setTermInputCapInd(String theTermInputCapInd)
   {
       termInputCapInd = theTermInputCapInd;
   }

   /**
    * <code>
    * TermOutputCapInd is a text String of1 bytes.
    * </code>
    */
   public String getTermOutputCapInd()
   {
      return termOutputCapInd;
   }

   /**
    * <code>
    * TermOutputCapInd is a text String of1 bytes.
    * </code>
    */
   public void setTermOutputCapInd(String theTermOutputCapInd)
   {
       termOutputCapInd = theTermOutputCapInd;
   }

   /**
    * <code>
    * CrdhldrAuthnCapInd is a text String of1 bytes.
    * </code>
    */
   public String getCrdhldrAuthnCapInd()
   {
      return crdhldrAuthnCapInd;
   }

   /**
    * <code>
    * CrdhldrAuthnCapInd is a text String of1 bytes.
    * </code>
    */
   public void setCrdhldrAuthnCapInd(String theCrdhldrAuthnCapInd)
   {
       crdhldrAuthnCapInd = theCrdhldrAuthnCapInd;
   }

   /**
    * <code>
    * CtlsInputCapInd is a text String of1 bytes.
    * </code>
    */
   public String getCtlsInputCapInd()
   {
      return ctlsInputCapInd;
   }

   /**
    * <code>
    * CtlsInputCapInd is a text String of1 bytes.
    * </code>
    */
   public void setCtlsInputCapInd(String theCtlsInputCapInd)
   {
       ctlsInputCapInd = theCtlsInputCapInd;
   }

   /**
    * <code>
    * PmntFacilitatorId is a text String of11 bytes.
    * </code>
    */
   public String getPmntFacilitatorId()
   {
      return pmntFacilitatorId;
   }

   /**
    * <code>
    * PmntFacilitatorId is a text String of11 bytes.
    * </code>
    */
   public void setPmntFacilitatorId(String thePmntFacilitatorId)
   {
       pmntFacilitatorId = thePmntFacilitatorId;
   }

   /**
    * <code>
    * SubMrchId is a text String of15 bytes.
    * </code>
    */
   public String getSubMrchId()
   {
      return subMrchId;
   }

   /**
    * <code>
    * SubMrchId is a text String of15 bytes.
    * </code>
    */
   public void setSubMrchId(String theSubMrchId)
   {
       subMrchId = theSubMrchId;
   }

   /**
    * <code>
    * Name=PTDF-BUF;
    * </code>
    */
   public PtdfBuf getPtdfBuf()
   {
      return ptdfBuf;
   }

   /**
    * <code>
    * Name=PTDF-BUF;
    * </code>
    */
   public void setPtdfBuf(PtdfBuf thePtdfBuf)
   {
       ptdfBuf = thePtdfBuf;
   }

   /**
    * <code>
    * Name=ERR-INFO;
    * </code>
    */
   public ErrInfo getErrInfo()
   {
      return errInfo;
   }

   /**
    * <code>
    * Name=ERR-INFO;
    * </code>
    */
   public void setErrInfo(ErrInfo theErrInfo)
   {
       errInfo = theErrInfo;
   }

   /**
    * <code>
    * Name=ERR-POSN-IND;CSL Type=cslShort;
    * </code>
    */
   public Short[] getErrPosnInd()
   {
       Short[] retval = new Short[errPosnInd.size()];
       errPosnInd.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=ERR-POSN-IND;CSL Type=cslShort;
    * </code>
    */
   public void setErrPosnInd(Short[] values)
   {
       errPosnInd = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addErrPosnInd(values[i]);
      }
   }

   /**
    * <code>
    * Name=ERR-POSN-IND;CSL Type=cslShort;
    * </code>
    */
   public Short getErrPosnInd(int i)
   {
      return (Short)errPosnInd.elementAt(i);
   }

   /**
    * <code>
    * Name=ERR-POSN-IND;CSL Type=cslShort;
    * </code>
    */
   public void setErrPosnInd(int i, Short value)
   {
       errPosnInd.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=ERR-POSN-IND;CSL Type=cslShort;
    * </code>
    */
   public void addErrPosnInd(Short value)
   {
       errPosnInd.addElement(value);
   }

   /**
    * <code>
    * Name=ERR-POSN-IND;CSL Type=cslShort;
    * </code>
    */
   public void removeErrPosnInd(Short value)
   {
       errPosnInd.removeElement(value);
   }

   /**
    * <code>
    * FuncKey is a text String of2 bytes.
    * </code>
    */
   public String getFuncKey()
   {
      return funcKey;
   }

   /**
    * <code>
    * FuncKey is a text String of2 bytes.
    * </code>
    */
   public void setFuncKey(String theFuncKey)
   {
       funcKey = theFuncKey;
   }

   /**
    * <code>
    * ScrnAccessInfoLgnt is a text String of288 bytes.
    * </code>
    */
   public String getScrnAccessInfoLgnt()
   {
      return scrnAccessInfoLgnt;
   }

   /**
    * <code>
    * ScrnAccessInfoLgnt is a text String of288 bytes.
    * </code>
    */
   public void setScrnAccessInfoLgnt(String theScrnAccessInfoLgnt)
   {
       scrnAccessInfoLgnt = theScrnAccessInfoLgnt;
   }

   /**
    * <code>
    * Name=LK-DATA-PKG;
    * </code>
    */
   public LkDataPkg getLkDataPkg()
   {
      return lkDataPkg;
   }

   /**
    * <code>
    * Name=LK-DATA-PKG;
    * </code>
    */
   public void setLkDataPkg(LkDataPkg theLkDataPkg)
   {
       lkDataPkg = theLkDataPkg;
   }

   /**
    * <code>
    * TblLookUpGrp is a text String of240 bytes.
    * </code>
    */
   public String getTblLookUpGrp()
   {
      return tblLookUpGrp;
   }

   /**
    * <code>
    * TblLookUpGrp is a text String of240 bytes.
    * </code>
    */
   public void setTblLookUpGrp(String theTblLookUpGrp)
   {
       tblLookUpGrp = theTblLookUpGrp;
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
      getTermId().write(out);
      out.writeString(getDhProName(),16, CSLTypes.PICX);
      getTermOwner().write(out);
      out.writeString(getUserFld1(),1, CSLTypes.PICX);
      getMultThreadSpdh().write(out);
      getDynLastAfm().write(out);
      getStatLastAfm().write(out);
      getLastTran().write(out);
      out.writeShort(getDynCoreLgth().shortValue());
      out.writeShort(getDynDevInfoOfst().shortValue());
      out.writeShort(getDynDevInfoLgth().shortValue());
      out.writeShort(getDynDevDataOfst().shortValue());
      out.writeShort(getDynDevDataLgth().shortValue());
      out.writeShort(getStaticCoreLgth().shortValue());
      out.writeShort(getStaticDevInfoOfst().shortValue());
      out.writeShort(getStaticDevInfoLgth().shortValue());
      out.writeShort(getStaticDevDataOfst().shortValue());
      out.writeShort(getStaticDevDataLgth().shortValue());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getRttn(), 11, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getTermGrp(),4, CSLTypes.PICX);
      out.writeString(getTermTyp(),2, CSLTypes.PICX);
      out.writeString(getPinPadChar(),1, CSLTypes.PICX);
      getEncrPin().write(out);
      out.writeString(getKeyLgth(),1, CSLTypes.PICX);
      getMacData().write(out);
      {
         int maxIndex = 52;
         int index = 0;
         java.util.Enumeration objects = desWorkArea.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            Short toWrite = (Short) objects.nextElement();
         out.writeShort(toWrite.shortValue()); 
            index++;
         }
      }
      out.writeString(getMKeyChkValue(),3, CSLTypes.PICX);
      out.writeString(getMasKeyChkValue(),3, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getCrncyCde(), 3, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getDeactivateFlg(),1, CSLTypes.PICX);
      out.writeShort(getTimOfst().shortValue());
      out.writeLong(getTranSeqNum().longValue());
      out.writeShort(getNumSrv().shortValue());
      {
         int maxIndex = 30;
         int index = 0;
         java.util.Enumeration objects = srv.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            Srv toWrite = (Srv) objects.nextElement();
            toWrite.write(out);
            index++;
         }
      }
      getPostDat().write(out);
      out.writeString(getBalFlg(),1, CSLTypes.PICX);
      out.writeString(getAuthEstFlg(),1, CSLTypes.PICX);
      out.writeInt(getLastSetlDat().intValue());
      out.writeShort(getLastSetlTim().shortValue());
      out.writeString(getClerkId(),6, CSLTypes.PICX);
      out.writeString(getBillingInfo(),10, CSLTypes.PICX);
      getClerkTots().write(out);
      getBatch().write(out);
      getBatchDc().write(out);
      getShift().write(out);
      getShiftDc().write(out);
      getDaily().write(out);
      getDailyDc().write(out);
      getCurNet().write(out);
      getCurNetDc().write(out);
      getPreNet().write(out);
      getPreNetDc().write(out);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getTermCutoverTc(), 1, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getDualSiteInd(),1, CSLTypes.PICX);
      out.writeShort(getNumShifts().shortValue());
      getTerm().write(out);
      out.writeShort(getNumBatches().shortValue());
      out.writeShort(getShiftNum().shortValue());
      out.writeShort(getBatchNum().shortValue());
      out.writeShort(getSeqNum().shortValue());
      out.writeString(getLogTotals(),1, CSLTypes.PICX);
      out.writeString(getWaitConfirmFlg(),1, CSLTypes.PICX);
      getMailData().write(out);
      out.writeString(getStatRsnCde(),2, CSLTypes.PICX);
      out.writeString(getMacPendingFlg(),1, CSLTypes.PICX);
      out.writeString(getPinPendingFlg(),1, CSLTypes.PICX);
      out.writeString(getDataPendingFlg(),1, CSLTypes.PICX);
      out.writeString(getDataEncryptTyp(),2, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getRelNum(), 2, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getLoadFilNam(),35, CSLTypes.PICX);
      out.writeShort(getLogRtCde().shortValue());
      out.writeString(getTermNamLoc(),25, CSLTypes.PICX);
      getTermCitySt().write(out);
      out.writeString(getCntryCde(),2, CSLTypes.PICX);
      out.writeString(getAcqTxnPrfl(),16, CSLTypes.PICX);
      out.writeString(getTermOwnerNam(),22, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getTermSicCde(), 4, 0, 0);
      out.writeString(help1, help1.length());
      getSrvRep().write(out);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getMultCrncyTtl(), 1, 0, 0);
      out.writeString(help1, help1.length());
      out.writeShort(getPreAuthHld().shortValue());
      out.writeInt(getPreAuthDftAmt().intValue());
      out.writeString(getDfltChkId(),2, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getDfltTc(), 2, 0, 0);
      out.writeString(help1, help1.length());
      out.writeShort(getApprvCdeLgth().shortValue());
      out.writeShort(getAdjLmtCnt().shortValue());
      out.writeLong(getAdjLmtAmt().longValue());
      out.writeShort(getReturnLmtCnt().shortValue());
      out.writeLong(getReturnLmtAmt().longValue());
      out.writeString(getPreAuthLessAmtFlg(),1, CSLTypes.PICX);
      out.writeString(getAdjFlg(),1, CSLTypes.PICX);
      out.writeString(getSalesDftFlg(),1, CSLTypes.PICX);
      out.writeString(getTermProto(),1, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getBalSupport(), 1, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getTknRetrvOpt(),1, CSLTypes.PICX);
      out.writeShort(getLanguageInd().shortValue());
      out.writeShort(getClerkFlag().shortValue());
      out.writeString(getPostalCde(),10, CSLTypes.PICX);
      getTermPhone().write(out);
      out.writeString(getRteGrp(),11, CSLTypes.PICX);
      out.writeString(getCompleteTrack2Data(),1, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getMailPoSicCde(), 4, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getCityExt(),5, CSLTypes.PICX);
      out.writeString(getClerkTtlFlg(),1, CSLTypes.PICX);
      out.writeString(getSftwrRel(),8, CSLTypes.PICX);
      out.writeShort(getPreCommFlrLmt().shortValue());
      out.writeShort(getPostCommFlrLmt().shortValue());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getPreCommLmtFlg(), 1, 0, 0);
      out.writeString(help1, help1.length());
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getPostCommLmtFlg(), 1, 0, 0);
      out.writeString(help1, help1.length());
      getEmvTermCap().write(out);
      out.writeString(getKeydGrp(),4, CSLTypes.PICX);
      out.writeString(getDpcNum(),4, CSLTypes.PICX);
      out.writeString(getRcnclEnt(),1, CSLTypes.PICX);
      out.writeString(getEnhncPreAuthFlg(),1, CSLTypes.PICX);
      out.writeString(getPreAuthChrgbckFlg(),1, CSLTypes.PICX);
      out.writeString(getBalRtrnFlg(),1, CSLTypes.PICX);
      out.writeString(getTermAttendInd(),1, CSLTypes.PICX);
      out.writeString(getTermLocInd(),1, CSLTypes.PICX);
      out.writeString(getCrdCaptrInd(),1, CSLTypes.PICX);
      out.writeString(getCrdhldrActvtTermInd(),1, CSLTypes.PICX);
      out.writeString(getTermInputCapInd(),1, CSLTypes.PICX);
      out.writeString(getTermOutputCapInd(),1, CSLTypes.PICX);
      out.writeString(getCrdhldrAuthnCapInd(),1, CSLTypes.PICX);
      out.writeString(getCtlsInputCapInd(),1, CSLTypes.PICX);
      out.writeString(getPmntFacilitatorId(),11, CSLTypes.PICX);
      out.writeString(getSubMrchId(),15, CSLTypes.PICX);
      getPtdfBuf().write(out);
      getErrInfo().write(out);
      {
         int maxIndex = 45;
         int index = 0;
         java.util.Enumeration objects = errPosnInd.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            Short toWrite = (Short) objects.nextElement();
         out.writeShort(toWrite.shortValue()); 
            index++;
         }
      }
      out.writeString(getFuncKey(),2, CSLTypes.PICX);
      out.writeString(getScrnAccessInfoLgnt(),288, CSLTypes.PICX);
      getLkDataPkg().write(out);
      out.writeString(getTblLookUpGrp(),240, CSLTypes.PICX);
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
      getTermId().read(in);
      setDhProName(in.readString(16));
      getTermOwner().read(in);
      setUserFld1(in.readString(1));
      getMultThreadSpdh().read(in);
      getDynLastAfm().read(in);
      getStatLastAfm().read(in);
      getLastTran().read(in);
      setDynCoreLgth(new Short(in.readShort()));
      setDynDevInfoOfst(new Short(in.readShort()));
      setDynDevInfoLgth(new Short(in.readShort()));
      setDynDevDataOfst(new Short(in.readShort()));
      setDynDevDataLgth(new Short(in.readShort()));
      setStaticCoreLgth(new Short(in.readShort()));
      setStaticDevInfoOfst(new Short(in.readShort()));
      setStaticDevInfoLgth(new Short(in.readShort()));
      setStaticDevDataOfst(new Short(in.readShort()));
      setStaticDevDataLgth(new Short(in.readShort()));
      help1 = in.readString(11);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 11, 0, 0);
      setRttn(help2);
      setTermGrp(in.readString(4));
      setTermTyp(in.readString(2));
      setPinPadChar(in.readString(1));
      getEncrPin().read(in);
      setKeyLgth(in.readString(1));
      getMacData().read(in);
      {
         int maxIndex = 52;
         int index = 0;
       desWorkArea = new java.util.Vector();
         while (index < maxIndex) {
            Short toRead = null;
            toRead = new Short(in.readShort()); 
						            addDesWorkArea(toRead); 
            index++;
         }
      }
      setMKeyChkValue(in.readString(3));
      setMasKeyChkValue(in.readString(3));
      help1 = in.readString(3);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 3, 0, 0);
      setCrncyCde(help2);
      setDeactivateFlg(in.readString(1));
      setTimOfst(new Short(in.readShort()));
      setTranSeqNum(new Long(in.readLong()));
      setNumSrv(new Short(in.readShort()));
      {
         int maxIndex = 30;
         int index = 0;
       srv = new java.util.Vector();
         while (index < maxIndex) {
            Srv toRead = new Srv();
            toRead.read(in);
            addSrv(toRead); 
            index++;
         }
      }
      getPostDat().read(in);
      setBalFlg(in.readString(1));
      setAuthEstFlg(in.readString(1));
      setLastSetlDat(new Integer(in.readInt()));
      setLastSetlTim(new Short(in.readShort()));
      setClerkId(in.readString(6));
      setBillingInfo(in.readString(10));
      getClerkTots().read(in);
      getBatch().read(in);
      getBatchDc().read(in);
      getShift().read(in);
      getShiftDc().read(in);
      getDaily().read(in);
      getDailyDc().read(in);
      getCurNet().read(in);
      getCurNetDc().read(in);
      getPreNet().read(in);
      getPreNetDc().read(in);
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setTermCutoverTc(help2);
      setDualSiteInd(in.readString(1));
      setNumShifts(new Short(in.readShort()));
      getTerm().read(in);
      setNumBatches(new Short(in.readShort()));
      setShiftNum(new Short(in.readShort()));
      setBatchNum(new Short(in.readShort()));
      setSeqNum(new Short(in.readShort()));
      setLogTotals(in.readString(1));
      setWaitConfirmFlg(in.readString(1));
      getMailData().read(in);
      setStatRsnCde(in.readString(2));
      setMacPendingFlg(in.readString(1));
      setPinPendingFlg(in.readString(1));
      setDataPendingFlg(in.readString(1));
      setDataEncryptTyp(in.readString(2));
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setRelNum(help2);
      setLoadFilNam(in.readString(35));
      setLogRtCde(new Short(in.readShort()));
      setTermNamLoc(in.readString(25));
      getTermCitySt().read(in);
      setCntryCde(in.readString(2));
      setAcqTxnPrfl(in.readString(16));
      setTermOwnerNam(in.readString(22));
      help1 = in.readString(4);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 4, 0, 0);
      setTermSicCde(help2);
      getSrvRep().read(in);
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setMultCrncyTtl(help2);
      setPreAuthHld(new Short(in.readShort()));
      setPreAuthDftAmt(new Integer(in.readInt()));
      setDfltChkId(in.readString(2));
      help1 = in.readString(2);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 2, 0, 0);
      setDfltTc(help2);
      setApprvCdeLgth(new Short(in.readShort()));
      setAdjLmtCnt(new Short(in.readShort()));
      setAdjLmtAmt(new Long(in.readLong()));
      setReturnLmtCnt(new Short(in.readShort()));
      setReturnLmtAmt(new Long(in.readLong()));
      setPreAuthLessAmtFlg(in.readString(1));
      setAdjFlg(in.readString(1));
      setSalesDftFlg(in.readString(1));
      setTermProto(in.readString(1));
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setBalSupport(help2);
      setTknRetrvOpt(in.readString(1));
      setLanguageInd(new Short(in.readShort()));
      setClerkFlag(new Short(in.readShort()));
      setPostalCde(in.readString(10));
      getTermPhone().read(in);
      setRteGrp(in.readString(11));
      setCompleteTrack2Data(in.readString(1));
      help1 = in.readString(4);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 4, 0, 0);
      setMailPoSicCde(help2);
      setCityExt(in.readString(5));
      setClerkTtlFlg(in.readString(1));
      setSftwrRel(in.readString(8));
      setPreCommFlrLmt(new Short(in.readShort()));
      setPostCommFlrLmt(new Short(in.readShort()));
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setPreCommLmtFlg(help2);
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setPostCommLmtFlg(help2);
      getEmvTermCap().read(in);
      setKeydGrp(in.readString(4));
      setDpcNum(in.readString(4));
      setRcnclEnt(in.readString(1));
      setEnhncPreAuthFlg(in.readString(1));
      setPreAuthChrgbckFlg(in.readString(1));
      setBalRtrnFlg(in.readString(1));
      setTermAttendInd(in.readString(1));
      setTermLocInd(in.readString(1));
      setCrdCaptrInd(in.readString(1));
      setCrdhldrActvtTermInd(in.readString(1));
      setTermInputCapInd(in.readString(1));
      setTermOutputCapInd(in.readString(1));
      setCrdhldrAuthnCapInd(in.readString(1));
      setCtlsInputCapInd(in.readString(1));
      setPmntFacilitatorId(in.readString(11));
      setSubMrchId(in.readString(15));
      getPtdfBuf().read(in);
      getErrInfo().read(in);
      {
         int maxIndex = 45;
         int index = 0;
       errPosnInd = new java.util.Vector();
         while (index < maxIndex) {
            Short toRead = null;
            toRead = new Short(in.readShort()); 
						            addErrPosnInd(toRead); 
            index++;
         }
      }
      setFuncKey(in.readString(2));
      setScrnAccessInfoLgnt(in.readString(288));
      getLkDataPkg().read(in);
      setTblLookUpGrp(in.readString(240));
   } 
}
