package com.collection.set;

public class Employee implements  Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee e2) {
        Employee e1=this;
        return   e1.id<e2.id ? -1 : e1.id==e2.id ? 0 : 1;
       /* if(e1.id<e2.id){
            return -1;
        }else if(e1.id==e2.id){
            return 0;
        }else{
            return +1;
        }*/
    }
}
