/******************************************************************************

Q5.Write a Java program to check if temperature is above 100 (fever check).

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal Temperature");
        }

        sc.close();
    }
}
