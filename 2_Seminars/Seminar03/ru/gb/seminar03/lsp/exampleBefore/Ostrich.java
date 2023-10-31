package ru.gb.seminar03.lsp.exampleBefore;

public class Ostrich extends Bird{
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly.");
    }

    public void run() {
        System.out.println("Ostrich runs.");
    }
}
