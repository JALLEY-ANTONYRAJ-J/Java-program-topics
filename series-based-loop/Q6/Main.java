//Q6. Write a java program to calculate sum of first N natural numbers.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++){

		   sum+=i;
		    
		}
		System.out.print(sum+" ");
	}
}