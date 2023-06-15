package org.example;
import java.util.Scanner;


public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonSpace;
        double fuelEfficiency;
        double gasPrice;

        do {
            System.out.println("How many gallons can the car hold?");
            if (scanner.hasNextDouble()) {
                gallonSpace = scanner.nextDouble();
                break;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Invalid Input");
            }
        } while (true);

        do {
            System.out.println("What is the fuel effiency of the car in mpg?");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                break;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Invalid Input");
            }
        } while (true);

        do {
            System.out.println("What is the price of gas per gallon?");
            if (scanner.hasNextDouble()) {
                gasPrice = scanner.nextDouble();
                break;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Invalid Input");
            }
        } while (true);

        double costHundrend = (100 / fuelEfficiency) * gasPrice;
        System.out.println("The cost per 100 miles is " + costHundrend);

        double distanceTraveled = (gallonSpace * fuelEfficiency);
        System.out.println("The car is able to travel " + distanceTraveled + " miles");
    }
}

