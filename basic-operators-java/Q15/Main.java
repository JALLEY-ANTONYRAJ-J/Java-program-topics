//PRINT THE AVERAGE OF THREE NUMBER

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a three numbers:");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
	    int avg=(a+b+c)/3;
	    
	    System.out.printf("Average value:");
		System.out.println(avg);
	}
}

