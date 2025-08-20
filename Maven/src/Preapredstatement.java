import java.sql.*;

public class Preapredstatement {
    public static void main(String[] args) throws Exception {
        /*
        import the package
        load and register
        create connection
        create statement
        process the results
        close
         */

        int sid = 101;
        String sname = "Navya";
        int marks = 99;

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "9999";
        String sql = "insert into student values (?,?,?)";


        Connection con = DriverManager.getConnection(url,uname,pass);

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        st.execute();

        con.close();
    }
}
