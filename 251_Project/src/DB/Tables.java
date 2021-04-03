/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author robakhalil
 */
public class Tables {

    public static void main(String[] args)
    {
        
        System.out.println("Inserting values in Mysql database table!");
        Connection con = null;
        
        try{
        // (1) load  JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // (2) set the path for the database
        String ConnectionURL = "jdbc:mysql://localhost:3306/CatCareSystem";

        // (3) create connection
        con = DriverManager.getConnection(ConnectionURL,"root","roba1021") ;
        
        // (4) create statment object
        Statement st = con.createStatement();
        
        // (5) execute sql statment
        String sql = "CREATE TABLE CatBreeder " +
                   "(IDCatBreeder INTEGER not NULL(4) PRIMARY KEY, " +
                   " UserName VARCHAR(26), " + 
                   " Password VARCHAR(9), " +
                   " Email VARCHAR(9), " + 
                   " BirthDate VARCHAR(10), " +
                   " ImagePath VARCHAR(150))"; 
        
        System.out.println("tabl CatBreeder is created");
        
        st.executeUpdate(sql);
        
              sql = "CREATE TABLE Cat " +    //Table name persone
                   "(ID_Cat INTEGER not NULL(4) PRIMARY KEY, " +
                   " Name VARCHAR(25), " + 
                   " Age INTEGER , " +
                   " Gender INTEGER , " +
                   " Color VARCHAR(15), " + 
                   " phone INTEGER(10), " + 
                   " weight INTEGER(3), " + 
                   "IDCatBreeder INTEGER(4) constraints  fkId refrences CatBreeder(IDCatBreeder))";

        st.executeUpdate(sql);//execut

        System.out.println("tabl Cat is created");
        
        
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
