import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.lang.UnsupportedOperationException;
public class DuplicateWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // parse the number of strings
        int numStrings = Integer.parseInt(sc.nextLine());
        // parse each string
        String[] stringsArray = new String[numStrings];
        for (int i = 0; i < numStrings; i++) {
            stringsArray[i] = sc.nextLine();
        }
        // print whether there are duplicates
        System.out.println(hasDuplicates(stringsArray));
    }
    private static boolean hasDuplicates(String[] stringsArray) {
        // Initialize a set of words seen
        Set < String > wordsSeen = new HashSet < > ();
        // For each word in the array, see if it’s in the set
        // already (this implies it’s a duplicate).
        for (int i = 0; i < stringsArray.length; i++) {
            if (wordsSeen.contains(stringsArray[i])) {
                return true;
            }
            wordsSeen.add(stringsArray[i]);
        }
        // If we don’t see duplicates, return false.
        return false;
    }
}