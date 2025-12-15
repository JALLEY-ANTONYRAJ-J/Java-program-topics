/******************************************************************************

Q9.Write a Java program to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        System.out.print("Enter Withdrawal Amount: ");
        int withdraw = sc.nextInt();

        if (withdraw <= balance ) {
            System.out.println("Transaction Successful.");
        } else if (withdraw > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            System.out.println("Enter amount in multiples of 100.");
        }

        sc.close();
    }
}
