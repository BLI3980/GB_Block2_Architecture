package ru.gb.seminar04.task03;

import java.util.Collection;
import java.util.Date;

/**
 * Develop contracts and components of a system "Online purchase of bus tickets during rush hour".
 * 1. Pre-conditions.
 * 2. Post-conditions.
 * 3. Invariants.
 * 4. Define abstract and concrete classes.
 * 5. Define interfaces.
 * 6. Implement inheritance.
 * 7. Identify components.
 * 8. Develop Component Diagram using UML2.0 notation. Generic, without details.
 */
public class Main {
    public static void main(String[] args) {
        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());

        if (mobileApp.buyTicket("111222333444555")) {
            System.out.println("Client successfully purchased the ticket.");
            mobileApp.searchTicket(new Date());
            Collection<Ticket> tickets = mobileApp.getTickets();
            if (busStation.checkTicket(tickets.stream().findFirst().get().getQrCode())) {
                System.out.println("Client successfully entered the bus.");
            }
        }
    }
}
