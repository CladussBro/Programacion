package Tarea4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ej4_5 {
    public static void main(String[] args) {

        Calendar calendario = new GregorianCalendar();
        int hora, minutos, segundos;

        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }
}
