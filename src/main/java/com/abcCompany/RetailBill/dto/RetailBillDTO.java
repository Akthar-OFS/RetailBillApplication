package com.abcCompany.RetailBill.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class RetailBillDTO.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@Getter
@Setter
public class RetailBillDTO {

	@NotNull(message = "User id must not be empty")
	private Long userId;
	
	@NotNull(message = "itemList must not be empty")
	private List<ItemDTO> itemList;
	
	private Double netPayableAmount;
}
