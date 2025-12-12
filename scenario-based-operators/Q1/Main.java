/******************************************************************************

Q1..A shop offers festival discounts. The customer enters the original price and discount
percentage. The program must calculate the discount amount and the final price payable
after applying the discount.

riginal Price: 1000  Discount Amount: 100.0  Final Price: 900.0   

*******************************************************************************/

import java.util.*;
public class Main    
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a original amount:");
	    double original_amount=s.nextDouble();
	    
	    System.out.printf("Enter a Discount amount:");
	    double Discount=s.nextDouble();
	    
	    double discount_amount=(original_amount*discount)/100;
	    double Final_prize=original_amount-discount_amount;
	    
		System.out.println("Discount amount: "+discount_amount+"\n");
				System.out.println("final amount: "+Final_prize);
		
	}
}
