package Insert_Data_intoDB;

import java.sql.*;
public class InsertJDBC {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Putul2003@";
        String query = "INSERT INTO employees(id, name, job_title,salary) VALUES(5,'puja','Data Analyst', 78000.0);";

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

           // here we can use executeUpdate after that print query
            //whenever we want update , insert or delete data that time we can use updateQuery

            int rowsaffected = st.executeUpdate(query);
           if(rowsaffected > 0){
               System.out.println("Insert successful "+rowsaffected+ "row(S) affected.");
           }else{
               System.out.println("Insertion failed!!");
           }

            st.close();
            con.close();
            System.out.println();
            System.out.println("connection close sucessfully");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
