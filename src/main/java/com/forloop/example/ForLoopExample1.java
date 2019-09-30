package com.forloop.example;

import com.forloop.model.Students;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample1 {
    public static void main(String[] args) {
        List<Students> data = prepareStudentsByList();
        removeElementsByindex(data,2);
    }

    public static  void removeElementsByindex(List<Students> data, int index){
        for(int i=0; i< data.size();i++){
            if(i==index){
                data.remove(data.get(i));

            }
        }
        System.out.println(data);
    }

    private static List<Students> prepareStudentsByList() {
        List<Students> data=new ArrayList<>();
        data.add(new Students(10,"ranga",1000));
        data.add(new Students(11,"raju",2000));
        data.add(new Students(12,"kiran",3000));
        data.add(new Students(13,"kumar",4000));
        return data;
    }
}