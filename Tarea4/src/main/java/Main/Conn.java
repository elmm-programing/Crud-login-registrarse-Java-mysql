package Main;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import AbstractClasses.AbstractConn;
import java.util.HashSet;
import java.util.Set;
/*Esta conexion esta hecha con el patron de diseño singlenton*/
public class Conn extends AbstractConn{
    private static Conn con;
    private static Connection connection;
  
    private Conn(){}
    public static Conn getInstance(){
        if(con == null){
       con = new Conn();
        }
        return con;
        
    }
   
   public Connection getConnection(){
        //pengecekan koneksi database
        if (connection==null){
            try{
                setUsername("elmm");
                setpassword("2002/6/2");
                seturl("jdbc:mysql://localhost:3306/escuela");
              /*
                String username = "elmm";
              String password = "2002/6/2";
              String url = "jdbc:mysql://localhost:3306/escuela";
              */
              MysqlDataSource source = new MysqlDataSource();
              source.setUser(getUsername());
              source.setPassword(getpassword());
              source.setURL(geturl());
              
              connection = source.getConnection();
              
              
            if (connection.isValid(2)) {
               
                System.out.println("The attempt to Connection was a SUCCESS");
            } else {
               
                System.out.println("The attempt to Connection FAILED");
            }
            
            } catch (SQLException ex){
              System.out.println("Error conectandose a la base de datos");  
            }
        }       
        
        return connection;
    }
    
    
}
