
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private static final int VALOR_FIJO_ALQUILER= 300;
    private static final int MULTIPLICADOR_ESLORA= 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias,Cliente cliente,Barco barco)
    {
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
    }

    /**
     * calcula el coste del alquiler
     */
    public float getCosteAlquiler()
    {
        return (barco.getEslora()*MULTIPLICADOR_ESLORA)+
        VALOR_FIJO_ALQUILER*barco.getCoeficienteBernua();
    }
    /**
     * devuelve como una cadena de string los atributos
     */
    public String toString()
    {
        return "Dias" + numeroDias+"\n Cliente "+cliente.getNombre()+"\nBarco "+barco.getMatricula()+
        "\nCoste total alquiler "+getCosteAlquiler();

    }
}
