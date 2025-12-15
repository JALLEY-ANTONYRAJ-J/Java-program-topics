/******************************************************************************

Q18.Write a Java program to calculate water bill using slab rates (≤1000 liters free, next 2000 @ ₹5, above @ ₹10 per 1000 liters).

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Water Consumption in liters: ");
        double liters = sc.nextDouble();

        double bill = 0;

        if (liters <= 1000) {
            bill = 0;
        } else if (liters <= 3000) {
            bill = (liters - 1000) * 5 / 1000;
        } else {
            bill = (2000 * 5 / 1000) + ((liters - 3000) * 10 / 1000);
        }

        System.out.println("Total Water Bill: ₹" + bill);
    }
}
