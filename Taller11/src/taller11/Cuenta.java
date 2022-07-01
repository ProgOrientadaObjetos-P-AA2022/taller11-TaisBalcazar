/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author UTPL
 */
public class Cuenta {

    private String nombreC;
    private ArrayList<Menu> menu = new ArrayList<>();
    private double valorCancelar;
    private double subtotal;
    private double iva = 0.10;

    public Cuenta(String n, ArrayList<Menu> lista) {
        nombreC = n;
        menu = lista;
    }

    public void establecerNombre(String n) {
        nombreC = n;
    }

    public void establecerMenus(ArrayList<Menu> lista) {
        menu = lista;
    }

    public void establecerSubtotal(double s) {
        subtotal = s;
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public void calcularValorCancelar() {
        for (int i = 0; i < menu.size(); i++) {
            subtotal += menu.get(i).obtenerValorMenu();
        }

        iva = subtotal * iva;
        valorCancelar = subtotal + iva;

    }

    public String obtenerNombre() {
        return nombreC;
    }

    public ArrayList<Menu> obtenerMenus() {
        return menu;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente:%s\n",
                obtenerNombre());
        for (int i = 0; i < obtenerMenus().size(); i++) {
            cadena = String.format("%s"
                    + "%d "
                    + "%s\n",
                    cadena,
                    (i + 1),
                    obtenerMenus().get(i));

        }
        cadena = String.format("\n%s"
                + "Subtotal:%.2f\n"
                + "Iva:%.2f\n"
                + "Total a pagar:%.2f\n",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }
}
