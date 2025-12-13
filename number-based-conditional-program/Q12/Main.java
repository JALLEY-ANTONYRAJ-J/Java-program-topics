// Q12. Java Program to check whether the last digit of a number is odd or even

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	    
	    int digit=a%10;
	    
	    if(digit%2==0)
		System.out.println("Even");
		else
		System.out.println("Odd");
	}
}



