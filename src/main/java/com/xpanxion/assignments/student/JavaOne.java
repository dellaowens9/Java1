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

        String userInput;
        String inputString = "";  
        Scanner console = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        userInput = console.nextLine().toLowerCase(); 
        inputString = userInput; 
        userInput.split(""); 
        

        int count = 0; 
        int constanceCount = 0; 
        while (true){
            if (inputString.equals("quit")){
                break; 
            }
           
            for (int i = 0; i < userInput.length(); i++){
                char letter = userInput.charAt(i); 
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                count+= 1;
                }
                else if (letter == '.' || letter == ' '){
                    continue;  
                }
                else{
                    constanceCount += 1;
                }
            }
        
        System.out.println("Number of vowels: " + count); 
        System.out.println("Number of contants: " + constanceCount);
        
        count = 0; 
        constanceCount = 0; 
        inputString = "";  
        System.out.print("Enter a string: ");
        userInput = console.nextLine().toLowerCase(); 
        inputString = userInput; 
        userInput.split("");         
        }
    }

    public void ex6() {
        int userInputA, userInputB;
        Scanner console = new Scanner(System.in); 
        System.out.print("Enter number A: ");
        userInputA = console.nextInt(); 

        System.out.print("Enter number B: ");
        userInputB = console.nextInt(); 

        int total = userInputA + userInputB; 

        System.out.println("Total: " + total);  
    }

    public void ex7() {
        int userInputA, userInputB;
        int total = 0; 
        Scanner console = new Scanner(System.in); 
        Scanner stringConsole = new Scanner(System.in); 
        System.out.print("Enter number A: ");
        userInputA = console.nextInt(); 

        System.out.print("Enter number B: ");
        userInputB = console.nextInt(); 

        String calcMethod; 
        System.out.print("Enter operation (add, sub, mul, div): "); 
        calcMethod = stringConsole.nextLine(); 

        if (calcMethod.equals("add")){
            total = userInputA + userInputB; 
            System.out.println("Result: " + total);
        }
        else if (calcMethod.equals("div")){
            total = userInputA / userInputB; 
            System.out.println("Result: " + total); 
        }
        else if (calcMethod.equals("sub")){
            total = userInputA - userInputB; 
            System.out.println("Result: " + total); 
        }
        else if (calcMethod.equals("mul")){
            total = userInputA * userInputB; 
            System.out.println("Result: " + total); 
        }

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
