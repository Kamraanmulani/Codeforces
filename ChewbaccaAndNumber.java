// import java.util.Scanner;

// public class ChewbaccaAndNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String number = sc.next();

//         StringBuilder result = new StringBuilder();

//         // Process each digit one by one
//         for (int i = 0; i < number.length(); i++) {

//             // Step 1: Get the character at position i
//             char digitChar = number.charAt(i);

//             // Step 2: Convert character to integer
//             int digit = digitChar - '0';

//             // Step 3: Apply the logic
//             if (i == 0 && digit == 9) {
//                 // Special case: first digit is 9, don't invert
//                 result.append(digit);
//             } else if (digit >= 5) {
//                 // Invert the digit (make it smaller)
//                 int inverted = 9 - digit;
//                 result.append(inverted);
//             } else {
//                 // Keep original digit (it's already small)
//                 result.append(digit);
//             }
//         }

//         System.out.println(result.toString());
//     }
// }

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        char[] digits = n.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            int digit = digits[i] - '0';
            if(i==-0 && digit ==9){
                list.add(digit);
            }else if (digit >= 5) {
                int inv = 9 - digit;
                list.add(inv);
            }else {
                list.add(digit);
            }
        }
         // Convert list to string
        StringBuilder result = new StringBuilder();
        for (int num : list) {
            result.append(num);
        }

        System.out.println(result.toString()); // Return-style output
    }
}
