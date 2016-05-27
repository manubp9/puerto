
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles,String matricula,float eslora,int anoFab)
    {
        super(matricula,eslora,anoFab);
        this.numeroMastiles = numeroMastiles;
    }
     /**
     *calcula el coeficiente de bernua
     */
    @Override
    public int getCoeficienteBernua()
    {
       return numeroMastiles;
    }
    /**
     * añade la potencia a la cadena String
     */
    @Override
    public String toString()
    {
        return super.toString()+ "\nNumero de mastiles "+numeroMastiles;
    }
}
