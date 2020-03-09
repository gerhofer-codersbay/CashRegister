package com.codersbay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Invoice {

    public static Integer BON_COUNTER = 0;

    public Date date;
    public Integer cashierNumber;
    public Double totalAmount;
    public Integer receiptNr;
    public Double receivedAmount;
    public List<Product> products;

    public Invoice(Date date,
                   Integer cashierNumber,
                   List<Product> products) {
        this.date = date;
        this.cashierNumber = cashierNumber;
        this.products = new ArrayList<>(products);
        // magic sum calculation
        this.totalAmount = products.stream()
                .map(it -> it.price)
                .reduce(0d, (a, b) -> a + b);
        BON_COUNTER++;
        this.receiptNr = BON_COUNTER;
    }

    public void print() {
        System.out.printf("Invoice # %d\n", this.receiptNr);
        for (Product product : products) {
            System.out.println(product.toString());
        }
        System.out.printf("Total Amount: %.2f\n", this.totalAmount);
    }

    public Double balance(Double receivedAmount) {
        return receivedAmount - this.totalAmount;
    }

}
