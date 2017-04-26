package Clases;

/**
 *
 * @author febre, estevan
 */
public class DocenteAuxiliar extends Docente {

    //Variable de la claser
    private String strHTutotia;

    //Constructor
    public DocenteAuxiliar(int strIdDocente, String strIdentificacion, String strNombres, String strEmail, String strHTutoria) {
        super(strIdDocente, strIdentificacion, strNombres, strEmail);
        this.strHTutotia = strHTutoria;
    }

    //Metodos
    public String getStrHTutotia() {
        return strHTutotia;
    }

    public void setStrHTutotia(String strHTutotia) {
        this.strHTutotia = strHTutotia;
    }

    //Metodo toString
    @Override
    public String toString() {
        return String.format("%s Horario: %s", super.toString(), getStrHTutotia());
    }

}
