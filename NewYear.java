import java.util.*;

public class NewYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();

        int[] arr = { x1, x2, x3 };
        Arrays.sort(arr);
        int median = arr[1];

        int min_distance = Math.abs(arr[0]-median)+ Math.abs(arr[1]-median) +Math.abs(arr[2]-median);
        System.out.println(min_distance);
    }
}

// find the median then use formula like |x1-median| + |x2 - median| + |x3 - median|