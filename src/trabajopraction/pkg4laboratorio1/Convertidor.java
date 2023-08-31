package trabajopraction.pkg4laboratorio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Convertidor extends javax.swing.JFrame {

    /**
     * Creates new form Convertidor
     */
    public Convertidor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBConvertir = new javax.swing.JButton();
        JLConvertidor = new javax.swing.JLabel();
        JTF1 = new javax.swing.JTextField();
        JLGrados = new javax.swing.JLabel();
        JLResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBConvertir.setBackground(new java.awt.Color(51, 255, 255));
        JBConvertir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JBConvertir.setText("Convertir");
        JBConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConvertirActionPerformed(evt);
            }
        });

        JLConvertidor.setBackground(new java.awt.Color(0, 255, 102));
        JLConvertidor.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        JLConvertidor.setForeground(new java.awt.Color(255, 51, 51));
        JLConvertidor.setText("Convertidor De Temperatura");

        JLGrados.setBackground(new java.awt.Color(255, 255, 255));
        JLGrados.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        JLGrados.setForeground(new java.awt.Color(0, 0, 0));
        JLGrados.setText("Grados C°:");

        JLResultado.setBackground(new java.awt.Color(0, 0, 0));
        JLResultado.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        JLResultado.setForeground(new java.awt.Color(255, 153, 102));
        JLResultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JBConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(158, 158, 158))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addComponent(JLConvertidor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(JLGrados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTF1)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLConvertidor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLGrados, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF1))
                .addGap(32, 32, 32)
                .addComponent(JBConvertir)
                .addGap(43, 43, 43)
                .addComponent(JLResultado)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConvertirActionPerformed
        try{
        double celsius = Double.parseDouble(JTF1.getText());
        double fahrenheit = (celsius * 9/5 + 32);
        JLResultado.setText("Resultado: " + String.format("%.2f", fahrenheit) + "°F");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese un valor válido en grados Fahrenheit.", "Error", JOptionPane.ERROR_MESSAGE);
    }     
        JTF1.setText("");
       
    }//GEN-LAST:event_JBConvertirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBConvertir;
    private javax.swing.JLabel JLConvertidor;
    private javax.swing.JLabel JLGrados;
    private javax.swing.JLabel JLResultado;
    private javax.swing.JTextField JTF1;
    // End of variables declaration//GEN-END:variables
}
