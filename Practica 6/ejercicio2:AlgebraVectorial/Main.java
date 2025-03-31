public class Main {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(1, 2, 3);
        AlgebraVectorial b = new AlgebraVectorial(-2, 1,0);
        System.out.println(" la suma de "+a.mostrar()+" y "+ a.mostrar()+ " es: " + a.sumar(b).mostrar());
        System.out.println("la multiplicación por un escalar k con "+a.mostrar()+ " es: " + a.multiplicar(0).mostrar());
        System.out.println("la magnitud de "+a.mostrar()+" es: " + a.magnitud());
        System.out.println("la norma de |"+a.mostrar()+"| es: " + a.normalizar().mostrar());
        System.out.println("el producto escalar de "+a.mostrar()+" · "+b.mostrar()+ " es: " + a.productoEscalar(b));
        System.out.println("el producto vectorial de "+a.mostrar()+" × "+b.mostrar()+ " es: "+ a.productoVectorial(b).mostrar());
        System.out.println("los vectores "+a.mostrar()+" y "+b.mostrar()+" son perpendiculares?: "+ a.esPerpendicular(b));
        System.out.println("la proyección de "+a.mostrar()+" sobre "+b.mostrar()+" es: " + a.proyeccionOrtogonal(b).mostrar());
        System.out.println("los vectores "+a.mostrar()+" y "+b.mostrar()+" su componente es: " + a.componente(a));
          }
}