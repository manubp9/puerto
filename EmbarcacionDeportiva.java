
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia,String matricula,float eslora,int anoFab)
    {
        super(matricula,eslora,anoFab);
        this.potencia = potencia;
    }

    /**
     *calcula el coeficiente de bernua
     */
    @Override
    public int getCoeficienteBernua()
    {
       return potencia;
    }
    /**
     * añade la potencia a la cadena String
     */
    @Override
    public String toString()
    {
        return super.toString()+ "\nPotencia "+potencia;
    }
    
}
