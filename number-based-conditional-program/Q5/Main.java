//Q5.Java Program to find whether the given number is 3 digit number or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	   int check=a%1000;
	    
	    if(a==check)
		System.out.println("3-digit number");
		else
		System.out.println("not  3-digit number");
	}
}

