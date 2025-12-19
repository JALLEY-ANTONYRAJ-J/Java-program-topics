/******************************************************************************

Q2. Write a Java program to calculate the sum of digits of a given number.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int sum=0;
	    int temp=n;
	    while(n!=0){
	        int digit=n%10;
	        sum+=digit;
	        n/=10;
	    }
	    System.out.println(sum);
	    }
	    
		
	}
