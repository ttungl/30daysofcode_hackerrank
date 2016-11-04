
// Task 
// Given an array, A, of N integers, print 's elements in reverse order as a single line of space-separated numbers.

// Input Format

// The first line contains an integer, N (the size of our array). 
// The second line contains N space-separated integers describing array 's elements.

// Constraints
// 1<=N<=10^3
// 1<=A_i<=10^4 
// , where A_i is the i^th integer in the array.
// Output Format

// Print the elements of array A in reverse order as a single line of space-separated numbers.

// Sample Input

// 4
// 1 4 3 2
// Sample Output

// 2 3 4 1

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        String result = "";
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();  
        }
        for(int i=(n-1); i>=0; i--){
            result+= arr[i]+" ";    
        }
        System.out.println(result);
        in.close();
    }
}
