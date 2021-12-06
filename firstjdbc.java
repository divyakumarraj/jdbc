import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import static java.lang.Class.forName;

public class firstjdbc {
    public static void main(String[] args) {
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/youtube";
                String user="root";
                String pass="";
                Connection con=DriverManager.getConnection(url,user,pass);
//                if(con.isClosed())
//                {
//                    System.out.println("close");
//                }
//                else
//                {
//                    System.out.println("open");
//
//                }
                //create a query
               // String q= "create table table2(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
                String q= " insert into table1(tName,tCity) values (?,?)";
                //
                PreparedStatement pstmt = con.prepareStatement(q);
                BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
                System.out.println("enter name : ");
                String name= br.readLine();
                System.out.println("enter city : ");
                String city= br.readLine();
                pstmt.setString(1,name);
                pstmt.setString(2,city);
                pstmt.executeUpdate();
                System.out.println(("inserted..."));
               // Statement stmt=con.createStatement();
               // stmt.executeUpdate(q);
               // System.out.println("table created");
                con.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
