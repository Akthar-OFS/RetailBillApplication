package com.abcCompany.RetailBill.constant;

/**
 * The Enum UserConstant.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
public enum UserConstant {

	EMPLOYEE(1),

	STORE_AFFLIATE(2),

	CUSTOMER(3);

	private int id;

	private UserConstant(int id) {
        this.id = id;
    }

	public int getValue() {
        return id;
    }
}
