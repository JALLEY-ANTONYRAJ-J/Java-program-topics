/* Q2.Java Program to check grade of a student based on marks (A, B, Java, Fail)

*/


import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter p: "); 
        int marks=s.nextInt();
        int grade=0;
        if(marks>=90){
            grade=1;
        }else if(marks>=80 && marks<90){
            grade=2;
        }else if(marks>=60 && marks<80){
            grade=3;
        }else if(marks>0 && marks<50){
            grade=4;
        }
        switch (grade) {
            case 1:
                System.out.println("A");
                break;
                case 2:
                    System.out.println("B");
                    break;
                    case 3:
                        System.out.println("C");
                        break;
                        case 4:
                            System.out.println("FAIL");
    
        }
        

    

        
    }
}
