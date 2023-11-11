package ru.gb.seminar03.task03;

public class CustomerProvider {
    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password) {
        return new Customer();
    }
}
