/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

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
