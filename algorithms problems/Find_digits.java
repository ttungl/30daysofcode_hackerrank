
// Given an integer, , traverse its digits (1,2,...,n) and determine how many digits evenly divide  (i.e.: count the number of times  divided by each digit i has a remainder of ). Print the number of evenly divisible digits.

// Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be counted (i.e.: for , the answer is ).

// Input Format

// The first line is an integer, , indicating the number of test cases. 
// The  subsequent lines each contain an integer, .

// Constraints 
 

// Output Format

// For every test case, count and print (on a new line) the number of digits in  that are able to evenly divide .

// Sample Input

// 2
// 12
// 1012
// Sample Output

// 2
// 3
// Explanation

// The number  is broken into two digits,  and . When  is divided by either of those digits, the calculation's remainder is ; thus, the number of evenly-divisible digits in  is .

// The number  is broken into four digits, , , , and .  is evenly divisible by its digits , , and , but it is not divisible by  as division by zero is undefined; thus, our count of evenly divisible digits is .


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt(); int count=0;
            String num = String.valueOf(n); // convert int to string
            for(int i = 0; i < num.length(); i++) {
                int j = Character.digit(num.charAt(i), 10); // separator
                if (j>0) count++;
            }
            System.out.println(count);
        }
    }
}