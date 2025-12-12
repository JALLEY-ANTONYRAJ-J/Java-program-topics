/******************************************************************************

A shopkeeper sells an item at a profit. Given cost price and profit,
calculate the selling price using: SP = CP + Profit.
CP: 500  Profit: 100    Selling Price: 600

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter CP: ");
        int cp=s.nextInt();
        System.out.printf("Enter  Profit: ");
        int Profit=s.nextInt();

        int sp=cp+Profit;
        System.out.println("Selling Price: "+sp);

        
    }
}
