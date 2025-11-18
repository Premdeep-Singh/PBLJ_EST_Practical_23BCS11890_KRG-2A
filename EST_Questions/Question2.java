/*
Develop a JDBC program that allows insertion of new books into a database and displays all records on the console.
*/

import java.sql.*;

public class Question2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bookdb";
        String user = "root"; 
        String password = "password"; 

        try {
            Class.forName("mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            
            String insertQuery = "INSERT INTO books (title, author, price) VALUES ('Java Programming', 'John Doe', 29.99)";
            // Statement stmt = conn.prepareStatement("INSERT INTO books VALUES (?, ?, ?)");
            // stmt.setString(1, "Java Programming");
            // stmt.setString(2, "John Doe");
            // stmt.setDouble(3, 29.99);
            // stmt.executeUpdate();
            
            stmt.executeUpdate(insertQuery);

            String selectQuery = "SELECT * FROM books";
            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println("-------------Books-------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                double price = rs.getDouble("price");
                System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Price: " + price);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
