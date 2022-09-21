package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CartItem;
@Repository
public interface CartItemRepository extends CrudRepository<CartItem, Long> {
	public List<CartItem> findCartItemByCartCartid(long cartid);
	public CartItem findCartItemByProductProductid(long productid);
}
