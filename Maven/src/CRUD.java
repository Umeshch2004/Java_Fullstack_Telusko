import java.sql.*;

public class CRUD {
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
        String sql = "delete from student where sid=5";


        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected to database successfully");
        Statement st = con.createStatement();
        st.execute(sql);

        con.close();
        System.out.println("Connection closed successfully");
    }
}
