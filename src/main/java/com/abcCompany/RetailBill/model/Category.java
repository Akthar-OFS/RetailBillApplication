package com.abcCompany.RetailBill.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Category.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {
	
	@Id
	@Column(name = "category_id")
	private Long categoryId;
	
	@Column(name = "name")
	private String categoryName;
	
	@Column(name = "description")
	private String description;

}
