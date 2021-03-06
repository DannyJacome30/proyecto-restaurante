package ec.edu.epn.git.reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {

    private Date fecha;
    private String hora;
    private int numPersonas;
    SimpleDateFormat fechaF = new SimpleDateFormat("yyyy/mm/dd");
    public int reser(String fecha, String hora, int numPersonas) {

        String mesa="disponible";
        int rsv=0;
        if(mesa.equalsIgnoreCase("disponible"))
            rsv = 1;
        else if (mesa.equalsIgnoreCase("ocupado"))
            rsv = 0;
        return rsv;
    }

    public String confirmacionMesa(int mesa, int numPersonas) {
        return "ok";
    }

    public String verificarFecha(String date) throws ParseException {

        Date dateReservation = fechaF.parse(date);
        Date fecha = new Date();
        int dia = fecha.getDate();
        int mes = fecha.getMonth();
        int año = fecha.getYear();

        String fechaFormato= dia + "/" + (mes+1) + "/" + año;
        Date fechaActual = fechaF.parse(fechaFormato);
        if (dateReservation.after(fechaActual))
            return "ok";
        else
            return "error";

    }

}