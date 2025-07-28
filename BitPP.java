import java.util.Scanner;

public class BitPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            String s = sc.next();
            if(s.charAt(0)=='+' || s.charAt(2)=='+'){
                ans++;
            }
            else if(s.charAt(0)=='-' || s.charAt(2)=='-'){
                ans--;
            }
        }
        System.out.println(ans);
    }
}

// for eg :

// ip: 2
//     X++
//     --X
// op: 0


