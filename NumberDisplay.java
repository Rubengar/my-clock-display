
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
    
    private int num;
   
    
    /**
     * Un constructor que recibe por parámetro el límite del display y que fija el valor actual del display a 0.
     */
    public NumberDisplay(int limiteDelDisplay)
    {
       num = 0 ;
       max = limiteDelDisplay;
    }
    
    /**
     * fija el valor actual del display al valor pasado como parámetro
     */
    public void setValue(int valorPasado)
    {
        num = valorPasado;
    }
    /**
     * devuelve el valor actual del display en forma de cadena de 2 caracteres
     */
    public String getDisplay()
    {
     String valor = "";
        if (num < 10)
        {
         valor = ""+"0"+ num ;
         return valor;
        }
        else
        {
          valor = " " + num ;
          return valor;
        }
     
    }
    public int getValue()
    {
        return num;
    }
    /**
     * método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite
     */
    public void increment()
    {
       if (num == (max - 1))
            {
                num = 0;
            }
            else
            {
                num = num + 1;
            }
    }
}
