package ec.edu.epn.git.pedido;

/**
 *
 * @author erick
 */
public class Restaurante {
    private String[][] Menu;

    public Restaurante(String[][] Menu, int[][][] Mesas) {
        this.Menu = Menu;
        this.Mesas = Mesas;
    }
    int[][][] Mesas;

    public String[][] getMenu() {
        return Menu;
    }

    public void setMenu(String[][] Menu) {
        this.Menu = Menu;
    }

    public int[][][] getMesas() {
        return Mesas;
    }

    public void setMesas(int[][][] Mesas) {
        this.Mesas = Mesas;
    }

}
