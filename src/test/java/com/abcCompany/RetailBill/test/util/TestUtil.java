package com.abcCompany.RetailBill.test.util;

import java.util.ArrayList;
import java.util.List;

import com.abcCompany.RetailBill.dto.ItemDTO;
import com.abcCompany.RetailBill.dto.RetailBillDTO;

/**
 * The Class TestUtil.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
public class TestUtil {
	
	public static RetailBillDTO getEmployeeBillData() {
		
		RetailBillDTO retailBillDTO = new RetailBillDTO();
		retailBillDTO.setUserId(1L);
		
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setItemId(1L);
		itemDTO.setQuantity(3);
		
		ItemDTO itemDTO1 = new ItemDTO();
		itemDTO1.setItemId(3L);
		itemDTO1.setQuantity(4);
		
		ItemDTO itemDTO2 = new ItemDTO();
		itemDTO2.setItemId(2L);
		itemDTO2.setQuantity(2);
		
		List<ItemDTO> itemList = new ArrayList<>();
		itemList.add(itemDTO);
		itemList.add(itemDTO1);
		itemList.add(itemDTO2);
		
		retailBillDTO.setItemList(itemList);
		return retailBillDTO;
	}
	
	public static RetailBillDTO getCustomerBillData() {
		
		RetailBillDTO retailBillDTO = new RetailBillDTO();
		retailBillDTO.setUserId(3L);
		
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setItemId(1L);
		itemDTO.setQuantity(3);
		
		ItemDTO itemDTO1 = new ItemDTO();
		itemDTO1.setItemId(3L);
		itemDTO1.setQuantity(4);
		
		ItemDTO itemDTO2 = new ItemDTO();
		itemDTO2.setItemId(2L);
		itemDTO2.setQuantity(2);
		
		List<ItemDTO> itemList = new ArrayList<>();
		itemList.add(itemDTO);
		itemList.add(itemDTO1);
		itemList.add(itemDTO2);
		
		retailBillDTO.setItemList(itemList);
		return retailBillDTO;
	}
	
	public static RetailBillDTO getOldCustomerBillData() {
		
		RetailBillDTO retailBillDTO = new RetailBillDTO();
		retailBillDTO.setUserId(4L);
		
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setItemId(1L);
		itemDTO.setQuantity(3);
		
		ItemDTO itemDTO1 = new ItemDTO();
		itemDTO1.setItemId(3L);
		itemDTO1.setQuantity(4);
		
		ItemDTO itemDTO2 = new ItemDTO();
		itemDTO2.setItemId(2L);
		itemDTO2.setQuantity(2);
		
		List<ItemDTO> itemList = new ArrayList<>();
		itemList.add(itemDTO);
		itemList.add(itemDTO1);
		itemList.add(itemDTO2);
		
		retailBillDTO.setItemList(itemList);
		return retailBillDTO;
	}

	public static RetailBillDTO getBillDataForException() {
		
		RetailBillDTO retailBillDTO = new RetailBillDTO();
		
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setItemId(1L);
		itemDTO.setQuantity(3);
		
		ItemDTO itemDTO1 = new ItemDTO();
		itemDTO1.setItemId(3L);
		itemDTO1.setQuantity(4);
		
		ItemDTO itemDTO2 = new ItemDTO();
		itemDTO2.setItemId(2L);
		itemDTO2.setQuantity(2);
		
		List<ItemDTO> itemList = new ArrayList<>();
		itemList.add(itemDTO);
		itemList.add(itemDTO1);
		itemList.add(itemDTO2);
		
		retailBillDTO.setItemList(itemList);
		return retailBillDTO;
	}
}
