/******************************************************************************

Q13. Write a Java program to check whether a given integer is a perfect square or not.

*******************************************************************************/

import java.util.*;
 public class Main{
     public static void main(String[]args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         
       if(n<0){
           System.out.println("Not a perfect square");
       }
	   
	   int sqr=(int)Math.sqrt(n);
	       
	   if(sqr*sqr==n){
	           System.out.println("perfect number");
	       }else{
	           System.out.println("Not perfect number");
	       }
     }
 }