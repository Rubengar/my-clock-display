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
    // Permite elegir si estamos en formato 12 horas(true) o 24 horas(false)
    private boolean relojDe12Horas;
    
    private int dia;
    
    private int mes;

    private int anno;
    

    /**
     * Crea un objeto ClockDisplay con hora por defecto 00:00
     * Es posible elegir el modelo horario en el que el reloj
     * muestra la hora: si reloj12Horas es true entonces funciona 
     * como un reloj en formato de 12 horas; en caso contrario,
     * como un reloj de 24 horas.
     */
    public ClockDisplay(boolean reloj12Horas)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        anno = 2015;
        dia = 20;
        mes = 11;
        relojDe12Horas = reloj12Horas;
        updateHoraActual();				
    }

    /** 
     * Crea un objeto ClockDisplay con la hora y los minutos dados
     * Es posible elegir el modelo horario en el que el reloj
     * muestra la hora: si reloj12Horas es true entonces funciona 
     * como un reloj en formato de 12 horas; en caso contrario,
     * como un reloj de 24 horas.
     */
    public ClockDisplay (int horasX, int minutosX, boolean reloj12Horas,int valorAnno,int valorMes,int valorDia)
    {
        horas =   new NumberDisplay(24);
        minutos = new NumberDisplay(60);	
           if ((valorDia <= 31) && (valorMes <= 12 ))
           {
            anno = valorAnno;
            dia = valorDia;
            mes = valorMes;
           }
           else
           {
               System.out.println("la fecha es incorecta");
           }
        horas.setValue(horasX);	
        minutos.setValue(minutosX);
        relojDe12Horas = reloj12Horas;
        updateHoraActual();    
    }

    /**
     * Fija la hora del reloj a la hora y los minutos dados
     */
    public void setTime(int horaY, int minutoY)
    {
        horas.setValue(horaY);	
        minutos.setValue(minutoY);
        updateHoraActual();
    }

    /**
     * Devuelve la hora del reloj como una cadena de 5 caracteres
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
            dia++;
                if (dia == 32)
                {
                    mes++;
                    dia = 1;
                        if (mes == 13)
                        {
                            mes = 1;
                            dia = 1;
                            anno++;
                        }
                }
        }
        updateHoraActual();
    }

    /**
     * Actualiza el atributo horaActual siguiendo las normas de un
     * reloj de 12 horas.
     */
    public void updateHoraActual()
    {
    	if (relojDe12Horas) {
	 		String formato = "a.m";
		    int horaAhora = horas.getValue(); 
		    if (horaAhora >= 12){
		        formato = "p.m.";
		    }

		    if (horaAhora > 12) {
		        horaAhora = horaAhora - 12;
		    }
		    else if (horaAhora == 0) {
		        horaAhora = 12;
		    }
		    horaActual = horaAhora + ":" + minutos.getDisplayValue() + " " + formato +" del dia " + dia + " del " + mes + " de " + anno ;
		}
		else {
			horaActual = horas.getDisplayValue() + ":" + minutos.getDisplayValue()+ " del dia " + dia + " del " + mes + " de " + anno ;     
		}
    }
     /**
     * Método que permite alternar entre los modos del reloj
     */
    public void changeFormat()
    {
    	relojDe12Horas = !relojDe12Horas;
    	updateHoraActual();	
    }	

}




