/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadg1.accesoadatos;

import java.sql.*;
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
        
//        String sql ="INSERT INTO `materia`(`nombre`, `a駉`, `estado`)"
//                + "VALUES(?,?,?)";
//        
//        try {
//            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, materia.getNombre());
//            ps.setInt(2, materia.getAnioMateria());
//            ps.setBoolean(3, materia.isActivo());
//            ps.executeUpdate();
//            
//            ResultSet rs = ps.getGeneratedKeys();
//            if(rs.next()){
//                materia.setIdMateria(1);
//                JOptionPane.showMessageDialog(null, "Materia agregada");
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(MateriaData.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    public void modificarMateria(Materia materia) {
        // C贸digo para actualizar una materia en la base de datos
    }
    
    public void eliminarMateria(int idMateria) {
        // C贸digo para marcar una materia como eliminada en la base de datos
    }
    
    public Materia buscarMateria(int id) {
        // C贸digo para buscar una materia por ID en la base de datos
        String sql ="SELECT nombre, a駉, estado FROM materia WHERE idMateria = ? AND estado = 1";
        Materia materia = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);          
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("a駉"));
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
    
    public List<Materia> listarMaterias() {
        // C贸digo para obtener una lista de todas las materias activas en la base de datos
        return null;
        // C贸digo para obtener una lista de todas las materias activas en la base de datos
    }
    
}
