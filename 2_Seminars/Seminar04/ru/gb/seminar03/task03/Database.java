package ru.gb.seminar03.task03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Database
 */
public class Database {
    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Database() {
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    /**
     * Get actual ticket price
     * @return - ticket price
     */
    public double getTicketPrice() {
        return 45;
    }

    /**
     * Get an ID of ticket order
     * @param clientId - client ID
     * @return - ticket order ID
     */
    public int createTicketOrder(int clientId) {
        return ++counter;
    }
}
