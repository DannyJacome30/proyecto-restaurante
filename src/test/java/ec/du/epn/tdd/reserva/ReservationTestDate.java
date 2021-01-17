package ec.du.epn.tdd.reserva;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class ReservationTestDate {
    Reservation r = new Reservation();

    @Test
    public void get_verificarFecha_ok_then_true() throws ParseException {
        assertTrue(r.verificarFecha("12/01/2021").equalsIgnoreCase("ok"));
    }

    @Test
    public void get_verificarFecha_error_then_false() throws ParseException {
        assertFalse(r.verificarFecha("12/01/2020").equalsIgnoreCase("error"));
    }
}