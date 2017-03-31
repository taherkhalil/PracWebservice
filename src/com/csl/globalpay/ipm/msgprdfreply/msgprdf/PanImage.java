/*
 * @(#)PanImage.java
 * Created by CSL Studio (definition-schema) on 14/11/2016 03:38:34 PM
 */
package com.csl.globalpay.ipm.msgprdfreply.msgprdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>PanImage</code>
 *  
 */
public class	PanImage implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected java.util.Vector panImageChar;

   /** <code>PanImage</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public PanImage(String characterEncoding)
   {
       panImageChar = new java.util.Vector();
      {
         int maxIndex = 28;
         for (int i=0; i < maxIndex; i++) {
            addPanImageChar(new String());
         }
      }
   }

   /** <code>PanImage</code>
    *  Constructor
    */ 
   public PanImage()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * PanImageChar is a text String of1 bytes.
    * </code>
    */
   public String[] getPanImageChar()
   {
       String[] retval = new String[panImageChar.size()];
       panImageChar.copyInto(retval);
      return retval; 
   }

   /**
    * <code>
    * PanImageChar is a text String of1 bytes.
    * </code>
    */
   public void setPanImageChar(String[] values)
   {
       panImageChar = new java.util.Vector(values.length);
      for (int i=0; i < values.length; i++) {
         addPanImageChar(values[i]);
      }
   }

   /**
    * <code>
    * PanImageChar is a text String of1 bytes.
    * </code>
    */
   public String getPanImageChar(int i)
   {
      return (String)panImageChar.elementAt(i);
   }

   /**
    * <code>
    * PanImageChar is a text String of1 bytes.
    * </code>
    */
   public void setPanImageChar(int i, String value)
   {
       panImageChar.setElementAt(value, i);
   }

   /**
    * <code>
    * PanImageChar is a text String of1 bytes.
    * </code>
    */
   public void addPanImageChar(String value)
   {
       panImageChar.addElement(value);
   }

   /**
    * <code>
    * PanImageChar is a text String of1 bytes.
    * </code>
    */
   public void removePanImageChar(String value)
   {
       panImageChar.removeElement(value);
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
         int maxIndex = 28;
         int index = 0;
         java.util.Enumeration objects = panImageChar.elements(); 
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
         int maxIndex = 28;
         int index = 0;
       panImageChar = new java.util.Vector();
         while (index < maxIndex) {
            String toRead = null;
            toRead = in.readString(1);
            addPanImageChar(toRead); 
            index++;
         }
      }
   } 
}
