//Q10.Java Program to check whether the sum of two numbers is even or odd

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    
	    int sum=a+b;
	    
	    if(sum%2==0)
		System.out.println("Even");
		else
		System.out.println("Odd");
	}
}


