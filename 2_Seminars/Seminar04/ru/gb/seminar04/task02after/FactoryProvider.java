package ru.gb.seminar04.task02after;

import java.util.ArrayList;

/**
 * Car parts manufacturer
 */
public class FactoryProvider {
    private ArrayList<ComponentInfo> components = new ArrayList<>();

    // Initialization block. The following data will be filled into each instance of FactoryProvider:
    {
        for (int i = 0; i < 10; i++) {
            components.add(new ComponentInfo(
                    900000 + i, String.format("component description %d", 900000 + i)));
        }

        for (int i = 0; i < 5; i++) {
            components.add(new ComponentInfo(
                    1000 + i, String.format("component description %d", 1000 + i)));
        }
    }

    /**
     * Get part description information by searching part id.
     * @param id - part id
     * @return - part information
     * @throws RuntimeException - part info search exception
     */
    public ComponentInfo getComponentInfo(int id) throws RuntimeException{

        // PRE-CONDITION
        if (id < 0) throw new RuntimeException("Incorrect part number");

        if (String.valueOf(id).length() < 6) throw new RuntimeException("Obsolete part number. " +
                "Part is not manufactured anymore.");

        // MAIN LOGICS PROCESSING
        ComponentInfo searchComponent = null;
        for (ComponentInfo component : components) {
            if (component.getId()== id) {
                searchComponent = component;
                break;
            }
        }

        // POST-CONDITION
//        if (searchComponent == null) {
//            throw new RuntimeException("Part has not been found");
//        }
        return searchComponent;
    }
}
