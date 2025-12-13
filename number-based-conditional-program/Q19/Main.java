// Q19. Java Program to check whether the product of two numbers is positive or negative

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a values: ");
	    int a=s.nextInt();
	     int b=s.nextInt();
	     
	    int product=a*b;
	    if(product>0){
	        System.out.println("positive");
	    }else if(product<0){
	        System.out.println("negative");
	    }else{
	        System.out.println("product is 0");
	    }
	}
}