/******************************************************************************

Q1. Write a java program to print the first digit of a given number.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int pos=Math.abs(n);
		
		while(n>=10){
		    n/=10;
		}
		System.out.print("first digit: "+n);
	}
}
