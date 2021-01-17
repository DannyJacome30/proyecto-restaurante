package ec.edu.epn.tdd.Pedido;

/**
 *
 * @author erick
 */
public class Empleado {
    private String Nombre;
    private String Apellido;
    private String Cargo;

    public Empleado(String Nombre, String Apellido, String Cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
}
