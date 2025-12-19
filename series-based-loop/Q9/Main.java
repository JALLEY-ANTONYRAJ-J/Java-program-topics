//Q9. Write a java program to calculate sum of even and odd numbers till N.// 
 	

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int even=0;
		int odd=0;
		for(int i=1;i<=n;i++){
		    if(i%2==0)
		    even+=i;
		    else
		    odd+=i;
		}
		System.out.print("Even: "+even+" ");
		System.out.print("Odd: "+odd+" ");
		
	}
}
