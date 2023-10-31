package ru.gb.seminar03.lsp.exampleAfter;

public class Ostrich extends Bird {

    public Ostrich() {
        super(false);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly.");
    }

    public void run() {
        System.out.println("Ostrich runs.");
    }
}
