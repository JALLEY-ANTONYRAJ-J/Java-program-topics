//print the last Number
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter N numbers:");
	    int a=s.nextInt();
	    int last=a%10;
	    
	    System.out.printf("Last digit:");
		System.out.println(last);
	}
}
