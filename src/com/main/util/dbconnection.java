/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.util;

/**
 *
 * @author omkar
 */
import java.sql.*;

public class dbconnection
{
    
    public static void main(String[] args) throws ClassNotFoundException
    {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4306/db_create1","root",""))
           {
               Statement stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery("select * from tbl_account1");
               while (rs.next())
                   System.out.println( rs.getString(1) + "  " + rs.getString(2)+ "  " + rs.getString(3)+ "  " + rs.getString(4)); 
                    
        }
       }
       
        catch (ClassNotFoundException | SQLException e)
        {
           System.out.println(e);
        }
    }

    public static Statement getConnection() {
        Statement stmt=null;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:4306/db_create1","root","");
           
            stmt    = con.createStatement();
             
       }
       
        catch (ClassNotFoundException | SQLException e)
        {
           System.out.println(e);
        
    }
        return stmt;
    }
    
}
