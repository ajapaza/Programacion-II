3public class Estadistica {
    private float[] x;
    private int n;
    public Estadistica() {
        this.x = new float[10];
        this.n = 0;
    }
    public Estadistica(float[] x, int n) {
        this.x = new float[10];
        this.n = n;
        for (int i = 0; i < n; i++) {
            this.x[i] = x[i];
        }
    }
    public float promedio() {
        if (n == 0) 
            return 0.0f;
        float suma = 0;
        for (int i = 0; i < n; i++) {
            suma += x[i];
        }
        return suma / n;
    }
    public float desviacion() {
        if (n <= 1) 
            return 0.0f;
        float promedio = promedio();
        float suma2 = 0;
        for (int i = 0; i < n; i++) {
            suma2 += (x[i] - promedio) * (x[i] - promedio);
        }
        return (float) Math.sqrt(suma2 / (n - 1));
    }
}