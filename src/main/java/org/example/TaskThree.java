package org.example;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heightShape;
        double widthShape;

        do {
            System.out.println("What is the height of the rectangle?");
            if (scanner.hasNextDouble()) {
                heightShape = scanner.nextDouble();
                break;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Invalid Input");
            }
        } while (true);

        do {
            System.out.println("What is the width of the rectangle?");
            if (scanner.hasNextDouble()) {
                widthShape = scanner.nextDouble();
                break;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Invalid Input");
            }
        } while (true);

        double areaShape = widthShape * heightShape;
        System.out.println("The area of the rectangle is " + areaShape);

        double perimeterShape = (widthShape * heightShape) * 2;
        System.out.println("The perimeter of the rectangle is " + perimeterShape);

        double diagonalShape = Math.sqrt(Math.pow(widthShape, 2) + Math.pow(heightShape, 2));
        System.out.println("The length of the diagonal in the rectangle is " + diagonalShape);
    }
}