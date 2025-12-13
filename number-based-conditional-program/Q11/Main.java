//Q11. Java Program to check whether the first digit of a 3 digit number is odd or even

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	    
	    int digit=a/100;
	    
	    if(digit%2==0)
		System.out.println("Even");
		else
		System.out.println("Odd");
	}
}


