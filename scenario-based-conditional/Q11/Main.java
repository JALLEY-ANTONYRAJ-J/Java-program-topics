/******************************************************************************

Q11.Write a Java program to apply discount based on purchase amount.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase Amount: ");
        double amount = sc.nextDouble();

        double discount = 0;

        if (amount < 1000) {
            discount = 0;
        } else if (amount < 5000) {
            discount = amount * 0.05;
        } else {
            discount = amount * 0.10;
        }

        double finalAmount = amount - discount;

        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }
}

