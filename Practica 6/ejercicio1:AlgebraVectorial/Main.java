public class Main {
    public static void main(String[] args) {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(-2, 1, 0);
        System.out.println(" la suma de "+a.mostrar()+" y "+ a.mostrar()+ " es: " + a.sumar(b).mostrar());
        System.out.println("la magnitud de "+a.mostrar()+" es: " + a.magnitud());
        System.out.println("el producto escalar de "+a.mostrar()+" · "+b.mostrar()+ " es: " + a.productoEscalar(b));
        System.out.println("el producto vectorial de "+a.mostrar()+" × "+b.mostrar()+ " es: "+ a.productoVectorial(b).mostrar());
      
           System.out.println("¿los vectores " +a.mostrar()  +" "+b.mostrar() + " son perpendiculares?: " + AlgebraVectorial.esPerpendicular(a, b));
        System.out.println("¿los vectores " +a.mostrar()+" "+b.mostrar() + " son perpendiculares?: " + AlgebraVectorial.esPerpendicular(a, b));
        System.out.println("¿los vectores " +a.mostrar() +" "+b.mostrar() + " son paralelos?: " + AlgebraVectorial.esParalelo(a, b));
        System.out.println("la Proyección de a sobre b =  " + b.mostrar());
        System.out.println("el componente  de a y b = " + AlgebraVectorial.componente(a, b));
    
    }
    }
