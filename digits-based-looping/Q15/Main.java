/******************************************************************************

 
 	
Q15. Write a java program to print each digit of a number in words.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	while(n!=0){
	    int digit=n%10;
	    
	    switch(digit){
	        case 0:
	            System.out.println("zero");
	            break;
	            case 1:
	            System.out.println("one");
	            break;
	            case 2:
	            System.out.println("two");
	            break;
	            case 3:
	            System.out.println("three");
	            break;
	            case 4:
	            System.out.println("four");
	            break;
	            case 5:
	            System.out.println("five");
	            break;
	            case 6:
	            System.out.println("six");
	            break;
	            case 7:
	            System.out.println("seven");
	            break;
	            case 8:
	            System.out.println("eight");
	            break;
	            case 9:
	            System.out.print("nine");
	            break;
	    }
	n/=10;
	}
	}
}
