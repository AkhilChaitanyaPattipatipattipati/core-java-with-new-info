package com.jdbc;

public class DBDetails {
    private String url;
    private String userName;
    private String password;
    private String driverClass;

    public DBDetails(String url, String userName, String password, String driverClass) {
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDriverClass() {
        return driverClass;
    }
}
