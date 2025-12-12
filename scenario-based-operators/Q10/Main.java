/* A company calculates employee salary using: Basic + HRA + Allowance.
The program must compute the total salary
Basic: 20000 HRA: 5000  Allowance: 3000         Total Salary: 28000

*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter basic: ");
        int basic=s.nextInt();
        System.out.printf("Enter  HRA: ");
        int hra=s.nextInt();
        System.out.printf("Enter  Allowance: ");
        int Allowance=s.nextInt();

        int Total_salary=basic+hra+Allowance;
        System.out.println("Total_salary "+Total_salary);

        
    }
}