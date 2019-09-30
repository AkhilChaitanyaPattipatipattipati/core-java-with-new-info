package com.forloop.model;

public class Students {
    int id;
    String name;
    double rollno;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    public Students(int id, String name, double rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRollno() {
        return rollno;
    }

    public void setRollno(double rollno) {
        this.rollno = rollno;
    }


}
