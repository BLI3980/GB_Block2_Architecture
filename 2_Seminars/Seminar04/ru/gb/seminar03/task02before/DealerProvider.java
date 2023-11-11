package ru.gb.seminar03.task02before;

/**
 * Car parts dealer
 */
public class DealerProvider {
    private final FactoryProvider factoryProvider;

    public DealerProvider(FactoryProvider factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    public ComponentInfo getComponent(int id) {
        if (id < 0 || String.valueOf(id).length() < 6) {
            throw new RuntimeException("Incorrect part number");
        }
        return factoryProvider.getComponentInfo(id);
    }
}
