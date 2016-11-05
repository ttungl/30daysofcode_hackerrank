// Recursive Method for Calculating Factorial 

// factorial(N) =  1                   if N<=1
//                 N*factorial(N-1)  , otherwise


// Task 
// Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! (N factorial).

// Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of 0.

// Input Format

// A single integer, N (the argument to pass to factorial).

// Constraints
// 2<=N<=12

// Output Format

// Print a single integer denoting N!.

// Sample Input
// 3

// Sample Output
// 6

// --

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int factorial(int n){
        int result;
        if (n==0){
            return 1;
        } else if(n<1){
            return -1;
        } else {
            result = n*factorial(n-1);
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = factorial(n);
        System.out.println(res);
    }
}