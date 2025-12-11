import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Address: ");
        String l1 = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter Pincode: ");
        int pin = sc.nextInt();

        System.out.println("Address:"+l1 + "\n"  +"City:"+ city + "\n" +"State:"+ state + "\n" + "Pincode:"+pin);
    }
}
