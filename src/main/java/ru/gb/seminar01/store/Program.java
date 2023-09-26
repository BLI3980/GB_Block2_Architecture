package ru.gb.seminar01.store;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Store store = new Store();
        Product product1 = new Product("AA1", 100);
        Product product2 = new Product("AA2", 200);

        Customer customer1 = new Customer("Customer1");

        OrderItem orderItem1 = new OrderItem(product1, 2);
        OrderItem orderItem2 = new OrderItem(product2, 3);
        List<OrderItem> items = new ArrayList<>();
        items.add(orderItem1);
        items.add(orderItem2);

        Order order1 = new Order(LocalDateTime.now(),"Address1", "Phone1", customer1, items);

        store.addOrder(order1);


    }
}
