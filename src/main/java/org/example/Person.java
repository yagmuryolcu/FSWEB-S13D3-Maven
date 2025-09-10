package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    double height;
    String gender;
    String adress;

    public Person(String firstname, String lastName, int age) {
        this.firstname= firstname;
        this.lastName=lastName;
        this.age=age;

    }
    public Person (String firstname, String lastName, int age,String gender, String adress, double height){
        this(firstname,lastName,age);
        this.gender=gender;
        this.adress=adress;
        this.height=height;
    }

    public  String getFirstName() {
        return firstname;
    }
    public  String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;

    }
}
