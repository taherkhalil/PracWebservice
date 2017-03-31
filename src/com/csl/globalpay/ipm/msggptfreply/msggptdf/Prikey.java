/*
 * @(#)Prikey.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:31:00 PM
 */
package com.csl.globalpay.ipm.msggptfreply.msggptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>Prikey</code>
 *  
 */
public class	Prikey implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String termId;

   /** <code>Prikey</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Prikey(String characterEncoding)
   {
      setTermId(new String());
   }

   /** <code>Prikey</code>
    *  Constructor
    */ 
   public Prikey()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * TermId is a text String of16 bytes.
    * </code>
    */
   public String getTermId()
   {
      return termId;
   }

   /**
    * <code>
    * TermId is a text String of16 bytes.
    * </code>
    */
   public void setTermId(String theTermId)
   {
       termId = theTermId;
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
      out.writeString(getTermId(),16, CSLTypes.PICX);
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
      setTermId(in.readString(16));
   } 
}
