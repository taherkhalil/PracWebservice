/*
 * @(#)WsAmexSeNum.java
 * Created by CSL Studio (definition-schema) on 14/11/2016 03:38:34 PM
 */
package com.csl.globalpay.ipm.msgprdfreq.msgprdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>WsAmexSeNum</code>
 *  
 */
public class	WsAmexSeNum implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected java.util.Vector wsAmexSeNumChar;

   /** <code>WsAmexSeNum</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public WsAmexSeNum(String characterEncoding)
   {
       wsAmexSeNumChar = new java.util.Vector();
      {
         int maxIndex = 15;
         for (int i=0; i < maxIndex; i++) {
            addWsAmexSeNumChar(new String());
         }
      }
   }

   /** <code>WsAmexSeNum</code>
    *  Constructor
    */ 
   public WsAmexSeNum()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * WsAmexSeNumChar is a text String of1 bytes.
    * </code>
    */
   public String[] getWsAmexSeNumChar()
   {
       String[] retval = new String[wsAmexSeNumChar.size()];
       wsAmexSeNumChar.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * WsAmexSeNumChar is a text String of1 bytes.
    * </code>
    */
   public void setWsAmexSeNumChar(String[] values)
   {
       wsAmexSeNumChar = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addWsAmexSeNumChar(values[i]);
      }
   }

   /**
    * <code>
    * WsAmexSeNumChar is a text String of1 bytes.
    * </code>
    */
   public String getWsAmexSeNumChar(int i)
   {
      return (String)wsAmexSeNumChar.elementAt(i);
   }

   /**
    * <code>
    * WsAmexSeNumChar is a text String of1 bytes.
    * </code>
    */
   public void setWsAmexSeNumChar(int i, String value)
   {
       wsAmexSeNumChar.setElementAt(value, i);
   }

   /**
    * <code>
    * WsAmexSeNumChar is a text String of1 bytes.
    * </code>
    */
   public void addWsAmexSeNumChar(String value)
   {
       wsAmexSeNumChar.addElement(value);
   }

   /**
    * <code>
    * WsAmexSeNumChar is a text String of1 bytes.
    * </code>
    */
   public void removeWsAmexSeNumChar(String value)
   {
       wsAmexSeNumChar.removeElement(value);
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
      {
         int maxIndex = 15;
         int index = 0;
         java.util.Enumeration objects = wsAmexSeNumChar.elements(); 
         while (objects.hasMoreElements()) {
            if (index >= maxIndex) break; // write no more than max
            String toWrite = (String) objects.nextElement();
         out.writeString(toWrite, 1, CSLTypes.PICX);
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
      {
         int maxIndex = 15;
         int index = 0;
       wsAmexSeNumChar = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            toRead = in.readString(1);
            addWsAmexSeNumChar(toRead); 
            index++;
         }
      }
   } 
}
