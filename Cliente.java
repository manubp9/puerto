
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre,String dni)
    {
        this.nombre = nombre;
        this.dni = dni;

    }

    /**
     * @return the name
     */
    public String getNombre()
    {
        // put your code here
        return nombre;
    }

    /**
     * @return the dni
     */
    public String getDni()
    {
        // put your code here
        return dni;
    }
    /**
     * escribe en una cadena todos los datos de la clase
     */
    public String toString()
    {
        return "Nombre "+nombre+"\nDNI "+dni;
    }
}
