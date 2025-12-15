/******************************************************************************

Q16.Write a Java program to validate a mobile number . If it has 10 or more digits, print “Valid Number”, otherwise print “Invalid Number”.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.next();

        if (mobile.length() >= 10) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
