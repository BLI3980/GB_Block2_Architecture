package ru.gb.seminar04.task02after;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        DealerProvider dealerProvider = new DealerProvider(factoryProvider);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter part number: #");
            int PN = Integer.parseInt(scanner.nextLine());
            // This part of the program may be considered as another component of the program.
            // In real life different components may be developed by different teams (factory team, deal team,
            // UI team for dealer interface.
            // And even though below validation is a validation of outbound data and is against DbC programming
            // such approach of basic data validation does save unnecessary usage of resources such as network for
            // instance.
            if (PN < 0) {
                System.out.println("Part number must be greater than 0." +
                        "Enter correct part number.");
                continue;
            }
            try {
                ComponentInfo componentInfo = dealerProvider.getComponent(PN);
                System.out.println(componentInfo);
                break;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
