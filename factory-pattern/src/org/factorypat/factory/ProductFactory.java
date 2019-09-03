package org.factorypat.factory;

import org.factorypat.model.Monitor;
import org.factorypat.model.Pc;
import org.factorypat.model.Product;

public class ProductFactory {

	public Product createProduct(String productType){
		Product product = null;
		if (productType.equals("PC")){
			product = new Pc();
		}
		if (productType.equals("monitor")){
			product = new Monitor();
		}
		return product;
	}

}
