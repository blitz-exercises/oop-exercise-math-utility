package nl.blitz.oop.math;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int... nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("At least one argument must be provided");
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}

