/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows_11
 */
public class Platea extends Boleto {
    protected int diasAnticipacion;
    
    public Platea(int numero, int diasAnticipacion) {
        super(numero);
        this.diasAnticipacion = diasAnticipacion;
        this.precio = calcularPrecio();
    }
    
    protected double calcularPrecio() {
        return (diasAnticipacion >= 10) ? 50.00 : 60.00;
    }
}

