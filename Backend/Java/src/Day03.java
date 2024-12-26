//Day 3 - Input and Output
/*
1. Write a program that reads user input and print it to the console.
2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
3. Write a program to read the user input using Scanner class
 */

import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String myname= myScanner.nextLine();

        System.out.println("Enter your age: ");
        int age=myScanner.nextInt();

        System.out.println("Enter your height: ");
        double height = myScanner.nextDouble();

        System.out.println("Your name is "+ myname);
        System.out.println("Your age is "+ age);
        System.out.println("Your height is "+ height);
    }
}
