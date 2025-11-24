package org.example.models;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Standart", "Normal", 3.56, "Lavaş");
        hamburger.addHamburgerAddition1("Domates", 0.27);
        hamburger.addHamburgerAddition2("Marul", 0.75);
        hamburger.addHamburgerAddition3("Peynir", 1.13);
        System.out.println("Toplam fiyat: " + hamburger.itemizeHamburger() + "₺\n");

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandviç");
        healthyBurger.addHamburgerAddition1("Salata", 5.43);
        healthyBurger.addHealthyAddition1("Fasulye", 3.41);
        System.out.println("Toplam fiyat: " + healthyBurger.itemizeHamburger() + "₺\n");

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Bunu yapmamalı", 50.53);
        System.out.println("Toplam fiyat: " + db.itemizeHamburger() + "₺");
    }
}