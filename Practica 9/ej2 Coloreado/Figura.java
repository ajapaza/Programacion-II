/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows_11
 */
public abstract class Figura  {
    public String color;

    public Figura(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
public String toString(){
 return String.format("Figura: color [%f]",color);
}    
    public  abstract double area(); 
    public  abstract double  perimetro(); 
}
