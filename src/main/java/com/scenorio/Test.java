package com.scenorio;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //Problem
        //Here data is coming from table then i can represent like the way using customer list if columns are fixed in table
        Customer customer1 = new Customer ( 1, "ranga", "kurnool" );
        Customer customer2 = new Customer ( 2, "akhil", "prakasam" );
        List<Customer> customerList = new ArrayList<> ();
        customerList.add ( customer1 );
        customerList.add ( customer2 );

        customerList.forEach ( customer -> System.out.println (customer) );





        //Solution
        //The above  approach is not suitable if columns are changing dynamically
        //then we have to follow the below approach

        Map<String, Object> row1 = new LinkedHashMap<> ();
        row1.put ( "id", 1 );
        row1.put ( "name", "ranga" );
        row1.put ( "city", "kurnool" );

        Map<String, Object> row2 = new LinkedHashMap<> ();
        row2.put ( "id", 2 );
        row2.put ( "name", "akhil" );
        row2.put ( "city", "Ongole" );

        Map<String, Object> row3 = new LinkedHashMap<> ();
        row3.put ( "id", 4 );
        row3.put ( "name", "Kiran" );
        row3.put ( "city", "Bapatla" );

        Map<String, Object> row4 = new LinkedHashMap<> ();
        row4.put ( "id", 3 );
        row4.put ( "name", "Madhavi" );
        row4.put ( "city", "Gonasapudi" );

        List<Map<String, Object>> rows = new ArrayList<> ();
        rows.add ( row1 );
        rows.add ( row2 );
        rows.add ( row3 );
        rows.add ( row4 );
        // System.out.println (rows);
    }

}
