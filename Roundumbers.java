import java.util.*;
public class Roundumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int no1 = sc.nextInt();
        RO(no1);
    }
    public static int RO(int no){
        
        return 0;
    }
}





// For the input:
// 5
// 5009
// 7
// 9876
// 10000
// 10

// Let's break them down:
// 5009
// Digits: 5 (thousands), 0 (hundreds), 0 (tens), 9 (ones)
// Nonzero digits: 5 (thousands) → 5000, 9 (ones) → 9
// Answer:
// 2
// 5000 9
// 7
// Only one digit, already a round number.
// Answer:
// 1
// 7
// 9876
// Digits: 9 (thousands), 8 (hundreds), 7 (tens), 6 (ones)
// Nonzero digits: 9 (thousands) → 9000, 8 (hundreds) → 800, 7 (tens) → 70, 6 (ones) → 6
// Answer:
// 4
// 9000 800 70 6
// 10000
// Only one nonzero digit (1, ten-thousands), so only one round number.
// Answer:
// 1
// 10000
// 10
// Digits: 1 (tens) → 10, 0 (ones) can be ignored.
// Answer:
// 1
// 10
// So, output for each test case would be:
// text
// 2
// 5000 9
// 1
// 7
// 4
// 9000 800 70 6
// 1
// 10000
// 1
// 10