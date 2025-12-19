//Q2. Write a java program to print whole numbers till N.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=0;i<=n;i++){
		    System.out.print(i+" ");
		}
	}
}