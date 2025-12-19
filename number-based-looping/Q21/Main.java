/******************************************************************************
Q21. Write a Java program to check whether a given integer is a power of 3 or not.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   
	   if(n<=0){
	       System.out.printf("Not a power of 3");
	   }
	   int count=0;
	   while(n%3==0){
	       n/=3;
	   }
	   
	   if(n==1){
	       System.out.printf("power of 3");
	   }else{
	       System.out.printf("Not power of 3");
	   }
	}
}