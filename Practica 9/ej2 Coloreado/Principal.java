/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows_11
 */
import java.util.ArrayList;
public class Principal {
   public static void main(String[] args) {
    ArrayList<Figura> figuras = new ArrayList<>();
    figuras.add(new Cuadrado("Rojo", 5.0));
    figuras.add(new Circulo("Azul", 3.0));
    figuras.add(new Cuadrado("Verde", 4.5));
    figuras.add(new Cuadrado("negro", 5.0));  
    figuras.add(new Circulo("violeta", 3.0));   
    for (int i = 0; i < 5; i++) { 
        Figura f1 = figuras.get(i);
        System.out.println("--------------------------------");
        System.out.println("color: " + f1.getColor());
        System.out.printf("area: %.1f%n", f1.area());
        System.out.printf("perimetro: %.1f%n", f1.perimetro());
        if (f1 instanceof Coloreado) {
            System.out.println("colorear: " + ((Coloreado)f1).comoColorear());
        }
    }
}
}