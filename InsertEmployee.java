
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Connection conn = DBConnection.getConnection();

        String sql = "INSERT INTO employee (name, email, salary) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDouble(3, salary);

            int rowsInserted = ps.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Employee inserted successfully.");
            } else {
                System.out.println("Insert failed.");
            }

            ps.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
