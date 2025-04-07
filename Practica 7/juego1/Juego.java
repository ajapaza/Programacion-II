/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego1;

import javax.swing.JOptionPane;

public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int n) {
        numeroDeVidas = n;
        record = 0;
    }

    public void reiniciaPartida() {
        JOptionPane.showMessageDialog(null, "partida nueva:");
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            JOptionPane.showMessageDialog(null, "tu record: " + record);
        }
    }

    public boolean quitaVida() {
        if (numeroDeVidas <= 0) {
            JOptionPane.showMessageDialog(null, "ya no tienes vidas");
            return false;
        } else {
            numeroDeVidas--;
            JOptionPane.showMessageDialog(null, "te quedan: " + numeroDeVidas+" vidas ");
            return true;
        }
    }
}