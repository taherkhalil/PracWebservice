package com.globalpay.ws.uk.util;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;

import com.globalpay.ws.uk.beans.Address;
import com.globalpay.ws.uk.beans.Name;
import com.globalpay.ws.uk.beans.PhoneNumber;
import com.globalpay.ws.uk.beans.MerchantInfo;
import com.globalpay.ws.uk.beans.UpdateMerchantInfo;
import com.globalpay.ws.uk.dto.MerchantInfoDTO;
import com.globalpay.ws.uk.exception.MandatoryFieldNotFoundException;
import com.globalpay.ws.uk.service.GNAPService;

// "/home/chouhapr/workspace/NucluesPOC/WebContent/WEB-INF/XMLConfig/B24Request.xml"
public class Utility {

	final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(GNAPService.class);

	public static <T> T parseRecordTest(String b24XML, Class<T> t) {
		logger.debug("Utility.parseRecordTest");
		T records = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(t);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			records = (T) jaxbUnmarshaller.unmarshal(new File(b24XML));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return records;
	}

	public static <T> T parseRecord(InputStream b24XML, Class<T> t) {
		logger.debug("Utility.parseRecord");
		T records = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(t);

			XMLInputFactory xif = XMLInputFactory.newFactory();
			xif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
			xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xsr = null;
			xsr = xif.createXMLStreamReader(b24XML);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			records = (T) jaxbUnmarshaller.unmarshal(xsr);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		logger.debug("Utility.parseRecord completed");
		return records;

	}

	public static String validateString(String str) {
		logger.debug("Utility.validateString");
		if (str != null && str.trim().length() > 0) {
			return str;
		}
		return "";
	}

	public static boolean isNotNullOrEmpty(String str) {
		logger.debug("Utility.isNotNullOrEmpty");
		if (str != null && str.trim().length() > 0) {
			return true;
		}
		return false;
	}

	public static String validateMerchant(String merchant)
			throws MandatoryFieldNotFoundException {
		logger.debug("Utility.validateMerchant");
		String validatedMerchant = merchant;

		if (merchant != null && merchant.trim().length() > 0
				&& merchant.trim().length() < 8) {
			validatedMerchant = StringUtils.leftPad(merchant, 8, '0');

		} else if (merchant == null || merchant.trim().length() == 0) {
			throw new MandatoryFieldNotFoundException(
					"Mandatory Fields : merchant Id not found in request object");
		}
		return validatedMerchant;
	}

	public static boolean validateRequest(MerchantInfo merchantInfo) {
		logger.debug("Utility.validateRequest");
		boolean flag = false;

		String merchantID = merchantInfo.getMerchantId();
		// List<DBAAddress> addressList = merchantInfo.getAddresses();
		// List<DBAName> namesList = merchantInfo.getNames();
		// List<DBAPhoneNumber> phoneNumberList =
		// merchantInfo.getPhoneNumbers();

		boolean merchantFlag = isNotNullOrEmpty(merchantID);
		if (merchantFlag) {
			flag = true;
		}

		// Iterator<DBAAddress> itAdd = addressList.iterator();
		//
		// while (itAdd.hasNext()) {
		// DBAAddress dbaAddress = (DBAAddress) itAdd.next();
		// if (isNotNullOrEmpty(dbaAddress.getAddress1())
		// && isNotNullOrEmpty(dbaAddress.getAddress2())
		// && isNotNullOrEmpty(dbaAddress.getCity())
		// && isNotNullOrEmpty(dbaAddress.getCountry())
		// && isNotNullOrEmpty(dbaAddress.getZip())) {
		// flag = true;
		// }
		// // As discussed with Neela, Attention and address3 field is not in
		// // GNAP . But for consistency map them to blank.
		// dbaAddress.getAddress3();
		// dbaAddress.getAttention();
		// }
		//
		// Iterator<DBAName> itName = namesList.iterator();
		//
		// while (itName.hasNext()) {
		// DBAName dbaName = (DBAName) itName.next();
		// if (isNotNullOrEmpty(dbaName.getName())) {
		// flag = true;
		// }
		// }
		//
		// Iterator<DBAPhoneNumber> itPhnNum = phoneNumberList.iterator();
		//
		// while (itPhnNum.hasNext()) {
		// DBAPhoneNumber dbaPhoneNumber = (DBAPhoneNumber) itPhnNum.next();
		// if (isNotNullOrEmpty(dbaPhoneNumber.getPhoneNumber())) {
		// flag = true;
		// }
		// }

		return flag;
	}

	public static MerchantInfoDTO mapDTO(UpdateMerchantInfo updateMerchantInfo) {
		logger.debug("Utility.mapDTO");
		MerchantInfoDTO merchantDTO = ObjectMapper.map(
				updateMerchantInfo.getMerchantInfo(), MerchantInfoDTO.class);

		return merchantDTO;
	}

}
