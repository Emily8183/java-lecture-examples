package chapter02;

// TODO: import Scanner from java.util
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* PRINTING TO THE CONSOLE */

        // TODO: Use System.out to print to the console
        System.out.println("Hi welcome");

        /* DECLARING AND INITIALIZING VARIABLES */

        // TODO: Declare and initialize several variables and print them to the console
        String name = "Emily";


        /* WRITING METHODS */

        // TODO: After coding your method below main(), call it here and print the result
        System.out.println("my name is " + name);


        /* USING METHODS FROM OTHER CLASSES */

        // TODO: Call each of the static methods from the Examples class
        Examples.sayHello("Jessie");
        System.out.println(Examples.addThreeNums(2,3,4));

        /* USING SCANNER TO GET USER INPUT */

        // TODO: Declare and initialize a Scanner object using System.in
        Scanner input = new Scanner(System.in);

        // TODO: Get user input
        // Precede your input with output to the user so they know what you need
        System.out.println("input your name please");

        // Receive the input and store it in a variable
        String userName = input.nextLine();

        // Do something with the stored user input
        System.out.println("You inputted ur name as: " + userName);

        // Always close the Scanner object at the end of the main method
        // for efficiency and security
        // TODO: Close Scanner
        input.close();

    }

    // TODO: Code a method to return a full name as a String using firstName and lastName

}
