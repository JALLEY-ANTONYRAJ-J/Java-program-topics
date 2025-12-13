// Q6. Write a Java Program to check whether four sides form a square or rectangle.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter triangle value: ");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    int d=s.nextInt();
	     
	    if(a==b && b==c && c==d){
	            System.out.println("square");
	    }else if(a==c && b==d){
	        System.out.println("rectangle");
	    }else{
	        System.out.println("neither square or rectangle");
	    }
	     }
	}

