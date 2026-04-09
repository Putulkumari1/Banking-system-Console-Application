import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        //database url
        String url = "jdbc:mysql://localhost:3306/Students";

        //Database credential
        String username ="root";
        String password = "Putul2003@";

        //Establish the connection
        try(Connection connection = DriverManager.getConnection(url, username,password )){
            System.out.println("Connected to database");
            System.out.println(connection);
            //performs database operation here

        }catch (SQLException e){
            System.out.println("Connection failed : "+e.getMessage());
        }
    }
}
