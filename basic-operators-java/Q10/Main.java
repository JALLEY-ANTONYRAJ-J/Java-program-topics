//sum first amd last digit of a 3 numebers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter 3 numbers:");
	    int a=s.nextInt();
	    int first=a/100;
	    int last=a%10;
	    int sum=first+last;
	    System.out.printf("sum of first and last:");
		System.out.println(sum);
	}
}
