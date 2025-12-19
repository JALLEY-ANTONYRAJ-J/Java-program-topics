/******************************************************************************

Q4. Write a java program to count the occurrence of a digit in a number.

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
		int count=0;

		while(n>0){
		    int digit=n%10;
		    if(digit==n1)
		        count++;
		        n/=10;
		}
		
		System.out.print(count+" times occurrence.");
	}
}