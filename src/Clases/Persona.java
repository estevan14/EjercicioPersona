package Clases;

/**
 *
 * @author febre, esteban
 */
public class Persona {

    //Variables de la clase principal
    private String strIdentificacion;
    private String strNombres;
    private String strEmail;

    //Constructor vacio
    public Persona() {
    }

    //Constructor 
    public Persona(String strIdentificacion, String strNombres, String strEmail) {
        this.strIdentificacion = strIdentificacion;
        this.strNombres = strNombres;
        this.strEmail = strEmail;
    }

    //Metodos
    public String getStrIdentificacion() {
        return strIdentificacion;
    }

    public void setStrIdentificacion(String strIdentificacion) {
        this.strIdentificacion = strIdentificacion;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    //Metodo toString
    @Override
    public String toString() {
        return String.format("Identificacion= " + strIdentificacion + "\tNombres= " + strNombres + "\tEmail= " + strEmail);
    }
}
