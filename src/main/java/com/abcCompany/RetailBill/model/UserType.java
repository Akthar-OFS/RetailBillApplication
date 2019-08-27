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
 * The Class UserType.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@Entity
@Table(name="user_type")
@Getter
@Setter
public class UserType {
	
	@Id
	@Column(name = "type_id")
	private Long typeId;
	
	@Column(name = "type_name")
	private String typeName;
	
	@Column(name = "description")
	private String description;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "discount_id", referencedColumnName = "discount_id")
	private Discount discount;
}
