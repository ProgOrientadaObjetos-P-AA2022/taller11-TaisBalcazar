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

    public Menu(String nP, double vinicialM) {
        nombrePlato = nP;

        valorinicialMenu = vinicialM;
    }

    public void establecerNombrePlato(String nP) {
        nombrePlato = nombrePlato;
    }

    public void establecerValorMenu(double vMenu) {
        valorMenu = vMenu;
    }

    public void establecerValorinicialMenu(double vinicialMenu) {
        valorinicialMenu = vinicialMenu;
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
