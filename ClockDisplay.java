/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // Guarda la hora
    private NumberDisplay horas;
    // Guarda los minutos
    private NumberDisplay minutos;
    // Almacena la hora actual con 5 caracteres
    private String horaActual;
    
    private boolean tiempo;

    /**
     * Crea un objeto ClockDisplay con hora por defecto 00:00
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    /** 
     * Crea un objeto ClockDisplay con la hora y los minutos dados
     */
    public ClockDisplay (int horasX, int minutosX)
    {
        horas =   new NumberDisplay(24);
        minutos = new NumberDisplay(60);    
        horas.setValue(horasX); 
        minutos.setValue(minutosX);
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue();     
    }
    
    /**
     * Fija la hora del reloj a la hora y los minutos dados
     */
    public void setTime(int horaY, int minutoY)
    {
        horas.setValue(horaY);  
        minutos.setValue(minutoY);
        horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue() ;
    }
    
    /**
     * Devuelve la hora del reloj como un   a cadena de 5 caracteres
     */
     public String getTime()
     {
         return horaActual;
     }
     
    /**
     * Hace avanzar la hora 1 minuto
     */
    public void timeTick()
    {
        minutos.increment();
        if ( minutos.getValue() == 0) {
            horas.increment();
        }
        if (tiempo == true)
        {
             horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ "a.m";
             if (horas.getValue() == 12 )
             {
                 horas.setValue(1);
                 horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ "p.m";
             }
        }
        else
        {
             horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ "p.m";
             if (horas.getValue() == 12)
             {
                 horas.setValue(1);
                 horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ "a.m";
             }
        }
    }
    public void cambiarFormato(boolean mañanaOTarde,int horasX, int minutosX)
    {
        tiempo = mañanaOTarde;
        horas =  new NumberDisplay(13);
        minutos = new NumberDisplay(60);
        horas.setValue(horasX);
        minutos.setValue(minutosX);
        if (tiempo == true)
        {
            horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ "a.m";     
        }
        else
        {
            horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ "p.m";
        }
    }
}





    

