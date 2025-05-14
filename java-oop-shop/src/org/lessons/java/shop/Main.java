package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Prodotto tShirt = new Prodotto("T-shirt", "T-shirt bianca", 9.99, 22.00);
        
        System.out.println("codice: " + tShirt.codice);
        System.out.println(tShirt.getPrezzoBase());
        System.out.println(tShirt.getPrezzoConIva());
        System.out.println(tShirt.getNomeEsteso());
    }
}