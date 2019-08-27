package com.abcCompany.RetailBill.constant;

/**
 * The Enum CategoryConstant.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
public enum CategoryConstant {

	STATIONARY(1),

	COSMETIC(2),

	GROCERY(3);

	private int id;

	private CategoryConstant(int id) {
        this.id = id;
    }

	public int getValue() {
        return id;
    }
}
