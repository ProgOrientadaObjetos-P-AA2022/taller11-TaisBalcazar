/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorinicialMenu;

    public Menu(String n, double vinicial) {
        nombrePlato = n;
        valorinicialMenu = vinicial;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorMenu(double v) {
        valorMenu = v;
    }

    public void establecerValorinicialMenu(double vinicial) {
        valorinicialMenu = vinicial;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorinicialMenu() {
        return valorinicialMenu;
    }

    public abstract void calcularvalorcancelartotal();

    @Override
    public String toString() {
        String cadena = String.format("Nombre Plato:%s\n"
                + "Valor menu inicial:%.2f\n", obtenerNombrePlato(),
                obtenerValorinicialMenu());
        return cadena;
    }
}
