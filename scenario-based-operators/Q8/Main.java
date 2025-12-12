/* A bakery produces a fixed number of cakes every hour. Given cakes per hour and total hours,
 the program calculates total cakes made
Cakes/Hour: 10   Hours: 5   Total Cakes: 50

*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter Cakes: ");
        int cakes=s.nextInt();
        System.out.printf("Enter  total hours: ");
        int hours=s.nextInt();

        int total_cakes=cakes*hours;
        System.out.println("total cakes: "+total_cakes);

        
    }
}
