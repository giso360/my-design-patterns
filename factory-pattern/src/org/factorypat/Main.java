package org.factorypat;

import org.factorypat.factory.ProductFactory;
import org.factorypat.model.Product;

public class Main {

    public static void main(String[] args) {

        ProductFactory factory = new ProductFactory();

        Product pc = factory.createProduct("PC");
        System.out.println(pc.purchase());

        System.out.println("==============================================");
        System.out.println("==============================================");

        Product monitor = factory.createProduct("monitor");
        System.out.println(monitor.purchase());

    }

}
