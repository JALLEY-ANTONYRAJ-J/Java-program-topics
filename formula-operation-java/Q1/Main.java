//find area of rectangle

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.printf("Enter len and bre:");
	    int len=s.nextInt();
	    int bre=s.nextInt();
	    
	    int tot=len*bre;
		System.out.println("area of rectangle:"+tot);
	}
}
