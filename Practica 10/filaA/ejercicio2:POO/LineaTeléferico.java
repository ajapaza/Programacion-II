/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac10ejer2filaa;

public class LineaTeléferico {
    private String color;
    private String tramo;
    private int nroCabinas;
    private int nroEmpleados = 0;
    private String[][] empleados = new String[100][4]; 
    private int[] edades = new int[100];
    private double[] sueldos = new double[100];

    public LineaTeléferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
    }

    public LineaTeléferico(String color, String tramo) {
        this(color, tramo, 4);
    }
    public void eliminarEmpleadoX(String x) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][1].equals(x) || empleados[i][2].equals(x)) {
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j][0] = empleados[j+1][0];
                    empleados[j][1] = empleados[j+1][1]; 
                    empleados[j][2] = empleados[j+1][2];
                    empleados[j][3] = empleados[j+1][3];
                    edades[j] = edades[j+1];
                    sueldos[j] = sueldos[j+1];
                }
                nroEmpleados--;
                i--;
            }
        }
    }
    public void transferirEmpleado(LineaTeléferico a, int b) {
        if (b >= 0 && b < a.nroEmpleados && nroEmpleados < 100) {
            for (int i = 0; i < 4; i++) {
                empleados[nroEmpleados][i] = a.empleados[b][i];
            }
            edades[nroEmpleados] = a.edades[b];
            sueldos[nroEmpleados] = a.sueldos[b];
            nroEmpleados++;
            a.quitarEmpleado(b);
        }
    }

    private void quitarEmpleado(int x) {
        if (x >= 0 && x < nroEmpleados) {
            for (int j = x; j < nroEmpleados - 1; j++) {
                empleados[j][0] = empleados[j+1][0];
                empleados[j][1] = empleados[j+1][1];
                empleados[j][2] = empleados[j+1][2];
                empleados[j][3] = empleados[j+1][3];
                edades[j] = edades[j+1];
                sueldos[j] = sueldos[j+1];
            }
            nroEmpleados--;
        }
    }

    public void añadirEmpleado(String a, String b, String c, String d, int x, double y) {
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

    // d) 
    public void mostrarEmpleados() {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados");
            return;
        }
        
        int may = edades[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (edades[i] > may) {
                may = edades[i];
            }
        }
        
        System.out.println("Empleados con mayor edad " + may + " años:");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == may) {
                System.out.println(empleados[i][0] + " " + empleados[i][1] + " " + empleados[i][2]);
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
        System.out.println("Línea: " + color);
        System.out.println("Tramo: " + tramo);
        System.out.println("Cabinas: " + nroCabinas);
        System.out.println("Empleados " + nroEmpleados + " ");
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.printf("| %-7s %-20s | %-4d | %-8.2f |\n",empleados[i][0],empleados[i][1] + " " + empleados[i][2] + " " + empleados[i][3],edades[i],sueldos[i]
            );
        }
     
    }

    
}