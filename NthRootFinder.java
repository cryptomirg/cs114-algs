import java.lang.UnsupportedOperationException;
import java.util.Scanner;
public class NthRootFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read n (for taking the nth root)
        int n = Integer.parseInt(sc.nextLine());
        // Read number to take the nth root of
        int number = Integer.parseInt(sc.nextLine());
        // Read the desired precision
        int precision = Integer.parseInt(sc.nextLine());
        // Print the answer
        System.out.println(findNthRoot(number, n, precision));
    }
    private static String findNthRoot(int number, int n, int precision) {
        // Initialize bounds
        double lowerBound = 0.0;
        double upperBound = (double) number;
        // compute epsilon, which represents 10^-(2 * precision)
        double epsilon = 1.0;
        for (int i = 0; i < 2 * precision; i++) {
            epsilon *= 0.1;
        }
        // Iteratively guess the midpoint and check it
        while (true) {
            double guess = (lowerBound + upperBound) / 2.0;
            // compute guess^n
            double guessToTheN = 1.0;
            for (int i = 0; i < n; i++) {
                guessToTheN *= guess;
            }
            // If guess^n is within 2*precision decimal places of number, stop.
            // (We use epsilon from above to do this).
            // Otherwise, update bounds accordingly.
            if((guessToTheN - number) < epsilon &&
                (guessToTheN - number) > (-1.0 * epsilon)) {
                return String.format("%." + precision + "f", guess);
            } else if (guessToTheN < number) {
                lowerBound = guess;
            } else if (guessToTheN > number) {
                upperBound = guess;
            } else {
                // should never get here
                throw new UnsupportedOperationException();
            }
        }
    }
}