/******************************************************************************
 
 	
Q8. Write a Java program to convert decimal to binary.

*******************************************************************************/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        
        if(n==0){
            System.out.print("binary 0");
        }
       String binary="";
       while(n>0){
           int rem=n%2;
           binary=rem+binary;
           n=n/2;
       }
       
       System.out.print(binary+" ");
            }
        }
       
    