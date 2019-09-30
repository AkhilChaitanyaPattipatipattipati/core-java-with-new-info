package com.ploymorphism;

public class Connection  {
    public static  Connection getConnection(String driverclass){
        if(driverclass.equalsIgnoreCase("MYSQL")){
            return new MySqlConnection ( "mysqlConnection");
        }else if(driverclass.equalsIgnoreCase("ORACLE")){
            return new OracleConnection ( "oracle connection");
        }else if(driverclass.equalsIgnoreCase("SQLSERVER")){
            Connection con= new SQLServerConnection("SqlServer connection");
            return con;
        }else{
            return null;
        }
    }
    @Override
    public String toString(){
        return "connection class toString method";
    }
}
