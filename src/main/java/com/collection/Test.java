package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int [] data=new int[]{1,2,3,3};
        //Arrays can hold homogenous objects only it cant allo hetorogeqnious objects
        Test t[]=new Test[3];
        t[0]=new Test();
       // t[1]=new ListUtils();

        //Arrays are fixed in size
        //Arrays dont have predeifined methods for adding a nd removing,replace
        data[0]=100;
       /* for (int k:data) {
            System.out.println(k);
        }*/
        //collectons can allow homogenious as well as hetorogenous objects
        //Array list internally following Dyanamic array only
       List l=new ArrayList<>();
        l.add(10);
        l.add("ranga");

        //Array list implemented based on object[] thats why it is allowing hetorogenious objects also
        Object[] objects=new Object[5];
        objects[0]=new Test();//
        objects[1]=new Integer(10);
        objects[2]=new Float(10.2f);
        objects[3]=new Float(10.2f);

        objects[4]=new Float(10.2f);

       // System.out.println(objects.length);

        //once it reached its capacity then he will create new object [] with currentcapacity*3/2+1 and copy data from old object[] and then delete old one
        /*Object[] newArray=new Object[8];
        int index=0;
        for(Object oldElement:objects){
            newArray[index]=oldElement;
            index++;
        }
        objects=null;
        newArray[index]=new Integer(10);
        */
       objects= Arrays.copyOf(objects,(objects.length*3/2)+1,Object[].class);
       // System.out.println(objects.length);
        objects[5]=new Integer(200);
        for(Object ele:objects){
            System.out.print(ele);
            System.out.print(" ---");
        }
    }
}
