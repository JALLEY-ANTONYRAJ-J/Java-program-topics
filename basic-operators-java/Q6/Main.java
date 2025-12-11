//swap two number using thrid variable

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter two numbers:");
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=a;
	    a=b;
	    b=c;
	    System.out.printf("After Swap:");
		System.out.println(a +"\n"+ b);
	}
}
