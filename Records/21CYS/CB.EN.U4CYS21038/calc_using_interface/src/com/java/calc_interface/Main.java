package com.java.calc_interface;

import java.util.Scanner;
interface Calculator {
    double calculate(double n1, double n2);
}
class Addition implements Calculator {
    public double calculate(double n1, double n2) {
        return n1 + n2;
    }
}

class Subtraction implements Calculator {
    public double calculate(double n1, double n2) {
        return n1 - n2;
    }
}

class Multiplication implements Calculator {
    public double calculate(double n1, double n2) {
        return n1 * n2;
    }
}

class Division implements Calculator {
    public double calculate(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Cannot divide by zero");
        }
        return 0;
    }
}

// com.java.calc_interface.Main class to test the calculator
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. com.java.calc_interface.Addition");
        System.out.println("2. com.java.calc_interface.Subtraction");
        System.out.println("3. com.java.calc_interface.Multiplication");
        System.out.println("4. com.java.calc_interface.Division");
        System.out.print("Enter your choice : ");
        choice = scanner.nextInt();
        Calculator calculator;
        switch (choice) {
            case 1:
                calculator = new Addition();
                break;
            case 2:
                calculator = new Subtraction();
                break;
            case 3:
                calculator = new Multiplication();
                break;
            case 4:
                calculator = new Division();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        double result = calculator.calculate(num1, num2);
        System.out.println("Result: " + result);
    }
}
