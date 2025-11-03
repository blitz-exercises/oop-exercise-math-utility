package nl.blitz.oop.math;

/**
 * Demo program for Calculator method overloading.
 *
 * TODO:
 * - Create a Calculator instance.
 * - Call add(int, int), add(double, double), and add(int...) with sample values.
 * - Print each result to verify the correct overload is selected.
 * - Optionally, demonstrate that calling add() with no varargs should fail (commented-out example).
 */
public class Demo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.1, 2.2));
        System.out.println(calculator.add(1,2,3,4,5,6,7,8,9,10));
    }
}

