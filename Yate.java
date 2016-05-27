
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarotes,int potencia,String matricula,float eslora,int anoFab)
    {
        super(potencia,matricula,eslora,anoFab);
        this.camarotes = camarotes;
    }

    /**
     *calcula el coeficiente de bernua
     */
    @Override
    public int getCoeficienteBernua()
    {
       return super.getCoeficienteBernua()+camarotes;
    }
    /**
     * añade camarotes a la cadena String
     */
    @Override
    public String toString()
    {
        return super.toString()+ "\nCamarotes "+camarotes;
    }
    
}
