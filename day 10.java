// Task 
// Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

// Input Format

// A single integer, n.

// Constraints
// 1<=n<=10^6

// Output Format

// Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary representation of n.

// Sample Input 1
// 5

// Sample Output 1
// 1

// Sample Input 2
// 13

// Sample Output 2
// 2
// --


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = Integer.toBinaryString(n); // convert Integer to BinaryString
        char[] ch = str.toCharArray(); // split BinaryString into elements of an array
        
        int max=0; int count=0;
        int i=0;
        while (i<ch.length){
            if (ch[i]=='1') { // count 1's consecutive.
                count++;
            } else {
                count=0;
            }
            if (max<count){ // check max.
                max = count;
            }
            i++;
        }
        System.out.println(max);
    }
}