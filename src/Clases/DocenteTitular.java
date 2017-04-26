package Clases;

/**
 *
 * @author febre, estevan
 */
public class DocenteTitular extends Docente {

    //Variable de la clase
    private String strHorario;

    //Constructor
    public DocenteTitular(int strIdDocente, String strIdentificacion, String strNombres, String strEmail, String strHorario) {
        super(strIdDocente, strIdentificacion, strNombres, strEmail);
        this.strHorario = strHorario;
    }

    //Metodos
    public String getStrHorario() {
        return strHorario;
    }

    public void setStrHorario(String strHorario) {
        this.strHorario = strHorario;
    }

    //Metodo toString
    @Override
    public String toString() {
        return String.format("%s Horario= %s", super.toString(), getStrHorario());
    }

}
