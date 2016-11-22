// https://www.hackerrank.com/challenges/30-generics
// day 21: Generics

import java.lang.reflect.Method;

class Solution {
	// generics applied
	public static <dataType> void printArray(dataType[] array){
        for(dataType element : array){
            System.out.println(element);    
        }   
    }

    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}