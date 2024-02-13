package org.calculator;
/**
 * The Calculator class represents a simple class for performing
 * arithmetic operations and managing two values.
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
        for (int i = 0; i < 2; i++){
            if (a < b){
                a = a + i;
            }
        }
        return a + b;
    }
    /**
     * Subtracts the second integer from the first.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of the subtraction.
     */
    public int sub(int a, int b) {
        return a - b;
    }
    /**
     * Multiplies the variables a and b.
     *
     * @param a The first value.
     * @param b The second value.
     * @return The result of the multiplication.
     */
    public float pro(float a , float b) {
        return a * b ;
    }
    public float div(float a, float b) {
        return a / b ;
    }
    public float sqrt(float a) {
        return (float) Math.sqrt(a);
    }
}
