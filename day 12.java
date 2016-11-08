// Task 
// You are given two classes, 'Person' and 'Student', where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

// Complete the Student class by writing the following:

// A Student class constructor, which has 4 parameters:
// A string, 'firstName'.
// A string, 'lastName'.
// An integer, 'id'.
// An integer array (or vector) of test scores, scores.
// A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:

// Grading scale
// Letter Average(a)
// O 		90<=a<=100
// E 		80<=a<90
// A 		70<=a<80
// P 		55<=a<70
// D 		40<=a<55
// T 		a<40

// Input Format

// The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It also calls the calculate method (which takes no arguments).

// You are not responsible for reading the following input from stdin: 
// The first line contains 'firstName', 'lastName', and 'id', respectively. The second line contains the number of test scores. The third line of space-separated integers describes 'score'.

// Constraints
// 4<= 'firstName', 'lastName' <= 10
// |id| = 7
// 0<= score, average<=100.

// Output Format

// This is handled by the locked stub code in your editor. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

// Sample Input

// Heraldo Memelli 8135627
// 2
// 100 80
// Sample Output

// Name: Memelli, Heraldo
// ID: 8135627
// Grade: O

// Explanation

// This student had 2 scores to average: 100 and 80. The student's average grade is 90. An average grade of  corresponds to the letter grade 'O', so our calculate() method should return the character'O'.
// --

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    private int studentId;
    private int sum=0;
    private int result=0;
    // parameterized constructor
    Student(String firstName, String lastName, int idNumber, int[] testScores){
        super(firstName, lastName, idNumber);
        this.studentId = idNumber;
        this.testScores = testScores;
    }
    // calculate
    String calculate(){
        String strLetter="";
        for(int i=0; i<testScores.length; i++){
            sum += testScores[i];
        }
        result = (sum/testScores.length);
        if(result>=90 && result <=100){
            strLetter = "O";
        } else if (result>=80 && result <90){
            strLetter = "E";
        } else if (result>=70 && result <80){
            strLetter = "A";
        } else if (result>=55 && result <70){
            strLetter = "P";
        } else if (result>=40 && result <55){
            strLetter = "D";
        } else if (result <40){
            strLetter = "T";
        } 
        return strLetter;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}