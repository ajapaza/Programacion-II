public class Vector {
    public double x;
    public double y;
    public double z;
    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector sumar(Vector a) {
        return new Vector(x + a.x, y + a.y, z + a.z);
    }
    public Vector restar(Vector b) {
        return new Vector(x - b.x, y - b.y, z - b.z);
    }
    public double productoEscalar(Vector b) {
        return x*b.x + y*b.y + z*b.z;
    }
    
    public Vector productoVectorial(Vector c) {
        return new Vector(y * c.z - z * c.y,z * c.x - x * c.z,x * c.y - y * c.x);
    }
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public String mostrar() {
    return "<"+ x + "," + y + "," + z +">";
}
}