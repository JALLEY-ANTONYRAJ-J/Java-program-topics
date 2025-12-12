/******************************************************************************

A fruit shop has an offer: Buy 3 mangoes and get 1 free. Based on the mango price and total mangoes purchased,
compute total mangoes received and amount to pay.
Mango Price: 20  Buy: 10        Total Mangoes: 13  Amount: 200

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter Mango price: ");
        int price=s.nextInt();
        System.out.printf("Enter  Buy: ");
        int buy=s.nextInt();
        
        int Total=buy/3;
        
        int Amount=price*buy;

        int Total_mango=buy+Total;
        System.out.println("Total mango: "+Total_mango);
        System.out.println("Amount: "+Amount);

        
    }
}
