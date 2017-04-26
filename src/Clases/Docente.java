
package Clases;

/**
 *
 * @author febre, estevan
 */
public class Docente extends Persona {

    //Variable de la clase
    private int iIdDocente;

    //Constructor
    public Docente(int strIdDocente, String strIdentificacion, String strNombres, String strEmail) {
        super(strIdentificacion, strNombres, strEmail);
        this.iIdDocente = strIdDocente;
    }

    //Metodos
    public int getStrIdDocente() {
        return iIdDocente;
    }

    public void setStrIdDocente(int strIdDocente) {
        this.iIdDocente = strIdDocente;
    }

    //Metodo toString
    @Override
    public String toString() {
        return String.format("ID=%s,%s", getStrIdDocente(), super.toString());
    }

}
