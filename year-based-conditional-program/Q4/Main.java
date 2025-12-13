//Q4.Java Program to check whether two given years have the same last digit.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter year1 : ");
	    int a=s.nextInt();
	     System.out.printf("Enter year2 : ");
	    int b=s.nextInt();
	    int lasty1=a%10;
	    int lasty2=b%10;
	    
	     if( lasty1==lasty2){
	         System.out.println("same last digit");
	     }else{
	         System.out.println("not same last digit");
	     }
	     }
	}
