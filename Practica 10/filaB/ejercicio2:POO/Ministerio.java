/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac10ejer2filab;
public class Ministerio {
    private String nombre;
    private String direccion;
    private int nroEmpleados = 0;
    private String[][] empleados = new String[100][4]; 
    private int[] edades = new int[100];
    private double[] sueldos = new double[100];
  
    public Ministerio(String nombre, String direccion, int nroEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = 0; 
    }

    public Ministerio(String nombre, String direccion) {
        this(nombre, direccion, 0);
    }

    // b)
    public void eliminarEmpleadoX(int x) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == x) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j][0] = empleados[j+1][0]; 
                    empleados[j][1] = empleados[j+1][1]; 
                    edades[j] = edades[j+1];
                    sueldos[j] = sueldos[j+1];
                }
                nroEmpleados--;
                i--; 
            }
        }
    }

    // c) 
    public void transferirEmpleado(Ministerio origen, int indice) {
        if (indice >= 0 && indice < origen.nroEmpleados && nroEmpleados < 100) {
            empleados[nroEmpleados][0] = origen.empleados[indice][0];
            empleados[nroEmpleados][1] = origen.empleados[indice][1];
            edades[nroEmpleados] = origen.edades[indice];
            sueldos[nroEmpleados] = origen.sueldos[indice];
            nroEmpleados++;
            origen.quitarEmp(indice);
        }
    }
    public void añadirEmp(String a, String b, String c,String d, int x, double y) {
        if (nroEmpleados < 100) {
            empleados[nroEmpleados][0] = a;
            empleados[nroEmpleados][1] = b;
            empleados[nroEmpleados][2] = c;
            empleados[nroEmpleados][3] = d;
            edades[nroEmpleados] = x;
            sueldos[nroEmpleados] = y;
            nroEmpleados++;
        }
    }
    public  void quitarEmp(int x) {
        if (x >= 0 && x < nroEmpleados) {
            for (int j = x; j < nroEmpleados - 1; j++) {
                empleados[j][0] = empleados[j+1][0];
                empleados[j][1] = empleados[j+1][1];
                edades[j] = edades[j+1];
                sueldos[j] = sueldos[j+1];
            }
            nroEmpleados--;
        }
    }
       // d) 
    public void mostrarEmpleados() {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados");
            return;
        }
        int a = edades[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (edades[i] < a) {
                a = edades[i];
            }
        }  
        System.out.println("Empleados con menor edad " + a + " años:");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == a) {
                System.out.println("- " + empleados[i][0] + " " + empleados[i][1]);
            }
        }
    }
    // d) 

  public void mostrarEmpleados(double x) {
    if (nroEmpleados == 0) {
        System.out.println("No hay empleados");
        return;
    }
    System.out.println("Empleados con sueldo menor a " + x + " Bs:");
    boolean a = false; 
    for (int i = 0; i < nroEmpleados; i++) {
        if (sueldos[i] < x) {
            System.out.println("- " + empleados[i][0] + " " + empleados[i][1] + 
                              " (Sueldo: " + sueldos[i] + " Bs)");
            a = true;
        }
    } 
    if (!a) {
        System.out.println("No se encontraron empleados con sueldo menor a " + x);
    }
}
   public void mostrar() {
    for (int i = 0; i < this.nroEmpleados; i++) {
        System.out.printf(" %-7s %-15s | %-4d | %-10.2f \n",this.empleados[i][0], this.empleados[i][1] + " " + this.empleados[i][2] + " " + this.empleados[i][3],this.edades[i], this.sueldos[i]    
        );
    }
}
}
   