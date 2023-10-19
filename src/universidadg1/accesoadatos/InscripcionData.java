package universidadg1.accesoadatos;

import java.sql.Connection;
import java.sql.*;
import universidadg1.entidades.Inscripcion;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadg1.entidades.Alumno;
import universidadg1.entidades.Materia;

/**
 *
 * @author MI EQUIPO
 */
public class InscripcionData {

    private Connection con = null;
    private MateriaData md= new MateriaData();
    private AlumnoData ad= new AlumnoData();

    public InscripcionData() {
        this.con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion(idAlumno, idMateria,nota)"
                + "VALUES(?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));//solo hay una
                JOptionPane.showMessageDialog(null, "Inscripcion registrada");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

        try {
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ");
        }
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria){
        try {
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas=ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Inscripcion Borrada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion>cursadas = new ArrayList<>();
        String sql="SELECT * FROM inscripcion";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Inscripcion insc= new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu= ad.buscarAlumnoPorId(rs.getInt("idAlumno"));
                Materia mat= md.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));
                cursadas.add(insc);
               
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        return cursadas;
    }
    public void mirarMateria(){
        
    }

}
