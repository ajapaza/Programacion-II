/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego2;

import javax.swing.JOptionPane;

public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int n) {
        numeroDeVidas = n;
        record = 0;
    }

    public void reiniciaPartida() {
        JOptionPane.showMessageDialog(null, "partida nueva");
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            JOptionPane.showMessageDialog(null, " tu record es:  " + record);
        }
    }

    public boolean quitaVida() {
        if (numeroDeVidas <= 0) {
            JOptionPane.showMessageDialog(null, "te quedaste sin vidas.");
            return false;
        } else {
            numeroDeVidas--;
            JOptionPane.showMessageDialog(null, "tienes " + numeroDeVidas + " vidas.");
            return true;
        }
    }
}