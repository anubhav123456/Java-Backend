import java.sql.*;

public class DemoJDBC
{
    public static void main(String[] args) throws Exception
    {
        //1. Import the package

        //2. Load and Register Drivers
        Class.forName("org.postgresql.Driver");

        //3. Create Connection
        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "anu123";
        Connection connection = DriverManager.getConnection(url, username, password);

        System.out.println("Connected to PostgreSQL database");

        //4. Create Statement
        String query = "INSERT INTO public.\"Student\" (\"SID\", \"MARKS\", \"SNAME\") VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        int sid = 6;
        int marks = 10;
        String sname = "John Doe";

        preparedStatement.setInt(1, sid);           // SID
        preparedStatement.setInt(2, marks);          // Marks
        preparedStatement.setString(3, sname);   // SNAME

        //5. Execute Statement
        // Execute the insert statement
        int rowsInserted = preparedStatement.executeUpdate();

        if (rowsInserted > 0)
        {
            System.out.println("A new student record was inserted successfully.");
            System.out.println("Inserted " + rowsInserted + " record(s).");
        }

        // Close resources
        preparedStatement.close();

        //6. Close the Connection
        connection.close();
        System.out.println("Closed the connection");


    }
}
