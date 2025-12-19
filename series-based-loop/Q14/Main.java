//Q14. Write a java program to calculate sum of N positive numbers (Skip the negative number and get another input instead).
 	

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int sum=0;
		int count=0;
		
	while(count<N){
	     int n=s.nextInt();
	    if(n<0){
	        continue;
	    }
	    
	   sum+=n;
	   count++;
	}
	System.out.print("negative skipped pos number: "+sum);
	     
	}
		
	}

