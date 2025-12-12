/******************************************************************************

A stationery shop offers: Buy 5 pens, pay only for 3. Given price per pen and pens bought, 
the program calculates how many pens need to be paid for and total cost.
Pen Price: 10  Buy: 12       Pay For: 8 Total Amount: 80

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter pen price: ");
        int price=s.nextInt();
        System.out.printf("Enter  Buy: ");
        int buy=s.nextInt();
        
        int tot_offer_pen=(buy/5)*3;
        int remiming=buy%5;
        
        int pay_for=tot_offer_pen+remiming;
        
        int Amount=price*pay_for;

        System.out.println("pay for: "+pay_for);
        System.out.println("Amount: "+Amount);

        
    }
}