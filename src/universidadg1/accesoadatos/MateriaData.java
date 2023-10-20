/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadg1.accesoadatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadg1.entidades.Materia;

/**
 *
 * @author Gonza
 */
public class MateriaData {
    private Connection con=null;

    public MateriaData() {
        this.con= Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        String sql ="INSERT INTO `materia`(`nombre`, `año`, `estado`)"
                + "VALUES(?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(1);
                JOptionPane.showMessageDialog(null, "Materia agregada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en tabla Materia");
        }
    }
    
    public Materia buscarMateria(int id) {
        // CÃ³digo para buscar una materia por ID en la base de datos
        String sql ="SELECT nombre, año, estado FROM materia WHERE idMateria = ? AND estado = 1";
        Materia materia = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);          
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe una materia con ese ID");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en tabla Materia");
        }
        return materia;
    }
    
    public void modificarMateria(Materia materia) {
        // CÃ³digo para actualizar una materia en la base de datos
        try {
            
            String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4,materia.getIdMateria());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Materia actualizada con exito");
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la tabla Materia!");
        }
    }
    
    public void eliminarMateria(int idMateria) {
        // CÃ³digo para marcar una materia como eliminada en la base de datos
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        
    }
    
    
    
    public List<Materia> listarMaterias() {
        // Codigo para obtener una lista de todas las materias activas en la base de datos
        List<Materia> listaMaterias = new ArrayList<>();
        
        PreparedStatement ps=
        return null;
        
    }
    
}
