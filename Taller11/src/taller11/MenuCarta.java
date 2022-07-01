/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorB;
    private double pAdicional;


    public MenuCarta(String nP, double vI) {
        super(nP, vI);

    }

    public void establecerValorGuarnicion(double vPG) {
        valorGuarnicion = vPG;
    }

    public void establecerValorBebida(double vB) {
        valorB = vB;
    }

    public void establecerPorcentajeAdicional(double pA) {
        pAdicional = ((pA * valorInicial)) / 100;
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorB;
    }

    public double obtenerPorcentajeAdicional() {
        return pAdicional;
    }

    @Override
    public void calcularValorTotal() {
        valorMenu = (valorInicial + valorGuarnicion + valorB) + pAdicional;

    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta:\n%s", super.toString());
        cadena = String.format("%s"
                + "\tValor guarnición: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                cadena,
                obtenerValorGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }

}
