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
        String query = "SELECT \"SNAME\" FROM public.\"Student\" WHERE \"SID\" = 1";

        //5. Execute Statement
        ResultSet resultSet = statement.executeQuery(query);

        if(resultSet.next())
        {
            System.out.println("Name of student is : " + resultSet.getString("SNAME"));
        }

        //6. Close the Connection
        connection.close();
        System.out.println("Closed the connection");


    }
}
