package com.Learning.Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    private List<Person> people=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);

    public  Person readValue(){


        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter address:");
        String address=sc.nextLine();
        System.out.println("Enter Age");
        int age=sc.nextInt();
        System.out.println("Enter Phone-number");
        long phoneNumber=sc.nextLong();
        sc.nextLine(); // Consume the leftover newline
        return new Person(name,address,age,phoneNumber);

    }

    public void print(List<Person>personList){
        for(Person person:personList)
            person.print();


    }



    public void storeValue(Person person){

        this.people.add(person);


    }
    public static void main(String[] args) {

        Driver driver=new Driver();
        Person person=driver.readValue();
        Person person1=driver.readValue();
        Person person2=driver.readValue();

        driver.storeValue(person);
        driver.storeValue(person1);
        driver.storeValue(person2);

        driver.print(driver.people);


    }
}
