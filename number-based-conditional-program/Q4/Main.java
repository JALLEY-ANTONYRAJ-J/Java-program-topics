//Q4.Java Program to find whether the difference between two numbers is even or odd

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter two values: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int diff=a-b;
	    
	    if(diff%2==0)
		System.out.println("Even");
		else
		System.out.println("Odd");
	}
}

