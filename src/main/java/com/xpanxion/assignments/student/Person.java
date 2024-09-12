package com.xpanxion.assignments.student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Person {

    int id;
    String firstName;
    String lastName; 



    public Person(int id, String firstName, String lastName){
        this.firstName = firstName; 
        this.id = id; 
        this.lastName = lastName; 
    }

    @Override
    public String toString(){
        return "Person{ " + id + "=" + ", fistName=" + firstName + ", lastName= " + lastName + "}"; 
    }

    public void PersonList(Person addPerson){
        var newPersonList = new ArrayList<Person>();
        int id; 
        String firstName = "";
        String lastName = "";
        String userInput = "";  
        
        
        while (true){
            Scanner console = new Scanner(System.in); 
            System.out.print("Enter Person: ");
            userInput = console.nextLine(); 
            if (userInput.equals("quit")){
                break; 
            }
            
        
            String userArr[] = userInput.split(" "); 
            firstName = userArr[1];
            lastName = userArr[2];
            id = Integer.parseInt(userArr[0]); 


            Person nextPerson = new Person(id, firstName, lastName); 
            newPersonList.add(nextPerson);
        } 

        for (Person elm : newPersonList){
                System.out.println(elm); 
            }
    }

    public static void main(String []args){
        
        HashMap<Integer, Person> personDictionary = new HashMap<Integer, Person>();
        var person1 = new Person(1, "Peter", "Jones"); 
        var person2 = new Person(2, "John", "Smith"); 
        var person3 = new Person(3, "Mary", "Jane"); 

        personDictionary.put(1, person1);
        personDictionary.put(2, person2);
        personDictionary.put(3, person3);

        int userInput; 
        Scanner console = new Scanner(System.in); 
        System.out.print("Enter Person ID: ");
        userInput = console.nextInt();

        var findPerson = personDictionary.get(userInput); 
        System.out.println(findPerson.toString()); 




    }
    
}
