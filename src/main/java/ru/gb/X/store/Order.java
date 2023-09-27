package ru.gb.X.store;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int counter = 10000;
    private int id;
    private LocalDateTime orderDate;
    private String address;
    private String phone;
    private ru.gb.X.store.Customer customer;
    private List<ru.gb.X.store.OrderItem> items = new ArrayList<>();

    {
        id = ++counter;
    }

    public Order(LocalDateTime orderDate, String address, String phone, Customer customer, List<OrderItem> items) {

        if (customer == null) {
            throw new RuntimeException("Customer must be existent.");
        }

        if (items == null || items.size() == 0) {
            throw new RuntimeException("Order must contain minimum one position.");
        }
        this.orderDate = orderDate;
        this.address = address;
        this.phone = phone;
        this.customer = customer;
        this.items = items;
    }
}
