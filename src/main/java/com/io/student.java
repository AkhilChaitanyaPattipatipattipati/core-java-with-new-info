package com.io;

public class student {

    static  String address;
    public String name;
    public int rollNumber;

    public student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        student.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
