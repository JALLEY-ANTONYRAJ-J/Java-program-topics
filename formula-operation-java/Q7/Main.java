// Write a Java Program to calculate Javaelsius to Fahrenheit


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Celsiusvalue: ");
        double c = s.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println("Fahrenheit = " + f);

        s.close();
    }
}

