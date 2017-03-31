/*
 * @(#)RecImage.java
 * Created by CSL Studio (definition-schema) on 14/11/2016 03:38:34 PM
 */
package com.csl.globalpay.ipm.msgprdfreq.msgprdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.PrdfRecImage;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.PanImage;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.WsService;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.WsAmexSeNum;

/** <code>RecImage</code>
 *  
 */
public class	RecImage implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected PrdfRecImage prdfRecImage;
   protected PanImage panImage;
   protected WsService wsService;
   protected Short wsNumSrvAfterCompression;
   protected Short wsNumSrv;
   protected Short wsNumSrv2;
   protected String wsSrvEstNumChk;
   protected WsAmexSeNum wsAmexSeNum;
   protected java.util.Vector wsTermId;
   protected java.util.Vector wsDeactivateFlg;
   protected Integer wsFirstRelPos;
   protected Integer wsLastRelPos;
   protected String wsVisaSmi;
   protected String leftover;

   /** <code>RecImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public RecImage(String characterEncoding)
   {
      setPrdfRecImage(new PrdfRecImage());
      setPanImage(new PanImage());
      setWsService(new WsService());
      setWsNumSrvAfterCompression(new Short((short)0));
      setWsNumSrv(new Short((short)0));
      setWsNumSrv2(new Short((short)0));
      setWsSrvEstNumChk(new String());
      setWsAmexSeNum(new WsAmexSeNum());
       wsTermId = new java.util.Vector();
      {
         int maxIndex = 26;
         for (int i=0; i < maxIndex; i++) {
            addWsTermId(new String());
         }
      }
       wsDeactivateFlg = new java.util.Vector();
      {
         int maxIndex = 26;
         for (int i=0; i < maxIndex; i++) {
            addWsDeactivateFlg(new String());
         }
      }
      setWsFirstRelPos(new Integer(0));
      setWsLastRelPos(new Integer(0));
      setWsVisaSmi(new String());
      setLeftover(new String());
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
    * Name=PRDF-REC-IMAGE;
    * </code>
    */
   public PrdfRecImage getPrdfRecImage()
   {
      return prdfRecImage;
   }

   /**
    * <code>
    * Name=PRDF-REC-IMAGE;
    * </code>
    */
   public void setPrdfRecImage(PrdfRecImage thePrdfRecImage)
   {
       prdfRecImage = thePrdfRecImage;
   }

   /**
    * <code>
    * Name=PAN-IMAGE;
    * </code>
    */
   public PanImage getPanImage()
   {
      return panImage;
   }

   /**
    * <code>
    * Name=PAN-IMAGE;
    * </code>
    */
   public void setPanImage(PanImage thePanImage)
   {
       panImage = thePanImage;
   }

   /**
    * <code>
    * Name=WS-SERVICE;
    * </code>
    */
   public WsService getWsService()
   {
      return wsService;
   }

   /**
    * <code>
    * Name=WS-SERVICE;
    * </code>
    */
   public void setWsService(WsService theWsService)
   {
       wsService = theWsService;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV-AFTER-COMPRESSION;CSL Type=cslShort;
    * </code>
    */
   public Short getWsNumSrvAfterCompression()
   {
      return wsNumSrvAfterCompression;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV-AFTER-COMPRESSION;CSL Type=cslShort;
    * </code>
    */
   public void setWsNumSrvAfterCompression(Short theWsNumSrvAfterCompression)
   {
       wsNumSrvAfterCompression = theWsNumSrvAfterCompression;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV;CSL Type=cslShort;
    * </code>
    */
   public Short getWsNumSrv()
   {
      return wsNumSrv;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV;CSL Type=cslShort;
    * </code>
    */
   public void setWsNumSrv(Short theWsNumSrv)
   {
       wsNumSrv = theWsNumSrv;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV2;CSL Type=cslShort;
    * </code>
    */
   public Short getWsNumSrv2()
   {
      return wsNumSrv2;
   }

   /**
    * <code>
    * Name=WS-NUM-SRV2;CSL Type=cslShort;
    * </code>
    */
   public void setWsNumSrv2(Short theWsNumSrv2)
   {
       wsNumSrv2 = theWsNumSrv2;
   }

   /**
    * <code>
    * WsSrvEstNumChk is a text String of1 bytes.
    * </code>
    */
   public String getWsSrvEstNumChk()
   {
      return wsSrvEstNumChk;
   }

   /**
    * <code>
    * WsSrvEstNumChk is a text String of1 bytes.
    * </code>
    */
   public void setWsSrvEstNumChk(String theWsSrvEstNumChk)
   {
       wsSrvEstNumChk = theWsSrvEstNumChk;
   }

   /**
    * <code>
    * Name=WS-AMEX-SE-NUM;
    * </code>
    */
   public WsAmexSeNum getWsAmexSeNum()
   {
      return wsAmexSeNum;
   }

   /**
    * <code>
    * Name=WS-AMEX-SE-NUM;
    * </code>
    */
   public void setWsAmexSeNum(WsAmexSeNum theWsAmexSeNum)
   {
       wsAmexSeNum = theWsAmexSeNum;
   }

   /**
    * <code>
    * WsTermId is a text String of16 bytes.
    * </code>
    */
   public String[] getWsTermId()
   {
       String[] retval = new String[wsTermId.size()];
       wsTermId.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * WsTermId is a text String of16 bytes.
    * </code>
    */
   public void setWsTermId(String[] values)
   {
       wsTermId = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addWsTermId(values[i]);
      }
   }

   /**
    * <code>
    * WsTermId is a text String of16 bytes.
    * </code>
    */
   public String getWsTermId(int i)
   {
      return (String)wsTermId.elementAt(i);
   }

   /**
    * <code>
    * WsTermId is a text String of16 bytes.
    * </code>
    */
   public void setWsTermId(int i, String value)
   {
       wsTermId.setElementAt(value, i);
   }

   /**
    * <code>
    * WsTermId is a text String of16 bytes.
    * </code>
    */
   public void addWsTermId(String value)
   {
       wsTermId.addElement(value);
   }

   /**
    * <code>
    * WsTermId is a text String of16 bytes.
    * </code>
    */
   public void removeWsTermId(String value)
   {
       wsTermId.removeElement(value);
   }

   /**
    * <code>
    * WsDeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public String[] getWsDeactivateFlg()
   {
       String[] retval = new String[wsDeactivateFlg.size()];
       wsDeactivateFlg.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * WsDeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public void setWsDeactivateFlg(String[] values)
   {
       wsDeactivateFlg = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addWsDeactivateFlg(values[i]);
      }
   }

   /**
    * <code>
    * WsDeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public String getWsDeactivateFlg(int i)
   {
      return (String)wsDeactivateFlg.elementAt(i);
   }

   /**
    * <code>
    * WsDeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public void setWsDeactivateFlg(int i, String value)
   {
       wsDeactivateFlg.setElementAt(value, i);
   }

   /**
    * <code>
    * WsDeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public void addWsDeactivateFlg(String value)
   {
       wsDeactivateFlg.addElement(value);
   }

   /**
    * <code>
    * WsDeactivateFlg is a text String of1 bytes.
    * </code>
    */
   public void removeWsDeactivateFlg(String value)
   {
       wsDeactivateFlg.removeElement(value);
   }

   /**
    * <code>
    * Name=WS-FIRST-REL-POS;CSL Type=cslInteger;
    * </code>
    */
   public Integer getWsFirstRelPos()
   {
      return wsFirstRelPos;
   }

   /**
    * <code>
    * Name=WS-FIRST-REL-POS;CSL Type=cslInteger;
    * </code>
    */
   public void setWsFirstRelPos(Integer theWsFirstRelPos)
   {
       wsFirstRelPos = theWsFirstRelPos;
   }

   /**
    * <code>
    * Name=WS-LAST-REL-POS;CSL Type=cslInteger;
    * </code>
    */
   public Integer getWsLastRelPos()
   {
      return wsLastRelPos;
   }

   /**
    * <code>
    * Name=WS-LAST-REL-POS;CSL Type=cslInteger;
    * </code>
    */
   public void setWsLastRelPos(Integer theWsLastRelPos)
   {
       wsLastRelPos = theWsLastRelPos;
   }

   /**
    * <code>
    * WsVisaSmi is a text String of1 bytes.
    * </code>
    */
   public String getWsVisaSmi()
   {
      return wsVisaSmi;
   }

   /**
    * <code>
    * WsVisaSmi is a text String of1 bytes.
    * </code>
    */
   public void setWsVisaSmi(String theWsVisaSmi)
   {
       wsVisaSmi = theWsVisaSmi;
   }

   /**
    * <code>
    * Leftover is a text String of9 bytes.
    * </code>
    */
   public String getLeftover()
   {
      return leftover;
   }

   /**
    * <code>
    * Leftover is a text String of9 bytes.
    * </code>
    */
   public void setLeftover(String theLeftover)
   {
       leftover = theLeftover;
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
      getPrdfRecImage().write(out);
      getPanImage().write(out);
      getWsService().write(out);
      out.writeShort(getWsNumSrvAfterCompression().shortValue());
      out.writeShort(getWsNumSrv().shortValue());
      out.writeShort(getWsNumSrv2().shortValue());
      out.writeString(getWsSrvEstNumChk(),1, CSLTypes.PICX);
      getWsAmexSeNum().write(out);
      {
         int maxIndex = 26;
         int index = 0;
         java.util.Enumeration objects = wsTermId.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            String toWrite = (String) objects.nextElement();
         out.writeString(toWrite, 16, CSLTypes.PICX);
            index++;
         }
      }
      {
         int maxIndex = 26;
         int index = 0;
         java.util.Enumeration objects = wsDeactivateFlg.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            String toWrite = (String) objects.nextElement();
         out.writeString(toWrite, 1, CSLTypes.PICX);
            index++;
         }
      }
      out.writeInt(getWsFirstRelPos().intValue());
      out.writeInt(getWsLastRelPos().intValue());
      out.writeString(getWsVisaSmi(),1, CSLTypes.PICX);
      out.writeString(getLeftover(),9, CSLTypes.PICX);
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
      getPrdfRecImage().read(in);
      getPanImage().read(in);
      getWsService().read(in);
      setWsNumSrvAfterCompression(new Short(in.readShort()));
      setWsNumSrv(new Short(in.readShort()));
      setWsNumSrv2(new Short(in.readShort()));
      setWsSrvEstNumChk(in.readString(1));
      getWsAmexSeNum().read(in);
      {
         int maxIndex = 26;
         int index = 0;
       wsTermId = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            toRead = in.readString(16);
            addWsTermId(toRead); 
            index++;
         }
      }
      {
         int maxIndex = 26;
         int index = 0;
       wsDeactivateFlg = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            toRead = in.readString(1);
            addWsDeactivateFlg(toRead); 
            index++;
         }
      }
      setWsFirstRelPos(new Integer(in.readInt()));
      setWsLastRelPos(new Integer(in.readInt()));
      setWsVisaSmi(in.readString(1));
      setLeftover(in.readString(9));
   } 
}
