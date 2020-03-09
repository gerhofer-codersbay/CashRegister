package com.codersbay;

import java.util.Date;
import java.util.List;

public class Invoice {

    public static Integer BON_NR = 0;

    public Date date;
    public Integer cashierNumber;
    public Double totalAmount;
    public Double receivedAmount;
    public List<Product> products;

    public Invoice(Date date,
                   Integer cashierNumber,
                   List<Product> products) {
        this.date = date;
        this.cashierNumber = cashierNumber;
        this.products = products;
        // magic sum calculation
        this.totalAmount = products.stream()
                .map(it -> it.price)
                .reduce(0d, (a, b) -> a + b);
        BON_NR++;
    }

    public void print() {
        System.out.printf("Invoice # %d\n", BON_NR);
        for (Product product : products) {
            System.out.println(product.toString());
        }
        System.out.printf("Total Amount: %.2f\n", this.totalAmount);
    }

}
