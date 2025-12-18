 //neyaan number
 
 import java.util.*;
 public class Main{
     public static void main(String[]args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int sqr=n*n;
	   int temp1=sqr;
	   int sum=0;
	   while(sqr!=0){
	       int digit=sqr%10;
	       sum+=digit;
	       sqr/=10;
	   }
	   if(temp1==sum){
	       System.out.println("yes");
	   }else{
	       System.out.println("no");
	   }
     }
 }
 
	   
	   
	   