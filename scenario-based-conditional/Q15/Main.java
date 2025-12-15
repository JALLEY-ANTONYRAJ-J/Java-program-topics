/******************************************************************************

 
 	
Q15.Write a Java program to check whether vehicle speed exceeds 100 km/h.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Speed (km/h): ");
        int speed = sc.nextInt();

        if (speed > 100) {
            System.out.println("Over Speed! Slow Down.");
        } else {
            System.out.println("Speed is within the limit.");
        }
    }
}
