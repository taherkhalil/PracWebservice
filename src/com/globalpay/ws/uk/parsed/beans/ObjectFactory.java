//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.11 at 02:49:54 PM IST 
//

package com.globalpay.ws.uk.parsed.beans;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.globalpay.ws.ca.parser.beans package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.globalpay.ws.ca.parser.beans
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link CurrentConnection }
	 * 
	 */
	public CurrentConnection createCurrentConnection() {
		return new CurrentConnection();
	}

	/**
	 * Create an instance of {@link BASE24 }
	 * 
	 */
	public BASE24 createBASE24() {
		return new BASE24();
	}

	/**
	 * Create an instance of {@link BASE24 .MSGHEADER }
	 * 
	 */
	public BASE24.MSGHEADER createBASE24MSGHEADER() {
		return new BASE24.MSGHEADER();
	}

	/**
	 * Create an instance of {@link BASE24 .MSGHEADER.SCCGP }
	 * 
	 */
	public BASE24.MSGHEADER.SCCGP createBASE24MSGHEADERSCCGP() {
		return new BASE24.MSGHEADER.SCCGP();
	}

	/**
	 * Create an instance of {@link BASE24 .MSGHEADER.MCCGP }
	 * 
	 */
	public BASE24.MSGHEADER.MCCGP createBASE24MSGHEADERMCCGP() {
		return new BASE24.MSGHEADER.MCCGP();
	}
}
