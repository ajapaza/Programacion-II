/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego2;

import javax.swing.JOptionPane;

public class Aplicacion2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenidos al Juego ADININA EL NUMERO :D");
        String[] menus = {"Juego Adivina Número", "Juego Adivina Par", "Juego Adivina Impar"};
        int opcion = JOptionPane.showOptionDialog(null, "elige un juego", "cliquea el juego", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menus, menus[0]);
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, "iniciar JUEGO ADIVINEMOS UN NUMERO");
                JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
                juegoNormal.juega();
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "iniciar JUEGO ADIVINEMOS UN NUMERO PAR");
                JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
                juegoPar.juega();
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "iniciar JUEGO ADIVINEMOS UN NUMERO IMPAR");
                JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
                juegoImpar.juega();
                break;

            default:
                JOptionPane.showMessageDialog(null, "error, juego cerrado");
                break;
        }
    }
}