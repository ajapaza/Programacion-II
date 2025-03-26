public class FiguraGeometrica {

    
    public double area(double radio) {
        return Math.PI * radio * radio; // círculo
    }

   
     double area(double base, double altura) {
        return base * altura; // rectángulo
    }

   
    double area(double base, double altura,int x) {
        return (base * altura) / x; // triángulo rectángulo 
    }

    
    double area(double baseA, double baseB, double altura,int x) {
        return (baseB * altura)+((baseA - baseB) / x) * altura;// trapecio
    }

   
        double area(double lado, double longitudLado, double altura, int x, int y) {
   
    double apotema = (altura * x) / y;
            return (lado * longitudLado * apotema) / (2 * Math.tan(Math.PI / lado));// pentagono
        }
}


  

    