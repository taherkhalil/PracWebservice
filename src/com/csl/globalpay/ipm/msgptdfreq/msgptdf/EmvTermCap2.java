/*
 * @(#)EmvTermCap2.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>EmvTermCap</code>
 *  
 */
public class	EmvTermCap2 implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String keyEntry;
   protected String magStripe;
   protected String icContacts;
   protected String reserved1;
   protected String reserved2;
   protected String reserved3;
   protected String plaintextPin;
   protected String enciphrPinOnl;
   protected String signature;
   protected String enciphrPinOffl;
   protected String noCvmReqd;
   protected String reserved4;
   protected String staticDataAuth;
   protected String dynDataAuth;
   protected String cardCapture;
   protected String reserved5;
   protected String combndDataAuth;
   protected String reserved6;

   /** <code>EmvTermCap</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public EmvTermCap2(String characterEncoding)
   {
      setKeyEntry(new String());
      setMagStripe(new String());
      setIcContacts(new String());
      setReserved1(new String());
      setReserved2(new String());
      setReserved3(new String());
      setPlaintextPin(new String());
      setEnciphrPinOnl(new String());
      setSignature(new String());
      setEnciphrPinOffl(new String());
      setNoCvmReqd(new String());
      setReserved4(new String());
      setStaticDataAuth(new String());
      setDynDataAuth(new String());
      setCardCapture(new String());
      setReserved5(new String());
      setCombndDataAuth(new String());
      setReserved6(new String());
   }

   /** <code>EmvTermCap</code>
    *  Constructor
    */ 
   public EmvTermCap2()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * KeyEntry is a text String of1 bytes.
    * </code>
    */
   public String getKeyEntry()
   {
      return keyEntry;
   }

   /**
    * <code>
    * KeyEntry is a text String of1 bytes.
    * </code>
    */
   public void setKeyEntry(String theKeyEntry)
   {
       keyEntry = theKeyEntry;
   }

   /**
    * <code>
    * MagStripe is a text String of1 bytes.
    * </code>
    */
   public String getMagStripe()
   {
      return magStripe;
   }

   /**
    * <code>
    * MagStripe is a text String of1 bytes.
    * </code>
    */
   public void setMagStripe(String theMagStripe)
   {
       magStripe = theMagStripe;
   }

   /**
    * <code>
    * IcContacts is a text String of1 bytes.
    * </code>
    */
   public String getIcContacts()
   {
      return icContacts;
   }

   /**
    * <code>
    * IcContacts is a text String of1 bytes.
    * </code>
    */
   public void setIcContacts(String theIcContacts)
   {
       icContacts = theIcContacts;
   }

   /**
    * <code>
    * Reserved1 is a text String of1 bytes.
    * </code>
    */
   public String getReserved1()
   {
      return reserved1;
   }

   /**
    * <code>
    * Reserved1 is a text String of1 bytes.
    * </code>
    */
   public void setReserved1(String theReserved1)
   {
       reserved1 = theReserved1;
   }

   /**
    * <code>
    * Reserved2 is a text String of1 bytes.
    * </code>
    */
   public String getReserved2()
   {
      return reserved2;
   }

   /**
    * <code>
    * Reserved2 is a text String of1 bytes.
    * </code>
    */
   public void setReserved2(String theReserved2)
   {
       reserved2 = theReserved2;
   }

   /**
    * <code>
    * Reserved3 is a text String of1 bytes.
    * </code>
    */
   public String getReserved3()
   {
      return reserved3;
   }

   /**
    * <code>
    * Reserved3 is a text String of1 bytes.
    * </code>
    */
   public void setReserved3(String theReserved3)
   {
       reserved3 = theReserved3;
   }

   /**
    * <code>
    * PlaintextPin is a text String of1 bytes.
    * </code>
    */
   public String getPlaintextPin()
   {
      return plaintextPin;
   }

   /**
    * <code>
    * PlaintextPin is a text String of1 bytes.
    * </code>
    */
   public void setPlaintextPin(String thePlaintextPin)
   {
       plaintextPin = thePlaintextPin;
   }

   /**
    * <code>
    * EnciphrPinOnl is a text String of1 bytes.
    * </code>
    */
   public String getEnciphrPinOnl()
   {
      return enciphrPinOnl;
   }

   /**
    * <code>
    * EnciphrPinOnl is a text String of1 bytes.
    * </code>
    */
   public void setEnciphrPinOnl(String theEnciphrPinOnl)
   {
       enciphrPinOnl = theEnciphrPinOnl;
   }

   /**
    * <code>
    * Signature is a text String of1 bytes.
    * </code>
    */
   public String getSignature()
   {
      return signature;
   }

   /**
    * <code>
    * Signature is a text String of1 bytes.
    * </code>
    */
   public void setSignature(String theSignature)
   {
       signature = theSignature;
   }

   /**
    * <code>
    * EnciphrPinOffl is a text String of1 bytes.
    * </code>
    */
   public String getEnciphrPinOffl()
   {
      return enciphrPinOffl;
   }

   /**
    * <code>
    * EnciphrPinOffl is a text String of1 bytes.
    * </code>
    */
   public void setEnciphrPinOffl(String theEnciphrPinOffl)
   {
       enciphrPinOffl = theEnciphrPinOffl;
   }

   /**
    * <code>
    * NoCvmReqd is a text String of1 bytes.
    * </code>
    */
   public String getNoCvmReqd()
   {
      return noCvmReqd;
   }

   /**
    * <code>
    * NoCvmReqd is a text String of1 bytes.
    * </code>
    */
   public void setNoCvmReqd(String theNoCvmReqd)
   {
       noCvmReqd = theNoCvmReqd;
   }

   /**
    * <code>
    * Reserved4 is a text String of1 bytes.
    * </code>
    */
   public String getReserved4()
   {
      return reserved4;
   }

   /**
    * <code>
    * Reserved4 is a text String of1 bytes.
    * </code>
    */
   public void setReserved4(String theReserved4)
   {
       reserved4 = theReserved4;
   }

   /**
    * <code>
    * StaticDataAuth is a text String of1 bytes.
    * </code>
    */
   public String getStaticDataAuth()
   {
      return staticDataAuth;
   }

   /**
    * <code>
    * StaticDataAuth is a text String of1 bytes.
    * </code>
    */
   public void setStaticDataAuth(String theStaticDataAuth)
   {
       staticDataAuth = theStaticDataAuth;
   }

   /**
    * <code>
    * DynDataAuth is a text String of1 bytes.
    * </code>
    */
   public String getDynDataAuth()
   {
      return dynDataAuth;
   }

   /**
    * <code>
    * DynDataAuth is a text String of1 bytes.
    * </code>
    */
   public void setDynDataAuth(String theDynDataAuth)
   {
       dynDataAuth = theDynDataAuth;
   }

   /**
    * <code>
    * CardCapture is a text String of1 bytes.
    * </code>
    */
   public String getCardCapture()
   {
      return cardCapture;
   }

   /**
    * <code>
    * CardCapture is a text String of1 bytes.
    * </code>
    */
   public void setCardCapture(String theCardCapture)
   {
       cardCapture = theCardCapture;
   }

   /**
    * <code>
    * Reserved5 is a text String of1 bytes.
    * </code>
    */
   public String getReserved5()
   {
      return reserved5;
   }

   /**
    * <code>
    * Reserved5 is a text String of1 bytes.
    * </code>
    */
   public void setReserved5(String theReserved5)
   {
       reserved5 = theReserved5;
   }

   /**
    * <code>
    * CombndDataAuth is a text String of1 bytes.
    * </code>
    */
   public String getCombndDataAuth()
   {
      return combndDataAuth;
   }

   /**
    * <code>
    * CombndDataAuth is a text String of1 bytes.
    * </code>
    */
   public void setCombndDataAuth(String theCombndDataAuth)
   {
       combndDataAuth = theCombndDataAuth;
   }

   /**
    * <code>
    * Reserved6 is a text String of1 bytes.
    * </code>
    */
   public String getReserved6()
   {
      return reserved6;
   }

   /**
    * <code>
    * Reserved6 is a text String of1 bytes.
    * </code>
    */
   public void setReserved6(String theReserved6)
   {
       reserved6 = theReserved6;
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
      out.writeString(getKeyEntry(),1, CSLTypes.PICX);
      out.writeString(getMagStripe(),1, CSLTypes.PICX);
      out.writeString(getIcContacts(),1, CSLTypes.PICX);
      out.writeString(getReserved1(),1, CSLTypes.PICX);
      out.writeString(getReserved2(),1, CSLTypes.PICX);
      out.writeString(getReserved3(),1, CSLTypes.PICX);
      out.writeString(getPlaintextPin(),1, CSLTypes.PICX);
      out.writeString(getEnciphrPinOnl(),1, CSLTypes.PICX);
      out.writeString(getSignature(),1, CSLTypes.PICX);
      out.writeString(getEnciphrPinOffl(),1, CSLTypes.PICX);
      out.writeString(getNoCvmReqd(),1, CSLTypes.PICX);
      out.writeString(getReserved4(),1, CSLTypes.PICX);
      out.writeString(getStaticDataAuth(),1, CSLTypes.PICX);
      out.writeString(getDynDataAuth(),1, CSLTypes.PICX);
      out.writeString(getCardCapture(),1, CSLTypes.PICX);
      out.writeString(getReserved5(),1, CSLTypes.PICX);
      out.writeString(getCombndDataAuth(),1, CSLTypes.PICX);
      out.writeString(getReserved6(),1, CSLTypes.PICX);
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
      setKeyEntry(in.readString(1));
      setMagStripe(in.readString(1));
      setIcContacts(in.readString(1));
      setReserved1(in.readString(1));
      setReserved2(in.readString(1));
      setReserved3(in.readString(1));
      setPlaintextPin(in.readString(1));
      setEnciphrPinOnl(in.readString(1));
      setSignature(in.readString(1));
      setEnciphrPinOffl(in.readString(1));
      setNoCvmReqd(in.readString(1));
      setReserved4(in.readString(1));
      setStaticDataAuth(in.readString(1));
      setDynDataAuth(in.readString(1));
      setCardCapture(in.readString(1));
      setReserved5(in.readString(1));
      setCombndDataAuth(in.readString(1));
      setReserved6(in.readString(1));
   } 
}
