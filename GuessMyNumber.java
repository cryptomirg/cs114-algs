import java.lang.Math;
import java.util.Scanner;
public class GuessMyNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       // Get n from user
       System.out.print("Enter n: ");
       int n = sc.nextInt();
       while (n < 1) {
           System.out.print("Enter a positive integer for n: ");
           n = sc.nextInt();
       }
       // Greet user and ask them to think of a number between 0 and n-1
       System.out.println("Welcome to Guess My Number!");
       System.out.println("Please think of a number between 0 and " + (n-1) + ".");
       // Initialize bounds
       int lowerBound = 0;
       int upperBound = n-1;
       while (true) {
           // make a guess
           int guess = lowerBound + (int)Math.ceil((double)(upperBound - lowerBound)/2.0);
           // check if the guess is correct
           System.out.println("Is your number: " + guess + "?");
           System.out.println("Please enter C for correct, H for too high, or L for too low.");
           // Get the response (H/L/C)
           char answer = ’Z’;
           while (true) {
              System.out.print("Enter your response (H/L/C): ");
              String line = sc.next();
              if (line.length() == 1) {
                  answer = line.charAt(0);
                  break;
              } 
           }
           // If we guessed correctly, end the game
           if (answer == ’C’) {
              break;
           }
           // check if the guess is too high or too low
           if (answer == ’H’) {
               upperBound = guess - 1;
           } else if (answer == ’L’) {
               lowerBound = guess + 1;
           }
        }
               
               System.out.println("Thank you for playing Guess My Number!");
      }
}
                  
