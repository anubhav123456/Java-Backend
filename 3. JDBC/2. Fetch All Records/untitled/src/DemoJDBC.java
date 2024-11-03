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
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM public.\"Student\"";

        //5. Execute Statement
        ResultSet resultSet = statement.executeQuery(query);

        while(resultSet.next())
        {
            System.out.print(resultSet.getInt(1) + " - ");
            System.out.print(resultSet.getString(3) + " - ");
            System.out.println(resultSet.getInt(2));
        }

        //6. Close the Connection
        connection.close();
        System.out.println("Closed the connection");


    }
}
