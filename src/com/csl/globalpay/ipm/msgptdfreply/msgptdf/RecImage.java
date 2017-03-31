/*
 * @(#)RecImage.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:53 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgptdfreply.msgptdf.Ptdfdef;

/** <code>RecImage</code>
 *  
 */
public class	RecImage implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Ptdfdef ptdfdef;

   /** <code>RecImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public RecImage(String characterEncoding)
   {
      setPtdfdef(new Ptdfdef());
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
    * Name=PTDFDEF;
    * </code>
    */
   public Ptdfdef getPtdfdef()
   {
      return ptdfdef;
   }

   /**
    * <code>
    * Name=PTDFDEF;
    * </code>
    */
   public void setPtdfdef(Ptdfdef thePtdfdef)
   {
       ptdfdef = thePtdfdef;
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
      getPtdfdef().write(out);
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
      getPtdfdef().read(in);
   } 
}
