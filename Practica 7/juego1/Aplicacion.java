/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego1;

import javax.swing.JOptionPane;

public class Aplicacion {
    public static void main(String[] args) {
        String menus = " BIENVENIDO AL JUEGO ¡ ADIVINA UN NUMERO! \n Elige la opcion de :\n" + "1. jugaremos una vez?\n" + "2. jugaremos dos veces?\n"+ "3. Salir";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(menus));
        
        switch (opcion) {
            case 1:
                JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3);
                juego.juega();
                break;
            case 2:
                JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
                juego1.juega();
                JuegoAdivinaNumero juego2 = new JuegoAdivinaNumero(3);
                juego2.juega();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saliendo del juego.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "error");
        }
    }
}