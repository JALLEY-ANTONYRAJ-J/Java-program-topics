/******************************************************************************

An ATM dispenses money in ₹2000, ₹500, and ₹100 notes. For a given amount,
calculate the number of each note required (highest denomination first).
Amount: 3700      2000 Notes: 1500 Notes: 3100 Notes: 2

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter Amount: ");
        int Amount=s.nextInt();
        
        int case1=Amount/2000;
        int remiming1=Amount%2000;
        
        int case2=remiming1/500;
        int remiming2=remiming1%1500;
        
        int case3=remiming2/100;
        

        System.out.println("2000 Notes: "+case1);
        System.out.println("500 Notes: "+case2);
        System.out.println("100 Notes: "+case3);

        
    }
}