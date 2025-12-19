/******************************************************************************

Q2. Write a java program to find whether the first digit of a given number is odd or even.

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
		
		if(n%2==0)
		System.out.print("Even");
		else
		System.out.print("Odd");
		
	}
}