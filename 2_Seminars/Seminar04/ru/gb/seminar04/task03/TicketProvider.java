package ru.gb.seminar04.task03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TicketProvider {
    private final Database database;
    private final PaymentProvider paymentProvider;

    public TicketProvider(Database database, PaymentProvider paymentProvider) {
        this.database = database;
        this.paymentProvider = paymentProvider;
    }

    public Collection<Ticket> searchTicket(int clientId, Date date) {
        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : database.getTickets()) {
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date)) {
                tickets.add(ticket);
            }
        }
        return tickets;
    }

    public boolean buyTicket(int clientId, String cardNo) {
        int orderId = database.createTicketOrder(clientId);
        double price= database.getTicketPrice();
        return paymentProvider.buyTicket(orderId, cardNo, price);
    }

    public boolean checkTicket(String qrcode) {
        for (Ticket ticket : database.getTickets()) {
            if (ticket.getQrCode().equals(qrcode)) {
                ticket.setValid(false);
                // Update database...
                return true;
            }
        }
        return false;
    }
}