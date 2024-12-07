import java.util.*;
import java.sql.*;

public class test {
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name : ");
            String name = sc.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhinesh","root","root");
            //dhinesh -> database name, root -> username for database, root -> password for database

            Statement cursor = con.createStatement();

            //inserting into database
            String que = "Insert into hi values (?)";
            PreparedStatement prep = con.prepareStatement(que);
            prep.setString(1,name);
            prep.executeUpdate();

            //selecting from database
            que = "Select * from hi";
            ResultSet rs = cursor.executeQuery(que);

            //printing selected items
            while(rs.next())
            {
                System.out.println("Name : "+rs.getString(1));
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }

}
