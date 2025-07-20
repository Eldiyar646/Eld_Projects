package com.eld_project.lessons._01_OOP._07_Product;

import java.util.List;

public class Product {
    private String name;
    private int price;
    private int amount;

    public Product(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product addProduct(int quantity) {
        if (quantity > 0) {
            amount += quantity;
            System.out.println(name + " добавлено " + quantity);
        } else {
            System.out.println("Количество должно быть положительным.");
        }
        return this;
    }

    public Product removeProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println("Количество должно быть положительным.");
        } else if (quantity <= amount) {
            amount -= quantity;
            System.out.println(name + ", удалено " + quantity + ". Осталось: " + amount + " штук.");
        } else {
            System.out.println("Превышение количества товара.");
        }
        return this;
    }

    public void printInfo() {
        System.out.println(name + ", цена: " + price + ", Количество: " + amount);
    }

    public static void result(List<Product> products) {
        int index = 1;
        for (Product p : products) {
            System.out.print(index + ". ");
            p.printInfo();
            index++;
        }
    }
}
