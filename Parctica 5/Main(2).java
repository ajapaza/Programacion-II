import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        float[] a = new float[10];
        int x = 10;
        for (int i = 0; i < x; i++) {
            a[i] = es.nextFloat();
        }
        Estadistica notas = new Estadistica(a, x);
        System.out.printf("El promedio es  %.2f%n", notas.promedio());
        System.out.printf("La desviacion estandar es %.5f%n", notas.desviacion());
        es.close();
    }
}