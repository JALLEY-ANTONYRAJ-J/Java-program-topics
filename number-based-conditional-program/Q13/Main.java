// Q13. Java Program to check whether a number is positive, negative, or zero

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	    
	    if(a>0)
		System.out.println("positive");
		else if(a<0)
		System.out.println("negative");
		else
		System.out.println("Zero");
	}
}



