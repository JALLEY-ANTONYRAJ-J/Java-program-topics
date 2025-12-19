//Q5. Write a java program to print N natural numbers in reverse.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=n-1;i>0;i--){

		    System.out.print(i+" ");
		    
		}
	}
}