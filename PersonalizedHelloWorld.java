import java.util.Scanner;
public class PersonalizedHelloWorld {
    public static void main(String[] args) {
       // Ask the user for their name
       Scanner sc = new Scanner(System.in);
       System.out.print("What is your name? ");
       String name = sc.nextLine();
       // Query for the name again if it’s empty
       while (name.equals("")) {
           System.out.print("Please enter your name: ");
           name = sc.nextLine();
           }
           // Display "Hello, <name>!"
           System.out.println("Hello, " + name + "!");
       }
}
