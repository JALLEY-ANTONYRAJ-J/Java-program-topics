/******************************************************************************

Q5. Write a Java program to reverse a given number.

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
	    System.out.println(rev);
		
	}
}