package Prepared_Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prepared_State_Schooldb {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school_db";
        String username = "root";
        String password = "Putul2003@";

        try {
            // 1. Connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to School Database!");

            // ================= INSERT =================
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO students VALUES (?, ?, ?, ?, ?)");

            // Student 1
            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setString(3, "A+");
            ps.setString(4, "Delhi");
            ps.setString(5, "10th");
            ps.executeUpdate();

            // Student 2
            ps.setInt(1, 2);
            ps.setString(2, "Priya");
            ps.setString(3, "B+");
            ps.setString(4, "Mumbai");
            ps.setString(5, "9th");
            ps.executeUpdate();

            // Student 3
            ps.setInt(1, 3);
            ps.setString(2, "Amit");
            ps.setString(3, "O+");
            ps.setString(4, "Kolkata");
            ps.setString(5, "8th");
            ps.executeUpdate();

            // Student 4
            ps.setInt(1, 4);
            ps.setString(2, "Sneha");
            ps.setString(3, "AB+");
            ps.setString(4, "Chennai");
            ps.setString(5, "10th");
            ps.executeUpdate();

            // Student 5
            ps.setInt(1, 5);
            ps.setString(2, "Vikas");
            ps.setString(3, "A-");
            ps.setString(4, "Patna");
            ps.setString(5, "7th");
            ps.executeUpdate();

            System.out.println("5 Students Inserted Successfully!");

            // ================= SELECT =================
            PreparedStatement selectPs = con.prepareStatement("SELECT * FROM students");
            ResultSet rs = selectPs.executeQuery();

            System.out.println("\nStudents Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("blood_group") + " | " +
                                rs.getString("address") + " | " +
                                rs.getString("class")
                );
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

