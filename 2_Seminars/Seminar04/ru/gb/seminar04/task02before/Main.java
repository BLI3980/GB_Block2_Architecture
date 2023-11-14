package ru.gb.seminar04.task02before;

public class Main {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        DealerProvider dealerProvider = new DealerProvider(factoryProvider);

        ComponentInfo componentInfo = dealerProvider.getComponent(900003);
        if (componentInfo != null) {
            System.out.println(componentInfo);
        }
    }
}
