import java.util.Scanner;

public class Main {
    // In this program were making a basic calculator
    // Each method has a different operation to be calculated with.
    /* to begin we started out by creating the addition operator method and add two parameters in the form of ints to create the sum of two numbers*/
    /* I wanted to go a step further from the code academy version which doesn't ask for user inputs. In this instance it does.
   In addition to this I wanted to make it where the program executes an initial method so the user can select which operation they would like to
   utilize for their calculation*/

    public static int addition() {
        // I added the scanner class in each method so instance can run depending on which operation they want to use.
        Scanner adding = new Scanner(System.in);
        System.out.println("Please input 2 numbers");
        System.out.println("First Number");
        int a = adding.nextInt();

        System.out.println("Second Number");
        int b = adding.nextInt();
        int c;
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        return c;
    }

    public static int subtraction() {
        Scanner subtraction = new Scanner(System.in);
        System.out.println("Please input 2 numbers");
        System.out.println("First Number");
        int a = subtraction.nextInt();

        System.out.println("Second Number");
        int b = subtraction.nextInt();

        int c;
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        return c;

    }

    public static int multiplication() {
        Scanner multiplication = new Scanner(System.in);
        System.out.println("Thank you for selecting multiplication");
        System.out.println("Please input two numbers to multiply");
        System.out.println("First number to multiply");
        int a = multiplication.nextInt();

        System.out.println("Second number to multiply");
        int b = multiplication.nextInt();

        int c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        return c;


    }

    public static int division() {
        System.out.println("Thank you for selecting division");
        System.out.println("Please input two numbers to divide");
        System.out.println("First number to divide");
        Scanner division = new Scanner(System.in);
        int a = division.nextInt();
        System.out.println("Second number to divide");
        int b = division.nextInt();
        int c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        return c;
    }

    public static int modulo() {
        System.out.println("Thank you for selecting remainder");
        System.out.println("Please input two numbers to remainder");
        System.out.println("First number to determine remainder");
        Scanner remainder = new Scanner(System.in);
        int a = remainder.nextInt();
        System.out.println("Second number to find the remainder with");
        int b = remainder.nextInt();
        int c = a % b;
        System.out.println(a + " % " + b + " = " + c);
        return c;
    }


    public static void main(String[] args) {
        System.out.println("Thank you for choosing the operational choice calculator");
        System.out.println("To begin, Please type which operation you would like to use");
        System.out.println("Addition , Subtraction , Multiplication , Division , or Modulo (Case sensitive)");
        Scanner operations = new Scanner(System.in);
        // Here I created an if else-if statement so the user can select which operation they would like to utilize.
        // I want to make it to where the string isn't case-sensitive but im still learning. This is in a great position already.
        if (operations.hasNext("Addition")) {
            System.out.println(addition());

        } else if (operations.hasNext("Subtraction")) {
            System.out.println(subtraction());

        } else if (operations.hasNext("Multiplication")) {
            System.out.println(multiplication());

        } else if (operations.hasNext("Division")) {
            System.out.println(division());

        } else if (operations.hasNext("Modulo")) {
            System.out.println(modulo());

        } else {

            System.out.println("Error");
            System.exit(0);
            // Here the program exits after the error instantly
        }
    }
}
