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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (ean != null ? !ean.equals(product.ean) : product.ean != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        return price != null ? price.equals(product.price) : product.price == null;
    }

    @Override
    public int hashCode() {
        int result = ean != null ? ean.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
