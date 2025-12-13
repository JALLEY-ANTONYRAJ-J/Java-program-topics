//Q8.Java Program to find whether the last digit of given number is divisible by 3 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	     int check=a%10;
	    
	    if(check%3==0)
		System.out.println("divisible");
		else
		System.out.println("not divisible");
	}
}

