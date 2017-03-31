package com.globalpay.ws.uk.test;

import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.globalpay.ws.uk.beans.Address;
import com.globalpay.ws.uk.beans.Name;
import com.globalpay.ws.uk.beans.PhoneNumber;
import com.globalpay.ws.uk.beans.MerchantInfo;
import com.globalpay.ws.uk.beans.UpdateMerchantInfo;
import com.globalpay.ws.uk.exception.ConnectionFailedException;
import com.globalpay.ws.uk.exception.ConnectionFileInvalidException;
import com.globalpay.ws.uk.exception.InvalidRequestException;
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
import com.globalpay.ws.uk.util.Utility;
import com.globalpay.ws.uk.webservice.GNAPUKWebService;

public class GNAPUKTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUpdateMerchantInfo() {
		// CurrentConnection currentConnection = Utility
		// .parseRecord(
		// "C:/Java Workspace/cxf/GNAPUKwebservicewithActualStubs/WebContent/WEB-INF/XMLConfig/CurrentConnection.xml",
		// CurrentConnection.class);
		// if (currentConnection != null && currentConnection.getCurrent() !=
		// null) {
		// System.out.println("Current connection is "
		// + currentConnection.getCurrent());
		// } else {
		// System.out.println("connection null");
		// }

		UpdateMerchantInfo updateMerchantInfo = new UpdateMerchantInfo();
		updateMerchantInfo.setRequestId("123456");
		updateMerchantInfo.setUserId("456789");
//		updateMerchantInfo.setCorrelationId("789456");
		PhoneNumber phnNo = new PhoneNumber();
		phnNo.setPhoneNumber("98810121212");
		Address add = new Address();
		add.setAddress1("1004");
		add.setAddress2("Baner");
		add.setCity("Pune");
		add.setCountry("123546");
		Name name = new Name();
		name.setName("prashant");
		List<Address> addList = new ArrayList<>();
		List<PhoneNumber> phnList = new ArrayList<>();
		List<Name> nameList = new ArrayList<>();
		phnList.add(phnNo);
		addList.add(add);
		nameList.add(name);
		MerchantInfo info = new MerchantInfo();
		info.setMerchantId("1891181");
		info.setAddresses(addList);
		info.setNames(nameList);
		info.setPhoneNumbers(phnList);

		updateMerchantInfo.setMerchantInfo(info);

		GNAPUKWebService service = new GNAPUKWebService();
		try {
			service.updateMerchantInfo(updateMerchantInfo);

		} catch (SocketException | ConnectionFailedException
				| RetailerNotFoundException | MandatoryFieldNotFoundException
				| InvalidRequestException | ConnectionFileInvalidException
				| NoBufferSpaceException | NoCBSpaceException
				| NoIOBufSpaceException | NoIOCBSpaceException
				| NoIOPhysMemException | NoPhysMemException
				| NoPoolSpaceException | StatusTimeoutException
				| RetailerFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
}
