
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

        
public class javaconnect {
    Connection conn;
    public static Connection connecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\pc\\management system\\my_database.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
}
