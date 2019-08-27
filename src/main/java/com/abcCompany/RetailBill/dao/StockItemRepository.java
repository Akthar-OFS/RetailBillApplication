package com.abcCompany.RetailBill.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abcCompany.RetailBill.model.StockItem;

/**
 * The Interface StockItemRepository.
 *
 * @author akthar hussaini
 * @since RetailBill; Aug 26, 2019
 *
 */
@Repository
public interface StockItemRepository extends CrudRepository<StockItem, Long>{

}
