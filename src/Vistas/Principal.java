
package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jButtonProductos = new javax.swing.JButton();
        jButtonPedidos = new javax.swing.JButton();
        jButtonMesas = new javax.swing.JButton();
        jButtonAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonProductos.setText("Productos");
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });

        jButtonPedidos.setText("Pedidos");
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });

        jButtonMesas.setText("Mesas");
        jButtonMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMesasActionPerformed(evt);
            }
        });

        jButtonAdmin.setText("Admin");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });

        Escritorio.setLayer(jButtonProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jButtonPedidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jButtonMesas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jButtonAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPedidos)
                    .addComponent(jButtonProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMesas)
                    .addComponent(jButtonAdmin))
                .addGap(36, 36, 36))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProductos)
                    .addComponent(jButtonMesas))
                .addGap(45, 45, 45)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPedidos)
                    .addComponent(jButtonAdmin))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed
        Escritorio.repaint();
        GestionProductos gp = new GestionProductos();
        gp.setVisible(true);
        gp.getContentPane().setBackground(new Color(51,51,51));
        gp.setBorder(new LineBorder((new Color(212, 175, 55)), 8));//color de todos los bordes
        //color borde superior
        JComponent superior = ((BasicInternalFrameUI) gp.getUI()).getNorthPane();
        superior.setOpaque(true);
        superior.setBackground(new Color(212, 175, 55));
        Escritorio.add(gp);
        Escritorio.moveToFront(gp);
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = gp.getSize();
        gp.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        gp.show();
    }//GEN-LAST:event_jButtonProductosActionPerformed

    private void jButtonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidosActionPerformed
        Escritorio.repaint();
        GestionPedidos gp = new GestionPedidos();
        gp.setVisible(true);
        gp.getContentPane().setBackground(new Color(51,51,51));
        gp.setBorder(new LineBorder((new Color(212, 175, 55)), 8));//color de todos los bordes
        //color borde superior
        JComponent superior = ((BasicInternalFrameUI) gp.getUI()).getNorthPane();
        superior.setOpaque(true);
        superior.setBackground(new Color(212, 175, 55));
        Escritorio.add(gp);
        Escritorio.moveToFront(gp);
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = gp.getSize();
        gp.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        gp.show();
    }//GEN-LAST:event_jButtonPedidosActionPerformed

    private void jButtonMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMesasActionPerformed
        Escritorio.repaint();
        GestionMesas gm = new GestionMesas();
        gm.setVisible(true);
        Escritorio.add(gm);
        Escritorio.moveToFront(gm);
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = gm.getSize();
        gm.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        gm.show();
    }//GEN-LAST:event_jButtonMesasActionPerformed

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
       Escritorio.repaint();
        Administracion ga = new Administracion();
        ga.setVisible(true);
        Escritorio.add(ga);
        Escritorio.moveToFront(ga);
        Dimension desktopSize = Escritorio.getSize();
        Dimension FrameSize = ga.getSize();
        ga.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        ga.show();
    }//GEN-LAST:event_jButtonAdminActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonMesas;
    private javax.swing.JButton jButtonPedidos;
    private javax.swing.JButton jButtonProductos;
    // End of variables declaration//GEN-END:variables
}
