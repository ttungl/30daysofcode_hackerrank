// The absolute difference between two integers, a and b, is written as |a-b|. The maximum absolute difference between two integers in a set of positive integers, elements, is the largest absolute difference between any two integers in elements.

// The Difference class is started for you in the editor. It has a private integer array (elements) for storing N non-negative integers, and a public integer (maximumDifference) for storing the maximum absolute difference.

// Task 
// Complete the Difference class by writing the following:

// A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
// A computeDifference method that finds the maximum absolute difference between any 2 numbers in N and stores it in the  instance variable.
// Input Format

// You are not responsible for reading any input from stdin. The locked Solution class in your editor reads in 2 lines of input; the first line contains N, and the second line describes the elements array.

// Constraints
// 1<=N<=10
// 1<= elements[i]<=100, where 0<=i<=N-1

// Output Format

// You are not responsible for printing any output; the Solution class will print the value of the maximumDifference instance variable.

// Sample Input

// 3
// 1 2 5
// Sample Output

// 4

// --

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	// parameterized constructor
    public Difference(int [] arr){
        this.elements = arr;
    }

    public int computeDifference(){
        int max=0;
        for(int i=0; i<elements.length-1; i++){
            for(int j=i+1; j<elements.length; j++){
                int diffgap = Math.abs(elements[i]-elements[j]);
                if (diffgap > max){
                    max = diffgap;
                    
                }
            }
        }
        maximumDifference = max; 
        return maximumDifference;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}



