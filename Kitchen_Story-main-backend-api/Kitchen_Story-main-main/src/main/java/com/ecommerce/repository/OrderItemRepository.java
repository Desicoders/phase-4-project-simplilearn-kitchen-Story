package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.OrderItem;
@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {

}
