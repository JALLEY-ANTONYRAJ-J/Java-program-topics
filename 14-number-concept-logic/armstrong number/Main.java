 //armstrong number
 
 import java.util.*;
 public class Main{
     public static void main(String[]args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         
         int temp=n;
	   int count=0;
	   int sum=0;
	   int sum1=0;
	   while(n!=0){
	       int digit=n%10;
	       sum=(digit*digit*digit);
	       sum1+=sum;
	       n/=10;
	   }
	   if(sum1==temp){
	       System.out.println("armstrong");
	   }else{
	       System.out.println("not");
	   }

        
     }
 }
 
	   
	   
	   
	   
	   

	   
	 