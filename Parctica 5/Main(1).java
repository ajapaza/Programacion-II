import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           System.out.print("In a, b, c : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        EcuacionCuadratica ecuacion1 = new EcuacionCuadratica(a, b, c);
           ecuacion1.resultados();

        System.out.print("Ingrese a, b, c : ");
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        EcuacionCuadratica ecuacion2 = new EcuacionCuadratica(d, e, f);
        ecuacion2.resultados();

        
        scanner.close();
    }
}