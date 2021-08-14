/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses;

import Main.Conn;
import java.sql.Connection;

/**
 *
 * @author edwin
 */
public abstract class AbstractConn {
    private static Conn con;
    private static Connection connection;
  private String username;
    private String password;
    private String url;
    
     public String getUsername(){
    return username;
    }
    public void setUsername(String Username){
    this.username = Username;
    }
    public String getpassword(){
    return password;
    }
    public void setpassword(String password){
    this.password = password;
    }
    public String geturl(){
    return url;
    }
    public void seturl(String url){
    this.url = url;
    }
    abstract public Connection getConnection();
}
