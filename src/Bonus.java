/**
 *
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since Version 1.0
 *
 */


import java.util.Scanner;
// Here are a few examples of format specifiers:
public class Bonus {
    public static void main(String[] args) {
        String name = "Linh";
        int age = 17;
        char grade = 'A';
        String zodiacSign = null;
        double pi = 3.14159265359;
        System.out.printf("Hello, my name is %s and I am %d years old %n", name, age);
        System.out.printf("Your grade is: %c%n", grade);
        System.out.printf("%b,%b,%b%n", age,grade,zodiacSign);
        System.out.printf("%e%n", pi);
        System.out.println("Enter a random floating-point number:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        System.out.printf("Floating-point number: %.3f%n", a);



    }}
