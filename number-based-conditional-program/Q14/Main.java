// Q14. Java Program to check whether a number is divisible by both 3 and 5

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	    
	    if(a%3==0 && a%5==0)
		System.out.println("divisible by both");
		else
		System.out.println("not divisible");
	}
}