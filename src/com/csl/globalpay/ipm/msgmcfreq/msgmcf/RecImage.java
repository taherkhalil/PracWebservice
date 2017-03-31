/*
 * @(#)RecImage.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:26:25 PM
 */
package com.csl.globalpay.ipm.msgmcfreq.msgmcf;
import java.io.IOException;

import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgmcfreq.msgmcf.LastFm2;
import com.csl.globalpay.ipm.msgmcfreq.msgmcf.Prikey;

/** <code>RecImage</code>
 *  
 */
public class	RecImage implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Prikey prikey;
   protected String userFld1;
   protected LastFm2 lastFm2;

   /** <code>RecImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public RecImage(String characterEncoding)
   {
      setPrikey(new Prikey());
      setUserFld1(new String());
      setLastFm2(new LastFm2());
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
    * Name=PRIKEY;
    * </code>
    */
   public Prikey getPrikey()
   {
      return prikey;
   }

   /**
    * <code>
    * Name=PRIKEY;
    * </code>
    */
   public void setPrikey(Prikey thePrikey)
   {
       prikey = thePrikey;
   }

   /**
    * <code>
    * UserFld1 is a text String of20 bytes.
    * </code>
    */
   public String getUserFld1()
   {
      return userFld1;
   }

   /**
    * <code>
    * UserFld1 is a text String of20 bytes.
    * </code>
    */
   public void setUserFld1(String theUserFld1)
   {
       userFld1 = theUserFld1;
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

   /** <code>write</code>
    * @param out
    * @throws java.io.IOException,
    */
   public void write(CSLOutputStream out) throws IOException
   {
      /* write all attribute values into out */
      String help1 = null;
      String help2 = null;
      getPrikey().write(out);
      out.writeString(getUserFld1(),20, CSLTypes.PICX);
      getLastFm2().write(out);
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
      getPrikey().read(in);
      setUserFld1(in.readString(20));
      getLastFm2().read(in);
   } 
}
