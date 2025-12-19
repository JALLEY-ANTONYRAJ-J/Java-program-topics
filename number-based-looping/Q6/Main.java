/******************************************************************************

Q6. Write a Java program to check whether a number is palindrome or not.
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int temp=n;
	    int rev=0;
	    while(n!=0){
	        int digit=n%10;
	        rev=rev*10+digit;
	        n/=10;
	    }
	    if(rev==temp)
	        System.out.print("Pliandrome");
	        else
	        System.out.print("Not Pliandrome");
		
	}
}