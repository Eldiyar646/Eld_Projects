package com.eld_project.lessons._01_OOP._07_Product;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    public static void main(String[] args) {
        Product laptop = new Product("Ноутбук", 25000, 20);
        Product notebook = new Product("Блокнот", 1200, 50);
        Product tablet = new Product("Планшет", 18000, 25);
        Product book = new Product("Книга", 1000, 45);
        Product phone = new Product("Телефон", 105000, 5);
        Product skate = new Product("Скейт", 900, 13);
        Product ball = new Product("Мяч", 1225, 6);
        Product guitar = new Product("Гитара", 5800, 2);
        Product mp3_player = new Product("Плеер", 2700, 15);
        Product smart_tv = new Product("Телевизор", 35000, 9);

        List<Product> products = new ArrayList<>(List.of(laptop, notebook, tablet, book,
                phone, skate, ball, guitar, mp3_player, smart_tv));

        Product.result(products);
        System.out.println("----------------------");
        laptop.addProduct(10);
        Product.result(products);
        System.out.println("----------------------");
        laptop.removeProduct(30);
        book.removeProduct(30);
        Product.result(products);
        products.removeIf(product -> product.getAmount() == 0);
        Product.result(products);
        laptop.addProduct(100);
        products.add(laptop);
        Product.result(products);
        laptop.removeProduct(30);
        Product.result(products);




    }
}
