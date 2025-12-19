/******************************************************************************

Q4. Write a Java program to print English alphabets that lie between two given alphabets.

*******************************************************************************/
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         char ch1 = s.next().charAt(0);
//         char ch2 = s.next().charAt(0);

//         if (ch1 < ch2) {
//             for (char ch = (char)(ch1 + 1); ch < ch2; ch++) {
//                 System.out.println(ch1+" "+ch);
//             }
//         } else {
//             for (char ch = (char)(ch2 + 1); ch < ch1; ch++) {
//                 System.out.println(ch + " "+ch2);
//             }
//         }
//     }
// }


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char a = s.next().charAt(0);
        char b = s.next().charAt(0);

        int start = Math.min(a, b);
        int end   = Math.max(a, b);

        for (int i = start + 1; i < end; i++) {
            System.out.print((char)i + " ");
        }
    }
}

