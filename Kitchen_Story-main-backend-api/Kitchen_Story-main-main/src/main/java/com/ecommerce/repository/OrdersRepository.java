package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Orders;
@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {

}
