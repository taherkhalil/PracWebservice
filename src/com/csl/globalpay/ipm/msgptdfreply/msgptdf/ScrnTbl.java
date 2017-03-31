/*
 * @(#)ScrnTbl.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:53 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>ScrnTbl</code>
 *  
 */
public class	ScrnTbl implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Short fldIdx;

   /** <code>ScrnTbl</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public ScrnTbl(String characterEncoding)
   {
      setFldIdx(new Short((short)0));
   }

   /** <code>ScrnTbl</code>
    *  Constructor
    */ 
   public ScrnTbl()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=FLD-IDX;CSL Type=cslShort;
    * </code>
    */
   public Short getFldIdx()
   {
      return fldIdx;
   }

   /**
    * <code>
    * Name=FLD-IDX;CSL Type=cslShort;
    * </code>
    */
   public void setFldIdx(Short theFldIdx)
   {
       fldIdx = theFldIdx;
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
      out.writeShort(getFldIdx().shortValue());
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
      setFldIdx(new Short(in.readShort()));
   } 
}
