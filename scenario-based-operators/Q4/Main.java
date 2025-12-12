/* A person drives at a constant speed. Given the speed (km/hr) and time (hr), the program 
must calculate the distance travelled using: distance = speed × time.
Speed: 60  Time: 2    Distance: 120 km

*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter a speed  (km/hr): ");
        int speed=s.nextInt();
        System.out.printf("Enter a time (hr): ");
        int time=s.nextInt();

        int distance=speed*time;
        
        System.out.printf("Distance: "+distance+"km");
    }
}
