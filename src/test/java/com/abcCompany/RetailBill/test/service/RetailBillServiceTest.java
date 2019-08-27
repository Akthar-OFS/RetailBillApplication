package com.abcCompany.RetailBill.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.abcCompany.RetailBill.dto.RetailBillDTO;
import com.abcCompany.RetailBill.service.RetailBillService;
import com.abcCompany.RetailBill.test.util.TestUtil;

/**
 * The Class RetailBillServiceTest.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RetailBillServiceTest {
	
	@Autowired
	RetailBillService myRetailService;
	
	@Test
	public void testGetRetailBillForEmployee() {
		
		RetailBillDTO retailBillDTO = TestUtil.getEmployeeBillData();
		RetailBillDTO resultDTO = myRetailService.getRetailBillAmount(retailBillDTO);
		
		Assert.assertNotNull(resultDTO.getNetPayableAmount());
	}

	@Test
	public void testGetRetailBillForCustomer() {
		
		RetailBillDTO retailBillDTO = TestUtil.getCustomerBillData();
		RetailBillDTO resultDTO = myRetailService.getRetailBillAmount(retailBillDTO);
		
		Assert.assertNotNull(resultDTO.getNetPayableAmount());
	}
	
	@Test
	public void testGetRetailBillForCustomerOver2Years() {
		
		RetailBillDTO retailBillDTO = TestUtil.getOldCustomerBillData();
		RetailBillDTO resultDTO = myRetailService.getRetailBillAmount(retailBillDTO);
		
		Assert.assertNotNull(resultDTO.getNetPayableAmount());	
	}

}
