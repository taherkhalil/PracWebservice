package com.globalpay.ws.uk.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.csl.globalpay.ipm.msgprdfreply.MsgPRDFReply;
import com.globalpay.ws.uk.beans.Address;
import com.globalpay.ws.uk.beans.Name;
import com.globalpay.ws.uk.beans.PhoneNumber;
import com.globalpay.ws.uk.beans.MerchantInfo;
import com.globalpay.ws.uk.beans.UpdateMerchantInfo;
import com.globalpay.ws.uk.dto.AddressDTO;
import com.globalpay.ws.uk.dto.MerchantInfoDTO;
import com.globalpay.ws.uk.dto.NameDTO;
import com.globalpay.ws.uk.dto.PhoneNumberDTO;
import com.globalpay.ws.uk.dto.StatusDetailsDTO;
import com.globalpay.ws.uk.exception.ConnectionFailedException;
import com.globalpay.ws.uk.exception.ConnectionFileInvalidException;
import com.globalpay.ws.uk.exception.MandatoryFieldNotFoundException;
import com.globalpay.ws.uk.exception.NoBufferSpaceException;
import com.globalpay.ws.uk.exception.NoCBSpaceException;
import com.globalpay.ws.uk.exception.NoIOBufSpaceException;
import com.globalpay.ws.uk.exception.NoIOCBSpaceException;
import com.globalpay.ws.uk.exception.NoIOPhysMemException;
import com.globalpay.ws.uk.exception.NoPhysMemException;
import com.globalpay.ws.uk.exception.NoPoolSpaceException;
import com.globalpay.ws.uk.exception.RetailerFileException;
import com.globalpay.ws.uk.exception.RetailerNotFoundException;
import com.globalpay.ws.uk.exception.StatusTimeoutException;
import com.globalpay.ws.uk.parsed.beans.CurrentConnection;
import com.globalpay.ws.uk.service.GNAPService;
import com.globalpay.ws.uk.util.Constant;
import com.globalpay.ws.uk.util.Utility;

public class B24UKUpdateTest {
	public static void main(String[] args) throws IOException {

		UpdateMerchantInfo updateMerchantInfo = new UpdateMerchantInfo();
		updateMerchantInfo.setRequestId("123456");
		updateMerchantInfo.setUserId("456789");
		// updateMerchantInfo.setCorrelationId("789456");
		PhoneNumber phnNo = new PhoneNumber();
		phnNo.setPhoneNumber("00121");
		phnNo.setFieldType(Constant.DBA_PHONE_NUMBER.getConstantValue());
		Address add = new Address();
		// add.setAddress1("1004");
		// add.setAddress2("Baner");
		// add.setCity("Pune");
		// add.setCountry("123546");
		add.setFieldType(Constant.DBA_ADDRESS.getConstantValue());
		Name name = new Name();
		name.setName("Prashant");
		name.setFieldType(Constant.DBA_NAME.getConstantValue());
		List<Address> addList = new ArrayList<>();
		List<PhoneNumber> phnList = new ArrayList<>();
		List<Name> nameList = new ArrayList<>();
		phnList.add(phnNo);
		addList.add(add);
		nameList.add(name);
		MerchantInfo info = new MerchantInfo();
		info.setMerchantId("02892561");// 44444X01, 03767721
		info.setAddresses(addList);
		info.setNames(nameList);
		info.setPhoneNumbers(phnList);

		updateMerchantInfo.setMerchantInfo(info);
		GNAPService ser = new GNAPService();
		MerchantInfoDTO merchantDTO = Utility.mapDTO(updateMerchantInfo);

		/**
		 * 
		 */
		// List<AddressDTO> addressList = merchantDTO.getAddresses();
		//
		// List<NameDTO> namesList = merchantDTO.getNames();
		//
		// List<PhoneNumberDTO> phoneNumberList = merchantDTO.getPhoneNumbers();
		//
		// if (addressList != null && addressList.size() > 0) {
		// AddressDTO dbaAddress = addressList.get(0);
		//
		// }
		// if (namesList != null && namesList.size() > 0) {
		// NameDTO dbaName = namesList.get(0);
		//
		// }
		// if (phoneNumberList != null && phoneNumberList.size() > 0) {
		// PhoneNumberDTO dbaPhoneNumber = phoneNumberList.get(0);
		//
		// }
		// merchantDTO.setAddresses(addressList);
		// merchantDTO.setNames(namesList);
		// merchantDTO.setPhoneNumbers(phoneNumberList);
		/**
		 * 
		 */

		// try {
		// StatusDetailsDTO status = ser.updateMerchantInfo(merchantDTO);
		// System.out.println("ERROR CODE " + status.getCode());
		// System.out.println("*****DESCRIPTION*****"
		// + status.getDescription());
		// System.out.println("Connection success full****");
		// } catch (SocketException | ConnectionFailedException
		// | RetailerNotFoundException | ConnectionFileInvalidException
		// | NoBufferSpaceException | NoCBSpaceException
		// | NoIOBufSpaceException | NoIOCBSpaceException
		// | NoIOPhysMemException | NoPhysMemException
		// | NoPoolSpaceException | StatusTimeoutException
		// | RetailerFileException e) {
		// e.printStackTrace();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		System.out.println(merchantDTO.getMerchantId());
		MerchantInfo info1 = new MerchantInfo();
		info.setMerchantId("1881");
		updateMerchantInfo.setMerchantInfo(info1);

		System.out.println(merchantDTO.getMerchantId());
		// File file = new File("");
		System.out.println("main");
		// File file = ResourceUtils
		// .getFile("classpath:/beans.xml");
		//
		// // File is found
		// System.out.println("File Found : " + file.exists());

		// InputStream in = ClassLoader
		// .getSystemResourceAsStream("CurrentConnection.xml");
		// // System.out.println(in.toString());
		// CurrentConnection records = null;
		//
		// URL url = Test.class.getClassLoader().getResource(
		// "CurrentConnection.xml");
		// System.out.println("url : "+url.getPath());
		// // new File(url);
		// try {
		// JAXBContext jaxbContext = JAXBContext
		// .newInstance(CurrentConnection.class);
		// Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		// // records = (CurrentConnection) jaxbUnmarshaller.unmarshal(in);
		// // records = (CurrentConnection) jaxbUnmarshaller.unmarshal(in);
		// // System.out.println(records.getCurrent());
		//
		// } catch (JAXBException e) {
		// e.printStackTrace();
		// }

		// // System.out.println("IN:" + + "    ");
		// ApplicationContext ctx = new ClassPathXmlApplicationContext(
		// "CurrentConnection.xml");

		// InputStream in =
		// Test.class.getResourceAsStream("classpath:beans.xml");
		//
		// ClassPathResource classPathResource = new ClassPathResource(
		// "../WEB-INF/beans.xml");
		// File file = classPathResource.getFile();
		// System.out.println("IN:" + in + "    " + file.getName());
		// Resource resource = new ClassPathResource("beans.xml");
		// InputStream is = resource.getInputStream();

		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "classpath:*/WebContent/WEB-INF/beans.xml");
		//
		// CustomResource customResourceLoader = (CustomResource) context
		// .getBean("customResource");

		// customResourceLoader.showResourceData();

		// CurrentConnection records = null;
		// try {
		// JAXBContext jaxbContext = JAXBContext
		// .newInstance(CurrentConnection.class);
		// Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		// records = (CurrentConnection) jaxbUnmarshaller.unmarshal(new File(
		// "/WebContent/WEB-INF/XMLConfig/CurrentConnection.xml"));
		// } catch (JAXBException e) {
		// e.printStackTrace();
		// }
	}
}
