/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public class MenudelDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenudelDia(String n, double vinicial, double vpostre, double vbebida) {
        super(n, vinicial);
        valorPostre = vpostre;
        valorBebida = vbebida;
    }

    public void establecerValorPostre(double vP) {
        valorPostre = vP;
    }

    public void establecerValorBebida(double vBebida) {
        valorBebida = vBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public void calcularvalorcancelartotal() {
        valorMenu = valorinicialMenu + valorPostre + valorBebida;
    }

    public double obtenerValorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu del dia\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor Postre:%.2f\n"
                + "Valor Bebida:%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerValorPostre(),
                obtenerValorBebida(),
                obtenerValorMenu());
        return cadena;
    }
}
