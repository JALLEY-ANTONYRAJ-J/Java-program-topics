/******************************************************************************

 
 	
Q4. Write a Java program to print the product of digits of a given number.


*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int temp=n;
	    int product=1;
	    while(n!=0){
	        int digit=n%10;
	        product*=digit;
	        n/=10;
	    }
	    System.out.println(product);
		
	}
}