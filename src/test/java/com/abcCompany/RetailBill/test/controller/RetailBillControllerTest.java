package com.abcCompany.RetailBill.test.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.abcCompany.RetailBill.dto.RetailBillDTO;
import com.abcCompany.RetailBill.test.util.TestUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RetailBillControllerTest extends BaseTest {
	
    @Autowired
    private MockMvc mvc;
    
    @Test
    public void testGetRetailBillForEmployee() throws Exception {
    	
    	RetailBillDTO retailBillDTO = TestUtil.getEmployeeBillData();
        mvc.perform(MockMvcRequestBuilders
        		.post("/bill/getRetailBillAmount")
        		.contentType(MediaType.APPLICATION_JSON)
        		.content(asJsonString(retailBillDTO)))
        		.andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    @Test
    public void testGetRetailBillForCustomer() throws Exception {
    	
    	RetailBillDTO retailBillDTO = TestUtil.getEmployeeBillData();
        mvc.perform(MockMvcRequestBuilders
        		.post("/bill/getRetailBillAmount")
        		.contentType(MediaType.APPLICATION_JSON)
        		.content(asJsonString(retailBillDTO)))
        		.andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    @Test
    public void testGetRetailBillForException() throws Exception {
    	
    	RetailBillDTO retailBillDTO = TestUtil.getBillDataForException();
        mvc.perform(MockMvcRequestBuilders
        		.post("/bill/getRetailBillAmount")
        		.contentType(MediaType.APPLICATION_JSON)
        		.content(asJsonString(retailBillDTO)))
        		.andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}
