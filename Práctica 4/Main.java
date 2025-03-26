public class Main {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new FiguraGeometrica();
        FiguraGeometrica f2 = new FiguraGeometrica();
        FiguraGeometrica f3 = new FiguraGeometrica();
        FiguraGeometrica f4 = new FiguraGeometrica();
        FiguraGeometrica f5 = new FiguraGeometrica();

        System.out.println("area del círculo es: " + f1.area(5));
        System.out.println("area del rectángulo es: " + f2.area(4, 10));
        System.out.println("area del triangulo es: " + f3.area(2, 10,2));
        System.out.println("area del trapecio es: " + f4.area(2, 10,2,2));
        System.out.println("area del pentagono es: " + f5.area(5, 1,2,2,2));
       
          }
}