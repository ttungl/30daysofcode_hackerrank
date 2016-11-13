// https://www.hackerrank.com/challenges/30-more-exceptions
// day 17: more exceptions

import java.util.*;
import java.io.*;

// Class: Calculator
// input: n and p
// output: n^p
// description: 
// - Validate the inputs n, p
//   + if n and p >=0: Compute n^p and return value.
//   + else: throw new Exception ("oh no!")
class Calculator{
    // instance variables
    private int n=0;
    private int p=0;
    
    // default constructor
    public Calculator(){}; 
    
    static int power(int n, int p) throws Exception{
        int result;
        if(n>=0 && p>=0){
            result = (int) Math.pow(n, p);
            return result;
        } else {
            throw new Exception("n and p should be non-negative");
        }
    }
}

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
