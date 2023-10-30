
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
        Block();
        
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
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaMesas2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jrbOcup = new javax.swing.JRadioButton();
        jrbDisp = new javax.swing.JRadioButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(60, 60, 60));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Capacidad ");

        jsCapacidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jsCapacidad.setRequestFocusEnabled(false);

        jbAgregar.setBackground(new java.awt.Color(204, 204, 204));
        jbAgregar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AGREGAR MESAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jsCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jbAgregar)
                .addGap(30, 30, 30))
        );

        jtTablaMesas1.setBackground(new java.awt.Color(204, 204, 204));
        jtTablaMesas1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
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
        jtTablaMesas1.setGridColor(new java.awt.Color(0, 0, 0));
        jtTablaMesas1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jtTablaMesas1.setShowGrid(true);
        jtTablaMesas1.getTableHeader().setResizingAllowed(false);
        jtTablaMesas1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTablaMesas1);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\Raton dorado.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36))))
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
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jtTablaMesas2.setBackground(new java.awt.Color(204, 204, 204));
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
        jtTablaMesas2.setGridColor(new java.awt.Color(0, 0, 0));
        jtTablaMesas2.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jtTablaMesas2.setShowGrid(true);
        jScrollPane2.setViewportView(jtTablaMesas2);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar Y Eliminar");

        jbActualizar.setBackground(new java.awt.Color(204, 204, 204));
        jbActualizar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(0, 0, 0));
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jbEliminar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        DispOcup.add(jrbOcup);
        jrbOcup.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jrbOcup.setForeground(new java.awt.Color(255, 255, 255));
        jrbOcup.setText("Ocupadas");
        jrbOcup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOcupActionPerformed(evt);
            }
        });

        DispOcup.add(jrbDisp);
        jrbDisp.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jrbDisp.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(143, 143, 143)
                .addComponent(jrbOcup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbDisp)
                .addGap(140, 140, 140))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOcup)
                    .addComponent(jrbDisp))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
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
        jbActualizar.setEnabled(true);
    }//GEN-LAST:event_jrbDispActionPerformed

    private void jrbOcupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOcupActionPerformed
        // TODO add your handling code here:
        listaMesaOcupadas();
        jbEliminar.setEnabled(false);
        jbActualizar.setEnabled(true);
    }//GEN-LAST:event_jrbOcupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup DispOcup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
for(Mesa mesa : MD.mesasSinPedidos()){
    modelo2.addRow(new Object[]{mesa.getIdMesa(),
                               mesa.isEstado(),
                               mesa.getCapacidad()});
        }
}
public void Block(){
jbEliminar.setEnabled(false);
jbActualizar.setEnabled(false);}
}