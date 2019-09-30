package com.forloop.example;

import com.forloop.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample {
    public static void main(String[] args) {
        List<Employee> e= prepareEmployeeList();
        removeElemetsByIndex ( e,2 );
    }

   public static void removeElemetsByIndex(List<Employee> emp, int index){
       for (int i =0; i< emp.size (); i++) {
           if(i==index){
               emp.remove ( emp.get ( i ) );
               System.out.println (emp);
           }
       }
       System.out.println(emp);
   }
    private static List<Employee> prepareEmployeeList() {
        List<Employee> data=new ArrayList<>();
        data.add(new Employee(10,"ranga",1000));
        data.add(new Employee(11,"raju",2000));
        data.add(new Employee(12,"kiran",3000));
        data.add(new Employee(13,"kumar",4000));
        return data;
    }
}
