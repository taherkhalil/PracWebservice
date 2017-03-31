/*
 * @(#)TermId.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>TermId</code>
 *  
 */
public class	TermId implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String id;

   /** <code>TermId</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public TermId(String characterEncoding)
   {
      setId(new String());
   }

   /** <code>TermId</code>
    *  Constructor
    */ 
   public TermId()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Id is a text String of16 bytes.
    * </code>
    */
   public String getId()
   {
      return id;
   }

   /**
    * <code>
    * Id is a text String of16 bytes.
    * </code>
    */
   public void setId(String theId)
   {
       id = theId;
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
      out.writeString(getId(),16, CSLTypes.PICX);
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
      setId(in.readString(16));
   } 
}
