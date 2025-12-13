//  Q18. Java Program to check whether a number is a single-digit, two-digit, or three-digit number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	 
	    if(a%10==a){
	        System.out.println("one-digit");
	    }else if(a%100==a){
	        System.out.println("two-digit");
	    }else if(a%1000==a){
	        System.out.println("three-digit");
	    }else{
	        System.out.println("Enter 1 to 3");
	    }
	}
}