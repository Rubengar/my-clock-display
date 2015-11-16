
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    
    private NumberDisplay minutos;
    
    private String pantalla;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {   
       int horas = 00;
       int minutos = 00;
       pantalla = "0"+ horas + ":0" + minutos;
    }
    public ClockDisplay(int valorHoras, int valorMinutos)
    {
        int horas = valorHoras;
        int minutos = valorMinutos;
       
        
    }

    
}
