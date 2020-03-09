package com.codersbay;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------");
        CashRegister cashRegister = new CashRegister();

        cashRegister.addProduct("123456");
        cashRegister.addProduct("1234567");
        cashRegister.addProduct("123456");

        Invoice invoice = cashRegister.generateInvoice();
        invoice.print();

        System.out.println("---------------");

        Invoice invoice2 = cashRegister.generateInvoice();
        invoice2.print();

        System.out.println("---------------");

    }

}
