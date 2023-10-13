package ru.gb.seminar01.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<ru.gb.seminar01.store.Order> orders = new ArrayList<>();

    public boolean addOrder(Order order) {
        orders.add(order);
        return true;
    }

    public boolean cancelOrder(int id) {
        //TODO: create order cancellation method
        return true;
    }
    public boolean paymentOrder(int id) {
        //TODO: create order payment method
        return true;
    }
}
