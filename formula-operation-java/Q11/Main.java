//Write a Java Program to find Javaircumference of a Javaircle


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter value: ");
        double r= s.nextDouble();


        double circumference = 2*Math.PI*r;
        System.out.println("circumference circle = " + circumference);

    }
}