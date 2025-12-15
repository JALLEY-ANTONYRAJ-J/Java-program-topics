
/*Q1.Write a Java Program to calculate different discount for different Bill amount */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your bill: ");
        double bill = sc.nextDouble();
        double discount=0;
        
        if(bill<1000){
            System.out.println("No Discount.");

    }else if(discount<5000){
        discount=bill*0.05;
    }else if(discount<10000){
       discount=bill*0.10;
    }else if(discount>=10000){
        discount=bill*0.15;
    }else{
        System.out.println("Enter valid bill.");
    }
    double finalamount=bill-discount;
    
    System.out.println("Discount: "+discount);
    System.out.println("payamount: "+finalamount);
}
}
