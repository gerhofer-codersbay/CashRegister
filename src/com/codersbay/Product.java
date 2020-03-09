package com.codersbay;

public class Product {

    public Long ean;
    public String name;
    public Double price;

    public Product(Long ean, String name, Double price) {
        this.ean = ean;
        this.name = name;
        this.price = price;
    }

    public Product(Long ean, String name) {
        this.ean = ean;
        this.name = name;
        this.price = 0.0;
    }

    @Override
    public String toString() {
        return String.format("%s [%.2f €] - %d",
                name, price, ean);
    }
}
