/*Q5.Write a Java Program to check whether a given year and month combination is valid and print the number of days 
//in that month (consider leap years for February).

Month must be between 1 and 12 → valid month

Days in month:

Jan, Mar, May, Jul, Aug, Oct, Dec → 31 days

Apr, Jun, Sep, Nov → 30 days

Feb → 28 days, 29 if leap year

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    
	    System.out.printf("Enter year : ");
	    int year=s.nextInt();
	     System.out.printf("Enter month : ");
	    int month=s.nextInt();
	    
	    
	    if(month<1 || month>12){
	        System.out.println("Invalid month");
	    }else{
	        int days;
	        switch(month){
	            case 1: case 3: case 5: case 7:
                case 8: case 10: case 12:
                    days=31;
                    break;
                     case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                    case 2:
                    if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
                        days = 29;
                    else
                        days = 28;
                    break;
                default:
                    days = 0;
	        }
	         System.out.println("Year " + year + ", Month " + month + " has " + days + " days");
	    }
	    
	    
	    
	     }
	     }
	
