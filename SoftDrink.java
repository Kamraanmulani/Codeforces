// This winter is so cold in Nvodsk! A group of n friends decided to 
// buy k bottles of a soft drink called "Take-It-Light" to warm up a bit. 
// Each bottle has l milliliters of the drink. Also they bought c limes and 
// cut each of them into d slices. After that they found p grams of salt.

// To make a toast, each friend needs nl milliliters of the drink, 
// a slice of lime and np grams of salt. The friends want to make as many 
// toasts as they can, provided they all drink the same amount. How many
// toasts can each friend make?

// Input
// The first and only line contains positive integers n, k, l, c, d, p, nl, np, 
// not exceeding 1000 and no less than 1. The numbers are separated by exactly 
// one space.

// Output
// Print a single integer — the number of toasts each friend can make.

// Examples
// InputCopy
// 3 4 5 10 8 100 3 1
// OutputCopy
// 2

import java.util.*;

public class SoftDrink {
    public static void main(String[] args) {
        int n, k, l, c, d, p, nl, np;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl = sc.nextInt();
        np = sc.nextInt();

        int totalDrink = (k * l) / nl;
        int totalSlices = c * d;
        int totalSalt = p / np;

        int maxToasts = Math.min(Math.min(totalDrink, totalSlices), totalSalt) / n;
        System.out.println(maxToasts);
        sc.close();
    }
}