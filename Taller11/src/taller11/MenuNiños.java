/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNiños(String nombrePl, double valorinicial, double vh, double vp) {
        super(nombrePl, valorinicial);
        valorHelado = vh;
        valorPastel = vp;
    }

    public void establecerValorHelado(double valorH) {
        this.valorHelado = valorH;
    }

    public void establecerValorPastel(double valorP) {
        valorPastel = valorP;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public void calcularvalorcancelartotal() {
        valorMenu = valorinicialMenu + valorHelado + valorPastel;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu de Ninos\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor Porcion Helado:%.2f\n"
                + "Valor Porcion Pastel:%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenerValorMenu()
        );
        return cadena;
    }
}
