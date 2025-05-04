/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;

public class TeatroGUI extends javax.swing.JFrame {

    public TeatroGUI() {
        initComponents();
        configurandoboletos();
    }

    private void configurandoboletos() {
        jButton1.addActionListener(e -> boletos());
        jButton2.addActionListener(e -> System.exit(0));
    }

    private void boletos() {
        if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected() && !jRadioButton3.isSelected()) {
            JOptionPane.showMessageDialog(this, "eliga un boleto", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String a = jTextPane1.getText().trim();
        if (!a.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "ingrese un numero", "error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int d = 0;
        if (jRadioButton2.isSelected() || jRadioButton3.isSelected()) {
            if (!jTextField1.getText().trim().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "ingrese los dias validos", "error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            d = Integer.parseInt(jTextField1.getText().trim());
        }

        Boleto b1 = jRadioButton1.isSelected() ? new Palco(Integer.parseInt(a)) :
                      jRadioButton2.isSelected() ? new Platea(Integer.parseInt(a), d) :
                      new Galeria(Integer.parseInt(a), d);

        jTextField2.setText(b1.toString());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            TeatroGUI t1 = new TeatroGUI();
            t1.setVisible(true);
            t1.setLocationRelativeTo(null);
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code with Adjusted Image Position">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Teatro Municipal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jRadioButton1.setText("Palco");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 104, -1, -1));

        jRadioButton2.setText("Platea");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 104, -1, -1));

        jRadioButton3.setText("Galeria");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 104, -1, -1));

        jLabel2.setText("Numero:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 143, -1, -1));

        jLabel3.setText("Cant. Dias para el Evento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 186, -1, -1));

        jScrollPane2.setViewportView(jTextPane1);
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 143, 92, -1));

        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 183, 92, -1));

        jButton1.setText("Vender");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 231, -1, -1));

        jButton2.setText("Salir");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 231, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 76, 50, 10));

        jLabel4.setText("Datos del Boleto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 70, -1, -1));

        jLabel5.setText("Informacion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 262, -1, -1));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 284, 403, 64));

        // Ajuste de posición de la imagen (movida 20px a la derecha)
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Teatro.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 260, 40)); // Cambiado de 80 a 100 en X

        pack();
    }// </editor-fold>                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration                   
}
