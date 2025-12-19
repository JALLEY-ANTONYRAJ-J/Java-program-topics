/******************************************************************************

 
 	
Q3. Write a java program to check whether the given digit is occurred in a number.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
			int n1=s.nextInt();
		
		int pos=Math.abs(n);
		
		if(n1<0 || n1>9){
		    System.out.print("Invalid input");
		}
		int same=0;

		while(n>0){
		    int digit=n%10;
		    if(digit==n1)
		        same++;
		        n/=10;
		
		}
		
		if(same>0)
		System.out.print("occurred number");
		else
		System.out.print("not occurred number");
		
	}
}