//Q3.Java Program to find whether the given number is odd or even number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter two values: ");
	    int a=s.nextInt();
	    
	    if(a%2==0)
		System.out.println("Even");
		else
		System.out.println("Odd");
	}
}
