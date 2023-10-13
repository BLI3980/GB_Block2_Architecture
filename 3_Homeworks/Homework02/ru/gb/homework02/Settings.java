package ru.gb.homework02;

import java.io.Serializable;

public class Settings implements Serializable {
    private static Settings instance;
    public Integer port;
    public String ip;
    public String username;

    private Settings() {
    }

    /**
     * Method resolves the issue of getting an object with different hascode after deserialization.
     * The method does not even have to be called, it only needs to be created in the class...
     * ... Wierd.
     */
    protected Object readResolve() {
        return instance;
    }

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    public String getInfo() {
        return String.format("[Host:%s:%d, username:%s]", ip, port , username);
    }
}
