import java.util.Scanner;

public class InputOutput {
    public static void main(String args[]) {
        //Output a message to the user
        System.out.println("Java programming is interesting.");

        //Create a new scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user for input
        System.out.println("Enter an integer: ");

        //Get input from the user
        int number = input.nextInt();

        //Display the number the user entered as output
        System.out.println("You entered " + number);

        //Prompt the user for input
        System.out.println("What is your favorite color?");

        //Get input from user
        String color = input.next();

        //Display the color the user entered as output
        System.out.println("Your favorite color is " + color);

        //Close the scanner object
        input.close();

    } // end main method
} //end class
