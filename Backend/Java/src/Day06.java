//Day 6 - Type Conversion
/*
Write a program that performs the following tasks:
Convert a String to an Integer
Convert a String to a Float
Convert an Integer to a String using valueOf() method
Convert an Integer to a String using toString() method
 */
public class Day06 {
    public static void main(String[] args) {
        String no="33";
        int age=39;
        System.out.println(Integer.parseInt(no));
        System.out.println(Float.parseFloat(no));
        System.out.println(String.valueOf(age));
        System.out.println(Integer.toString(age));
    }
}
