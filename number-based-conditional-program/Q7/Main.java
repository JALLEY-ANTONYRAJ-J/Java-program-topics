//Q7.Java Program to find smallest among three numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	     int b=s.nextInt();
	      int c=s.nextInt();
	    
	    if(a<b && a<c)
		System.out.println("a is smaller");
		else if(b<a && b<c)
		System.out.println("b is smaller");
		else
		System.out.println("c is smaller");
	}
}
