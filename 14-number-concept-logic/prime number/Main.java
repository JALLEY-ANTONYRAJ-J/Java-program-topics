 //prime number

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
	    if(count==2){
	           System.out.println("prime");
	       }else{
	           System.out.println("not");
	       }
	   
	   
         
        

        
     }
 }
 
	   
	   
	   
	   
	   

	   
	  
	   
	   
	   
	   
	   
	  
	   
	   
	  
	
