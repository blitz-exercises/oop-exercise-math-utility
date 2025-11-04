package nl.blitz.oop.math;

/**
 * Calculator demonstrates method overloading: - add(int a, int b): returns int sum - add(double a,
 * double b): returns double sum - add(int... nums): returns int sum of all provided numbers (must
 * provide at least one argument)
 *
 * STUDENT TASKS: - Implement each method body. - For add(int... nums), validate that at least one
 * number is given; if not, throw IllegalArgumentException. - Do not introduce public mutable state.
 */
public class Calculator {

    /**
     * TODO: Return the sum of two ints.
     */
    public int add(int a, int b) {
       return a + b;
    }

    /**
     * TODO: Return the sum of two doubles.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * TODO: Return the sum of an arbitrary number of ints. - Validate that at least one argument is
     * provided; if none, throw IllegalArgumentException.
     */
    public int add(int... nums) {
        if(nums.length == 0){
            throw new IllegalArgumentException("At least one number is required.");
        }

        int sum = 0;
        for (int n: nums){
            sum += n;
        }
        return sum;
    }
}

