package com.abcCompany.RetailBill.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcCompany.RetailBill.dto.RetailBillDTO;
import com.abcCompany.RetailBill.service.RetailBillService;

/**
 * The Class RetailBillController.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@RestController
@RequestMapping("/bill")
public class RetailBillController {
	
	@Autowired
	RetailBillService myRetailService;

    /**
     * Method to Get Retail Bill Amount
     *
     * @param retailBillDTO
     *            the object contains user and item list
     * 
     * @return response retailBillDTO
     * 				the object contains net retail bill amount
     */
	@PostMapping(path= "/getRetailBillAmount", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RetailBillDTO> getRetailBillAmount(@Valid @RequestBody RetailBillDTO retailBillDTO) {

		return new ResponseEntity<>(myRetailService.getRetailBillAmount(retailBillDTO), HttpStatus.OK);
	}
}
