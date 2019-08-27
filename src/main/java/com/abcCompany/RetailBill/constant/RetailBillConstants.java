package com.abcCompany.RetailBill.constant;

/**
 * The Enum RetailBillConstants.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
public enum RetailBillConstants {

	NUMBER_OF_YEARS(2),
	
	OLD_CUSTOMER_DISCOUNT(5),

	DISCOUNT_FIXED(5);

	private int id;

	private RetailBillConstants(int id) {
        this.id = id;
    }

	public int getValue() {
        return id;
    }
}
