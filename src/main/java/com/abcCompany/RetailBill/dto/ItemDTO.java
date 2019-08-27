package com.abcCompany.RetailBill.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class ItemDTO.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@Getter
@Setter
public class ItemDTO {
	
	@NotNull(message = "item id must not be empty")
	private Long itemId;
	
	private String name;
	
	@NotNull(message = "quantity must not be empty")
	private Integer quantity;

}
