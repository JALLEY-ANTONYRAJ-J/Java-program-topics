//Q1. Write a java program to print N natural numbers.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++){
		    System.out.print(i+" ");
		}
	}
}
