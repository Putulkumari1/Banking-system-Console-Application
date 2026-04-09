package TRANSACTION_ROLLBACK_COMMIT;
import java.sql.*;
public class TransactionExample {
    public static void main(String[] args) {
        Connection con = null;
        try {
            // 1. Connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school_db", "root", "Putul2003@");

            // 2. Disable auto-commit
            con.setAutoCommit(false);

            // 3. Prepare statements
            PreparedStatement debit = con.prepareStatement(
                    "UPDATE account SET balance = balance - ? WHERE id = ?");

            PreparedStatement credit = con.prepareStatement(
                    "UPDATE account SET balance = balance + ? WHERE id = ?");

            // 4. Debit from account A
            debit.setInt(1, 500);
            debit.setInt(2, 1);
            debit.executeUpdate();

            // 5. Credit to account B
            credit.setInt(1, 500);
            credit.setInt(2, 2);
            credit.executeUpdate();

            // 6. Commit if both succeed
            con.commit();

            System.out.println("Transaction Successful!");

        } catch (Exception e) {
            try {
                // 7. Rollback if error occurs
                if (con != null) {
                    con.rollback();
                }
                System.out.println("Transaction Failed! Rolled back.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true); // reset
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
