import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        /*
        import the package
        load and register
        create connection
        create statement
        process the results
        close
         */

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "9999";

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);

        System.out.println("Connected to database successfully");
    }
}
