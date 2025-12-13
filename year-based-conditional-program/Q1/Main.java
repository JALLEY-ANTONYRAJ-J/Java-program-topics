//Q1. Java Program to check whether a year is a leap year or not

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter year : ");
	    int a=s.nextInt();
	    
	     if(a%4==0 || a%400==0 && a%100!=0 ){
	         System.out.println("leap year");
	     }else{
	         System.out.println("not a leap year");
	     }
	     }
	}
