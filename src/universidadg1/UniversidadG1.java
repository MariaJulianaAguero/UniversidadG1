/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg1;

import java.sql.Connection;
import java.time.LocalDate;
import universidadg1.accesoadatos.AlumnoData;
import universidadg1.accesoadatos.Conexion;
import universidadg1.entidades.Alumno;

/**
 *
 * @author MI EQUIPO
 */
public class UniversidadG1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con= Conexion.getConexion();
        Alumno camilo= new Alumno(34123657,"Urquiza","Camilo",LocalDate.of(1995, 7, 1),true);
        AlumnoData alum= new AlumnoData();
        alum.guardarAlumno(camilo);
    }
    
}
