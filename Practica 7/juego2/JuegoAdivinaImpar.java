/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego2;

import javax.swing.JOptionPane;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int n) {
        super(n);
    }

    public boolean validaNumero(int b) {
        if (!super.validaNumero(b)) {
            return false;
        }

        if (b % 2 == 0) {
            JOptionPane.showMessageDialog(null, "error ingrese un  impar por favor");
            return false;
        }
        return true;
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 5) * 2 + 1;
        boolean bien = false;

        JOptionPane.showMessageDialog(null, "adivina un numero impar entre 0-10");

        while (numeroDeVidas > 0 && !bien) {
            String input = JOptionPane.showInputDialog("ingrese un numero con " + numeroDeVidas + " vidas:");
            int intento = Integer.parseInt(input);

            if (!validaNumero(intento)) {
                continue;
            }

            if (intento != numeroAAdivinar) {
                JOptionPane.showMessageDialog(null, "fallaste :( . El número es " + (intento < numeroAAdivinar ? "mayor" : "menor"));
                if (!quitaVida()) {
                    JOptionPane.showMessageDialog(null, "lo siento el numero era: " + numeroAAdivinar);
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Acertaste! :D");
                actualizaRecord();
                bien = true;
            }
        }
    }
}