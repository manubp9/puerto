
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    private String matricula;
    private float eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula,float eslora,int anoFabricacion)
    {
        this.matricula = matricula;
        this.eslora =eslora;
        this.anoFabricacion = anoFabricacion;
    }

    /**
     * devuelve la matriculacion
     */
    public String getMatricula()
    {
        return matricula;
    }

    /**
     * devuelve eslora
     */
    public float getEslora()
    {
        return eslora;
    }

    /**
     * devuelve el año de fabricacion
     */
    public int anoFabricacion()
    {
        return anoFabricacion;
    }

    /**
     * devuelve el Coeficiente de Bernua
     */
    public abstract int getCoeficienteBernua();

    
    /**
     * devuelve como String todos los datos del barco
     */
    public String toString()
    {
        return "Matricula del barco " + matricula +"\nEslora "+
        eslora+"\nAño de fabricacion "+anoFabricacion+
        "\nCoeficiente de Bernua "+getCoeficienteBernua();
    }

}
