package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double weight;
    int height;
    boolean hasCat;


    public Person(String firstName , String lastName , int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName , String lastName , int age , double weight , int height , boolean hasCat){
        this(firstName,lastName,age);
        this.weight = weight;
        this.height = height;
        this.hasCat = hasCat;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;
    }
}



