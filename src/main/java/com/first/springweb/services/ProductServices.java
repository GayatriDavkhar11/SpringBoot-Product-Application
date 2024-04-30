package com.first.springweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.springweb.entity.Product;
import com.first.springweb.repos.ProductReposiratory;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServices {
	@Autowired
	private ProductReposiratory repos;
	
	public List<Product> listAll() {
		return repos.findAll();
		
	}
	
	public void save(Product product) {
		repos.save(product);
	}
	public Product get(long id) {
		return repos.findById(id).get();
	}
	public void delete(long id) {
		repos.deleteById(id);
	}

}
