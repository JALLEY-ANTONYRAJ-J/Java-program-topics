/******************************************************************************

Q8.Write a Java program to check if an entered PIN matches the stored ATM PIN before allowing withdrawal.
*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int storedPin = 1234;

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == storedPin) {
            System.out.println("PIN Matched.");
        } else {
            System.out.println("Incorrect PIN..");
        }

    }
}
