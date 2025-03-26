public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;
    public EcuacionCuadratica() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }
    public double getRaiz1() {
        double di= getDiscriminante();
        if (di>= 0) {
            return (-b + Math.sqrt(di)) / (2 * a);
        } else {
            return Double.NaN;  
        }
    }
    public double getRaiz2() {
        double di = getDiscriminante();
        if (di >= 0) {
            return (-b - Math.sqrt(di)) / (2 * a);
        } else {
            return Double.NaN;  
        }
    }
    public void resultados() {
        double dis = getDiscriminante();
        if (dis > 0) {
            System.out.printf("La ecuacion tiene dos raices: %.6f y %.6f%n", getRaiz1(), getRaiz2());
        } else if (dis == 0) {
            System.out.printf("La ecuacion tiene una raiz %.0f%n", getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}