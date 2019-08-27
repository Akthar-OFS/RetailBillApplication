package com.abcCompany.RetailBill.service;

import com.abcCompany.RetailBill.dto.RetailBillDTO;

/**
 * The Interface RetailBillService.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
public interface RetailBillService {
	
    /**
     * Method to Get Retail Bill Amount
     *
     * @param retailBillDTO
     *            the object contains user and item list
     * 
     * @return response retailBillDTO
     * 				the object contains net retail bill amount
     */
	public RetailBillDTO getRetailBillAmount(RetailBillDTO retailBillDTO);

}
