  //twisted number

import java.util.*;
 public class Main{
     public static void main(String[]args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         
            int sum=0;
	   int count=0;
	   if(n<0){
	       System.out.println("Not a prime");
	   }
	   for(int i=1;i<=n;i++){
	       if(n%i==0){
	           count++;
	       }
	      
	   }
	   int temp=n;
	   int rev=0;
	   while(n!=0){//1
	       int digit=n%10;//1
	       rev=rev*10+digit;//31
	       n/=10;
	   }
	   
	   int reverse=rev;
	   int count1=0;
	   for(int i=1;i<=rev;i++){
	       if(rev%i==0){
	           count1++;
	       }
	   }
	    if(count==2 && count1==2){
	           System.out.println("prime");
	       }else{
	           System.out.println("not");
	       }
	  
	   

        
     }
 }
 
	   
	   
	   
	   
	   

	   
	  
	   
	   
	   
	   
	   
	  
	   
	   
	  
	
	   
	 
	   
	 
	  