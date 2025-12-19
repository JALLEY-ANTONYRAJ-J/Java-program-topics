//Q8. Write a java program to print N even numbers.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int num=2;
		int count=0;
		while(count<n){
		    
		    System.out.print(num+" ");
		    num+=2;
		    count++;
		}
	}
}