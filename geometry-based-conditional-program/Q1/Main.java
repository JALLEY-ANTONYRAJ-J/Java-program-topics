//Q1. Java Program to check whether a triangle is equilateral, isosceles, or scalene

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a triangle value: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	     
	    if(a==b && a==c && b==a && b==c &&c==a && c==b){
	        System.out.println("equilateral");
	    }else if(a==b && b==a){
	        System.out.println("isosceles");
	    }else{
	        System.out.println("scalene");
	    }
	}
}
