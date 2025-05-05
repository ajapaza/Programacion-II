/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac10ejer2filaa;

/**
 *
 * @author Windows_11
 */
public class Prac10ejer2filaA {

   public static void main(String[] args) {
        // a) 
        System.out.println("a)");
       LineaTeléferico l1 = new LineaTeléferico("Rojo", "Estación Central, Estación Cementerio, Estación 16 de Julio", 20);
       LineaTeléferico l2 = new LineaTeléferico("Morado", "Estación Sur, Estación Libertador");
        l1.añadirEmpleado("Pedro", "Rojas", "Luna", "Garcia", 35, 6000.0);
        l1.añadirEmpleado("Lucy", "Sosa", "Rios", "Mendez", 28, 5500.0);
        l2.añadirEmpleado("Ana", "Perez", "Rojas", "Lopez", 35, 5000.0);
        l2.añadirEmpleado("Saul", "Arce", "Calle", "Vargas", 40, 7000.0);
        l2.añadirEmpleado("Carlos", "Mendez", "Paz", "Torres", 28, 4500.0);
         System.out.println("linea roja:");
        l1.mostrar();
        System.out.println("linea Morada:");
        l2.mostrar();
        System.out.println("b)");
        l1.mostrar(); 
        l1.eliminarEmpleadoX("Rojas");
        l1.mostrar();
        System.out.println("c)");
        System.out.println("linea Morada:");
        l2.mostrar();
        System.out.println("linea roja:");
        l1.mostrar();  
        l1.transferirEmpleado(l2, 2);
        System.out.println("linea Morada:");
        l2.mostrar();
        System.out.println("linea roja:");
        l1.mostrar();
        // d)
        System.out.println("d)");
        System.out.println("linea roja:");
        System.out.println("Empleados con menor edad:");
        l1.mostrarEmpleados();
        System.out.println("Empleados con menor sueldo:");
        l1.mostrarEmpleados(6000.0);
        System.out.println("linea Morada:");
        System.out.println("Empleados con menor edad:");
        l2.mostrarEmpleados();
        System.out.println("Empleados con menor sueldo:");
        l2.mostrarEmpleados(6000.0);
   }  
}
