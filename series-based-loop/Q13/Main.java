//Q13. Write a java program to calculate sum of multiple positive numbers (Stop if user enters negative number).
 	

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		int sum=0;
		int n;
	while(true){
	     n=s.nextInt();
	    if(n<0){
	        break;
	    }
	    
	   sum+=n;
	}
	System.out.print("sum of value is: "+sum);
	     
	}
		
	}

