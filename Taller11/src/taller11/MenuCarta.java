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
    private double valorBebida;
    private double porcentajeAdicional;


    public MenuCarta(String nP, double vinicialM, double vPG, double vBebida) {
        super(nP, vinicialM);
        valorGuarnicion = vPG;
        valorBebida = vBebida;

    }

    public void establecerValorGuarnicion(double vPG) {
        valorGuarnicion = vPG;
    }

    public void establecerValorBebida(double vBebida) {
        valorBebida = vBebida;
    }

    public void establecerPorcentajeAdicional(double pA) {
        porcentajeAdicional = ((pA * valorinicialMenu)) / 100;
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public void calcularvalorcancelartotal() {
        valorMenu = (valorinicialMenu + valorGuarnicion + valorBebida) + porcentajeAdicional;

    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la carta\n%s", super.toString());
        cadena = String.format("%s"
                + "Valor porcion guarnicion:%.2f\n"
                + "Valor bebida:%.2f\n"
                + "Porcentaje Adicional:%.2f\n"
                + "Valor menu:%.2f\n", cadena,
                obtenerValorGuarnicion(),
                obtenerValorBebida(),
                obtenerPorcentajeAdicional(),
                obtenerValorMenu());
        return cadena;
    }

}
