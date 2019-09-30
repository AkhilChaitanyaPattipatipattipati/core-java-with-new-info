package com.scenorio;

import com.jdbc.Student;

public class EqulatsMethodExamples {

    public static void main(String[] args) {
        Student s1= new Student ( 1,"Akhil");
        Student s2= new Student ( 2,"Madhavi");
        Student s3=new Student (3, "venkat");
        Student s4=s1;

        System.out.println (s1.equals ( s2 ));
        System.out.println (s2.equals ( s3 ));
        System.out.println (s4.equals ( s1 ));
    }
}
