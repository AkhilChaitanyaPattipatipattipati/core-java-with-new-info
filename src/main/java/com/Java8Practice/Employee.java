package com.Java8Practice;

public class Employee {
    private int id;
    private int age;
    public Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
