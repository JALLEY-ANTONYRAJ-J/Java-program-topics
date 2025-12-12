/* Three friends eat at a restaurant and get a single bill. They want to split the total bill equally.
 The program calculates how much each friend must pay.
Total Bill: 1500   Each Friend Pays: 500

*/


import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.printf("Enter a total bill: ");
        int total_bill=s.nextInt();

        int each_friend_pays=total_bill/3;
        
        System.out.printf("each friend pays: "+each_friend_pays);
    }
}