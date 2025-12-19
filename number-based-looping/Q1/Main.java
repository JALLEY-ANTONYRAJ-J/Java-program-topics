/******************************************************************************

Q1. Write a Java program to print the factorial of a given number N.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    
	    int fact=1;
	    for(int i=1;i<=n;i++){
	        fact*=i;
	    }
	    System.out.println(fact);
		
	}
}
