package Main;


import Vistas.Registrarse;
import Vistas.Login;
import Main.Conn;
import java.awt.Window;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import AbstractClasses.AbstractSqlStatements;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwin
 */
 import javax.swing.JOptionPane;
public class SqlStatements  extends AbstractSqlStatements{
     private Connection connection;
     public boolean visi = true;
     Login formLogin = new Login();
     Registrarse formRegistrarse = new  Registrarse();
     private Conn con = Conn.getInstance();
  
  public void SetVisiblelogin(){
        formLogin.setVisible(visi);
     
    }
  public void SetVisibleRegistrarse(){
        formRegistrarse.setVisible(visi);
     
    }
  public boolean InsertUser(String username,String password,String nombre ,String apellido,String tel,String email ){
  connection = con.getConnection();
   String query = "INSERT INTO Users"
                + "(username, password, nombre , apellido, tel, mail)"
                + "VALUES (?,?,?,?,?,?)";
   try {
          PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);
          
          statement.setString(1, username);
          statement.setString(2, password);
          statement.setString(3, nombre);
          statement.setString(4, apellido);
          statement.setString(5, tel);
          statement.setString(6, email);
          
          statement.executeUpdate();
        } catch (SQLException ex){
            return false;
          
          
        }
    return true;
  }
   public boolean deleteUser(String id ){
  connection = con.getConnection();
   String query = "DELETE FROM Users WHERE id=?";
   try {
          PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);
          
          statement.setString(1, id);
            statement.executeUpdate(); 
          
        
        } catch (SQLException ex){
            return false;
          
          
        }
    return true;
  }
   public boolean editUser(String id,String username,String password,String nombre ,String apellido,String tel,String email ){
  connection = con.getConnection();
  
   String query = "UPDATE Users SET "
            + "username=?,password=?,nombre=?,apellido=?,tel=?,mail=? "
            + "WHERE id=?";
   try {
          PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);
          
         
          statement.setString(1, username);
          statement.setString(2, password);
          statement.setString(3, nombre);
          statement.setString(4, apellido);
          statement.setString(5, tel);
          statement.setString(6, email);
           statement.setString(7, id);
            statement.executeUpdate(); 
          
        
        } catch (SQLException ex){
            return false;
          
          
        }
    return true;
  }
   public boolean userSignIn(String username)throws SQLException{
         connection = con.getConnection();
         String query = "Select * from Users WHERE username = ?";
         if (connection != null) {
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(query);
            st.setString(1, username);
            
            ResultSet res = st.executeQuery();
//                 password.setText("");
//                username.setText("");
            if (res.next()) {
                //display dashboard or new page after login
               
               return true;
                
                //JOptionPane.showMessageDialog(this, "logged in successfully \n welcome " + username, "Success", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            System.out.println("The connection not available");
         
        }
       return false;
    }
    public boolean userSignIn(String username,String password)throws SQLException{
         connection = con.getConnection();
         String query = "Select * from Users WHERE username = ? AND password=?";
         if (connection != null) {
            PreparedStatement st = (PreparedStatement) connection.prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
//                 password.setText("");
//                username.setText("");
            if (res.next()) {
                //display dashboard or new page after login
               
               return true;
                
                //JOptionPane.showMessageDialog(this, "logged in successfully \n welcome " + username, "Success", JOptionPane.ERROR_MESSAGE);
            } else {
//                System.out.println("username: " + username);
//                    System.out.println("password: " + password);
  
 JOptionPane.showMessageDialog(null, "username / password not found");

                
            }
        } else {
            System.out.println("The connection not available");
         
        }
       return false;
    }
  
    

   
    
}
