//Day 4 - Basic Arithmetic Operations
/*1. Write a program that declares two integer variables and perform basic arithmetic operations (addition, subtraction, multiplication, division) on them. Print the results to the console.
2. Write a program that calculates the area of a rectangle. Prompt the user to input the length(integer) and width(integer) of the rectangle, calculate the area (length * width), and print the result.
3. Modify the above program to read decimal numbers as the length and width, and output the area to two decimal points
*/
import java.util.Scanner;

public class Day04 {

    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println(a+b);
        System.out.println(b-a);
        System.out.println(a*b);
        System.out.println(a/b);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int length= myScanner.nextInt();
        System.out.println("Enter the width of rectangle");
        int width= myScanner.nextInt();
        System.out.println("The total area is "+ length*width);


        System.out.println("Enter the length of rectangle");
        double dlength= myScanner.nextDouble();
        System.out.println("Enter the width of rectangle");
        double dwidth= myScanner.nextDouble();
        System.out.println("The total area is "+ dlength*dwidth);
    }
}
