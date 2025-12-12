/* A student measures experiment time in minutes but needs the time in seconds. The program should convert minutes into seconds.
Minutes: 5   Seconds: 300


*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter a minutes: ");
        int minutes=s.nextInt();

        int second=minutes*60;
        
        System.out.printf("seconds: "+second);
    }
}
