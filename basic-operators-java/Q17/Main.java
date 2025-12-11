//check power of 2 digit using AND

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter a numbers:");
	    int a=s.nextInt();
	    boolean ispower=(a>0&&(a&(a-1))==0);
	    
	    
	    System.out.printf(" power:");
		System.out.println(ispower);
	}
}
