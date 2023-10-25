/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg1;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import universidadg1.accesoadatos.*;
import universidadg1.entidades.*;

/**
 *
 * @author MI EQUIPO
 */
public class UniversidadG1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();

        //AGREGAR WACHOS
//        Alumno a1 = new Alumno(12351777, "paredes", "sandra", LocalDate.of(1996, 7, 21), true);
//        Alumno a2 = new Alumno(66651777, "gomez", "sandra", LocalDate.of(1997, 3, 6), true);
//        AlumnoData alumnoData = new AlumnoData();
//        alumnoData.guardarAlumno(a1);
//        alumnoData.guardarAlumno(a2);

////////MODIFICAR ALUMNOS
//      
//       Alumno sebAlumno=new Alumno(1,32751482, "castro", "sebas", LocalDate.of(1987,7,1), true);
//       AlumnoData alumnoData= new AlumnoData();
//       alumnoData.modificarAlumno(sebAlumno);

//////////borrar ALUMNOS
        // alumnoData.borradoLogicoAlumno(1);
        
//////////mostrar ALUMNOS por ID
//       AlumnoData alumnoData = new AlumnoData();
//       Alumno alumnoEncontradoID=alumnoData.buscarAlumnoPor(1);
//       System.out.println("-------------DATOS ALUMNO ENCONTRADO ID-----------------");
//       System.out.println("    ");
//       System.out.println("DNI"+ alumnoEncontradoID.getDni()); 
//       System.out.println("Nombre: "+ alumnoEncontradoID.getNombre());
//       System.out.println("Apellido: "+ alumnoEncontradoID.getApellido());
//       System.out.println("    ");

//////////mostrar ALUMNOS por DNI
//       AlumnoData alumnoData = new AlumnoData();
//       Alumno alumnoEncontradoDNI = alumnoData.buscarAlumnoPorDni(32751482);
//        if (alumnoEncontradoDNI != null) {
//            System.out.println("------------DATOS ALUMNO ENCONTRADO DNI-----------------");
//            System.out.println("    ");
//            System.out.println("Nombre: " + alumnoEncontradoDNI.getNombre());
//            System.out.println("Apellido: " + alumnoEncontradoDNI.getApellido());
//            System.out.println("DNI: " + alumnoEncontradoDNI.getDni());
//        } else {
//            System.out.println("");
//            System.out.println(" No encontrÃ© nada che por DNI...");
//        }

//////////mostrar LISTA ALUMNOS
//       AlumnoData alumnosData= new AlumnoData();
//        List<Alumno> listaAlumnos = alumnosData.listaAlumnos();
//
//       for (Alumno alumno : listaAlumnos) {
//          System.out.println("Nombre: " + alumno.getNombre() + ", Apellido "+ alumno.getApellido()+" ID: " + alumno.getIdAlumno() + ", DNI: " + alumno.getDni());
//       }
//----------------------------MATERIA DATA----------------------------------------------------------------------
//////////Para guardar Materia
//        Materia m1 = new Materia("IngSoftware", 2023, true);
//        MateriaData materiaData = new MateriaData();
//        materiaData.guardarMateria(m1);

//////////Para modificar Materia
//        Materia ingSoft = new Materia(12,"Ingenieria de Software", 2024, true);
//        MateriaData materiaData = new MateriaData();
//        materiaData.modificarMateria(ingSoft);

//////////Para Buscar una materia
//        MateriaData data= new MateriaData();
//        Materia materiaEncontrada=data.buscarMateria(2);
//        if(materiaEncontrada!=null){
//            System.out.println("Nombre: "+ materiaEncontrada.getNombre());
//        }else{
//            System.out.println("no se encntro naranja");
//        }

//////////mostrar lista de materia
//        MateriaData matDat= new MateriaData();
//        List<Materia> materiasActivas = matDat.obtenerMateriasActivas();
//
//        for (Materia materia : materiasActivas) {
//            System.out.println("ID: " + materia.getIdMateria() 
//            +  ", Nombre: " + materia.getNombre() + ", año: " + materia.getAnioMateria());
//        }

//////////para eliminado logico de materia
//        materiaData.eliminarMateria(1);

//--------------------------INSCRIBIR ALUMNO-----------------------------------------------------------------------------
////---------------Para inscribir un alumno
//    AlumnoData ad = new AlumnoData();
//    MateriaData md = new MateriaData();
//    InscripcionData ind = new InscripcionData();
//
//    Alumno al = ad.buscarAlumnoPor(8);
//    Materia mat = md.buscarMateria(2);
//    Inscripcion insc = new Inscripcion(al, mat, 10);
//
//    ind.guardarInscripcion(insc); 
//    ---------------- Probar este metodo sacando este arriba

//////Actualizar nota
//    InscripcionData ind = new InscripcionData();
//    ind.actualizarNota(7, 1, 7);

//////borrar Inscripcion
//      InscripcionData ind = new InscripcionData();
//      ind.borrarInscripcionMateriaAlumno(7, 1);

//////Obtener alumnosxMateria
//    InscripcionData ind = new InscripcionData();
//    int idMateria = 1;
//    List<Alumno> alumnos = ind.obtenerAlumnosXMateria(idMateria);
//    for(Alumno alumno:alumnos){
//        System.out.println("Id del Alumno: " + alumno.getIdAlumno());
//        System.out.println("Nombre del alumno: " + alumno.getNombre());
//        System.out.println("-----------------");
//    }

//-------------------------







    }
}
