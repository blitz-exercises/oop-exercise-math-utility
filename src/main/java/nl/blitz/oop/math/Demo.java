package nl.blitz.oop.math;

/**
 * Demo program for Calculator method overloading.
 *
 * TODO: - Create a Calculator instance. - Call add(int, int), add(double, double), and add(int...)
 * with sample values. - Print each result to verify the correct overload is selected. - Optionally,
 * demonstrate that calling add() with no varargs should fail (commented-out example).
 */
public class Demo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInts = calculator.add(3,6);
        System.out.println("The sum of integers is: " + sumInts);

        double sumDoubles = calculator.add(4.5, 2.25);
        System.out.println("The sum of doubles is: " + sumDoubles);
        
        int sumVarargs = calculator.add(2, 5, 3, 6);
        System.out.println("The sum of varargs is: " + sumVarargs);

        int sumVarargsUncorrect = calculator.add();
        System.out.println("The sum of varargs is: " + sumVarargsUncorrect);
    }
}

