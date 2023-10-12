
package universidadg1.accesoadatos;

import java.sql.Connection;
import java.sql.*;
import universidadg1.entidades.Inscripcion;
/**
 *
 * @author MI EQUIPO
 */
public class InscripcionData {
    private Connection con= null;

    public InscripcionData() {
        this.con= Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql= "INSERT INTO alumno(dni,apellido,nombre,fechaNacimiento,estado)"
                +"VALUES(?,?,?,?;?)";
        try{
            PreparedStatement ps= con.prepareStatement (sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5,alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado");
            }
                ps.close();
            
           } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
