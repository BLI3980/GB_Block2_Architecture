package ru.gb.seminar04.task03;

import java.util.Collection;

/**
 * Customer
 */
public class Customer {
    private static int counter;
    private final int id;

    private Collection<Ticket> tickets;

    {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }
}
