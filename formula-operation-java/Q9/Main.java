//Write a Java Program to find Perimeter of a Rectangle


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length: ");
        double len = s.nextDouble();
        System.out.print("Enter height: ");
        double heg = s.nextDouble();

        double perimeterrect = 2*(len+heg);
        System.out.println("perimeter of rectangle = " + perimeterrect);

    }
}
