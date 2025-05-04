/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows_11
 */
public class Boleto {
    protected int numero;
    protected double precio;
    
    public Boleto(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString() {
        return String.format("Número: %d, Precio: %.1f", numero, precio);
    }
}

