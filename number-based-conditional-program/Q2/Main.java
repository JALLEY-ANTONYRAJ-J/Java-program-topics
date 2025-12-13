//Q2.Java Program to find smallest among two numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter two values: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    
	    if(a<b)
		System.out.println("a is smaller");
		else
		System.out.println("b is smaller");
	}
}