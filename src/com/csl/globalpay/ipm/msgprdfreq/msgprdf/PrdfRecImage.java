/*
 * @(#)PrdfRecImage.java
 * Created by CSL Studio (definition-schema) on 14/11/2016 03:38:34 PM
 */
package com.csl.globalpay.ipm.msgprdfreq.msgprdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.Rkey;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.Retailer;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.LastTran;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.LastFm2;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.MerchActivityRpt;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.CsmMasHrchy;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.SrvInfo;

/** <code>PrdfRecImage</code>
 *  
 */
public class	PrdfRecImage implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Rkey rkey;
   protected Retailer retailer;
   protected String debitSupportFlg;
   protected Integer prePostDat;
   protected Integer curPostDat;
   protected Integer nxtPostDat;
   protected Short retailerBalAndCutvrStrt;
   protected Short retailerBalAndCutvrEnd;
   protected String retailerProg;
   protected String setl;
   protected String chkRtgGrp;
   protected String chkMrchntId;
   protected String userFld6;
   protected LastTran lastTran;
   protected LastFm2 lastFm2;
   protected MerchActivityRpt merchActivityRpt;
   protected String mailPoSicCde;
   protected String userFld4;
   protected String chkProvider;
   protected String rtlrTxnPrfl;
   protected String acqTxnPrfl;
   protected String userFld3;
   protected Short numSrv;
   protected Short numAltMrchnt;
   protected String astPrfl;
   protected String emvCapable;
   protected String srvEstNumChk;
   protected String emvDelayedAuthSppt;
   protected String authPartialAmt;
   protected String userFldAci;
   protected String userFldRegn;
   protected String userFldCust;
   protected String amexOpi;
   protected String mcAsgnId;
   protected String serviceProviderType;
   protected String idpntSalesOrgId;
   protected String pmntFacilitatorId;
   protected String visaSmi;
   protected CsmMasHrchy csmMasHrchy;
   protected Short srvInfoLgth;
   protected SrvInfo srvInfo;

   /** <code>PrdfRecImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public PrdfRecImage(String characterEncoding)
   {
      setRkey(new Rkey());
      setRetailer(new Retailer());
      setDebitSupportFlg(new String());
      setPrePostDat(new Integer(0));
      setCurPostDat(new Integer(0));
      setNxtPostDat(new Integer(0));
      setRetailerBalAndCutvrStrt(new Short((short)0));
      setRetailerBalAndCutvrEnd(new Short((short)0));
      setRetailerProg(new String());
      setSetl(new String());
      setChkRtgGrp(new String());
      setChkMrchntId(new String());
      setUserFld6(new String());
      setLastTran(new LastTran());
      setLastFm2(new LastFm2());
      setMerchActivityRpt(new MerchActivityRpt());
      setMailPoSicCde(new String());
      setUserFld4(new String());
      setChkProvider(new String());
      setRtlrTxnPrfl(new String());
      setAcqTxnPrfl(new String());
      setUserFld3(new String());
      setNumSrv(new Short((short)0));
      setNumAltMrchnt(new Short((short)0));
      setAstPrfl(new String());
      setEmvCapable(new String());
      setSrvEstNumChk(new String());
      setEmvDelayedAuthSppt(new String());
      setAuthPartialAmt(new String());
      setUserFldAci(new String());
      setUserFldRegn(new String());
      setUserFldCust(new String());
      setAmexOpi(new String());
      setMcAsgnId(new String());
      setServiceProviderType(new String());
      setIdpntSalesOrgId(new String());
      setPmntFacilitatorId(new String());
      setVisaSmi(new String());
      setCsmMasHrchy(new CsmMasHrchy());
      setSrvInfoLgth(new Short((short)0));
      setSrvInfo(new SrvInfo());
   }

   /** <code>PrdfRecImage</code>
    *  Constructor
    */ 
   public PrdfRecImage()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=RKEY;
    * </code>
    */
   public Rkey getRkey()
   {
      return rkey;
   }

   /**
    * <code>
    * Name=RKEY;
    * </code>
    */
   public void setRkey(Rkey theRkey)
   {
       rkey = theRkey;
   }

   /**
    * <code>
    * Name=RETAILER;
    * </code>
    */
   public Retailer getRetailer()
   {
      return retailer;
   }

   /**
    * <code>
    * Name=RETAILER;
    * </code>
    */
   public void setRetailer(Retailer theRetailer)
   {
       retailer = theRetailer;
   }

   /**
    * <code>
    * DebitSupportFlg is a text String of1 bytes.
    * </code>
    */
   public String getDebitSupportFlg()
   {
      return debitSupportFlg;
   }

   /**
    * <code>
    * DebitSupportFlg is a text String of1 bytes.
    * </code>
    */
   public void setDebitSupportFlg(String theDebitSupportFlg)
   {
       debitSupportFlg = theDebitSupportFlg;
   }

   /**
    * <code>
    * Name=PRE-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getPrePostDat()
   {
      return prePostDat;
   }

   /**
    * <code>
    * Name=PRE-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setPrePostDat(Integer thePrePostDat)
   {
       prePostDat = thePrePostDat;
   }

   /**
    * <code>
    * Name=CUR-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getCurPostDat()
   {
      return curPostDat;
   }

   /**
    * <code>
    * Name=CUR-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setCurPostDat(Integer theCurPostDat)
   {
       curPostDat = theCurPostDat;
   }

   /**
    * <code>
    * Name=NXT-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public Integer getNxtPostDat()
   {
      return nxtPostDat;
   }

   /**
    * <code>
    * Name=NXT-POST-DAT;CSL Type=cslInteger;
    * </code>
    */
   public void setNxtPostDat(Integer theNxtPostDat)
   {
       nxtPostDat = theNxtPostDat;
   }

   /**
    * <code>
    * Name=RETAILER-BAL-AND-CUTVR-STRT;CSL Type=cslShort;
    * </code>
    */
   public Short getRetailerBalAndCutvrStrt()
   {
      return retailerBalAndCutvrStrt;
   }

   /**
    * <code>
    * Name=RETAILER-BAL-AND-CUTVR-STRT;CSL Type=cslShort;
    * </code>
    */
   public void setRetailerBalAndCutvrStrt(Short theRetailerBalAndCutvrStrt)
   {
       retailerBalAndCutvrStrt = theRetailerBalAndCutvrStrt;
   }

   /**
    * <code>
    * Name=RETAILER-BAL-AND-CUTVR-END;CSL Type=cslShort;
    * </code>
    */
   public Short getRetailerBalAndCutvrEnd()
   {
      return retailerBalAndCutvrEnd;
   }

   /**
    * <code>
    * Name=RETAILER-BAL-AND-CUTVR-END;CSL Type=cslShort;
    * </code>
    */
   public void setRetailerBalAndCutvrEnd(Short theRetailerBalAndCutvrEnd)
   {
       retailerBalAndCutvrEnd = theRetailerBalAndCutvrEnd;
   }

   /**
    * <code>
    * RetailerProg is a text String of1 bytes.
    * </code>
    */
   public String getRetailerProg()
   {
      return retailerProg;
   }

   /**
    * <code>
    * RetailerProg is a text String of1 bytes.
    * </code>
    */
   public void setRetailerProg(String theRetailerProg)
   {
       retailerProg = theRetailerProg;
   }

   /**
    * <code>
    * Setl is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public String getSetl()
   {
      return setl;
   }

   /**
    * <code>
    * Setl is a numeric String of
							1 digits with 0 decimal places.
    * </code>
    */
   public void setSetl(String theSetl)
   {
       setl = theSetl;
   }

   /**
    * <code>
    * ChkRtgGrp is a text String of11 bytes.
    * </code>
    */
   public String getChkRtgGrp()
   {
      return chkRtgGrp;
   }

   /**
    * <code>
    * ChkRtgGrp is a text String of11 bytes.
    * </code>
    */
   public void setChkRtgGrp(String theChkRtgGrp)
   {
       chkRtgGrp = theChkRtgGrp;
   }

   /**
    * <code>
    * ChkMrchntId is a text String of15 bytes.
    * </code>
    */
   public String getChkMrchntId()
   {
      return chkMrchntId;
   }

   /**
    * <code>
    * ChkMrchntId is a text String of15 bytes.
    * </code>
    */
   public void setChkMrchntId(String theChkMrchntId)
   {
       chkMrchntId = theChkMrchntId;
   }

   /**
    * <code>
    * UserFld6 is a text String of14 bytes.
    * </code>
    */
   public String getUserFld6()
   {
      return userFld6;
   }

   /**
    * <code>
    * UserFld6 is a text String of14 bytes.
    * </code>
    */
   public void setUserFld6(String theUserFld6)
   {
       userFld6 = theUserFld6;
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

   /**
    * <code>
    * Name=MERCH-ACTIVITY-RPT;
    * </code>
    */
   public MerchActivityRpt getMerchActivityRpt()
   {
      return merchActivityRpt;
   }

   /**
    * <code>
    * Name=MERCH-ACTIVITY-RPT;
    * </code>
    */
   public void setMerchActivityRpt(MerchActivityRpt theMerchActivityRpt)
   {
       merchActivityRpt = theMerchActivityRpt;
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
    * UserFld4 is a text String of9 bytes.
    * </code>
    */
   public String getUserFld4()
   {
      return userFld4;
   }

   /**
    * <code>
    * UserFld4 is a text String of9 bytes.
    * </code>
    */
   public void setUserFld4(String theUserFld4)
   {
       userFld4 = theUserFld4;
   }

   /**
    * <code>
    * ChkProvider is a text String of1 bytes.
    * </code>
    */
   public String getChkProvider()
   {
      return chkProvider;
   }

   /**
    * <code>
    * ChkProvider is a text String of1 bytes.
    * </code>
    */
   public void setChkProvider(String theChkProvider)
   {
       chkProvider = theChkProvider;
   }

   /**
    * <code>
    * RtlrTxnPrfl is a text String of16 bytes.
    * </code>
    */
   public String getRtlrTxnPrfl()
   {
      return rtlrTxnPrfl;
   }

   /**
    * <code>
    * RtlrTxnPrfl is a text String of16 bytes.
    * </code>
    */
   public void setRtlrTxnPrfl(String theRtlrTxnPrfl)
   {
       rtlrTxnPrfl = theRtlrTxnPrfl;
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
    * UserFld3 is a text String of16 bytes.
    * </code>
    */
   public String getUserFld3()
   {
      return userFld3;
   }

   /**
    * <code>
    * UserFld3 is a text String of16 bytes.
    * </code>
    */
   public void setUserFld3(String theUserFld3)
   {
       userFld3 = theUserFld3;
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
    * Name=NUM-ALT-MRCHNT;CSL Type=cslShort;
    * </code>
    */
   public Short getNumAltMrchnt()
   {
      return numAltMrchnt;
   }

   /**
    * <code>
    * Name=NUM-ALT-MRCHNT;CSL Type=cslShort;
    * </code>
    */
   public void setNumAltMrchnt(Short theNumAltMrchnt)
   {
       numAltMrchnt = theNumAltMrchnt;
   }

   /**
    * <code>
    * AstPrfl is a text String of16 bytes.
    * </code>
    */
   public String getAstPrfl()
   {
      return astPrfl;
   }

   /**
    * <code>
    * AstPrfl is a text String of16 bytes.
    * </code>
    */
   public void setAstPrfl(String theAstPrfl)
   {
       astPrfl = theAstPrfl;
   }

   /**
    * <code>
    * EmvCapable is a text String of1 bytes.
    * </code>
    */
   public String getEmvCapable()
   {
      return emvCapable;
   }

   /**
    * <code>
    * EmvCapable is a text String of1 bytes.
    * </code>
    */
   public void setEmvCapable(String theEmvCapable)
   {
       emvCapable = theEmvCapable;
   }

   /**
    * <code>
    * SrvEstNumChk is a text String of1 bytes.
    * </code>
    */
   public String getSrvEstNumChk()
   {
      return srvEstNumChk;
   }

   /**
    * <code>
    * SrvEstNumChk is a text String of1 bytes.
    * </code>
    */
   public void setSrvEstNumChk(String theSrvEstNumChk)
   {
       srvEstNumChk = theSrvEstNumChk;
   }

   /**
    * <code>
    * EmvDelayedAuthSppt is a text String of1 bytes.
    * </code>
    */
   public String getEmvDelayedAuthSppt()
   {
      return emvDelayedAuthSppt;
   }

   /**
    * <code>
    * EmvDelayedAuthSppt is a text String of1 bytes.
    * </code>
    */
   public void setEmvDelayedAuthSppt(String theEmvDelayedAuthSppt)
   {
       emvDelayedAuthSppt = theEmvDelayedAuthSppt;
   }

   /**
    * <code>
    * AuthPartialAmt is a text String of1 bytes.
    * </code>
    */
   public String getAuthPartialAmt()
   {
      return authPartialAmt;
   }

   /**
    * <code>
    * AuthPartialAmt is a text String of1 bytes.
    * </code>
    */
   public void setAuthPartialAmt(String theAuthPartialAmt)
   {
       authPartialAmt = theAuthPartialAmt;
   }

   /**
    * <code>
    * UserFldAci is a text String of46 bytes.
    * </code>
    */
   public String getUserFldAci()
   {
      return userFldAci;
   }

   /**
    * <code>
    * UserFldAci is a text String of46 bytes.
    * </code>
    */
   public void setUserFldAci(String theUserFldAci)
   {
       userFldAci = theUserFldAci;
   }

   /**
    * <code>
    * UserFldRegn is a text String of50 bytes.
    * </code>
    */
   public String getUserFldRegn()
   {
      return userFldRegn;
   }

   /**
    * <code>
    * UserFldRegn is a text String of50 bytes.
    * </code>
    */
   public void setUserFldRegn(String theUserFldRegn)
   {
       userFldRegn = theUserFldRegn;
   }

   /**
    * <code>
    * UserFldCust is a text String of4 bytes.
    * </code>
    */
   public String getUserFldCust()
   {
      return userFldCust;
   }

   /**
    * <code>
    * UserFldCust is a text String of4 bytes.
    * </code>
    */
   public void setUserFldCust(String theUserFldCust)
   {
       userFldCust = theUserFldCust;
   }

   /**
    * <code>
    * AmexOpi is a text String of1 bytes.
    * </code>
    */
   public String getAmexOpi()
   {
      return amexOpi;
   }

   /**
    * <code>
    * AmexOpi is a text String of1 bytes.
    * </code>
    */
   public void setAmexOpi(String theAmexOpi)
   {
       amexOpi = theAmexOpi;
   }

   /**
    * <code>
    * McAsgnId is a text String of6 bytes.
    * </code>
    */
   public String getMcAsgnId()
   {
      return mcAsgnId;
   }

   /**
    * <code>
    * McAsgnId is a text String of6 bytes.
    * </code>
    */
   public void setMcAsgnId(String theMcAsgnId)
   {
       mcAsgnId = theMcAsgnId;
   }

   /**
    * <code>
    * ServiceProviderType is a text String of1 bytes.
    * </code>
    */
   public String getServiceProviderType()
   {
      return serviceProviderType;
   }

   /**
    * <code>
    * ServiceProviderType is a text String of1 bytes.
    * </code>
    */
   public void setServiceProviderType(String theServiceProviderType)
   {
       serviceProviderType = theServiceProviderType;
   }

   /**
    * <code>
    * IdpntSalesOrgId is a text String of11 bytes.
    * </code>
    */
   public String getIdpntSalesOrgId()
   {
      return idpntSalesOrgId;
   }

   /**
    * <code>
    * IdpntSalesOrgId is a text String of11 bytes.
    * </code>
    */
   public void setIdpntSalesOrgId(String theIdpntSalesOrgId)
   {
       idpntSalesOrgId = theIdpntSalesOrgId;
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
    * VisaSmi is a text String of1 bytes.
    * </code>
    */
   public String getVisaSmi()
   {
      return visaSmi;
   }

   /**
    * <code>
    * VisaSmi is a text String of1 bytes.
    * </code>
    */
   public void setVisaSmi(String theVisaSmi)
   {
       visaSmi = theVisaSmi;
   }

   /**
    * <code>
    * Name=CSM-MAS-HRCHY;
    * </code>
    */
   public CsmMasHrchy getCsmMasHrchy()
   {
      return csmMasHrchy;
   }

   /**
    * <code>
    * Name=CSM-MAS-HRCHY;
    * </code>
    */
   public void setCsmMasHrchy(CsmMasHrchy theCsmMasHrchy)
   {
       csmMasHrchy = theCsmMasHrchy;
   }

   /**
    * <code>
    * Name=SRV-INFO-LGTH;CSL Type=cslShort;
    * </code>
    */
   public Short getSrvInfoLgth()
   {
      return srvInfoLgth;
   }

   /**
    * <code>
    * Name=SRV-INFO-LGTH;CSL Type=cslShort;
    * </code>
    */
   public void setSrvInfoLgth(Short theSrvInfoLgth)
   {
       srvInfoLgth = theSrvInfoLgth;
   }

   /**
    * <code>
    * Name=SRV-INFO;
    * </code>
    */
   public SrvInfo getSrvInfo()
   {
      return srvInfo;
   }

   /**
    * <code>
    * Name=SRV-INFO;
    * </code>
    */
   public void setSrvInfo(SrvInfo theSrvInfo)
   {
       srvInfo = theSrvInfo;
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
      getRkey().write(out);
      getRetailer().write(out);
      out.writeString(getDebitSupportFlg(),1, CSLTypes.PICX);
      out.writeInt(getPrePostDat().intValue());
      out.writeInt(getCurPostDat().intValue());
      out.writeInt(getNxtPostDat().intValue());
      out.writeShort(getRetailerBalAndCutvrStrt().shortValue());
      out.writeShort(getRetailerBalAndCutvrEnd().shortValue());
      out.writeString(getRetailerProg(),1, CSLTypes.PICX);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getSetl(), 1, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getChkRtgGrp(),11, CSLTypes.PICX);
      out.writeString(getChkMrchntId(),15, CSLTypes.PICX);
      out.writeString(getUserFld6(),14, CSLTypes.PICX);
      getLastTran().write(out);
      getLastFm2().write(out);
      getMerchActivityRpt().write(out);
      help1 =
        com.comforte.csl.model.Util.convertNumStringFromDisplayToTransferFormat(getMailPoSicCde(), 4, 0, 0);
      out.writeString(help1, help1.length());
      out.writeString(getUserFld4(),9, CSLTypes.PICX);
      out.writeString(getChkProvider(),1, CSLTypes.PICX);
      out.writeString(getRtlrTxnPrfl(),16, CSLTypes.PICX);
      out.writeString(getAcqTxnPrfl(),16, CSLTypes.PICX);
      out.writeString(getUserFld3(),16, CSLTypes.PICX);
      out.writeShort(getNumSrv().shortValue());
      out.writeShort(getNumAltMrchnt().shortValue());
      out.writeString(getAstPrfl(),16, CSLTypes.PICX);
      out.writeString(getEmvCapable(),1, CSLTypes.PICX);
      out.writeString(getSrvEstNumChk(),1, CSLTypes.PICX);
      out.writeString(getEmvDelayedAuthSppt(),1, CSLTypes.PICX);
      out.writeString(getAuthPartialAmt(),1, CSLTypes.PICX);
      out.writeString(getUserFldAci(),46, CSLTypes.PICX);
      out.writeString(getUserFldRegn(),50, CSLTypes.PICX);
      out.writeString(getUserFldCust(),4, CSLTypes.PICX);
      out.writeString(getAmexOpi(),1, CSLTypes.PICX);
      out.writeString(getMcAsgnId(),6, CSLTypes.PICX);
      out.writeString(getServiceProviderType(),1, CSLTypes.PICX);
      out.writeString(getIdpntSalesOrgId(),11, CSLTypes.PICX);
      out.writeString(getPmntFacilitatorId(),11, CSLTypes.PICX);
      out.writeString(getVisaSmi(),1, CSLTypes.PICX);
      getCsmMasHrchy().write(out);
      out.writeShort(getSrvInfoLgth().shortValue());
      getSrvInfo().write(out);
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
      getRkey().read(in);
      getRetailer().read(in);
      setDebitSupportFlg(in.readString(1));
      setPrePostDat(new Integer(in.readInt()));
      setCurPostDat(new Integer(in.readInt()));
      setNxtPostDat(new Integer(in.readInt()));
      setRetailerBalAndCutvrStrt(new Short(in.readShort()));
      setRetailerBalAndCutvrEnd(new Short(in.readShort()));
      setRetailerProg(in.readString(1));
      help1 = in.readString(1);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 1, 0, 0);
      setSetl(help2);
      setChkRtgGrp(in.readString(11));
      setChkMrchntId(in.readString(15));
      setUserFld6(in.readString(14));
      getLastTran().read(in);
      getLastFm2().read(in);
      getMerchActivityRpt().read(in);
      help1 = in.readString(4);
      help2 =
         com.comforte.csl.model.Util.convertNumStringFromTransferToDisplayFormat(help1, 4, 0, 0);
      setMailPoSicCde(help2);
      setUserFld4(in.readString(9));
      setChkProvider(in.readString(1));
      setRtlrTxnPrfl(in.readString(16));
      setAcqTxnPrfl(in.readString(16));
      setUserFld3(in.readString(16));
      setNumSrv(new Short(in.readShort()));
      setNumAltMrchnt(new Short(in.readShort()));
      setAstPrfl(in.readString(16));
      setEmvCapable(in.readString(1));
      setSrvEstNumChk(in.readString(1));
      setEmvDelayedAuthSppt(in.readString(1));
      setAuthPartialAmt(in.readString(1));
      setUserFldAci(in.readString(46));
      setUserFldRegn(in.readString(50));
      setUserFldCust(in.readString(4));
      setAmexOpi(in.readString(1));
      setMcAsgnId(in.readString(6));
      setServiceProviderType(in.readString(1));
      setIdpntSalesOrgId(in.readString(11));
      setPmntFacilitatorId(in.readString(11));
      setVisaSmi(in.readString(1));
      getCsmMasHrchy().read(in);
      setSrvInfoLgth(new Short(in.readShort()));
      getSrvInfo().read(in);
   } 
}
