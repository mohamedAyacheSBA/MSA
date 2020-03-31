package fr.med.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.med.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	public static List<Product> products = new ArrayList<>();
	
	static{
		
		products.add(new Product(1, "aspirateur", 100));
		products.add(new Product(2, "portable", 300));
		products.add(new Product(3, "console de jeux", 250));
	}
	@Override
	public List<Product> findAll() {	
		return products;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
