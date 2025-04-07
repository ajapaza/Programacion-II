/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego1;

import javax.swing.JOptionPane;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int n) {
        super(n);
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 11);
        boolean si = false;
        JOptionPane.showMessageDialog(null, "¡Juguemos! Adivina el número entre 0-10");

        while (numeroDeVidas > 0 && !si) {
            String inicio = JOptionPane.showInputDialog("ingrese un número. Tiene " + numeroDeVidas + " vidas:");
            
            if (inicio == null) {
                JOptionPane.showMessageDialog(null, "juego terminado.");
                return;
            }

            int i = Integer.parseInt(inicio); 

            if (!validaNumero(i)) {
                continue;
            }

            if (i != numeroAAdivinar) {
                JOptionPane.showMessageDialog(null, " fallaste :0 .El numero es " +
                    (i < numeroAAdivinar ? "mayor" : "menor"));

                if (!quitaVida()) {
                    JOptionPane.showMessageDialog(null, "lo siento el numero era: " + numeroAAdivinar);
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Acertaste!");
                actualizaRecord();
                si = true;
            }
        }
    }

    public boolean validaNumero(int a) {
        if (a > 10 || a < 0) {
            JOptionPane.showMessageDialog(null, "error :( , por favor ingrese un numero de 0-10");
            return false;
        }
        return true;
    }
}