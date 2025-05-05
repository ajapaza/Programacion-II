/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac10ejer2filab;

/**
 *
 * @author Windows_11
 */
public class Prac10ejer2FilaB {

    public static void main(String[] args) {
         System.out.println("a)"); 
        Ministerio m1 = new Ministerio("MinTransporte", "Av. Arce #123");
        Ministerio m2 = new Ministerio("MinSalud", "Av. 16 de Julio #456", 23);
        m1.añadirEmp("Pedro","Rojas", "Luna", "Garcia", 35, 6000.0);
        m1.añadirEmp("Lucy","Sosa", "Rios", "Mendez", 28, 5500.0);
        m2.añadirEmp("Ana", "Perez","Rojas", "Lopez", 35, 5000.0);
        m2.añadirEmp("Saul", "Arce","Calle", "Vargas", 40, 7000.0);
        m2.añadirEmp("Carlos", "Mendez", "Paz", "Torres", 28, 4500.0);
        System.out.println("Ministerio de Transporte:");
        m1.mostrar();
        System.out.println("Ministerio de Salud:");
        m2.mostrar();
        System.out.println("b)");
        m1.mostrar(); 
        m1.eliminarEmpleadoX(35);
        m1.mostrar();
        System.out.println("c)");
        System.out.println("Ministerio de Salud:");
        m2.mostrar();
        System.out.println("Ministerio de Transporte:");
        m1.mostrar();  
        m1.transferirEmpleado(m2, 2);
        System.out.println("Ministerio de Salud:");
        m2.mostrar();
        System.out.println("Ministerio de Transporte:");
        m1.mostrar();
        // d)
        System.out.println("d)");
        System.out.println("Ministerio de Transporte:");
        System.out.println("Empleados con menor edad:");
        m1.mostrarEmpleados();
        System.out.println("Empleados con menor sueldo:");
        m1.mostrarEmpleados(6000.0);
        System.out.println("Ministerio de Salud:");
        System.out.println("Empleados con menor edad:");
        m2.mostrarEmpleados();
        System.out.println("Empleados con menor sueldo:");
        m2.mostrarEmpleados(6000.0);
    }

}

