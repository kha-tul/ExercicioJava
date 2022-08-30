//Write a Java program to compute body mass index (BMI).
//
//BMI: The BMI is defined as the body mass divided by the square of the body height, and is universally expressed in units of kg/m2, resulting from mass in kilograms and height in metres.
//
//Test Data
//Input weight in pounds: 452
//Input height in inches: 72

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Input height in inches: ");
        double inches = input.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.println("Body Mass Index is " + BMI + "\n");
    }
}
