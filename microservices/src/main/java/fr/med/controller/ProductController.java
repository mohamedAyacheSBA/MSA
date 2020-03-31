package fr.med.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.med.dao.ProductDao;
import fr.med.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping(value= "Produits")
	public List<Product> ListProduits(){
		return productDao.findAll();
	}
	
	@GetMapping(value = "Produits/{id}")
	public Product afficherUnProduit(@PathVariable int id){
		
		Product produit = new Product(id, "aspirateur", 100);
		
		return produit;
	}
    
}
