/*
 * @(#)MultThreadSpdh.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>MultThreadSpdh</code>
 *  
 */
public class	MultThreadSpdh implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String siteId;
   protected String recTyp;
   protected String userFld1MultThread;

   /** <code>MultThreadSpdh</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public MultThreadSpdh(String characterEncoding)
   {
      setSiteId(new String());
      setRecTyp(new String());
      setUserFld1MultThread(new String());
   }

   /** <code>MultThreadSpdh</code>
    *  Constructor
    */ 
   public MultThreadSpdh()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * SiteId is a text String of16 bytes.
    * </code>
    */
   public String getSiteId()
   {
      return siteId;
   }

   /**
    * <code>
    * SiteId is a text String of16 bytes.
    * </code>
    */
   public void setSiteId(String theSiteId)
   {
       siteId = theSiteId;
   }

   /**
    * <code>
    * RecTyp is a text String of1 bytes.
    * </code>
    */
   public String getRecTyp()
   {
      return recTyp;
   }

   /**
    * <code>
    * RecTyp is a text String of1 bytes.
    * </code>
    */
   public void setRecTyp(String theRecTyp)
   {
       recTyp = theRecTyp;
   }

   /**
    * <code>
    * UserFld1MultThread is a text String of1 bytes.
    * </code>
    */
   public String getUserFld1MultThread()
   {
      return userFld1MultThread;
   }

   /**
    * <code>
    * UserFld1MultThread is a text String of1 bytes.
    * </code>
    */
   public void setUserFld1MultThread(String theUserFld1MultThread)
   {
       userFld1MultThread = theUserFld1MultThread;
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
      out.writeString(getSiteId(),16, CSLTypes.PICX);
      out.writeString(getRecTyp(),1, CSLTypes.PICX);
      out.writeString(getUserFld1MultThread(),1, CSLTypes.PICX);
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
      setSiteId(in.readString(16));
      setRecTyp(in.readString(1));
      setUserFld1MultThread(in.readString(1));
   } 
}
