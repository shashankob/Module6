package org.example;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempCelsius;
        double tempFarenheit;

        while (true) {
            System.out.println("Enter the temperature in celsius: ");
            if (scanner.hasNextDouble()) {
                tempCelsius = scanner.nextDouble();
                break;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Invalid Input!");
            }
        }
        double tempFahrenheit = tempCelsius * 9 / 5 + 32;
        System.out.println("The temperature in Fahrenheit is " + tempFahrenheit);
    }
}