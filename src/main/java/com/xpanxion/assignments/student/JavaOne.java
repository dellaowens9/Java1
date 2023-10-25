package com.xpanxion.assignments.student;
import java.util.Scanner; 


public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        String userInput; 
        Scanner console = new Scanner(System.in); 
        System.out.print("Enter a first and last name: ");

        userInput = console.nextLine(); 
        userInput = userInput.toUpperCase(); 

        System.out.println(userInput); 
    }

    public void ex2() {
        String test1 = "This is a Test"; 
        String test2 = "nothing to see here";

        test1.split(""); 
        test2.split(""); 

        int count = 0; 
        for (int i = 0; i < test1.length(); i++){
            char letter = test1.charAt(i); 
            if (letter >= 'A' && letter <='Z'){
                count+= 1;
            }
        }
        int count2 = 0; 
        for (int j = 0; j < test1.length(); j++){
            char letter = test2.charAt(j); 
            if (letter >= 'A' && letter <= 'Z'){
                count2 += 1; 
            }
        }

        System.out.println("Test 1: " + test1); 
        System.out.println("Number of uppercase letters: " + count);

        System.out.println("Test 2: " + test2);
        System.out.println("Number of uppercase letters: " + count2);
    }

    public void ex3() {
        String userInput; 
        Scanner console = new Scanner(System.in); 
        System.out.print("Enter a sentence ");
        userInput = console.nextLine(); 

        String []splitInput = userInput.split(" "); 

        for (int i = 0; i < splitInput.length; i++){
            if (i == 0 || i % 2 == 0){
                splitInput[i] = splitInput[i].toUpperCase(); 
            }
        }

        String finalString = ""; 

        for (int j = 0; j < splitInput.length; j++){
            finalString += splitInput[j] + " "; 
        }

        System.out.println(finalString); 
    }

    public void ex4() {
        StringBuilder word1 = new StringBuilder("racecar");
        StringBuilder rev1 = new StringBuilder(word1.reverse()); 
        String stringWord1 = word1.toString(); 
        System.out.println(stringWord1.equals(rev1.toString())); 

        StringBuilder word2 = new StringBuilder("cat");
        StringBuilder rev2 = new StringBuilder(word1.reverse()); 
        String stringWord2 = word2.toString(); 
        System.out.println(stringWord2.equals(rev2.toString())); 
       
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
