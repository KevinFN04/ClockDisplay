
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
    }

