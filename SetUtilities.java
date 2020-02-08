import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class SetUtilities {
    // constants for parsing input
    public static final int INTERSECTION_OPERATION = 0;
    public static final int UNION_OPERATION = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // parse operation
        int operation = Integer.parseInt(sc.nextLine());
        // variables for processing input
        String[] numberStrings;
        Integer[] numbers;
        String input;
        // parse first set
        Set < Integer > set1;
        input = sc.nextLine();
        if (input.equals("")) {
            set1 = new HashSet < Integer > ();
        } else {
            numberStrings = input.split(" ");
            numbers = new Integer[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
            set1 = new HashSet < Integer > (Arrays.asList(numbers));
        }
        // parse second set
        Set < Integer > set2;
        input = sc.nextLine();
        if (input.equals("")) {
            set2 = new HashSet < Integer > ();
        } else {
            numberStrings = input.split(" ");
            numbers = new Integer[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
            set2 = new HashSet < Integer > (Arrays.asList(numbers));
        }
        // find the result set
        Set < Integer > result;
        if (operation == INTERSECTION_OPERATION) {
            result = findIntersection(set1, set2);
        } else if (operation == UNION_OPERATION) {
            result = findUnion(set1, set2);
        } else {
            throw new UnsupportedOperationException();
        }
        // convert the result set to a sorted array and print it
        Integer[] resultInts = result.toArray(new Integer[result.size()]);
        Arrays.sort(resultInts);
        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < resultInts.length; i++) {
            resultSb.append(resultInts[i].toString());
            if (i < resultInts.length - 1) {
                resultSb.append(" ");
            }
        }
        System.out.println(resultSb.toString());
    }
    private static Set < Integer > findIntersection(Set < Integer > set1,
        Set < Integer > set2) {
        // Convert set 1 to an array so we can iterate through it
        Integer[] set1Array = set1.toArray(new Integer[set1.size()]);
        // Initialize a result set
        Set < Integer > result = new HashSet < > ();
        // Add items to the result set if they are also in set 2
        for (int i = 0; i < set1Array.length; i++) {
            if (set2.contains(set1Array[i])) {
                result.add(set1Array[i]);
            }
        }
        return result;
    }
    private static Set < Integer > findUnion(Set < Integer > set1,
        Set < Integer > set2) {
        // Initialize a result set
        Set < Integer > result = new HashSet < > ();
        // Convert set 1 to an array and add its items to the result set
        Integer[] set1Array = set1.toArray(new Integer[set1.size()]);
        for (int i = 0; i < set1Array.length; i++) {
            result.add(set1Array[i]);
        }
        // Convert set 2 to an array and add its items to the result set
        Integer[] set2Array = set2.toArray(new Integer[set2.size()]);
        for (int i = 0; i < set2Array.length; i++) {
            result.add(set2Array[i]);
        }
        return result;
    }
}