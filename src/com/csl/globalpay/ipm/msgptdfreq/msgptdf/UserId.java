/*
 * @(#)UserId.java
 * Created by CSL Studio (definition-schema) on 11/11/2016 01:06:52 PM
 */
package com.csl.globalpay.ipm.msgptdfreq.msgptdf;
import java.io.IOException;
import com.comforte.csl.cslapi.CSLInputStream;
import com.comforte.csl.cslapi.CSLOutputStream;
import com.comforte.csl.xmlutils.CSLTypes;

/** <code>UserId</code>
 *  
 */
public class	UserId implements com.comforte.csl.cslapi.CSLStreamable
{
   /* Members */
   protected Short grpNum;
   protected Integer userNum;

   /** <code>UserId</code>
    * Constructor
    * @param characterEncoding this is for setting strings with CSLBaseData
    * here we do not use it!
    */
   public UserId(String characterEncoding)
   {
      setGrpNum(new Short((short)0));
      setUserNum(new Integer(0));
   }

   /** <code>UserId</code>
    *  Constructor
    */ 
   public UserId()
   {
      this(null);
   }
   /* getter and setter */

   /**
    * <code>
    * Name=GRP-NUM;CSL Type=cslShort;
    * </code>
    */
   public Short getGrpNum()
   {
      return grpNum;
   }

   /**
    * <code>
    * Name=GRP-NUM;CSL Type=cslShort;
    * </code>
    */
   public void setGrpNum(Short theGrpNum)
   {
       grpNum = theGrpNum;
   }

   /**
    * <code>
    * Name=USER-NUM;CSL Type=cslInteger;
    * </code>
    */
   public Integer getUserNum()
   {
      return userNum;
   }

   /**
    * <code>
    * Name=USER-NUM;CSL Type=cslInteger;
    * </code>
    */
   public void setUserNum(Integer theUserNum)
   {
       userNum = theUserNum;
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
      out.writeShort(getGrpNum().shortValue());
      out.writeInt(getUserNum().intValue());
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
      setGrpNum(new Short(in.readShort()));
      setUserNum(new Integer(in.readInt()));
   } 
}
