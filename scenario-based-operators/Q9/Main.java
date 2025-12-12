/* A person deposits money in the bank. Using the formula SI = (P × R × T) / 100,
 the program computes simple interest.
P: 5000  R: 5  T: 2   Simple Interest: 500.0

*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter p: ");
        int p=s.nextInt();
        System.out.printf("Enter  r: ");
        int r=s.nextInt();
        System.out.printf("Enter  t: ");
        int t=s.nextInt();

        double si=(p*r*t)/100;
        System.out.println("Simple Interest "+si);

        
    }
}
