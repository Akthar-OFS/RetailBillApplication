package com.abcCompany.RetailBill.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Discount.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@Entity
@Table(name = "discount")
@Getter
@Setter
public class Discount {
	
	@Id
	@Column(name = "discount_id")
	private Long discountId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "percentage")
	private Integer percentage;

}
