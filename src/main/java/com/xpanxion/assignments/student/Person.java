package com.xpanxion.assignments.student;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    int id;
    String firstName;
    String lastName; 

    public Person() {}; 

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
        var bestList = new ArrayList<Person>(); 
        Person personA = new Person(1, "John", "Smith"); 
        personA.PersonList(personA);
    }
    
}
