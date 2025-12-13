// Q4. Java Program to check whether the sum of three angles forms a valid triangle.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter triangle value: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	     
	    if(a>0 && b>0 && c>0 && a+b+c==180){
	            System.out.println("valid triangle");
	    }else{
	        System.out.println("not a valid triangle");
	    }
	     }
	}

