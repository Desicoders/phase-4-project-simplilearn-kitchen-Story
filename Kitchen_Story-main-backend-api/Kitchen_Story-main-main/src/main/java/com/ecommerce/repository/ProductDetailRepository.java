package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.ProductDetail;
@Repository
public interface ProductDetailRepository extends CrudRepository<ProductDetail, Long> {
	public ProductDetail findByProductProductid(long productid);
}
