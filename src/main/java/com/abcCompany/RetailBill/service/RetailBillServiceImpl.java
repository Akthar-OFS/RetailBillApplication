package com.abcCompany.RetailBill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcCompany.RetailBill.constant.CategoryConstant;
import com.abcCompany.RetailBill.constant.RetailBillConstants;
import com.abcCompany.RetailBill.constant.UserConstant;
import com.abcCompany.RetailBill.dao.DiscountRepository;
import com.abcCompany.RetailBill.dao.RetailUserRepository;
import com.abcCompany.RetailBill.dao.StockItemRepository;
import com.abcCompany.RetailBill.dto.ItemDTO;
import com.abcCompany.RetailBill.dto.RetailBillDTO;
import com.abcCompany.RetailBill.model.Discount;
import com.abcCompany.RetailBill.model.RetailUser;
import com.abcCompany.RetailBill.model.StockItem;
import com.abcCompany.RetailBill.util.CalculationUtil;

/**
 * The Class RetailBillServiceImpl.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@Service
public class RetailBillServiceImpl implements RetailBillService {
	
	@Autowired
	RetailUserRepository retailUserRepository;
	
	@Autowired
	StockItemRepository stockItemRepository;
	
	@Autowired
	DiscountRepository discountRepository;

    /**
     * Method to Get Retail Bill Amount
     *
     * @param retailBillDTO
     *            the object contains user and item list
     * 
     * @return response retailBillDTO
     * 				the object contains net retail bill amount
     */
	@Override
	public RetailBillDTO getRetailBillAmount(RetailBillDTO retailBillDTO) {
		
		Double netPayableAmount = 0.0;
		Discount discount = new Discount();
		discount.setPercentage(0);

		RetailUser user = retailUserRepository.findById(retailBillDTO.getUserId()).get();
		
		if (user.getUserType().getTypeId().equals(Long.valueOf(UserConstant.CUSTOMER.getValue()))) {
			
			// Condition checks for Customer over given years
			if (CalculationUtil.isOldCustomer(user.getCreatedDate(), 
					RetailBillConstants.NUMBER_OF_YEARS.getValue())) {
				
				discount.setPercentage(RetailBillConstants.OLD_CUSTOMER_DISCOUNT.getValue());
			}
		} else {
			discount = user.getUserType().getDiscount();
		}
		
		for (ItemDTO itemsdto : retailBillDTO.getItemList()) {
			
			StockItem item = stockItemRepository.findById(itemsdto.getItemId()).get();
			Double amount = item.getPrice() * itemsdto.getQuantity(); 
			
			 // Condition checks for Not Grocery
			if (!item.getCategory().getCategoryId().equals(Long.valueOf(CategoryConstant.GROCERY.getValue()))) {
					netPayableAmount += amount - ((amount / 100) * discount.getPercentage());
			} else {
				netPayableAmount += amount;
			}
		}
		
		int resultAmount = (int) (netPayableAmount/100);
		netPayableAmount -= resultAmount * RetailBillConstants.DISCOUNT_FIXED.getValue();
		retailBillDTO.setNetPayableAmount(netPayableAmount);

		return retailBillDTO;
	}
}
