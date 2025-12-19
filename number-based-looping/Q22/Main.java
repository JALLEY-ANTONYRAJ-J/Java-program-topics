/******************************************************************************

Q22. Write a Java program to multiply two numbers without using * operator.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int result=0;
		for(int i=1;i<=b;i++){
		    result+=a;
		}
		System.out.print(result);
		
		
	}
}
