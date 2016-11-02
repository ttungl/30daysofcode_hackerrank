// Objective 
// Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

// Task 
// Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

// Note: 0 is considered to be an even index.

// Input Format

// The first line contains an integer, T (the number of test cases). 
// Each line i of the T subsequent lines contain a String, S.

// Constraints
// 1<=T<=100
// Output Format
// 2<=length_of_S<=10^4
// For each String S_j (where 0<=j<=(T-1)), print S_j's even-indexed characters, followed by a space, followed by S_j's odd-indexed characters.

// Sample Input

// 2
// Hacker
// Rank
// Sample Output

// Hce akr
// Rn ak



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static void printEvenOddIndexed(String str){
        char [] charArray = str.toCharArray();  // convert string to array
        int charLen = charArray.length;         // length of array (.length)
        int count1=0;
        int count2=0;
        // use StringBuffer
        StringBuffer strBuffEven = new StringBuffer();
        StringBuffer strBuffOdd = new StringBuffer();
        
        for (int i=0; i<charLen; i++){
            if (i%2==0){
                strBuffEven.append(charArray[i]);     
            } else {
                strBuffOdd.append(charArray[i]);
            }
        }
        System.out.println(strBuffEven+" "+strBuffOdd);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // new an instance
        int T = scan.nextInt();                 // number of testcases
        scan.nextLine();
        for (int i=0; i<T; i++){
            String str = scan.nextLine();
            printEvenOddIndexed(str);
        }
        scan.close(); // close the reading
    }
}