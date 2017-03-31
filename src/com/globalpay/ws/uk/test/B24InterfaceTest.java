package com.globalpay.ws.uk.test;

import static org.junit.Assert.*;

import java.net.SocketException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.csl.globalpay.ipm.msgprdfreply.MsgPRDFReply;
import com.globalpay.ws.uk.dao.B24interface;
import com.globalpay.ws.uk.exception.ConnectionFailedException;
import com.globalpay.ws.uk.exception.ConnectionFileInvalidException;
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
import com.globalpay.ws.uk.service.GNAPService;

public class B24InterfaceTest {

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
	public void testReadPRDFRecord() {
		B24interface b24Int = new B24interface();
		// GNAPService ser = new GNAPService();
		try {
			MsgPRDFReply prdfReply = b24Int.ReadPRDFRecord("01891181");// 02892561
																		// ,01900251,03767721
																		// ,04847581
																		// ,01234567
																		// ,01891181,
																		// 0000000002892561,01900251
			// MsgPRDFReply prdfReply =ser.updateMerchantInfo(merchantDTO);
			System.out.println("acnt nmbr1 "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getAcct().getAcctNum()
					+ " ,"
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getName()
					+ " , "
					+ prdfReply.getMsgprdf().getRecImage().getPrdfRecImage()
							.getRetailer().getPhone());
			String[] pan = prdfReply.getMsgprdf().getRecImage().getPanImage()
					.getPanImageChar();

			for (int i = 0; i < pan.length; i++) {
				System.out.println(i
						+ " pan "
						+ prdfReply.getMsgprdf().getRecImage().getPanImage()
								.getPanImageChar(i));
			}

			System.out.println("Connection success full****");
		} catch (SocketException | ConnectionFailedException
				| RetailerNotFoundException | ConnectionFileInvalidException
				| NoBufferSpaceException | NoCBSpaceException
				| NoIOBufSpaceException | NoIOCBSpaceException
				| NoIOPhysMemException | NoPhysMemException
				| NoPoolSpaceException | StatusTimeoutException
				| RetailerFileException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testUpdatePRDFRecord() {
		fail("Not yet implemented");
	}

}
