# 🪑 Online Furniture Shopping Application

This is a Java-based desktop application developed using **Java Swing**, **MySQL**, and **JDBC**, XAMPP Server designed to provide a smooth shopping experience for users to browse, search, and purchase furniture products. The application is built in **NetBeans IDE** and features a clean and user-friendly interface.

## ✨ Key Features

- Developed an interactive UI using **Java Swing** for seamless user experience.
- Integrated **MySQL** database via **JDBC** for efficient management of products, orders, and customer data.
- Implemented key functionalities such as:
  - Product search and filtering
  - Add to cart and checkout system
  - Secure customer management
- Optimized database performance for smooth communication between front-end and back-end systems.

## 🛠️ Technologies Used

- **Java**
- **Java Swing** (UI Components)
- **JDBC** (Java Database Connectivity)
- **MySQL** (Database)
- **XAMPP** (Server)
- **NetBeans IDE**


## 🔌 JDBC Connectivity Steps

Follow the steps below to set up JDBC connectivity between Java and MySQL:

1. Import JDBC Packages
import java.sql.*;'

2. Load and Register the JDBC Driver
   Class.forName("com.mysql.cj.jdbc.Driver");
   
3. Establish the Connection
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");

4. Create a Statement
   Statement stmt = con.createStatement();
   
5. Execute the Query
  ResultSet rs = stmt.executeQuery("SELECT * FROM your_table_name");

6. Process the Result
   while(rs.next()) {
    System.out.println(rs.getString("column_name"));
}

7. Close the Connection
  rs.close();
  stmt.close();
 con.close();
