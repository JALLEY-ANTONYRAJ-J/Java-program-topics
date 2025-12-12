/* A teacher distributes candies equally among students. 
The program finds how many candies each student gets and how many remain undistributed.
Candies: 50  Students: 6 Each Gets: 8  Remaining: 2

*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter candies : ");
        int candies=s.nextInt();
        System.out.printf("Enter  total students : ");
        int student=s.nextInt();

        int each_gets=candies/student;
        int Remaining=candies%student;
        System.out.println("each_gets: "+each_gets);
        System.out.println("Remming: "+Remaining);

        
    }
}
