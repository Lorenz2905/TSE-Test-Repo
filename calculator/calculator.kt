package org.calculator;
/**
 * The Calculator class represents a simple class for performing
 * arithmetic operations and managing two integers.
 */
public class Calculator {
    /**
     * Constructor for the Calculator class.
     */
    public Calculator() {
    }

    /**
     * Adds two integers together.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public int add(int a, int b) {
        a = 0;
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of the subtraction.
     */
    private static int sub(int a, int b) {
        a = 0;
        return a - b;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of the subtraction.
     */
    private static int sub(int a, int b) {
        a = 3;
        return a - b;
    }

    public static void beispielMethode() {
        // while-Schleife
        int counter = 0;
        while (counter < 5) {
            if (counter == 2) {
                counter = 3;
            }
            System.out.println("While-Schleife: " + counter);
            counter++;
        }

        // for-Schleife
        for (int i = 0; i < 5; i++) {
            System.out.println("For-Schleife: " + i);
        }

        // switch-case
        int zahl = 2;
        switch (zahl) {
            case 1:
            System.out.println("Zahl ist 1");
            break;
            case 2:
            System.out.println("Zahl ist 2");
            break;
            case 3:
            System.out.println("Zahl ist 3");
            break;
            default:
            System.out.println("Zahl ist nicht 1, 2 oder 3");
        }

        // try-catch
        try {
            int result = divide(10, 0);
            System.out.println("Ergebnis der Division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
        }
    }