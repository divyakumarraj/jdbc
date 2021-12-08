import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class update {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/updating";
            String user="root";
            String pass="";
            Connection con= DriverManager.getConnection(url,user,pass);
            String q="select * from tab33 where number >1500";
            Statement stmt=con.createStatement();
            ResultSet set=stmt.executeQuery(q);
            while (set.next())
            {
                int id=set.getInt(2);
                System.out.println(id);
            }
            System.out.println("executed");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
