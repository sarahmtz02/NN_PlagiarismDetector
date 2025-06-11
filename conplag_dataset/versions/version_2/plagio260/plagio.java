import java.util.Calendar;
import java.util.Date;

public class MostrarFechaDeHoy {
    public static void main(String[] args) {
        Date fechaSistema = new Date();
        // Alternativamente, usando Calendar si se necesita más manipulación
        Calendar cal = Calendar.getInstance();
        System.out.println("La fecha de hoy es: " + cal.get(Calendar.DAY_OF_MONTH) + "/" + 
                           (cal.get(Calendar.MONTH) + 1) + "/" + 
                           cal.get(Calendar.YEAR));
    }
}