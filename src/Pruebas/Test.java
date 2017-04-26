package Pruebas;

//Importaciones 
import Clases.Alumno;
import Clases.RegistroAcademico;
import Clases.ComponenteEducativo;
import Clases.DocenteAuxiliar;
import Clases.DocenteTitular;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //variables de opcion
        int opcion;
        int opcion1 = 0;
        //variables a utilizar
        int strid;
        String strNombre;
        String strIdentificacion;
        String strCorreo;
        String strHorario;
        String archivo;
        int iNumCreditos;
        int icodigo;
        RegistroAcademico objregistro = new RegistroAcademico();
        //objregistro.addalumno(objpersona);
        //System.out.println(objpersona.toString());
        while (opcion1 == 0) {
            System.out.println("Ingresar Al Sistema UTPL");
            System.out.println("[1] Alumno \n[2]Docente\n[3]Componente Educativo\n[4]Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    archivo = "";
                    System.out.println("Ingrese ID Estudiante");
                    strid = teclado.nextInt();

                    System.out.println("Ingrese Identificacion");
                    strIdentificacion = teclado.next();

                    System.out.println("Ingrese Nombre: ");
                    strNombre = teclado.next();

                    System.out.println("Ingrese Correo");
                    strCorreo = teclado.next();

                    Alumno objAlumno = new Alumno(strid, strIdentificacion, strNombre, strCorreo);

                    objregistro.addalumno(objAlumno);
                    System.out.println(objregistro.unir(strid));

                    archivo = objregistro.unir(strid);
                    objregistro.registarArchivo(archivo);
                    break;
                case 2:
                    opcion = 0;
                    System.out.println("[1]Docente Titular \n[2]Docente Auxiliar");
                    opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            archivo = "";
                            System.out.println("Ingrese ID Docente");
                            strid = teclado.nextInt();

                            System.out.println("Ingrese Identificacion");
                            strIdentificacion = teclado.next();

                            System.out.println("Ingrese Nombre: ");
                            strNombre = teclado.next();

                            System.out.println("Ingrese Correo");
                            strCorreo = teclado.next();

                            System.out.println("Ingrese su Horario");
                            strHorario = teclado.next();

                            //Creamos el objeto y lo enviamos a los metodos
                            DocenteTitular objDocenteTitular = new DocenteTitular(strid, strIdentificacion, strNombre, strCorreo, strHorario);

                            objregistro.adddocentetitular(objDocenteTitular);
                            System.out.println(objregistro.unir(strid));

                            archivo = objregistro.unir(strid);
                            objregistro.registarArchivo(archivo);
                            break;
                        case 2:
                            archivo = "";
                            System.out.println("Ingrese ID Docente");
                            strid = teclado.nextInt();

                            System.out.println("Ingrese Identificacion");
                            strIdentificacion = teclado.next();

                            System.out.println("Ingrese Nombre: ");
                            strNombre = teclado.next();

                            System.out.println("Ingrese Correo");
                            strCorreo = teclado.next();

                            System.out.println("Ingrese su Horario");
                            strHorario = teclado.next();

                            //Creamos el objeto y lo enviamos a los metodos
                            DocenteAuxiliar objDocenteAuxiiar = new DocenteAuxiliar(strid, strIdentificacion, strNombre, strCorreo, strHorario);

                            objregistro.adddocenteauxiliar(objDocenteAuxiiar);
                            System.out.println(objregistro.unir(strid));
                            archivo = objregistro.unir(strid);
                            objregistro.registarArchivo(archivo);
                            break;

                        default:

                            break;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese Codigo ");
                    icodigo = teclado.nextInt();

                    System.out.println("Ingrese Nombre de la materia");
                    strNombre = teclado.next();

                    System.out.println("Ingrese Numero de Creditos");
                    iNumCreditos = teclado.nextInt();

                    //Creamos el objeto y lo enviamos a los metodos
                    ComponenteEducativo objcomponente = new ComponenteEducativo(icodigo, strNombre, iNumCreditos);
                    objregistro.componenteeducativo(objcomponente);
                    break;
                default:
                    opcion1 = 1;
                    break;
            }
        }

    }
}
