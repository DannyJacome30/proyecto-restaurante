package ec.du.epn.tdd.reserva;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ReservationTestParametroMesa {
    private int numMesa, numIntegrantes;
    private String expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{1, 4, "res"});
        objects.add(new Object[]{2, 2, "res"});
        objects.add(new Object[]{3, 6, "res"});
        objects.add(new Object[]{4, 2, "res"});
        objects.add(new Object[]{5, 4, "res"});
        objects.add(new Object[]{6, 6, "res"});
        return objects;
    }

    public ReservationTestParametroMesa(int numMesa, int numIntegrantes, String expected) {
        this.numMesa = numMesa;
        this.numIntegrantes = numIntegrantes;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then_summation() {
        Reservation reservation = new Reservation();
        String actual = reservation.confirmacionMesa(numMesa, numIntegrantes);
        assertEquals(expected, actual);
    }

    @Test
    public void given_parameters() {
        Reservation reservation = new Reservation();
        String actual = reservation.confirmacionMesa(numMesa, numIntegrantes);
        assertNotEquals(expected, actual);
    }
}