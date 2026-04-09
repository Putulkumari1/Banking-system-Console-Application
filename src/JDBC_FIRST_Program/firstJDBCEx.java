package JDBC_FIRST_Program;
import java.sql.*;
public class firstJDBCEx {
    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Putul2003@";
        String query = "Select * from employees;";

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
            //here are we can use executeQuery method and print query and check how many rows are affected
            //whenever we retriev data that time we use executeQuery
           ResultSet rs = st.executeQuery(query);
           while(rs.next()){
               int id = rs.getInt("id");
               String name = rs.getString("name");
               String job_title = rs.getString("job_title");
               double salary = rs.getDouble("salary");
               System.out.println();
               System.out.println("===========================");
               System.out.println("ID: "+id);
               System.out.println("Name: "+name);
               System.out.println("Job Title: "+job_title);
               System.out.println("Salary: "+salary);

           }
           rs.close();
           st.close();
           con.close();
            System.out.println();
            System.out.println("connection close sucessfully");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }
}