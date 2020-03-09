package com.codersbay;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CashRegister {

    public List<Product> currentlyScannedProducts;
    public Scanner scanner;

    public CashRegister() {
        this.scanner = new Scanner();
        this.currentlyScannedProducts = new ArrayList<>();
    }

    public void addProduct(String barCode) {
        Product product = scanner.readCode(barCode);
        currentlyScannedProducts.add(product);
    }

    public void removeProduct(String barCode) {
        // TODO
    }

    public Invoice generateInvoice() {
        Invoice invoice = new Invoice(
                new Date(),
                7,
                currentlyScannedProducts
        );
        return invoice;
    }

}
