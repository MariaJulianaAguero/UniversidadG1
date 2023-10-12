/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg1.accesoadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MI EQUIPO
 */
public class Conexion {
    private static final String URL= "jdbc:mariadb://localhost/";
    private static final String DB= "universidadulp";
    private static final String USUARIO= "root";
    private static final String PASSWORD= "";
    private static Connection connection;
    private static DriverManager Connection;

    public Conexion() {
    }
    
    public static Connection getConexion(){
        if(connection==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                Connection =(DriverManager) DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD");
            }
        }
        return connection;
    }
    
}
