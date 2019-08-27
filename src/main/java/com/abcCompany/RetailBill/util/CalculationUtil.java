package com.abcCompany.RetailBill.util;

import java.util.Calendar;
import java.util.Date;

/**
 * The Class CalculationUtil.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
public class CalculationUtil {
	
	public static Boolean isOldCustomer (Date createDate, int yearsBack) {
		
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, -yearsBack); // to get previous year add -1
		Date oldYear = cal.getTime();
		int diff = oldYear.compareTo(createDate);
		
		return diff >= 0;
	}

}
