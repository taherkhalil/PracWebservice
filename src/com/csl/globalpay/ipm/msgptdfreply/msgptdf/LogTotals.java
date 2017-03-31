/*
 * @(#)LogTotals.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:53 PM
 */
package com.csl.globalpay.ipm.msgptdfreply.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>LogTotals</code>
 *  
 */
public class	LogTotals implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected String logTtlBatch;
   protected String logTtlShift;
   protected String logTtlDay;
   protected String logTtlNetwork;
   protected String logTtlService;

   /** <code>LogTotals</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public LogTotals(String characterEncoding)
   {
      setLogTtlBatch(new String());
      setLogTtlShift(new String());
      setLogTtlDay(new String());
      setLogTtlNetwork(new String());
      setLogTtlService(new String());
   }

   /** <code>LogTotals</code>
    *  Constructor
    */ 
   public LogTotals()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * LogTtlBatch is a text String of1 bytes.
    * </code>
    */
   public String getLogTtlBatch()
   {
      return logTtlBatch;
   }

   /**
    * <code>
    * LogTtlBatch is a text String of1 bytes.
    * </code>
    */
   public void setLogTtlBatch(String theLogTtlBatch)
   {
       logTtlBatch = theLogTtlBatch;
   }

   /**
    * <code>
    * LogTtlShift is a text String of1 bytes.
    * </code>
    */
   public String getLogTtlShift()
   {
      return logTtlShift;
   }

   /**
    * <code>
    * LogTtlShift is a text String of1 bytes.
    * </code>
    */
   public void setLogTtlShift(String theLogTtlShift)
   {
       logTtlShift = theLogTtlShift;
   }

   /**
    * <code>
    * LogTtlDay is a text String of1 bytes.
    * </code>
    */
   public String getLogTtlDay()
   {
      return logTtlDay;
   }

   /**
    * <code>
    * LogTtlDay is a text String of1 bytes.
    * </code>
    */
   public void setLogTtlDay(String theLogTtlDay)
   {
       logTtlDay = theLogTtlDay;
   }

   /**
    * <code>
    * LogTtlNetwork is a text String of1 bytes.
    * </code>
    */
   public String getLogTtlNetwork()
   {
      return logTtlNetwork;
   }

   /**
    * <code>
    * LogTtlNetwork is a text String of1 bytes.
    * </code>
    */
   public void setLogTtlNetwork(String theLogTtlNetwork)
   {
       logTtlNetwork = theLogTtlNetwork;
   }

   /**
    * <code>
    * LogTtlService is a text String of1 bytes.
    * </code>
    */
   public String getLogTtlService()
   {
      return logTtlService;
   }

   /**
    * <code>
    * LogTtlService is a text String of1 bytes.
    * </code>
    */
   public void setLogTtlService(String theLogTtlService)
   {
       logTtlService = theLogTtlService;
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
      out.writeString(getLogTtlBatch(),1, CSLTypes.PICX);
      out.writeString(getLogTtlShift(),1, CSLTypes.PICX);
      out.writeString(getLogTtlDay(),1, CSLTypes.PICX);
      out.writeString(getLogTtlNetwork(),1, CSLTypes.PICX);
      out.writeString(getLogTtlService(),1, CSLTypes.PICX);
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
      setLogTtlBatch(in.readString(1));
      setLogTtlShift(in.readString(1));
      setLogTtlDay(in.readString(1));
      setLogTtlNetwork(in.readString(1));
      setLogTtlService(in.readString(1));
   } 
}
