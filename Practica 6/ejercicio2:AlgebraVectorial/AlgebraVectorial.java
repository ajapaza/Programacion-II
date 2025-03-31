public class AlgebraVectorial {
    public double x, y, z;
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public AlgebraVectorial sumar(AlgebraVectorial b) {
        return new AlgebraVectorial(
        x + b.x, 
        y + b.y, 
        z + b.z);
    }
    public AlgebraVectorial multiplicar(double k) {
        return new AlgebraVectorial(
        k*x, 
        k*y, 
        k*z);
    }
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    public AlgebraVectorial normalizar() {
        double m = magnitud();
        return new AlgebraVectorial(
        x/m, 
        y/m, 
        z/m);
    }
    public double productoEscalar(AlgebraVectorial b) {
        return x*b.x + y*b.y + z*b.z;
    }
    public AlgebraVectorial productoVectorial(AlgebraVectorial b) {
        return new AlgebraVectorial(
            y*b.z - z*b.y,
            z*b.x - x*b.z,
            x*b.y - y*b.x
        );
    }
    public boolean esPerpendicular(AlgebraVectorial b) {
        return productoEscalar(b) == 0;
    }
    public AlgebraVectorial proyeccionOrtogonal(AlgebraVectorial b) {
    double f = productoEscalar(b) / (b.x*b.x + b.y*b.y + b.z*b.z);
    return b.multiplicar(f);
}
    
    public double componente(AlgebraVectorial b) {
        return productoEscalar(b)/b.magnitud();
    }
    public String mostrar() {
        return "< " + x + ", " + y + ", " + z + ">";
    }
}