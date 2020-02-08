import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class PairFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read in the value of k
        int k = Integer.parseInt(sc.nextLine());
        // Read in the list of numbers
        int[] numbers;
        String input = sc.nextLine();
        if (input.equals("")) {
            numbers = new int[0];
        } else {
            String[] numberStrings = input.split(" ");
            numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
        }
        System.out.println(findPairs(numbers, k));
    }
    private static int findPairs(int[] numbers, int k) {
        // Initialize an empty set of numbers already seen
        Set < Integer > numbersSeen = new HashSet < > ();
        // Track the count of pairs found
        int pairsFound = 0;
        // for each number, see if its difference from k is
        // in the set; add one to pairsFound if so.
        // Then, add the number to the set.
        for (int i = 0; i < numbers.length; i++) {
            if (numbersSeen.contains(k - numbers[i])) {
                pairsFound++;
            }
            numbersSeen.add(numbers[i]);
        }
        return pairsFound;
    }
}