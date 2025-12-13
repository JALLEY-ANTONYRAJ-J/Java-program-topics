//Q3. Java Program to check whether a point (x, y) lies in which quadrant

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a x and y value: ");
	    int x=s.nextInt();
	    int y=s.nextInt();
	     
	    if(x>0 && y>0){
	            System.out.println("first-quadrant");
	    }
	     
	    else if(x<0 && y>0){
	            System.out.println("second-quadrant");
	    }
	     else if(x<0 && y<0){
	            System.out.println("thrid-quandrant");
	    }else{
	        System.out.println("four-quandrant");
	    }
	     }
	}

