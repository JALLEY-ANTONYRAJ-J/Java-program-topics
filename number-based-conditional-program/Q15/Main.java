// Q15. Java Program to check whether a number is divisible by either 3 or 7

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	    
	    if(a%3==0 || a%7==0)
		System.out.println("divisible");
		else
		System.out.println("not divisible");
	}
}