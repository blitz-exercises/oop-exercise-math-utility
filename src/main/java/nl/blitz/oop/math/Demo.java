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
        // throw new UnsupportedOperationException("TODO: implement demo to exercise all add
        // overloads");
        Calculator calculator = new Calculator();

        result_add_int_int = calculator.add(5, 5);
        assert result1 = 10 : "The calculator is broken";
        System.out.println(result1);

        result_add_double_double = calculator.add(1.2, 1.2);
        assert result2 = 2.4 : "The calculator is broken";
        System.out.println(result2);

        result_add_multi = calculator.add(1, 2, 3, 4, 6, 10)
        assert result = 26 : "The calculator is broken";
        System.out.println(result3);


    }
}

