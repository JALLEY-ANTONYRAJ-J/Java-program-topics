//.Write a Java Program to calculate Fahrenheit to Javaelsius


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Fahrenheit value: ");
        double f = s.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println(" Celsius = " + c);

    }
}

