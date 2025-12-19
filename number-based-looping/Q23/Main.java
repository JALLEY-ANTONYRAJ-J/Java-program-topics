/******************************************************************************

Q23. Write a Java program to find N power of M (Exponentiation) without using built-in functions.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		
		int result=1;
		for(int i=1;i<=m;i++){
		    result*=n;
		}
		System.out.println(result);
	}
}
