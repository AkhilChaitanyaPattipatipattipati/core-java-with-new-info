package com.Java8Practice;

public class Person {
    private int id;
    private String name;
    private String personType;
    public Person(int id, String name, String personType) {
        this.id = id;
        this.name = name;
        this.personType = personType;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPersonType() {
        return personType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personType='" + personType + '\'' +
                '}';
    }
}
