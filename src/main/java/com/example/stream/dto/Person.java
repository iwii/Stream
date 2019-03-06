package com.example.stream.dto;

import com.example.stream.enums.Gender;

import java.util.List;

public class Person {
    
    private String name;
    private String lastName;
    private int age;
    Gender gender;
    List<Address> address;

   public Person(String name, String lastName, int age, Gender gender, List<Address> address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
