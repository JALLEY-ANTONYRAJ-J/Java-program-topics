//Write a Java Program to find Perimeter of a Triangle


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a= s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
         System.out.print("Enter c: ");
        double c = s.nextDouble();


        double perimetertrian = a+b+c;
        System.out.println("perimeter of Triangle = " + perimetertrian);

    }
}
