package com.abcCompany.RetailBill.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class StockItem.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@Entity
@Table(name = "stock_item")
@Getter
@Setter
public class StockItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "item_id")
	private Long itemId;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;
	
	@Column(name = "price")
	private Double price;
}
