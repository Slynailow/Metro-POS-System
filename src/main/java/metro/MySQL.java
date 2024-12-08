
package com.mycompany.metrosystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQL {
    public static final String driver = "com.mysql.cj.jdbc.Driver";
    private String url;
    private String username;
    private String password;
    private Connection conn;

    public MySQL() {
        String hostname = "1n-kn.h.filess.io";
        String database = "Metro_obtainare";
        String port = "3307";
        String username = "Metro_obtainare";
        String password = "0b0cb3dbec8a6597b3406bae44ea54138e90cb69";

        this.username = username;
        this.password = password;

        this.url = String.format("jdbc:mysql://%s:%s/%s", hostname, port, database);
    }

    /**
     * Prepares the things for the connection.
     * @param hostname
     * @param database
     * @param port
     * @param username
     * @param password
     */
    public MySQL(String hostname, String database, String port, String username, String password) {
        this.username = username;
        this.password = password;

        this.url = String.format("jdbc:mysql://%s:%s/%s", hostname, port, database);
    }

    public Connection connect() throws ClassNotFoundException, SQLException {

        Class.forName(MySQL.driver);
        conn = DriverManager.getConnection(url, username, password);

        return conn;
    }

    public static void main(String[] args) {
        String hostname = "1n-kn.h.filess.io";
        String database = "Metro_obtainare";
        String port = "3307";
        String username = "Metro_obtainare";
        String password = "0b0cb3dbec8a6597b3406bae44ea54138e90cb69";

        MySQL mysql = new MySQL(hostname, database, port, username, password);
        try {
    Connection conn = mysql.connect();
    System.out.println(String.format("Connected: %b", !conn.isClosed()));

    ResultSet resultSet = conn.createStatement().executeQuery("SELECT 1+1");
    if (resultSet.next()) {
        System.out.println(String.format("Result of query: %s", resultSet.getInt(1)));
    }
} catch (SQLException e) {
    System.out.println("A MySQL error occurred. Check the query and connection settings.");
    e.printStackTrace();
} catch (ClassNotFoundException e) {
    System.out.println("MySQL driver not found. Ensure the dependency is included.");
    e.printStackTrace();
}

    }
}
