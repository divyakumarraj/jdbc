import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ConnectionProperties;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;

public class updatejdbc {
    public static void main(String[] args) {
        try {
            Connection con= ConnectionProvider.getConnection();
            String q="update table set tName=? , tCity=? where tId=?;";
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name");
            String name = br.readLine();
            System.out.println("enter new city");
            String city= br.readLine();
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();
            System.out.println("done---");
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
