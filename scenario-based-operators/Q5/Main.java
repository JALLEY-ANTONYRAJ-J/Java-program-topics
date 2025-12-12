/* A fitness trainer tracks running distances in meters. 
Athletes give distance in kilometers, so the program converts km → meters.

KM: 3   Meters: 3000

*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter KM : ");
        int km=s.nextInt();
        // System.out.printf("Enter a time (hr): ");
        // int time=s.nextInt();

        int meters=km*1000;
        System.out.println("Meters: "+meters);

        
    }
}