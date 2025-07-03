import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewEmployee {

    public static void main(String[] args) {

        Connection conn = DBConnection.getConnection();

        String sql = "SELECT * FROM employee";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                double salary = rs.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Salary: " + salary);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}