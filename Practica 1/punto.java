package punto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class punto {
    private double x;
    private double y;

    public punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void coordenadasCartesianas() {
        System.out.println("los puntos del plno cartesiano son : (" + x + ", " + y + ")");
    }

    public void coordenadasPolares() {
        double c = Math.sqrt(x * x + y * y);
        double a = Math.atan2(y, x);
        System.out.println("Las coordenadas Polares son : (r = " + c + ", θ = " + a + ")");
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        punto p = new punto(3, 4);
        p.coordenadasCartesianas();
        p.coordenadasPolares();
        p.toString();
    }
}