package Clases;

/**
 *
 * @author febre, estevan
 */
public class ComponenteEducativo {

    //Variables 
    private int iCodigo;
    private String strNombre;
    private int iNumCreditos;

    //Constructor
    public ComponenteEducativo(int iCodigo, String strNombre, int iNumCreditos) {
        this.iCodigo = iCodigo;
        this.strNombre = strNombre;
        this.iNumCreditos = iNumCreditos;
    }

    //Metodos de la clase
    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public int getiNumCreditos() {
        return iNumCreditos;
    }

    public void setiNumCreditos(int iNumCreditos) {
        this.iNumCreditos = iNumCreditos;
    }

    //Metodo toString
    @Override
    public String toString() {
        return /*"ComponenteEducativo{" + "iCodigo=" + iCodigo + */ getStrNombre() /*+ ", iNumCreditos=" + iNumCreditos + '}'*/;
    }

}
