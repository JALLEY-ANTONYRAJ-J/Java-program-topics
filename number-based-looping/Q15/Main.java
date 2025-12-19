/******************************************************************************
Q15. Write a Java program to check whether a given number is a Perfect Number or not.

*******************************************************************************/

import java.util.*;
 public class Main{
     public static void main(String[]args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         
        int temp=n;
	   int sum=0;
	   
	   for(int i=1;i<n;i++){
	       if(n%i==0){
	           sum=sum+i;
	       
	   }
	   }
	   if(sum==temp){
	           System.out.println("perfect");
	       }else{
	           System.out.println("Not");
	       }
     }
 }
 