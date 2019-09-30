package com.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnectionDemo {

    public static void main(String[] args) throws IOException {
        //Load properties file and get DB details
        String fileName="application.properties";
        DBDetails dbDetails = DBUtils.loadPropertiesFile (fileName);
        //getConnection  by passing db details
        Connection con = DBUtils.getConnection ( dbDetails );

        //Get student list by passing student query, connection
        String selectStudentsQuery="select * from school";
        List<Student> students = getStudentList ( con ,selectStudentsQuery);
        System.out.println (students);
    }

    private static List<Student> getStudentList(Connection con,String query) {
        try (Statement st = con.createStatement ();
             ResultSet rs = st.executeQuery (query )
        ) {
            List<Student> students = new ArrayList<> ();
            while (rs.next ()) {
                Integer studentId = rs.getInt ( "student_id" );
                String studentName = rs.getString ( "student_name" );
                students.add ( new Student ( studentId, studentName ) );
            }
            return students;

        } catch (Exception e) {
            throw new RuntimeException ( "Unable to find data from resultSet exception:" + e.getMessage () );
        }
    }
}
