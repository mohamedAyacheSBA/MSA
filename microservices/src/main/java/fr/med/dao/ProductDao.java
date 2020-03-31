package fr.med.dao;

import java.util.List;

import fr.med.model.Product;

public interface ProductDao {

	public List<Product> findAll();
	
	public Product findById(int id);
	
	public Product save(Product product);
}
