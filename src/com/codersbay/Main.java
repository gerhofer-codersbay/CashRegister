package com.codersbay;

public class Main {

    public static void main(String[] args) {


        Product billigApfel = new Product(1L, "Apfel", 0.49);
        Product teuerApfel = new Product(1L, "Apfel", 0.50);

        System.out.println(billigApfel == teuerApfel);
        System.out.println(billigApfel.equals(teuerApfel));

        System.out.println(billigApfel == billigApfel);
        System.out.println(teuerApfel == teuerApfel);

        teuerApfel.price = 0.49;


        System.out.println(billigApfel == teuerApfel);
        System.out.println(billigApfel.equals(teuerApfel));



        System.out.println("---------------");
        CashRegister kasse = new CashRegister();
        kasse.addProduct("123456");
        kasse.addProduct("1234567");
        kasse.addProduct("123456");
        Invoice rechnung = kasse.generateInvoice();
        rechnung.print();

        Double retourGeld = rechnung.balance(100.0);
        System.out.println(retourGeld);

        System.out.println("---------------");
        kasse.addProduct("stickerCode");
        kasse.addProduct("stickerCode");
        kasse.removeProduct("stickerCode");
        Invoice rechnung2 = kasse.generateInvoice();

        rechnung2.print();


        System.out.println("---------------");

    }

}
