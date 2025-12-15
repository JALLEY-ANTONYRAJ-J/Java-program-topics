/******************************************************************************

Q19.Write a Java program to display mobile data usage alert – "Low Data", "Half Javaonsumed", or "Data Over" based on usage.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Data (MB): ");
        double totalData = sc.nextDouble();

        System.out.print("Enter Data Used (MB): ");
        double usedData = sc.nextDouble();

        double usagePercent = (usedData / totalData) * 100;

        if (usagePercent < 20) {
            System.out.println("Low Data");
        } else if (usagePercent <= 80) {
            System.out.println("Half Consumed");
        } else {
            System.out.println("Data Over");
        }
    }
}
