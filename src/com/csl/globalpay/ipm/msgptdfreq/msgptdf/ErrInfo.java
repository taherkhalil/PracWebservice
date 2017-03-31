/*
 * @(#)ErrInfo.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.ScrnTbl;

/** <code>ErrInfo</code>
 *  
 */
public class	ErrInfo implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Short overlayNum;
   protected Short errCnt;
   protected java.util.Vector scrnTbl;

   /** <code>ErrInfo</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public ErrInfo(String characterEncoding)
   {
      setOverlayNum(new Short((short)0));
      setErrCnt(new Short((short)0));
       scrnTbl = new java.util.Vector();
      {
         int maxIndex = 45;
         for (int i=0; i < maxIndex; i++) {
            addScrnTbl(new ScrnTbl());
         }
      }
   }

   /** <code>ErrInfo</code>
    *  Constructor
    */ 
   public ErrInfo()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=OVERLAY-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getOverlayNum()
   {
      return overlayNum;
   }

   /**
    * <code>
    * Name=OVERLAY-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setOverlayNum(Short theOverlayNum)
   {
       overlayNum = theOverlayNum;
   }

   /**
    * <code>
    * Name=ERR-CNT;CSL Type=cslShort;
    * </code>
    */
   public Short getErrCnt()
   {
      return errCnt;
   }

   /**
    * <code>
    * Name=ERR-CNT;CSL Type=cslShort;
    * </code>
    */
   public void setErrCnt(Short theErrCnt)
   {
       errCnt = theErrCnt;
   }

   /**
    * <code>
    * Name=SCRN-TBL;
    * </code>
    */
   public ScrnTbl[] getScrnTbl()
   {
       ScrnTbl[] retval = new ScrnTbl[scrnTbl.size()];
       scrnTbl.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * Name=SCRN-TBL;
    * </code>
    */
   public void setScrnTbl(ScrnTbl[] values)
   {
       scrnTbl = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addScrnTbl(values[i]);
      }
   }

   /**
    * <code>
    * Name=SCRN-TBL;
    * </code>
    */
   public ScrnTbl getScrnTbl(int i)
   {
      return (ScrnTbl)scrnTbl.elementAt(i);
   }

   /**
    * <code>
    * Name=SCRN-TBL;
    * </code>
    */
   public void setScrnTbl(int i, ScrnTbl value)
   {
       scrnTbl.setElementAt(value, i);
   }

   /**
    * <code>
    * Name=SCRN-TBL;
    * </code>
    */
   public void addScrnTbl(ScrnTbl value)
   {
       scrnTbl.addElement(value);
   }

   /**
    * <code>
    * Name=SCRN-TBL;
    * </code>
    */
   public void removeScrnTbl(ScrnTbl value)
   {
       scrnTbl.removeElement(value);
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
      out.writeShort(getOverlayNum().shortValue());
      out.writeShort(getErrCnt().shortValue());
      {
         int maxIndex = 45;
         int index = 0;
         java.util.Enumeration objects = scrnTbl.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            ScrnTbl toWrite = (ScrnTbl) objects.nextElement();
            toWrite.write(out);
            index++;
         }
      }
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
      setOverlayNum(new Short(in.readShort()));
      setErrCnt(new Short(in.readShort()));
      {
         int maxIndex = 45;
         int index = 0;
       scrnTbl = new java.util.Vector();
         while (index < maxIndex) {
            ScrnTbl toRead = new ScrnTbl();
            toRead.read(in);
            addScrnTbl(toRead); 
            index++;
         }
      }
   } 
}
