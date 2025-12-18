 //strong number

import java.util.*;
 public class Main{
     public static void main(String[]args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         
         int temp=n;
	   int sum=0;
	   while(n!=0){
	       int digit=n%10;
	       
	       	    int fact=1;
	       for(int i=2;i<=digit;i++){
	           fact*=i;
	       }
	       sum+=fact;
	       n/=10;
	       
	   }
	   if(sum==temp){
	       System.out.println("strong");
	   }else{
	       System.out.println("Not");
	   }
         
        

        
     }
 }
 
	   
	   
	   
	   
	   

	   
	  
	   
	   
	   
