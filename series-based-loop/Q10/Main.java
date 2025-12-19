//Q10. Write a java program to calculate sum of N given numbers.
 	

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int sum=0;
		
		while(n>0){
		    int digit=n%10;
		    sum+=digit;
		    n/=10;
		}
	
		System.out.print("sum of N numbers: "+sum+" ");
		
	}
}
