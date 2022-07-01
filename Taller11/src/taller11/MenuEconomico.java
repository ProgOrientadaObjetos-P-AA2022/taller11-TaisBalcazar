/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nP, double vinicialM) {
        super(nP, vinicialM);

    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double pD) {
        porcentajeDescuento = ((pD * valorInicial)) / 100;
    }

    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicial - porcentajeDescuento;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Económico\n%s", super.toString());
        cadena = String.format("%s"
                + "Porcentaje Descuento: %.2f\n"
                + "Valor del Menu:%.2f\n", cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }
}
