/*
 * @(#)StatLastAfm.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreq.msgptdf.Fm;

/** <code>StatLastAfm</code>
 *  
 */
public class	StatLastAfm implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Fm fm;

   /** <code>StatLastAfm</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public StatLastAfm(String characterEncoding)
   {
      setFm(new Fm());
   }

   /** <code>StatLastAfm</code>
    *  Constructor
    */ 
   public StatLastAfm()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=FM;
    * </code>
    */
   public Fm getFm()
   {
      return fm;
   }

   /**
    * <code>
    * Name=FM;
    * </code>
    */
   public void setFm(Fm theFm)
   {
       fm = theFm;
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
      getFm().write(out);
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
      getFm().read(in);
   } 
}
