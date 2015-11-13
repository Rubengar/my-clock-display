
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own

    private int max;
    
    private int min;
   
    
    /**
     * Un constructor que recibe por parámetro el límite del display y que fija el valor actual del display a 0.
     */
    public NumberDisplay(int limiteDelDisplay)
    {
       min = 0 ;
       max = limiteDelDisplay;
    }
    
    /**
     * fija el valor actual del display al valor pasado como parámetro
     */
    public void setValue(int valorPasado)
    {
        min = valorPasado;
    }
    /**
     * 
     */
    public String getDisplay()
    {
     String valor = "";
        if (min < 10)
        {
         valor = ""+"0"+ min ;
         return valor;
        }
        else
        {
          valor = " " + min ;
          return valor;
        }
     
    }
}
