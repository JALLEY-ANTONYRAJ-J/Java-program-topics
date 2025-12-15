
/*Q2.Write a Java Program to check whether a person is eligible to vote (age ≥ 18) */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        int voter=0;
        
        if(age<18){
            voter=1;

    }else if(age<=18){
       voter=2;
    }
    
    switch(voter){
        case 1:
             System.out.println("Not eligible.");
             break;
             case 2:
                  System.out.println("eligible to vote.");
                  break;
                  default:
                  System.out.println("Enter valid age");
    }
    
   
}
}
