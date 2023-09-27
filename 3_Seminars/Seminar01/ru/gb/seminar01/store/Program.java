package ru.gb.seminar01.store;

import ru.gb.X.store.Customer;
import ru.gb.X.store.Order;
import ru.gb.X.store.OrderItem;
import ru.gb.X.store.Product;
import ru.gb.X.store.Store;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ru.gb.X.store.Store store = new Store();
        ru.gb.X.store.Product product1 = new ru.gb.X.store.Product("AA1", 100);
        ru.gb.X.store.Product product2 = new Product("AA2", 200);

        ru.gb.X.store.Customer customer1 = new Customer("Customer1");

        ru.gb.X.store.OrderItem orderItem1 = new ru.gb.X.store.OrderItem(product1, 2);
        ru.gb.X.store.OrderItem orderItem2 = new ru.gb.X.store.OrderItem(product2, 3);
        List<OrderItem> items = new ArrayList<>();
        items.add(orderItem1);
        items.add(orderItem2);

        ru.gb.X.store.Order order1 = new Order(LocalDateTime.now(),"Address1", "Phone1", customer1, items);

        store.addOrder(order1);


    }
}
