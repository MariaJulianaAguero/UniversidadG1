/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg1;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
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
     //  Connection con= Conexion.getConnection();   
          
      
      
      //AGREGAR WACHOS
          Alumno a1= new Alumno(12351777, "paredes", "sandra", LocalDate.of(1996,7,21), true);
          Alumno a2= new Alumno(66651777, "gomez", "sandra", LocalDate.of(1997,3,6), true);
          AlumnoData alumnoData= new AlumnoData();
//          alumnoData.guardarAlumno(a1);
//          alumnoData.guardarAlumno(a2);


      //  MODIFICAR WACHOS
      
      
//      Alumno sebAlumno=new Alumno(1,32751482, "castro", "sebas", LocalDate.of(1987,7,1), true);
//      AlumnoData alumnoData= new AlumnoData();
      //alumnoData.modificarAlumno(sebAlumno);;
      
      
            //  matar WACHOS
 
     // alumnoData.borradoLogicoAlumno(1);
     
     
            //  mostrar WACHOS por ID
            
        Alumno alumnoEncontradoID=alumnoData.buscarAlumnoPorId(1);
        System.out.println("-------------DATOS ALUMNO ENCONTRADO ID-----------------");
        System.out.println("    ");
        System.out.println("DNI"+ alumnoEncontradoID.getDni()); 
        System.out.println("Nombre: "+ alumnoEncontradoID.getNombre());
        System.out.println("Apellido: "+ alumnoEncontradoID.getApellido());
        System.out.println("    ");

      //  mostrar WACHOS por DNI
      
      Alumno alumnoEncontradoDNI=alumnoData.buscarAlumnoPorDni(32751482);
        if (alumnoEncontradoDNI!=null) {
        System.out.println("------------DATOS ALUMNO ENCONTRADO DNI-----------------");
        System.out.println("    ");        
        System.out.println("Nombre: "+ alumnoEncontradoDNI.getNombre());
        System.out.println("Apellido: "+ alumnoEncontradoDNI.getApellido());
        System.out.println("DNI: "+ alumnoEncontradoDNI.getDni());
        }else{
            System.out.println("");
            System.out.println(" No encontré nada che por DNI...");
        }
        
       //  mostrar WACHOS
      
      
       AlumnoData alumnosData= new AlumnoData();
        List<Alumno> listaAlumnos = alumnosData.listaAlumnos();

for (Alumno alumno : listaAlumnos) {
    System.out.println(", Nombre: " + alumno.getNombre() + ", Apellido "+ alumno.getApellido()+" ID: " + alumno.getIdAlumno() + ", DNI: " + alumno.getDni()  );
}

      
      
    }
}
