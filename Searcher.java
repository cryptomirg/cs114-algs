import java.lang.UnsupportedOperationException;
import java.util.Scanner;
public class Searcher {
    public static final int LINEAR_SEARCH_OPTION = 0;
    public static final int BINARY_SEARCH_OPTION = 1;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       // parse the search method
       int searchMethod = Integer.parseInt(sc.nextLine());
       // parse the number to find
       int n = Integer.parseInt(sc.nextLine());
       // parse the list of numbers to search in
       String[] numberStrings = sc.nextLine().split(" ");
       int[] numbers = new int[numberStrings.length];
       
       for (int i = 0; i < numberStrings.length; i++) {
           numbers[i] = Integer.parseInt(numberStrings[i]);
       }
       
       // run linear or binary search
       if (searchMethod == LINEAR_SEARCH_OPTION) {
           System.out.println(linearSearch(numbers, n));
       } else if (searchMethod == BINARY_SEARCH_OPTION) {
           System.out.println(binarySearch(numbers, n));
       } else {
           throw new UnsupportedOperationException();
       } 
    }
    
    private static boolean linearSearch(int[] numbers, int n) {
       // Check all items in the list
       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] == n) {
               return true;
           }
       }
       
       // If we didn’t find our desired item, return false
       return false;
    }
    
    private static boolean binarySearch(int[] numbers, int n) {
         // Initialize bounds
           int lowerBound = 0;
           int upperBound = numbers.length - 1;
           // Iteratively guess the middle and update the bounds
               accordingly
           while (lowerBound <= upperBound) {
               // Arbitrarily round down when guessing
               int guess = (lowerBound + upperBound) / 2;
               // If we are correct, return true; otherwise, update
                   bounds
               if (n == numbers[guess]) {
                  return true;
               } else if (n < numbers[guess]) {
                  upperBound = guess - 1;
               } else if (n > numbers[guess]) {
                  lowerBound = guess + 1;
               }
           // If we didn’t find our desired item, return false
           return false;
       }
    }
}
