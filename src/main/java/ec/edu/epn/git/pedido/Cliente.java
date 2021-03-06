package ec.edu.epn.git.pedido;

/**
 *
 * @author erick
 */
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String password;
    private String correo_electronico;

    public Cliente(String Nombre, String Apellido, String password, String correo_electronico) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.password = password;
        this.correo_electronico = correo_electronico;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean add_seleccion(Empleado empleado1,Restaurante restaurante,int opcion){
        String errores="";
        //valdiacion
        System.out.println("soy "+this.Nombre+" "+this.Apellido+" voy a ingresar a la aplciacion con las credenciales");
        if("eliana.sanchez@epn.edu.ec".equals(this.correo_electronico) && "eli123".equals(this.password)){
            System.out.println("credenciales correctas");
        }else{
            System.out.println("credenciales incorrectas"+this.correo_electronico+this.password);
            errores+="\ncredecniales incorrectas ";
        }
        //menu de opciones
        
        switch(opcion){
            case 1:
                //caso reservar mesa
                System.out.println("se reserva una mesa");
                break;
            case 2:
                //caso realziar pedido
                System.out.println("se realiza el pedido");
                System.out.println("El cliente selecciono la siguiente combinacion: "+restaurante.getMenu()[0][0]+", "+ restaurante.getMenu()[3][0] + ", " +restaurante.getMenu()[7][0]+" y "+restaurante.getMenu()[8][0]);
                //confirmacion del empleado             
               if(empleado1.getCargo()=="Mesero"){
                   //validacion de existencia del stock
                   if(restaurante.getMenu()==null){
                        errores+="\nNo se tiene disponible ese producto";
                    }
                    System.out.println("Se confirmo el pedido por el mesero: "+empleado1.getNombre()+" "+empleado1.getApellido());
                    System.out.println("el precio total es: "+ (Integer.parseInt(restaurante.getMenu()[0][1])+Integer.parseInt(restaurante.getMenu()[3][1])+Integer.parseInt(restaurante.getMenu()[7][1])+Integer.parseInt(restaurante.getMenu()[8][1])));
                }else{
                    System.out.println("Pedido sin confirmar");
                    errores+="\nno se pudo confirmar el pedido ";
                }
                break;
            case 0:
                //salir
                break;
        }
        
        
        if(!"".equals(errores)){
            System.out.println("Existen errores que no permiten la finalizacion "+errores);
            return false;
        }
        return true;
    }
}





