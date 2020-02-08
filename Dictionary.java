import java.lang.UnsupportedOperationException;
import java.util.Scanner;
public class Dictionary {
    // Constants for function names in input
    public static final String MIN_METHOD_NAME = "MIN";
    public static final String MAX_METHOD_NAME = "MAX";
    public static final String RANGE_METHOD_NAME = "RANGE";
    public static final String AVERAGE_METHOD_NAME = "AVERAGE";
    public static final String MODE_METHOD_NAME = "MODE";
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Read in the method name that we want to call
            String methodName = sc.nextLine();
            // Read in number of words
            int numWords = Integer.parseInt(sc.nextLine());
            // Read in list of words
            String[] words = new String[numWords];
            for (int i = 0; i < numWords; i++) {
                words[i] = sc.nextLine();
            }
            // Run the specified method
            switch (methodName) {
                case MIN_METHOD_NAME:
                    System.out.println(minWordLength(words));
                    break;
                case MAX_METHOD_NAME:
                    System.out.println(maxWordLength(words));
                    break;
                case RANGE_METHOD_NAME:
                    System.out.println(wordLengthRange(words));
                    break;
                case AVERAGE_METHOD_NAME:
                    System.out.println(averageWordLength(words));
                    break;
                case MODE_METHOD_NAME:
                    System.out.println(mostCommonWordLength(words));
                    break;
                default:
                    throw new UnsupportedOperationException();
                    private static int minWordLength(String[] words) {
                        // Initialize current min
                        int currentMin = Integer.MAX_VALUE;
                        // For each word, update current min length if necessary
                        for (int i = 0; i < words.length; i++) {
                            if (words[i].length() < currentMin) {
                                currentMin = words[i].length();
                            }
                        }
                        return currentMin;
                    }

                    private static int maxWordLength(String[] words) {
                        // Initialize current max
                        int currentMax = Integer.MIN_VALUE;
                        // For each word, update current min length if necessary
                        for (int i = 0; i < words.length; i++) {
                            if (words[i].length() > currentMax) {
                                currentMax = words[i].length();
                            }
                        }
                        return currentMax;
                    }
                    private static int wordLengthRange(String[] words) {
                        // Use max and min since range = max - min
                        return maxWordLength(words) - minWordLength(words);
                    }
                    private static String averageWordLength(String[] words) {
                        // Initialize sum of lengths
                        int sumOfLengths = 0;
                        // Compute the sum of the word lengths
                        for (int i = 0; i < words.length; i++) {
                            sumOfLengths += words[i].length();
                        }
                        // Return the average as a string to two decimal places
                        double average = (double) sumOfLengths / words.length;
                        return String.format("%.2f", average);
                    }
                    private static int mostCommonWordLength(String[] words) {
                        // Assume that English words are < 200 letters
                        int[] lengthOccurrences = new int[200];
                        // Count the occurrences of each length
                        for (int i = 0; i < words.length; i++) {
                            lengthOccurrences[words[i].length()] += 1;
                        }
                        // Find the max number of occurrences of a given length
                        int maxOccurrences = 0;
                        for (int i = 0; i < lengthOccurrences.length; i++) {
                            if (lengthOccurrences[i] > maxOccurrences) {
                                maxOccurrences = lengthOccurrences[i];
                            }
                        }
                        // If the max occurrences appears once, that is the mode.
                        // Otherwise, we return -1.
                        int mode = -1;
                        for (int i = 0; i < lengthOccurrences.length; i++) {
                            // If we found a second mode, return -1.
                            // If we found the first mode, set that into the mode
                            variable.
                            if((lengthOccurrences[i] == maxOccurrences) && (mode > -1)) {
                                return -1;
                            } else if (lengthOccurrences[i] == maxOccurrences) {
                                mode = i;
                            }
                        }
                        return mode;
                    }
            }
     }
}