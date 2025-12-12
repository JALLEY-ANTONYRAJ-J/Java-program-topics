//Q8.Write a Java Program to find Perimeter of a Square


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter side value: ");
        double side = s.nextDouble();

        double perimetersqr = 4*side;
        System.out.println("perimeter ofsquare = " + perimetersqr);

    }
}