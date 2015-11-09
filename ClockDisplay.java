
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private int horas;
    
    private int min;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        horas = 00;
        min = 00;
    }

    /**
     * Poner en hora el reloj.
     */
    public void setTime(int hora, int minutos)
    {
       if (hora < 24 && minutos < 60){
        horas = hora;
        min = minutos;
       }
       else{
        System.out.println("Hora no admitida");
       }
    }
    
    /**
     * Pasar los minutos del reloj (incluidas horas en su debido momento).
     */
    public void timeTick()
    {
       if (min >= 59 && horas >= 23) {
           min = 00;
           horas = 00;
        }
       else if (min >= 59 && horas <= 23){
           min = 00;
           horas = horas + 1;
        }
       else {
           min = min + 1;
        }
    }
    
        /**
     * Mostrar la hora actual del reloj.
     */
    public String getTime()
    {
       String HoraAc = "%02d:%02d";
       String resultado = String.format(HoraAc,horas,min);
       return resultado;
    }
    }

