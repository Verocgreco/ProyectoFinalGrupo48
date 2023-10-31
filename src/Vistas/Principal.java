
package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
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

        ImageIcon icono =  new ImageIcon(getClass().getResource("/imagenes/Imagen.png") );
        Image miImagen = icono.getImage();
        Escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen, 0, 0, getWidth(),getHeight() , this);

            }

        };
        jButtonProductos = new javax.swing.JButton();
        jButtonPedidos = new javax.swing.JButton();
        jButtonMesas = new javax.swing.JButton();
        jButtonAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonProductos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonProductos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonProductos.setForeground(new java.awt.Color(0, 0, 0));
        jButtonProductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\hamburguesa.png")); // NOI18N
        jButtonProductos.setText("Productos");
        jButtonProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });

        jButtonPedidos.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPedidos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonPedidos.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPedidos.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\pedidos.png")); // NOI18N
        jButtonPedidos.setText("Pedidos");
        jButtonPedidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });

        jButtonMesas.setBackground(new java.awt.Color(204, 204, 204));
        jButtonMesas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonMesas.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMesas.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\mesas.png")); // NOI18N
        jButtonMesas.setText("Mesas");
        jButtonMesas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMesasActionPerformed(evt);
            }
        });

        jButtonAdmin.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAdmin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonAdmin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAdmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\pc.png")); // NOI18N
        jButtonAdmin.setText("Admin");
        jButtonAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addGap(47, 47, 47)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jButtonPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMesas, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(271, Short.MAX_VALUE))
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
        gm.getContentPane().setBackground(new Color(51,51,51));
        gm.setBorder(new LineBorder((new Color(212, 175, 55)), 8));//color de todos los bordes
        //color borde superior
        JComponent superior = ((BasicInternalFrameUI) gm.getUI()).getNorthPane();
        superior.setOpaque(true);
        superior.setBackground(new Color(212, 175, 55));
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
        ga.getContentPane().setBackground(new Color(51,51,51));
        ga.setBorder(new LineBorder((new Color(212, 175, 55)), 8));//color de todos los bordes
        //color borde superior
        JComponent superior = ((BasicInternalFrameUI) ga.getUI()).getNorthPane();
        superior.setOpaque(true);
        superior.setBackground(new Color(212, 175, 55));
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
