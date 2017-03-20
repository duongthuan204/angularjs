package com.csc.fresher.angular.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.csc.fresher.angular.dto.Product;

@Service
public class ProductService {
	
	private static Map<Long, Product> PRODUCT_LIST = new HashMap<Long, Product>();
	private static final AtomicLong counter = new AtomicLong();
	
	static {
		Product p1 = new Product();
		p1.setId(counter.incrementAndGet());
		p1.setName("Zenfone 5");
		p1.setModel("Android 4.4");
		p1.setPrice(3500000);
		p1.setYear(2014);
		p1.setProducer("Asus");
		p1.setAvailable(5);
		PRODUCT_LIST.put(p1.getId(), p1);
		
		Product p2 = new Product();
		p2.setId(counter.incrementAndGet());
		p2.setName("iPhone 5S");
		p2.setModel("iOS 9.3.3");
		p2.setPrice(6900000);
		p2.setYear(2013);
		p2.setProducer("Apple");
		p2.setAvailable(10);
		PRODUCT_LIST.put(p2.getId(), p2);
		
		Product p3 = new Product();
		p3.setId(counter.incrementAndGet());
		p3.setName("Samsung Galaxy S7 Edge");
		p3.setModel("Limited Edition");
		p3.setPrice(20000000);
		p3.setYear(2016);
		p3.setProducer("Samsung");
		p3.setAvailable(12);
		PRODUCT_LIST.put(p3.getId(), p3);
	}
	
	public List<Product> getProductList() {
		return new ArrayList<Product>(PRODUCT_LIST.values());
	}
	
	public void addProduct(Product product) {
		product.setId(counter.incrementAndGet());
		PRODUCT_LIST.put(product.getId(), product);
	}
	
	public Product getProduct(long id) {
		return PRODUCT_LIST.get(id);
	}
	
	public void updateAvailable(long id, int available) {
		Product product = PRODUCT_LIST.get(id);
		product.setAvailable(available);
	}
	
	public void increaseAvailableByOne(long id) {
		Product product = PRODUCT_LIST.get(id);
		product.setAvailable(product.getAvailable() + 1);
	}

	public void decreaseAvailableByOne(long id) {
		Product product = PRODUCT_LIST.get(id);
		product.setAvailable(product.getAvailable() - 1);
	}
	
	public void removeProductById(long id)
	{
		PRODUCT_LIST.remove(id);
	}
}
