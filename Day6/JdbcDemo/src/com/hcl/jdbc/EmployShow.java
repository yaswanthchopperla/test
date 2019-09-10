package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployShow {
  public static void main(String[] args) { 
    try { 
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = 
          DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpratice","root","root");
      //System.out.println("connected");
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select*from Employ");
      while (rs.next()) {  
        System.out.println("employ no " + rs.getInt("empno" ));
        System.out.println("employ name "+ rs.getString("name"));
        System.out.println("employ department "+ rs.getString("dept"));
        System.out.println("employ designation "+ rs.getString("desig"));
        System.out.println("employ basic "+ rs.getInt("basic"));
      }
      } catch (ClassNotFoundException e) { 
        e.printStackTrace();
      } catch (SQLException e) { 
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  }

}
