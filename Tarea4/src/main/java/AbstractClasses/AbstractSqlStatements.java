/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClasses;

import Vistas.Registrarse;
import Vistas.Login;
import Main.Conn;

import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author edwin
 */
public abstract class AbstractSqlStatements {
    private Connection connection;
     public boolean visi = true;
     Login formLogin;
     Registrarse formRegistrarse;
     private Conn con ;
    abstract public void SetVisiblelogin();
    abstract public void SetVisibleRegistrarse();
    abstract public boolean InsertUser(String username,String password,String nombre ,String apellido,String tel,String email );
    abstract public boolean deleteUser(String id );
    abstract public boolean editUser(String id,String username,String password,String nombre ,String apellido,String tel,String email );
    abstract public boolean userSignIn(String username)throws SQLException;
    abstract public boolean userSignIn(String username,String password)throws SQLException;
    
}
