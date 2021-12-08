import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class minorr {
    public static void main(String[] args) {
        ResultSet rs=null;
//        Statement st=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/minor";
            String user="root";
            String pass="";
            Connection con= DriverManager.getConnection(url,user,pass);
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter emp_no");
            int emp_no= br.read();
            Statement st=con.createStatement();
            String q="select * from employe";
            Statement stmt=con.createStatement();
//           rs=con.ex;
            rs=stmt.executeQuery(q);
            while (rs.next())
            {
                System.out.println("Emp id: "+rs.getString(1)+"\nEmp name: "+rs.getString(2)+"\nDEpt: "+rs
                        .getString(3)+"\nDest: "+rs.getString(4)+"\nsal: "+rs.getString(5));
                break;
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
