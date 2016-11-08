// Task 
// Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

// Input Format

// There are 6 lines of input, where each line contains 6 space-separated 
// integers describing 2D Array ; every value in A will be in the inclusive 
// range of -9 to 9.

// Constraints
// -9<=A[i][j]<=9
// 0<=i,j<=5

// Output Format

// Print the largest (maximum) hourglass sum found in A.

// Sample Input

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0

// Sample Output

// 19

// Explanation

//  contains the following hourglasses:

// 1 1 1   1 1 0   1 0 0   0 0 0
//   1       0       0       0
// 1 1 1   1 1 0   1 0 0   0 0 0

// 0 1 0   1 0 0   0 0 0   0 0 0
//   1       1       0       0
// 0 0 2   0 2 4   2 4 4   4 4 0

// 1 1 1   1 1 0   1 0 0   0 0 0
//   0       2       4       4
// 0 0 0   0 0 2   0 2 0   2 0 0

// 0 0 2   0 2 4   2 4 4   4 4 0
//   0       0       2       0
// 0 0 1   0 1 2   1 2 4   2 4 0
// The hourglass with the maximum sum (19) is:

// 2 4 4
//   2
// 1 2 4



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int [] maxNum = new int[16];
        int max = 0;
        int temp = 0;
        int count=0; 
        int count1=0;
        
        int [] myArr = {1,1,1,0,1,0,1,1,1}; 
        for(int i=0; i<4; i++){ //row
            for(int j=0; j<4; j++){ //col
                for(int k=i; k<=(i+2); k++){//row
                    for(int h=j; h<=(j+2); h++){//col
                        temp += arr[k][h]*myArr[count++];
                    }
                }
                maxNum[count1++] = temp;
                temp=0;
                count=0;
            }
        }
        
        int largestSum = maxNum[0];
        for (int i=0; i<16; i++){
            if (maxNum[i]>largestSum){
                largestSum=maxNum[i];
            }
        }
        
        
        System.out.println(largestSum);
    }
}
