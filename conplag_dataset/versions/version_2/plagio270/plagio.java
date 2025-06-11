import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ObtenerFechaHoraConFormato {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fechaHoraStr = formato.format(fechaActual);
        System.out.println("Fecha y hora actual: " + fechaHoraStr);
    }
}