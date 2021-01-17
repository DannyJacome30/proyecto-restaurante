package ec.du.epn.tdd.reserva;

public class MensajeConfirmacion {
    public Object mensajeEnviado(String mensaje){
        Object msm = mensaje;
        if (!mensaje.equalsIgnoreCase("confirmado"))
            return null;
        else
            return msm;
    }
}
