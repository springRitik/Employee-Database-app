
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();

        Connection conn = DBConnection.getConnection();

        String sql = "DELETE FROM employee WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }

            ps.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}