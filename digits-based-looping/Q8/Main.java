/* Q8. Write a java program to find the frequency of each digit in a given number. */
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long l = s.nextLong();

        l = Math.abs(l);

        for (int i = 0; i <= 9; i++) {
            int count = 0;
            long temp = l; 

            while (temp > 0) {
                int digit = (int)(temp % 10);
                if (digit == i) {
                    count++;
                }
                temp /= 10;
            }
            if (count > 0) {
                System.out.println(i + " occurred " + count + " times");
            }
        }
    }
}
