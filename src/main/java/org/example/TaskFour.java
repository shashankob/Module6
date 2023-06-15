package org.example;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double meterLength;

       do {
           System.out.println("What is the measurement in meters?");
           if (scanner.hasNextDouble()) {
               meterLength = scanner.nextDouble();
               break;
           } else {
               String invalidInput = scanner.next();
               System.out.println("Invalid Input");
           }
       } while (true);

       double milesConvert = meterLength * (0.00621);
       System.out.println(meterLength + " meters converted into miles is " + milesConvert);

       double feetConvert = meterLength * (3.281);
       System.out.println(meterLength + " meters converted into feet is " + feetConvert);

       double inchesConvert = meterLength * (39.3801);
       System.out.println(meterLength + " meters converted into inches is " + inchesConvert);
    }
}