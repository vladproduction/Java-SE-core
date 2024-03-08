package com.vladproduction.vp34_wildcards_generics.factory_mechanism;

/**
 * Created by vladproduction on 07-Mar-24
 */

public class ProductFactory {

    public static <T> Product<T> createProduct(String productCode){

        if("BOOK".equals(productCode)){
            return new Book("The Lord of the Rings");
        } else if ("ELECTRONIC".equals(productCode)) {
            return (Product<T>) new Electronic(12345);
        }else {
            throw new IllegalArgumentException("Invalid product code: " + productCode);
        }
    }

}
