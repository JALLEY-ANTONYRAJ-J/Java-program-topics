//Q2.Java Program to check whether a given year is a century year or not.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter year : ");
	    int a=s.nextInt();
	    
	     if( a%100==0 ){
	         System.out.println("century year");
	     }else{
	         System.out.println("not a century year");
	     }
	     }
	}
