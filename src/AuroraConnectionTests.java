package com.wasi.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AuroraConnectionTests {
    public static void main(String[] args) {
        // Connecting to the default database postgres
        String url = "jdbc:postgresql://aurorapostgresstack-aurorapostgresclusterfe4b644f-rhubqmahf4a5.cluster-cxmjznzz7qrx.us-east-1.rds.amazonaws.com:5432/postgres?sslmode=require";
        String password = "YSNp8yt4XxIp7uwyzVXTnVpkDMLKzTke";
        String username = "wasi";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful.");
            connection.close();
        } catch (Exception e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
// package com.example.test;

// import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.sql.Connection;
// import java.sql.SQLException;

// import javax.sql.DataSource;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
// public class AuroraConnectionTests {

//     @Autowired
//     private DataSource dataSource;

//     @Test
//     void testConnection() throws SQLException {
//         Connection connection = null;
//         try {
//             connection = dataSource.getConnection();
//             assertTrue(connection.isValid(5000));
//         } finally {
//             if (connection != null) {
//                 connection.close();
//             }
//         }
//     }
// }
