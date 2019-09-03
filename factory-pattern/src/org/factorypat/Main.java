package org.factorypat;

import org.factorypat.factory.ProductFactory;
import org.factorypat.model.Product;

public class Main {

    public static void main(String[] args) {

        /**
         *
         * This module involves building different products using the factory design pattern.
         * A PC product and/or Monitor component
         * -------------------------------------------------------------------------------------------------------------
         * STEP #1: Create model classes with fields that match the description of products & subproducts
         * include getters/setters/toString() and a common method for both that will be implemented differently
         * STEP #2: Create an interface containing the signature of this common method (here is purchase()).
         * STEP #3: Create a product factory class that is able of discerning whether to produce type A or B objects
         * by calling their constructors and loading the results to the interface type (i.e. within the factory class,
         * the interface is used as a type for both PC and Monitor POJO classes)
         * STEP #4: Invoke the Business Logic from the client (Main.java) by using the product factory object
         * -------------------------------------------------------------------------------------------------------------
         *
         *  */


        ProductFactory factory = new ProductFactory();

        Product pc = factory.createProduct("PC");
        System.out.println(pc.purchase());

        System.out.println("==============================================");
        System.out.println("==============================================");

        Product monitor = factory.createProduct("monitor");
        System.out.println(monitor.purchase());

    }

}
