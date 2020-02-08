import java.util.Scanner;
public class GeneralizedFizzBuzz {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n: ");
       int n = sc.nextInt();
       while (n < 1) {
           System.out.print("Enter a positive integer for n: ");
           n = sc.nextInt();
       }
       System.out.print("Enter p: ");
       int p = sc.nextInt();
       while (p < 1) {
           System.out.print("Enter a positive integer for p: ");
           p = sc.nextInt();
       }
       System.out.print("Enter q: ");
       int q = sc.nextInt();
       while (q < 1) {
           System.out.print("Enter a positive integer for q: ");
           q = sc.nextInt();
       }
       // Print the numbers from 1 to n with modified rules
       for (int i = 1; i < n+1; i++) {
           if (i % p == 0 && i % q == 0) {
              System.out.println("FIZZBUZZ");
           } else if (i % p == 0) {
              System.out.println("FIZZ");
           } else if (i % q == 0) {
              System.out.println("BUZZ");
           } else {
              System.out.println(i);
           }
       }
    }
}