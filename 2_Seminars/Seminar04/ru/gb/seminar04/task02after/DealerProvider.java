package ru.gb.seminar04.task02after;

/**
 * Car parts dealer
 */
public class DealerProvider {
    private final FactoryProvider factoryProvider;

    public DealerProvider(FactoryProvider factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    /**
     * Method for searching part information is part number
     * @param id - part number
     * @return - part information
     */
    public ComponentInfo getComponent(int id) {

        // PRE-CONDITION
        // In Design by Contract programming outbound parameters, going to another component,
        // should not be validated. But inbound data, from returning from another component, should be validated.
//        if (id < 0 || String.valueOf(id).length() < 6) {
//            throw new RuntimeException("Incorrect part number");
//        }

        // MAIN LOGICS PROCESSING
        ComponentInfo componentInfo = factoryProvider.getComponentInfo(id);


        // POST-CONDITION
        if (componentInfo == null) {
            throw new RuntimeException("Part has not been found");
        }


        return componentInfo;
    }
}
