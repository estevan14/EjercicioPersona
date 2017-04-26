package Clases;

/**
 *
 * @author febre, estevan
 */
public class Alumno extends Persona {

    //Variable de la clase
    private int iAlumno;

    //Constructor
    public Alumno(int strAlumno, String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
        this.iAlumno = strAlumno;
    }

    //Metodos de la clase
    public int getStrAlumno() {
        return iAlumno;
    }

    public void setStrAlumno(int strAlumno) {
        this.iAlumno = strAlumno;
    }

    @Override
    public String toString() {
        return String.format("Id= %s,%s", getStrAlumno(), super.toString());
    }

}
