package com.globalpay.ws.uk.parsed.beans;

//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2016.12.09 at 04:57:34 PM IST 
//

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSGHEADER">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SCCGP">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TERMID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OMFAUDIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="FRMTCDE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="REPLCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="FIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="REGN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="BRCH" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="USERGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="USERNUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="SITEPRODIND" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ERRCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ERRSUBCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PTD_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RDF_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PIN_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PATHMON" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LCONFNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MCCGP">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TERMID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="OMFAUDIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="FRMTCDE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="REPLCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="FIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="REGN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="BRCH" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="USERGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="USERNUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="SITEPRODIND" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ERRCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ERRSUBCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PTD_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RDF_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PIN_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PATHMON" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LCONFNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "msgheader" })
@XmlRootElement(name = "BASE24")
public class BASE24 {

	@XmlElement(name = "MSGHEADER", required = true)
	protected BASE24.MSGHEADER msgheader;

	/**
	 * Gets the value of the msgheader property.
	 * 
	 * @return possible object is {@link BASE24 .MSGHEADER }
	 * 
	 */
	public BASE24.MSGHEADER getMSGHEADER() {
		return msgheader;
	}

	/**
	 * Sets the value of the msgheader property.
	 * 
	 * @param value
	 *            allowed object is {@link BASE24 .MSGHEADER }
	 * 
	 */
	public void setMSGHEADER(BASE24.MSGHEADER value) {
		this.msgheader = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="SCCGP">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="TERMID" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="OMFAUDIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="FRMTCDE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
	 *                   &lt;element name="REPLCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="FIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="REGN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
	 *                   &lt;element name="BRCH" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
	 *                   &lt;element name="USERGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="USERNUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="SITEPRODIND" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="ERRCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="ERRSUBCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="PTD_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="RDF_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="PIN_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="PATHMON" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="LN" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="LCONFNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="MCCGP">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="TERMID" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="OMFAUDIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="FRMTCDE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
	 *                   &lt;element name="REPLCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="FIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="REGN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
	 *                   &lt;element name="BRCH" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
	 *                   &lt;element name="USERGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="USERNUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="SITEPRODIND" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="ERRCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="ERRSUBCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="PTD_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="RDF_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="PIN_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="PATHMON" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="LN" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="LCONFNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "sccgp", "mccgp" })
	public static class MSGHEADER {

		@XmlElement(name = "SCCGP", required = true)
		protected BASE24.MSGHEADER.SCCGP sccgp;
		@XmlElement(name = "MCCGP", required = true)
		protected BASE24.MSGHEADER.MCCGP mccgp;

		/**
		 * Gets the value of the sccgp property.
		 * 
		 * @return possible object is {@link BASE24 .MSGHEADER.SCCGP }
		 * 
		 */
		public BASE24.MSGHEADER.SCCGP getSCCGP() {
			return sccgp;
		}

		/**
		 * Sets the value of the sccgp property.
		 * 
		 * @param value
		 *            allowed object is {@link BASE24 .MSGHEADER.SCCGP }
		 * 
		 */
		public void setSCCGP(BASE24.MSGHEADER.SCCGP value) {
			this.sccgp = value;
		}

		/**
		 * Gets the value of the mccgp property.
		 * 
		 * @return possible object is {@link BASE24 .MSGHEADER.MCCGP }
		 * 
		 */
		public BASE24.MSGHEADER.MCCGP getMCCGP() {
			return mccgp;
		}

		/**
		 * Sets the value of the mccgp property.
		 * 
		 * @param value
		 *            allowed object is {@link BASE24 .MSGHEADER.MCCGP }
		 * 
		 */
		public void setMCCGP(BASE24.MSGHEADER.MCCGP value) {
			this.mccgp = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="TERMID" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="OMFAUDIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="FRMTCDE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
		 *         &lt;element name="REPLCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="FIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="REGN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
		 *         &lt;element name="BRCH" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
		 *         &lt;element name="USERGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="USERNUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="SITEPRODIND" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="ERRCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="ERRSUBCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="PTD_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="RDF_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="PIN_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="PATHMON" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="LN" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="LCONFNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "termid", "omfaudit", "frmtcde",
				"replcde", "fiid", "regn", "brch", "usergrp", "usernum",
				"siteprodind", "errcde", "errsubcde", "ptdserver", "rdfserver",
				"pinserver", "system", "pathmon", "ln", "lconfname" })
		public static class MCCGP {

			@XmlElement(name = "TERMID", required = true)
			protected String termid;
			@XmlElement(name = "OMFAUDIT")
			protected int omfaudit;
			@XmlElement(name = "FRMTCDE", required = true)
			protected Object frmtcde;
			@XmlElement(name = "REPLCDE")
			protected int replcde;
			@XmlElement(name = "FIID", required = true)
			protected String fiid;
			@XmlElement(name = "REGN", required = true)
			protected String regn;
			@XmlElement(name = "BRCH", required = true)
			protected String brch;
			@XmlElement(name = "USERGRP")
			protected int usergrp;
			@XmlElement(name = "USERNUM")
			protected int usernum;
			@XmlElement(name = "SITEPRODIND")
			protected int siteprodind;
			@XmlElement(name = "ERRCDE")
			protected int errcde;
			@XmlElement(name = "ERRSUBCDE")
			protected int errsubcde;
			@XmlElement(name = "PTD_SERVER", required = true)
			protected String ptdserver;
			@XmlElement(name = "RDF_SERVER", required = true)
			protected String rdfserver;
			@XmlElement(name = "PIN_SERVER", required = true)
			protected String pinserver;
			@XmlElement(name = "SYSTEM", required = true)
			protected String system;
			@XmlElement(name = "PATHMON", required = true)
			protected String pathmon;
			@XmlElement(name = "LN", required = true)
			protected String ln;
			@XmlElement(name = "LCONFNAME", required = true)
			protected String lconfname;

			/**
			 * Gets the value of the termid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getTERMID() {
				return termid;
			}

			/**
			 * Sets the value of the termid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setTERMID(String value) {
				this.termid = value;
			}

			/**
			 * Gets the value of the omfaudit property.
			 * 
			 */
			public int getOMFAUDIT() {
				return omfaudit;
			}

			/**
			 * Sets the value of the omfaudit property.
			 * 
			 */
			public void setOMFAUDIT(int value) {
				this.omfaudit = value;
			}

			/**
			 * Gets the value of the frmtcde property.
			 * 
			 * @return possible object is {@link Object }
			 * 
			 */
			public Object getFRMTCDE() {
				return frmtcde;
			}

			/**
			 * Sets the value of the frmtcde property.
			 * 
			 * @param value
			 *            allowed object is {@link Object }
			 * 
			 */
			public void setFRMTCDE(Object value) {
				this.frmtcde = value;
			}

			/**
			 * Gets the value of the replcde property.
			 * 
			 */
			public int getREPLCDE() {
				return replcde;
			}

			/**
			 * Sets the value of the replcde property.
			 * 
			 */
			public void setREPLCDE(int value) {
				this.replcde = value;
			}

			/**
			 * Gets the value of the fiid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFIID() {
				return fiid;
			}

			/**
			 * Sets the value of the fiid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFIID(String value) {
				this.fiid = value;
			}

			/**
			 * Gets the value of the regn property.
			 * 
			 * @return possible object is {@link Object }
			 * 
			 */
			public String getREGN() {
				return regn;
			}

			/**
			 * Sets the value of the regn property.
			 * 
			 * @param value
			 *            allowed object is {@link Object }
			 * 
			 */
			public void setREGN(String value) {
				this.regn = value;
			}

			/**
			 * Gets the value of the brch property.
			 * 
			 * @return possible object is {@link Object }
			 * 
			 */
			public String getBRCH() {
				return brch;
			}

			/**
			 * Sets the value of the brch property.
			 * 
			 * @param value
			 *            allowed object is {@link Object }
			 * 
			 */
			public void setBRCH(String value) {
				this.brch = value;
			}

			/**
			 * Gets the value of the usergrp property.
			 * 
			 */
			public int getUSERGRP() {
				return usergrp;
			}

			/**
			 * Sets the value of the usergrp property.
			 * 
			 */
			public void setUSERGRP(int value) {
				this.usergrp = value;
			}

			/**
			 * Gets the value of the usernum property.
			 * 
			 */
			public int getUSERNUM() {
				return usernum;
			}

			/**
			 * Sets the value of the usernum property.
			 * 
			 */
			public void setUSERNUM(int value) {
				this.usernum = value;
			}

			/**
			 * Gets the value of the siteprodind property.
			 * 
			 */
			public int getSITEPRODIND() {
				return siteprodind;
			}

			/**
			 * Sets the value of the siteprodind property.
			 * 
			 */
			public void setSITEPRODIND(int value) {
				this.siteprodind = value;
			}

			/**
			 * Gets the value of the errcde property.
			 * 
			 */
			public int getERRCDE() {
				return errcde;
			}

			/**
			 * Sets the value of the errcde property.
			 * 
			 */
			public void setERRCDE(int value) {
				this.errcde = value;
			}

			/**
			 * Gets the value of the errsubcde property.
			 * 
			 */
			public int getERRSUBCDE() {
				return errsubcde;
			}

			/**
			 * Sets the value of the errsubcde property.
			 * 
			 */
			public void setERRSUBCDE(int value) {
				this.errsubcde = value;
			}

			/**
			 * Gets the value of the ptdserver property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPTDSERVER() {
				return ptdserver;
			}

			/**
			 * Sets the value of the ptdserver property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPTDSERVER(String value) {
				this.ptdserver = value;
			}

			/**
			 * Gets the value of the rdfserver property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRDFSERVER() {
				return rdfserver;
			}

			/**
			 * Sets the value of the rdfserver property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRDFSERVER(String value) {
				this.rdfserver = value;
			}

			/**
			 * Gets the value of the pinserver property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPINSERVER() {
				return pinserver;
			}

			/**
			 * Sets the value of the pinserver property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPINSERVER(String value) {
				this.pinserver = value;
			}

			/**
			 * Gets the value of the system property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getSYSTEM() {
				return system;
			}

			/**
			 * Sets the value of the system property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setSYSTEM(String value) {
				this.system = value;
			}

			/**
			 * Gets the value of the pathmon property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPATHMON() {
				return pathmon;
			}

			/**
			 * Sets the value of the pathmon property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPATHMON(String value) {
				this.pathmon = value;
			}

			/**
			 * Gets the value of the ln property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLN() {
				return ln;
			}

			/**
			 * Sets the value of the ln property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLN(String value) {
				this.ln = value;
			}

			/**
			 * Gets the value of the lconfname property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLCONFNAME() {
				return lconfname;
			}

			/**
			 * Sets the value of the lconfname property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLCONFNAME(String value) {
				this.lconfname = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="TERMID" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="OMFAUDIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="FRMTCDE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
		 *         &lt;element name="REPLCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="FIID" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="REGN" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
		 *         &lt;element name="BRCH" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
		 *         &lt;element name="USERGRP" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="USERNUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="SITEPRODIND" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="ERRCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="ERRSUBCDE" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="PTD_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="RDF_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="PIN_SERVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="SYSTEM" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="PATHMON" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="LN" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="LCONFNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "termid", "omfaudit", "frmtcde",
				"replcde", "fiid", "regn", "brch", "usergrp", "usernum",
				"siteprodind", "errcde", "errsubcde", "ptdserver", "rdfserver",
				"pinserver", "system", "pathmon", "ln", "lconfname" })
		public static class SCCGP {

			@XmlElement(name = "TERMID", required = true)
			protected String termid;
			@XmlElement(name = "OMFAUDIT")
			protected int omfaudit;
			@XmlElement(name = "FRMTCDE", required = true)
			protected Object frmtcde;
			@XmlElement(name = "REPLCDE")
			protected int replcde;
			@XmlElement(name = "FIID", required = true)
			protected String fiid;
			@XmlElement(name = "REGN")
			protected String regn;
			@XmlElement(name = "BRCH")
			protected String brch;
			@XmlElement(name = "USERGRP")
			protected int usergrp;
			@XmlElement(name = "USERNUM")
			protected int usernum;
			@XmlElement(name = "SITEPRODIND")
			protected int siteprodind;
			@XmlElement(name = "ERRCDE")
			protected int errcde;
			@XmlElement(name = "ERRSUBCDE")
			protected int errsubcde;
			@XmlElement(name = "PTD_SERVER", required = true)
			protected String ptdserver;
			@XmlElement(name = "RDF_SERVER", required = true)
			protected String rdfserver;
			@XmlElement(name = "PIN_SERVER", required = true)
			protected String pinserver;
			@XmlElement(name = "SYSTEM", required = true)
			protected String system;
			@XmlElement(name = "PATHMON", required = true)
			protected String pathmon;
			@XmlElement(name = "LN", required = true)
			protected String ln;
			@XmlElement(name = "LCONFNAME", required = true)
			protected String lconfname;

			/**
			 * Gets the value of the termid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getTERMID() {
				return termid;
			}

			/**
			 * Sets the value of the termid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setTERMID(String value) {
				this.termid = value;
			}

			/**
			 * Gets the value of the omfaudit property.
			 * 
			 */
			public int getOMFAUDIT() {
				return omfaudit;
			}

			/**
			 * Sets the value of the omfaudit property.
			 * 
			 */
			public void setOMFAUDIT(int value) {
				this.omfaudit = value;
			}

			/**
			 * Gets the value of the frmtcde property.
			 * 
			 * @return possible object is {@link Object }
			 * 
			 */
			public Object getFRMTCDE() {
				return frmtcde;
			}

			/**
			 * Sets the value of the frmtcde property.
			 * 
			 * @param value
			 *            allowed object is {@link Object }
			 * 
			 */
			public void setFRMTCDE(Object value) {
				this.frmtcde = value;
			}

			/**
			 * Gets the value of the replcde property.
			 * 
			 */
			public int getREPLCDE() {
				return replcde;
			}

			/**
			 * Sets the value of the replcde property.
			 * 
			 */
			public void setREPLCDE(int value) {
				this.replcde = value;
			}

			/**
			 * Gets the value of the fiid property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFIID() {
				return fiid;
			}

			/**
			 * Sets the value of the fiid property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFIID(String value) {
				this.fiid = value;
			}

			/**
			 * Gets the value of the regn property.
			 * 
			 * @return possible object is {@link Object }
			 * 
			 */
			public String getREGN() {
				return regn;
			}

			/**
			 * Sets the value of the regn property.
			 * 
			 * @param value
			 *            allowed object is {@link Object }
			 * 
			 */
			public void setREGN(String value) {
				this.regn = value;
			}

			/**
			 * Gets the value of the brch property.
			 * 
			 * @return possible object is {@link Object }
			 * 
			 */
			public String getBRCH() {
				return brch;
			}

			/**
			 * Sets the value of the brch property.
			 * 
			 * @param value
			 *            allowed object is {@link Object }
			 * 
			 */
			public void setBRCH(String value) {
				this.brch = value;
			}

			/**
			 * Gets the value of the usergrp property.
			 * 
			 */
			public int getUSERGRP() {
				return usergrp;
			}

			/**
			 * Sets the value of the usergrp property.
			 * 
			 */
			public void setUSERGRP(int value) {
				this.usergrp = value;
			}

			/**
			 * Gets the value of the usernum property.
			 * 
			 */
			public int getUSERNUM() {
				return usernum;
			}

			/**
			 * Sets the value of the usernum property.
			 * 
			 */
			public void setUSERNUM(int value) {
				this.usernum = value;
			}

			/**
			 * Gets the value of the siteprodind property.
			 * 
			 */
			public int getSITEPRODIND() {
				return siteprodind;
			}

			/**
			 * Sets the value of the siteprodind property.
			 * 
			 */
			public void setSITEPRODIND(int value) {
				this.siteprodind = value;
			}

			/**
			 * Gets the value of the errcde property.
			 * 
			 */
			public int getERRCDE() {
				return errcde;
			}

			/**
			 * Sets the value of the errcde property.
			 * 
			 */
			public void setERRCDE(int value) {
				this.errcde = value;
			}

			/**
			 * Gets the value of the errsubcde property.
			 * 
			 */
			public int getERRSUBCDE() {
				return errsubcde;
			}

			/**
			 * Sets the value of the errsubcde property.
			 * 
			 */
			public void setERRSUBCDE(int value) {
				this.errsubcde = value;
			}

			/**
			 * Gets the value of the ptdserver property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPTDSERVER() {
				return ptdserver;
			}

			/**
			 * Sets the value of the ptdserver property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPTDSERVER(String value) {
				this.ptdserver = value;
			}

			/**
			 * Gets the value of the rdfserver property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getRDFSERVER() {
				return rdfserver;
			}

			/**
			 * Sets the value of the rdfserver property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setRDFSERVER(String value) {
				this.rdfserver = value;
			}

			/**
			 * Gets the value of the pinserver property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPINSERVER() {
				return pinserver;
			}

			/**
			 * Sets the value of the pinserver property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPINSERVER(String value) {
				this.pinserver = value;
			}

			/**
			 * Gets the value of the system property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getSYSTEM() {
				return system;
			}

			/**
			 * Sets the value of the system property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setSYSTEM(String value) {
				this.system = value;
			}

			/**
			 * Gets the value of the pathmon property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getPATHMON() {
				return pathmon;
			}

			/**
			 * Sets the value of the pathmon property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setPATHMON(String value) {
				this.pathmon = value;
			}

			/**
			 * Gets the value of the ln property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLN() {
				return ln;
			}

			/**
			 * Sets the value of the ln property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLN(String value) {
				this.ln = value;
			}

			/**
			 * Gets the value of the lconfname property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getLCONFNAME() {
				return lconfname;
			}

			/**
			 * Sets the value of the lconfname property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setLCONFNAME(String value) {
				this.lconfname = value;
			}

		}

	}

}