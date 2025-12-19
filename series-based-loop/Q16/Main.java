// Q16. Write a java program to print the first N prime numbers.
 	

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    
	    int num=2;
	    int count=0;
	    while(count<n){
	        int c=0;
		for(int i=1;i<=num;i++){
		    if(num%i==0){
		        c++;
		    }
		}
		    
		    if(c==2){
		        System.out.print(num+" ");
		        count++;
		    }
		    
		    num++;
	    }
		  
		}
		
	     
	}

		
	

