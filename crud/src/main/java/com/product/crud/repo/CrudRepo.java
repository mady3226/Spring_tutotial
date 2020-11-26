package com.product.crud.repo;

import com.product.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepo extends JpaRepository<Product, Integer> {

}
