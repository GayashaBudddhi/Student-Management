/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spot_Test_Manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author prakashakarshana
 */
public class datainsert {
 
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
static final String DB_URL = "jdbc:mysql://localhost:8889/studentDetails";

// Database credentials
static final String USER = "itp";
static final String PASS = "1234";

public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
   
   

    try {
        // STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // STEP 3: Open a connection
        System.out.print("\nConnecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println(" SUCCESS!\n");

        // STEP 4: Ask for user input
      

        // STEP 5: Excute query
        System.out.print("\nInserting records into table...");
        stmt = conn.createStatement();

        String sql = "INSERT INTO student" +
            "VALUES (course_code, course_desc, course_chair)";
        stmt.executeUpdate(sql);

        System.out.println(" SUCCESS!\n");

    } catch(SQLException se) {
        se.printStackTrace();
    } catch(Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if(stmt != null)
                conn.close();
        } catch(SQLException se) {
        }
        try {
            if(conn != null)
                conn.close();
        } catch(SQLException se) {
            se.printStackTrace();
        }
    }
    System.out.println("Thank you for your patronage!");
  }
    }
