//create new table in database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/updating";
            String user="root";
            String pass="";
            Connection con= DriverManager.getConnection(url,user,pass);
            String q="create table tab33(name varchar(55),number int(10))";
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
