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
public class Principal {

    public static void main(String[] args) {

        ArrayList<Menu> menu = new ArrayList<>();

        MenuNiños mn1 = new MenuNiños("Niños 01", 2);
        mn1.establecerValorHelado(1.50);
        mn1.establecerValorPastel(1);
        mn1.calcularValorTotal();

        MenuNiños mn2 = new MenuNiños("Niños 02", 3);
        mn2.establecerValorHelado(1.50);
        mn2.establecerValorPastel(1);
        mn2.calcularValorTotal();
        menu.add(mn1);
        menu.add(mn2);

        MenuEconomico me1 = new MenuEconomico("Econo 001", 4);
        me1.establecerPorcentajeDescuento(5);
        me1.calcularValorTotal();
        menu.add(me1);

        MenudelDia md1 = new MenudelDia("Dia 001", 5);
        md1.establecerValorBebida(1);
        md1.establecerValorPostre(1);
        md1.calcularValorTotal();
        menu.add(md1);

        MenuCarta mC1 = new MenuCarta("Carta001", 6);
        mC1.establecerValorGuarnicion(1.50);
        mC1.establecerValorBebida(2);
        mC1.establecerPorcentajeAdicional(10);
        mC1.calcularValorTotal();
        menu.add(mC1);

        Cuenta c = new Cuenta("Tais Balcazar", menu);
        c.calcularValorCancelar();

        System.out.println(c);

    }

}
