/*
 * @(#)Msgprdf.java
 * Created by CSL Studio (definition-schema) on 14/11/2016 03:38:34 PM
 */
package com.csl.globalpay.ipm.msgprdfreq.msgprdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.MsgHeader;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.LastFm;
import com.csl.globalpay.ipm.msgprdfreq.msgprdf.RecImage;

/** <code>Msgprdf</code>
 *  
 */
public class	Msgprdf implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected MsgHeader msgHeader;
   protected LastFm lastFm;
   protected RecImage recImage;

   /** <code>Msgprdf</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public Msgprdf(String characterEncoding)
   {
      setMsgHeader(new MsgHeader());
      setLastFm(new LastFm());
      setRecImage(new RecImage());
   }

   /** <code>Msgprdf</code>
    *  Constructor
    */ 
   public Msgprdf()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=MSG-HEADER;
    * </code>
    */
   public MsgHeader getMsgHeader()
   {
      return msgHeader;
   }

   /**
    * <code>
    * Name=MSG-HEADER;
    * </code>
    */
   public void setMsgHeader(MsgHeader theMsgHeader)
   {
       msgHeader = theMsgHeader;
   }

   /**
    * <code>
    * Name=LAST-FM;
    * </code>
    */
   public LastFm getLastFm()
   {
      return lastFm;
   }

   /**
    * <code>
    * Name=LAST-FM;
    * </code>
    */
   public void setLastFm(LastFm theLastFm)
   {
       lastFm = theLastFm;
   }

   /**
    * <code>
    * Name=REC-IMAGE;
    * </code>
    */
   public RecImage getRecImage()
   {
      return recImage;
   }

   /**
    * <code>
    * Name=REC-IMAGE;
    * </code>
    */
   public void setRecImage(RecImage theRecImage)
   {
       recImage = theRecImage;
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
      getMsgHeader().write(out);
      getLastFm().write(out);
      getRecImage().write(out);
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
      getMsgHeader().read(in);
      getLastFm().read(in);
      getRecImage().read(in);
   } 
}
