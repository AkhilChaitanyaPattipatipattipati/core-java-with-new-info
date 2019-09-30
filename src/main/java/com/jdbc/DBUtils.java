package com.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBUtils {
    public static DBDetails loadPropertiesFile(String fileName) throws IOException {
        String path = Thread.currentThread ().getContextClassLoader ().getResource ( "" ).getPath ();
        Properties properties = new Properties ();
        properties.load ( new FileInputStream ( path + fileName ) );
        return new DBDetails ( properties.getProperty ( "url" ),
                               properties.getProperty ( "userName" ),
                               properties.getProperty ( "password" ),
                               properties.getProperty ( "driverClass" )
        );

    }
    public static Connection getConnection(DBDetails dbDetails) {
        try {
            Class.forName ( dbDetails.getDriverClass () );
            Connection con = DriverManager
                    .getConnection ( dbDetails.getUrl (), dbDetails.getUserName (), dbDetails.getPassword () );
            return con;
        } catch (Exception e) {
            throw new RuntimeException ( e );
        }
    }
}
