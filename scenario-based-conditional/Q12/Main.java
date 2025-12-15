/******************************************************************************
 
 	
Q12.Write a Java program to show weather condition (cold, pleasant, hot, heatwave) based on temperature.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature (°C): ");
        int temp = sc.nextInt();

        if (temp < 15) {
            System.out.println("Cold");
        } else if (temp <= 25) {
            System.out.println("Pleasant");
        } else if (temp <= 35) {
            System.out.println("Hot");
        } else {
            System.out.println("Heatwave");
        }
    }
}
