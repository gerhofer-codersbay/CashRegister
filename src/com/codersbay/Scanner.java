package com.codersbay;

public class Scanner {

    public Product readCode(String barCode) {
        switch (barCode) {
            case "123456":
                return new Product(123456L, "Rasiergel", 5.20);
            case "1234567":
                return new Product(1234567L, "Zwüfirostbrotn (vegan)", 17.40);
            default:
                return new Product(123L, "Sticker");
        }

    }

}
