/*Q3.Java Program to check whether the given day number (1–7) is a weekday or weekend */

import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.printf("Enter a Day: ");
        int day=sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                System.out.println("Weekday");
                break;
                case 2:
                    System.out.println("Tuesday");
                     System.out.println("Weekday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                         System.out.println("Weekday");
                        break;
                        case 4:
                            System.out.println("Thrusday");
                             System.out.println("Weekday");
                            break;
                            case 5:
                                System.out.println("Friday");
                                 System.out.println("Weekday");
                                break;
                                case 6:
                                     System.out.println("Saturday");
                                      System.out.println("Weekend");
                                      break;
                                      case 7:
                                       System.out.println("Sunday");
                                        System.out.println("Weekend");
                                        break;
                                        default:
                                             System.out.println("invaild input");
        }


    }
    
}
