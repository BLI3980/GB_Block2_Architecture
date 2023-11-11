package ru.gb.seminar03.task03;

import java.util.Date;

/**
 * Ticket
 */
public class Ticket {
    private int id;
    private int customerId;
    private Date date;
    private String qrCode;
    private boolean isValid = true;

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrCode() {
        return qrCode;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
