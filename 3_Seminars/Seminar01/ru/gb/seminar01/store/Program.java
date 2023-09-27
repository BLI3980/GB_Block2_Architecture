package ru.gb.seminar01.store;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ru.gb.seminar01.store.Store store = new Store();
        ru.gb.seminar01.store.Product product1 = new ru.gb.seminar01.store.Product("AA1", 100);
        ru.gb.seminar01.store.Product product2 = new Product("AA2", 200);

        ru.gb.seminar01.store.Customer customer1 = new Customer("Customer1");

        ru.gb.seminar01.store.OrderItem orderItem1 = new ru.gb.seminar01.store.OrderItem(product1, 2);
        ru.gb.seminar01.store.OrderItem orderItem2 = new ru.gb.seminar01.store.OrderItem(product2, 3);
        List<OrderItem> items = new ArrayList<>();
        items.add(orderItem1);
        items.add(orderItem2);

        ru.gb.seminar01.store.Order order1 = new Order(LocalDateTime.now(),"Address1", "Phone1", customer1, items);

        store.addOrder(order1);


    }
}
