// Alice and Bob play the following game:

// They choose a permutation of the first  numbers to begin with.
// They play alternately and Alice plays first.
// In a turn, they can remove any one remaining number from the permutation.
// The game ends when the remaining numbers form an increasing sequence. The person who played the last turn (after which the sequence becomes increasing) wins the game.
// Assuming both play optimally, who wins the game?

// Input Format

// The first line contains the number of test cases .  test cases follow. Each case contains an integer on the first line, followed by a permutation of the integers  on the second line.

// Constraints

 
// The permutation will not be an increasing sequence initially.
// Output Format

// Output  lines, one for each test case, containing "Alice" if Alice wins the game and "Bob" otherwise.

// Sample Input

// 2
// 3
// 1 3 2
// 5
// 5 3 2 1 4

// Sample Output

// Alice
// Bob

// Explanation

// For the first example, Alice can remove the  or the  to make the sequence increasing and wins the game. 

// For the second example, if  is removed then the only way to have an increasing sequence is to only have  number left, which would take a total of  moves, thus allowing Bob to win. On the first move if Alice removes the , it will take  more moves to create an increasing sequence thus Bob wins. If Alice does not remove the , then Bob can remove it on his next turn since Alice can not win in one move.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // read input
    public static Scanner scan = new Scanner(System.in);
    public static int nextInput(){
        return scan.nextInt();
    }
    
    // check the increasing sequence
    public static boolean isIncreasing(int[] a){
        int last=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                if(last>a[i]) return false;
                last = a[i];
            }
        }
        return true;
    }
    
    // hashcode
    public static long hashCode(int[] a){
        long result =0;
        for(int i=0; i<a.length; i++){
            result = (result<<4) + a[i];
        }
        return result;
    }
    
    //check the winner
    public static boolean aliceWins(int[] a, Map<Long, Boolean> map){
        long h= hashCode(a);
        int temp;
        if(map.containsKey(h)) return true;
        
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                temp = a[i];
                a[i]=0;
                if(isIncreasing(a)){
                    map.put(h, true);
                    a[i] = temp;
                    return true;
                }
                if(!aliceWins(a, map)){
                    map.put(h, true);
                    a[i]=temp;
                    return true;
                }
                a[i]=temp;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // read the next input
        int t = nextInput();
        //for(int i=0; i<t.Length(); i++){
        for(int i=0; i<t; i++){
            int n = nextInput();
            // create a hashmap <key, val>
            Map<Long, Boolean> map = new HashMap<Long, Boolean>();
            int [] numbers = new int[n];
            for(int j=0; j<n; j++){
                numbers[j] = nextInput();
            }
            if(aliceWins(numbers, map)) 
                System.out.println("Alice");
            else System.out.println("Bob");
        }
    }
}