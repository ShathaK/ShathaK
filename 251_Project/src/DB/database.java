/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author robakhalil
 */
public class database {

    public static void main(String[] args) 
   {
        System.out.println("Database creation example!");
        Connection con = null;
       try
       {
        // (1) load  JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // (2) set the path for the database
        String ConnectionURL = "jdbc:mysql://localhost:3306";
            
        // (3) create connection
        con = DriverManager.getConnection(ConnectionURL,"root","roba1021") ;
        
        // (4) create statment object
        Statement st = con.createStatement();
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // (5) excute sql statment
        st.executeUpdate("CREATE DATABASE CatCareSystem");
        System.out.println("data base is created");
        // (6) close connection
        con.close();
        }
  
  
        catch (SQLException s){
         System.out.println("SQL statement is not executed!");
        }
 
        catch (Exception e){
          e.printStackTrace();
        }
 
    
}
    
}
