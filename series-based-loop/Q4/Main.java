//Q4. Write a java program to print even numbers till N.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++){
		    if(i%2==0){
		    System.out.print(i+" ");
		    }
		}
	}
}