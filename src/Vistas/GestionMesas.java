
package Vistas;

import accesoADatos.Conexion;
import accesoADatos.MesaData;
import entidades.Mesa;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;


public class GestionMesas extends javax.swing.JInternalFrame {
     private Connection conn = null;
     private MesaData MD = new MesaData();
     private DefaultTableModel modelo= new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex, int colIndex) {
        return false;
    }
     };
          private DefaultTableModel modelo2= new DefaultTableModel(){
    public boolean isCellEditable(int rowIndex, int colIndex) {
        if(colIndex==2){
                return true;
        }else{
            return false;
        }
        
    }
     };
    public GestionMesas() {
        initComponents();
        Cabecera1();
        Cabecera2();
        listaMesaDis();
        listaMesaTotales();
        conn = Conexion.getConexion();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DispOcup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jsCapacidad = new javax.swing.JSpinner();
        jbAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMesas1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaMesas2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jrbOcup = new javax.swing.JRadioButton();
        jrbDisp = new javax.swing.JRadioButton();

        setClosable(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Capacidad ");

        jsCapacidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jsCapacidad.setRequestFocusEnabled(false);

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("AGREGAR MESAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jsCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jbAgregar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsCapacidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbAgregar)
                .addGap(30, 30, 30))
        );

        jtTablaMesas1.setFont(new java.awt.Font("Corsiva Hebrew", 0, 12)); // NOI18N
        jtTablaMesas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jtTablaMesas1.getTableHeader().setResizingAllowed(false);
        jtTablaMesas1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTablaMesas1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jtTablaMesas2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jtTablaMesas2);

        jLabel2.setText("Modificar Y Eliminar");

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        DispOcup.add(jrbOcup);
        jrbOcup.setText("Ocupadas");
        jrbOcup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOcupActionPerformed(evt);
            }
        });

        DispOcup.add(jrbDisp);
        jrbDisp.setText("Disponibles");
        jrbDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDispActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbActualizar)
                .addGap(168, 168, 168)
                .addComponent(jbEliminar)
                .addGap(160, 160, 160))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jrbOcup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbDisp)
                .addGap(140, 140, 140))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOcup)
                    .addComponent(jrbDisp))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar)
                    .addComponent(jbEliminar))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:

        Mesa mesa = new Mesa();
        mesa.setCapacidad(Integer.parseInt(jsCapacidad.getValue().toString()));
        MD.mesaNueva(mesa);
        listaMesaDis();
        
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        
        MD.borrarMesa(Integer.parseInt(modelo2.getValueAt(jtTablaMesas2.getSelectedRow(), 0).toString()));
        
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        // TODO add your handling code here:
        
        
        Mesa mes = MD.buscarMesa(Integer.parseInt(modelo2.getValueAt(jtTablaMesas2.getSelectedRow(), 0).toString()));
        mes.setCapacidad(Integer.parseInt(modelo2.getValueAt(jtTablaMesas2.getSelectedRow(), 2).toString()));
        MD.cambiarCapacidad(mes);
        listaMesaTotales();
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jrbDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDispActionPerformed
        // TODO add your handling code here:
        listaMesaDisponibles();
        jbEliminar.setEnabled(true);
        
    }//GEN-LAST:event_jrbDispActionPerformed

    private void jrbOcupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOcupActionPerformed
        // TODO add your handling code here:
        listaMesaOcupadas();
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jrbOcupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup DispOcup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JRadioButton jrbDisp;
    private javax.swing.JRadioButton jrbOcup;
    private javax.swing.JSpinner jsCapacidad;
    private javax.swing.JTable jtTablaMesas1;
    private javax.swing.JTable jtTablaMesas2;
    // End of variables declaration//GEN-END:variables

public void Cabecera1(){
modelo.addColumn("ID");
modelo.addColumn("Estado");
modelo.addColumn("Capacidad");
jtTablaMesas1.setModel(modelo);
}
public void listaMesaDis(){
modelo.setRowCount(0);
for(Mesa mesa : MD.listarMesasLibres()){
    modelo.addRow(new Object[]{mesa.getIdMesa(),
                               mesa.isEstado(),
                               mesa.getCapacidad()});
        }
}
public void Cabecera2(){
modelo2.addColumn("ID");
modelo2.addColumn("Estado");
modelo2.addColumn("Capacidad");
jtTablaMesas2.setModel(modelo2);
}
public void listaMesaTotales(){
    modelo2.setRowCount(0);
for(Mesa mesa : MD.mesasTotales()){
    modelo2.addRow(new Object[]{mesa.getIdMesa(),
                               mesa.isEstado(),
                               mesa.getCapacidad()});

                        


}
}
public void listaMesaOcupadas(){
    modelo2.setRowCount(0);
for(Mesa mesa : MD.listarMesasOcupadas()){
    modelo2.addRow(new Object[]{mesa.getIdMesa(),
                               mesa.isEstado(),
                               mesa.getCapacidad()});

                        


}
}

public void listaMesaDisponibles(){
modelo2.setRowCount(0);
for(Mesa mesa : MD.listarMesasLibres()){
    modelo2.addRow(new Object[]{mesa.getIdMesa(),
                               mesa.isEstado(),
                               mesa.getCapacidad()});
        }
}
}