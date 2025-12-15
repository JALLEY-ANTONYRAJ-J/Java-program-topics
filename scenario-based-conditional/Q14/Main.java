/******************************************************************************

Q14.Write a Java program to assign ticket price based on passenger age (child, adult, senior).

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Age: ");
        int age = sc.nextInt();

        int ticketPrice = 0;

        if (age >= 0 && age <= 12) {
            ticketPrice = 50;
            System.out.println("Category: Child");
        } else if (age <= 59) {
            ticketPrice = 100;
            System.out.println("Category: Adult");
        } else if (age >= 60) {
            ticketPrice = 70;
            System.out.println("Category: Senior");
        } else {
            System.out.println("Invalid Age");
        }

        if (ticketPrice > 0) {
            System.out.println("Ticket Price: ₹" + ticketPrice);
        }
    }
}
