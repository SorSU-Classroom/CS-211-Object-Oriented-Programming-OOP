package com.oop.Exercise;

//QuadraticFormula.java
import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] roots = calculateRoots(a, b, c);
        System.out.println("x = " + "-" + b + " + " + "sqrt(" + b + "^2 - 4 * " + a + " * " + c + ") / 2 * " + a);

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (discriminant == 0) {
            System.out.println("Root 1: " + roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0] + " + " + roots[1] + "i");
            System.out.println("Root 2: " + roots[0] + " - " + roots[1] + "i");
        }

        scanner.close();
    }

    public static double[] calculateRoots(double a, double b, double c) {
        // Declare variables for the roots
        double root1 = 0, root2 = 0;

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Calculate the roots
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            root2 = root1;
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different.");
            return new double[] { realPart, imaginaryPart };
        }

        return new double[] { root1, root2 };
    }
}