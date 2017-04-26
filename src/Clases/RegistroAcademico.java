package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author febre, estevan
 */
public class RegistroAcademico {

    //Creacion de listas para guardar informacion 
    ArrayList<ComponenteEducativo> lstcomponente = new ArrayList();
    ArrayList<Alumno> lstalumno = new ArrayList();
    ArrayList<DocenteTitular> lstdocentetitular = new ArrayList();
    ArrayList<DocenteAuxiliar> lstdocenteauxiliar = new ArrayList();

    //Metodos
    public void addalumno(Alumno lstalum) {
        //Agrega en la lista el objeto 
        lstalumno.add(lstalum);

    }

    public void adddocentetitular(DocenteTitular lstdocente) {
        //Agrega en la lista el objeto 
        lstdocentetitular.add(lstdocente);
    }

    public void adddocenteauxiliar(DocenteAuxiliar lstdocente) {
        //Agrega en la lista el objeto 
        lstdocenteauxiliar.add(lstdocente);
    }

    public void componenteeducativo(ComponenteEducativo lstcomp) {
        //Agrega en la lista el objeto 
        lstcomponente.add(lstcomp);
    }

    public String unir(int id) {
        //Creacion de variables para el metodo
        String concatenar = "";
        String materias = "";
        String materias1 = "";
        String materias2 = "";
        //Mediante el id que se ingresa controlamos que tipo de persona es
        if (id > 10) {
            for (int i = 0; i < (int) (Math.random() * (5 - 0) + 1); i++) {
                //Guardamos la materia que se genere aleatoriamente 
                materias = materias + "\t" + lstcomponente.get(i);
            }
            for (Alumno alumno : lstalumno) {
                concatenar = "Alumno:\n" + alumno.toString() + "\n Nombre de las materias: " + materias;
            }

        }
        if (id > 20) {
            for (int i = 0; i < (int) (Math.random() * (5 - 0) + 1); i++) {
                //Guardamos la materia que se genere aleatoriamente 
                materias1 = materias1 + "\t" + lstcomponente.get(i);
            }
            for (DocenteTitular docenteTitular : lstdocentetitular) {
                concatenar = "Docente Titular:\t" + docenteTitular.toString() + "\n Nombre de las materias: " + materias;
            }
        }
        if (id > 30) {
            for (int i = 0; i < (int) (Math.random() * (5 - 0) + 1); i++) {
                //Guardamos la materia que se genere aleatoriamente 
                materias2 = materias2 + "\t" + lstcomponente.get(i);
            }
            for (DocenteAuxiliar docenteAuxiliar : lstdocenteauxiliar) {
                concatenar = "Docente Auxiliar:\n" + docenteAuxiliar.toString() + "\n Nombre de las materias: " + materias;
            }

        }
        //Retornamos la variable que tiene toda la informacion
        return concatenar;
    }

    public void registarArchivo(String guardar) {
        //Metodo guarda las variables que retorna en un archivo txt
        try {
            //Manejar  Objetos
            File crear = new File("ARCHIVO.txt");
            FileWriter escribir;
            BufferedWriter escribir2;
            //Si el archivo existe 
            if (crear.exists()) {
                escribir = new FileWriter(crear, true);
                escribir2 = new BufferedWriter(escribir);
                escribir2.newLine();
                escribir2.write(guardar);

            } else {
                escribir = new FileWriter(crear);
                escribir2 = new BufferedWriter(escribir);
                escribir2.write(guardar);
            }

            //Cierre
            escribir2.close();
            escribir.close();

        } catch (Exception e) {
        }

    }
}
