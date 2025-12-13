//Q3.Java Program to check whether the first two digits and last two digits of a year are equal.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter year : ");
	    int a=s.nextInt();
	    int first=a/100;
	    int last=a%100;
	    
	     if( first==last){
	         System.out.println("equal");
	     }else{
	         System.out.println("not equal");
	     }
	     }
	}
