package JDBC_DELETE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_data_jdbc {
        public static void main(String[] args) throws ClassNotFoundException {

            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password = "Putul2003@";
            String query = "DELETE FROM employees where id = 3;";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Drivers loaded sucessfully");
            }catch (ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
            try{
                Connection con = DriverManager.getConnection(url, username, password);
                System.out.println("connection establish successfully ! !");
                Statement st = con.createStatement();

                int rowsaffected = st.executeUpdate(query);
                if(rowsaffected > 0){
                    System.out.println("deletion successful "+rowsaffected+ "row(S) affected.");
                }else{
                    System.out.println("deletion failed!!");
                }

                st.close();
                con.close();
                System.out.println();
                System.out.println("connection close sucessfully!!");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }


