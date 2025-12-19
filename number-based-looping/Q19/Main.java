/******************************************************************************
Q19. Write a Java program to check whether a given number is an Automorphic Number or not

*******************************************************************************/
import java.util.*;
 public class Main{
     public static void main(String[]args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         
           int temp=n;
	   int count=0;
	   while(n!=0){
	       int digit=n%10;
	       count++;
	       n/=10;
	   }

	   int sqr=(int)Math.pow(temp,count);

	   int lasttwo=sqr%100;

	   if(lasttwo==temp){
	       System.out.println("automorpic");
	   }else{
	       System.out.println("Not");
	   }
	   