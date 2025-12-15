/******************************************************************************

Q10.Write a Java program to print "Stop / Ready / Go" based on traffic light color.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Traffic Light Color (Red/Yellow/Green): ");
        String color = sc.next();
        color = color.toLowerCase();

        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            System.out.println("Ready");
        } else if (color.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid Color");
        }
    }
}
