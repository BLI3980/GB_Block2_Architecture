package ru.gb.seminar01.store;

public class OrderItem {

    private static int counter = 5000;
    private int id;
    private ru.gb.seminar01.store.Product product;
    private int quantity;

    // Initialization section
    {
        id = ++counter;
    }

    public OrderItem(ru.gb.seminar01.store.Product product) {
        this.product = product;
        quantity = 1;
    }

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

}
