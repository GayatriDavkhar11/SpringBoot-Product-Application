package com.first.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.springweb.entity.Product;

public interface ProductReposiratory extends JpaRepository<Product,Long> {

}
