package ru.gb.seminar03.lsp.exampleAfter;

public class Bird {

    private boolean canFly = true;

    public Bird(boolean canFly) {
        this.canFly = canFly;
    }

    public Bird() {
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void fly() {
        System.out.println("Bird flies.");
    }
}
