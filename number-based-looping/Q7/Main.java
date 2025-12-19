/******************************************************************************

Q7. Write a Java program to check whether a number is Armstrong number or not.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int temp=n;
	    int count=0;
	    while(n!=0){
	        int digit=n%10;
	        count++;
	        n/=10;
	    }
	    int sum=0;
	     n=temp;
	      while(n!=0){
	        int digit=n%10;
	         sum+=Math.pow(digit,count);
	        n/=10;
	    }
	    System.out.println(sum);
	    
	    if(sum==temp)
	        System.out.print("Armstrong");
	        else
	        System.out.print("Not Armstrong");
		
	}
}