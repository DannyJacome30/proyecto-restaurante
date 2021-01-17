package ec.du.epn.tdd.reserva;

import org.junit.Test;

import static org.junit.Assert.*;

public class MensajeConfirmacionTest {
    @Test
    public void given_ok_when_messageSend_then_Ok() {
        MensajeConfirmacion mc = new MensajeConfirmacion();
        assertNotNull(mc.mensajeEnviado("confirmado"));
    }
    @Test
    public void given_null_when_messageSend_then_null() {
        MensajeConfirmacion mc = new MensajeConfirmacion();
        assertNull(mc.mensajeEnviado(""));
    }
}