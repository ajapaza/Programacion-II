public class AlgebraVectorial {
    public static boolean esPerpendicular(Vector a, Vector b) {
        return a.sumar(b).magnitud() == a.restar(b).magnitud(); // |a + b| = |a - b|
    }
    public static boolean esPerpendicular(Vector a, Vector b, boolean e) {
        double p = a.x * b.x + a.y * b.y + a.z * b.z;
        return p == 0;  // a · b = 0
    }
    public static boolean esPerpendicular(Vector a, Vector b, int n) {
        double sumaC = Math.pow(a.magnitud(), n) + Math.pow(b.magnitud(), n);
        double mSuma = Math.pow(a.sumar(b).magnitud(), n);
        return mSuma == sumaC;  //|a + b|^2 = |a|^2 + |b|^2
    }
    public static boolean esParalelo(Vector a, Vector b) {
        return a.productoVectorial(b).magnitud() == 0;  //a x b = 0
    }
    public static boolean esParalelo(Vector a, Vector b, double r) {
        return (a.x / b.x == r) && (a.y / b.y == r) && (a.z / b.z == r);//  a = r * b
    }
    public static Vector proyeccion(Vector a, Vector b) {
        double pe = a.x * b.x + a.y * b.y + a.z * b.z;
        double mc = Math.pow(b.magnitud(), 2);
        double fa = pe / mc;
        return new Vector(b.x * fa, b.y * fa, b.z * fa);// Proyección de a sobre b
    }
    public static double componente(Vector a, Vector b) {
        double pe = a.x * b.x + a.y * b.y + a.z * b.z;
        return pe / b.magnitud();// Componente de a en b
    }
}