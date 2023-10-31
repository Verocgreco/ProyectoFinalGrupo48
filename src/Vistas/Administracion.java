
package Vistas;

import accesoADatos.Conexion;
import accesoADatos.PedidoData;
import entidades.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;


public class Administracion extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel(){
    
    public boolean isCellEditable(int fila, int columna){
        return false;
    }
};
private DefaultTableModel modeloG = new DefaultTableModel(){
    
    public boolean isCellEditable(int fila, int columna){
        return false;
    }
};
    
    
    private Connection conn = null;
    PedidoData pedD = new PedidoData();
    
    double monto = 0;

    
    public Administracion() {
        initComponents();
        conn = Conexion.getConexion();
        meserosCB();
        meserosCBG();
        titulosT();
        titulosGT();
        jrbGen.setSelected(true);
        general();
        pedidosTotalG();
        gananciaMesAnterior();
        this.setSize(500, 550);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbGen = new javax.swing.JRadioButton();
        jcbMec = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jrbMec = new javax.swing.JRadioButton();
        jrbXdia = new javax.swing.JRadioButton();
        jrbEdia = new javax.swing.JRadioButton();
        jrbPers = new javax.swing.JRadioButton();
        jrbXhora = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jsHD = new javax.swing.JSpinner();
        jsHH = new javax.swing.JSpinner();
        jbBuscar = new javax.swing.JButton();
        jdcXD = new com.toedter.calendar.JDateChooser();
        jdcEDD = new com.toedter.calendar.JDateChooser();
        jdcEDH = new com.toedter.calendar.JDateChooser();
        jrbMXF = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtGanancia = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jcbMeseroG = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jdcFechaG = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jlGananciaDiaria = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlMesi = new javax.swing.JLabel();
        jrbMXFG = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar los pedidos:");

        jrbGen.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrbGen.setForeground(new java.awt.Color(255, 255, 255));
        jrbGen.setText("General");
        jrbGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbGenActionPerformed(evt);
            }
        });

        jcbMec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMecActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Desde");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hasta");

        jtPedidos.setBackground(new java.awt.Color(204, 204, 204));
        jtPedidos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtPedidos.setGridColor(new java.awt.Color(0, 0, 0));
        jtPedidos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jtPedidos);

        jrbMec.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrbMec.setForeground(new java.awt.Color(255, 255, 255));
        jrbMec.setText("Mesero:");
        jrbMec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMecActionPerformed(evt);
            }
        });

        jrbXdia.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrbXdia.setForeground(new java.awt.Color(255, 255, 255));
        jrbXdia.setText("Por dia:");
        jrbXdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbXdiaActionPerformed(evt);
            }
        });

        jrbEdia.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrbEdia.setForeground(new java.awt.Color(255, 255, 255));
        jrbEdia.setText("Entre dias:");
        jrbEdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEdiaActionPerformed(evt);
            }
        });

        jrbPers.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrbPers.setForeground(new java.awt.Color(255, 255, 255));
        jrbPers.setText("Personalizada");
        jrbPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPersActionPerformed(evt);
            }
        });

        jrbXhora.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrbXhora.setForeground(new java.awt.Color(255, 255, 255));
        jrbXhora.setText("Por hora:");
        jrbXhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbXhoraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Desde");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hasta");

        jsHD.setModel(new javax.swing.SpinnerNumberModel(8, 8, 23, 1));
        jsHD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jsHDPropertyChange(evt);
            }
        });

        jsHH.setModel(new javax.swing.SpinnerNumberModel(23, 18, 23, 1));
        jsHH.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jsHHPropertyChange(evt);
            }
        });

        jbBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jbBuscar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jdcXD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcXDPropertyChange(evt);
            }
        });

        jdcEDD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcEDDPropertyChange(evt);
            }
        });

        jdcEDH.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcEDHPropertyChange(evt);
            }
        });

        jrbMXF.setBackground(new java.awt.Color(51, 51, 51));
        jrbMXF.setForeground(new java.awt.Color(255, 255, 255));
        jrbMXF.setText("Habilitar mesero x fecha");
        jrbMXF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMXFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbMec)
                            .addComponent(jrbXdia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jdcXD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jrbMXF))
                            .addComponent(jcbMec, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbXhora)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12)
                                        .addComponent(jsHD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jsHH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrbEdia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jdcEDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcEDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jrbGen)
                .addGap(52, 52, 52)
                .addComponent(jrbPers)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jrbGen)
                    .addComponent(jrbPers))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMec)
                    .addComponent(jcbMec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbXdia)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jrbMXF)
                        .addComponent(jdcXD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcEDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbEdia)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcEDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbXhora)
                    .addComponent(jLabel3)
                    .addComponent(jsHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedidos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jtGanancia.setBackground(new java.awt.Color(204, 204, 204));
        jtGanancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtGanancia.setGridColor(new java.awt.Color(0, 0, 0));
        jtGanancia.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setViewportView(jtGanancia);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Por Mesero:");

        jcbMeseroG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMeseroGActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Por fecha:");

        jdcFechaG.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaGPropertyChange(evt);
            }
        });

        jlGananciaDiaria.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlGananciaDiaria.setForeground(new java.awt.Color(255, 255, 255));
        jlGananciaDiaria.setText("Ingresos del día:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ingresos del mes actual:");

        jlMesi.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlMesi.setForeground(new java.awt.Color(255, 255, 255));
        jlMesi.setText("Ingresos del mes anterior:");

        jrbMXFG.setBackground(new java.awt.Color(51, 51, 51));
        jrbMXFG.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jrbMXFG.setForeground(new java.awt.Color(255, 255, 255));
        jrbMXFG.setText("Habilitar mesero x fecha");
        jrbMXFG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMXFGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel5))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jdcFechaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrbMXFG))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbMeseroG, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlGananciaDiaria)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jlMesi))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMeseroG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbMXFG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcFechaG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jlGananciaDiaria)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jlMesi)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingresos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbXdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbXdiaActionPerformed
        // TODO add your handling code here:
        
        if (jrbXdia.isSelected()){
            
            jrbEdia.setSelected(false);
            jdcXD.setEnabled(true);
            jdcEDD.setEnabled(false);
            jdcEDH.setEnabled(false);
            
            if (jdcXD.getDate() != null && !jrbXhora.isSelected()){
            
                LocalDate f = jdcXD.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                modelo.setRowCount(0);
                
                for(Pedido pedido:pedD.listarPedidosPorFecha(f)){
                    
                    modelo.addRow(new Object[]{
                        pedido.getIdPedido(),
                        pedido.getMesero(),
                        parseFecha(pedido.getFecha()),
                        pedido.getHora()
                    });
                    
                }
            
            }
            
        }
    }//GEN-LAST:event_jrbXdiaActionPerformed

    private void jrbMecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMecActionPerformed
        // TODO add your handling code here:
        
        if (jrbMec.isSelected()){
            jcbMec.setEnabled(true);
        }else{
            jcbMec.setEnabled(false);
        }
        
    }//GEN-LAST:event_jrbMecActionPerformed

    private void jrbGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbGenActionPerformed
        // TODO add your handling code here:
        
        general();
        
    }//GEN-LAST:event_jrbGenActionPerformed

    private void jrbPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPersActionPerformed
        // TODO add your handling code here:
        
        if (jrbPers.isSelected()){
            
            jrbGen.setSelected(false);
            jrbMec.setSelected(true);
            jrbMec.setEnabled(true);
            jcbMec.setEnabled(true);
            jrbXdia.setEnabled(true);
            jrbEdia.setEnabled(true);
            jrbXhora.setEnabled(true);
            
            
        } else {
            general();
        }
        
    }//GEN-LAST:event_jrbPersActionPerformed

    private void jrbEdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEdiaActionPerformed
        // TODO add your handling code here:
        
        if (jrbEdia.isSelected()){
            
            jrbXdia.setSelected(false);
            jdcXD.setEnabled(false);
            jdcEDD.setEnabled(true);
            jdcEDH.setEnabled(true);
            
            entreFechas();
            
        }
        
    }//GEN-LAST:event_jrbEdiaActionPerformed

    private void jrbXhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbXhoraActionPerformed
        // TODO add your handling code here:
        
        if (jrbXhora.isSelected()){
            
            jsHD.setEnabled(true);
            jsHH.setEnabled(true);
            jbBuscar.setEnabled(true);
            jrbXdia.setSelected(true);
            jdcXD.setEnabled(true);
            jrbEdia.setSelected(false);
            jdcEDD.setEnabled(false);
            jdcEDH.setEnabled(false);
            entreHoras();
            
            
        }else{
            
            jsHD.setEnabled(false);
            jsHH.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_jrbXhoraActionPerformed

    private void jdcXDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcXDPropertyChange
        // TODO add your handling code here:
        
        if (jdcXD.getDate() != null){
            
            if (jrbMXF.isSelected() && !(jcbMec.getSelectedItem().equals("Todos"))){
                
                meseroXFecha();
                
            }
            
            LocalDate f = jdcXD.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            modelo.setRowCount(0);
            
            for(Pedido pedido:pedD.listarPedidosPorFecha(f)){
                    
                modelo.addRow(new Object[]{
                    pedido.getIdPedido(),
                    pedido.getMesero(),
                    parseFecha(pedido.getFecha()),
                    pedido.getHora()
                });
                    
            }
            
        }
        
    }//GEN-LAST:event_jdcXDPropertyChange

    private void jdcEDDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcEDDPropertyChange
        // TODO add your handling code here:
        
        entreFechas();
        
    }//GEN-LAST:event_jdcEDDPropertyChange

    private void jdcEDHPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcEDHPropertyChange
        // TODO add your handling code here:
        
        entreFechas();
        
    }//GEN-LAST:event_jdcEDHPropertyChange

    private void jcbMecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMecActionPerformed
        // TODO add your handling code here:
        
        if ((jcbMec.getSelectedItem()).equals("Todos")){
            pedidosTotal();
        }else if (jdcXD.getDate() != null && jrbMXF.isSelected()){
        
            meseroXFecha();
        
        }else{
            
            String mesero = (String)jcbMec.getSelectedItem();
            modelo.setRowCount(0);
            for(Pedido pedido : pedD.totalPedidosMesero(mesero)){
                
                modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                pedido.getMesero(),
                parseFecha(pedido.getFecha()),
                pedido.getHora()
                        
                });
            }
        }
    }//GEN-LAST:event_jcbMecActionPerformed

    private void jsHDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jsHDPropertyChange
        // TODO add your handling code here:
        
        entreHoras();
        
    }//GEN-LAST:event_jsHDPropertyChange

    private void jsHHPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jsHHPropertyChange
        // TODO add your handling code here:
        
        entreHoras();
        
    }//GEN-LAST:event_jsHHPropertyChange

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        
        entreHoras();
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    //*******************************************************************
    // * * * * * * * * * * * * Parte de Ganancias * * * * * * * * * * * *
    //*******************************************************************
    
    private void jcbMeseroGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeseroGActionPerformed
        // TODO add your handling code here:
        
        if (jcbMeseroG.getSelectedItem().equals("Todos")){
            pedidosTotalG();
        }else if (jdcFechaG.getDate() != null && jrbMXFG.isSelected()){
            
            meseroXFechaG();
            
        } else {
            
            monto = 0;
            
            modeloG.setRowCount(0);
            
            for(Pedido pedido : pedD.totalPedidosMesero((String)jcbMeseroG.getSelectedItem())){
                
                monto = monto + pedido.getImporte();
                
                modeloG.addRow(new Object[]{
                        pedido.getImporte(),
                        pedido.getMesero(),
                        parseFecha(pedido.getFecha()),
                        pedido.getHora()
                    });
            }
            
            jlGananciaDiaria.setText("Ingresos totales de " + (String)jcbMeseroG.getSelectedItem()
        + " = " + monto);
            
        }
    }//GEN-LAST:event_jcbMeseroGActionPerformed

    private void jdcFechaGPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaGPropertyChange
        // TODO add your handling code here:
        
        if (jdcFechaG.getDate() != null){
            
            if (jrbMXFG.isSelected() && !(jcbMeseroG.getSelectedItem().equals("Todos"))){
                
                meseroXFechaG();
                
            } else {
                
                monto = 0;
                
                LocalDate f = jdcFechaG.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                modeloG.setRowCount(0);
                
                for(Pedido pedido:pedD.listarPedidosPorFecha(f)){
                    
                    monto = monto + pedido.getImporte();
                    
                    modeloG.addRow(new Object[]{
                        pedido.getImporte(),
                        pedido.getMesero(),
                        parseFecha(pedido.getFecha()),
                        pedido.getHora()
                    });
                }
                
                jlGananciaDiaria.setText("Ingresos totales del dia seleccionado = " + monto);
                
            }
        }
    }//GEN-LAST:event_jdcFechaGPropertyChange

    private void jrbMXFGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMXFGActionPerformed
        // TODO add your handling code here:
        
        if (jdcFechaG.getDate() != null && !(jcbMeseroG.getSelectedItem().equals("Todos"))){
            
            meseroXFechaG();
            
        }
        
    }//GEN-LAST:event_jrbMXFGActionPerformed

    
    //*************************************************************************
    // * * * * * * jRadioButton en Pedidos para el mesero x fecha * * * * * *
    //*************************************************************************
    
    private void jrbMXFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMXFActionPerformed
        // TODO add your handling code here:
        
        if (jdcXD.getDate() != null && !(jcbMec.getSelectedItem().equals("Todos"))){
            
            meseroXFecha();
            
        }
        
    }//GEN-LAST:event_jrbMXFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbMec;
    private javax.swing.JComboBox<String> jcbMeseroG;
    private com.toedter.calendar.JDateChooser jdcEDD;
    private com.toedter.calendar.JDateChooser jdcEDH;
    private com.toedter.calendar.JDateChooser jdcFechaG;
    private com.toedter.calendar.JDateChooser jdcXD;
    private javax.swing.JLabel jlGananciaDiaria;
    private javax.swing.JLabel jlMesi;
    private javax.swing.JRadioButton jrbEdia;
    private javax.swing.JRadioButton jrbGen;
    private javax.swing.JRadioButton jrbMXF;
    private javax.swing.JRadioButton jrbMXFG;
    private javax.swing.JRadioButton jrbMec;
    private javax.swing.JRadioButton jrbPers;
    private javax.swing.JRadioButton jrbXdia;
    private javax.swing.JRadioButton jrbXhora;
    private javax.swing.JSpinner jsHD;
    private javax.swing.JSpinner jsHH;
    private javax.swing.JTable jtGanancia;
    private javax.swing.JTable jtPedidos;
    // End of variables declaration//GEN-END:variables

    public void titulosT(){
        
        modelo.addColumn("ID pedido");
        modelo.addColumn("Mesero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        jtPedidos.setModel(modelo);
        
    }
    
    public void general(){
        if(jrbGen.isSelected()){
        
            jrbPers.setSelected(false);
            jrbMec.setSelected(false);
            jrbMec.setEnabled(false);
            jcbMec.setEnabled(false);
            jrbXdia.setSelected(false);
            jrbXdia.setEnabled(false);
            jdcXD.setEnabled(false);
            jrbEdia.setSelected(false);
            jrbEdia.setEnabled(false);
            jdcEDD.setEnabled(false);
            jdcEDH.setEnabled(false);
            jrbXhora.setSelected(false);
            jrbXhora.setEnabled(false);
            jsHD.setEnabled(false);
            jsHH.setEnabled(false);
            jbBuscar.setEnabled(false);
            
            pedidosTotal();
        } else {
            
            jrbGen.setSelected(false);
            jrbMec.setSelected(true);
            jrbMec.setEnabled(true);
            jcbMec.setEnabled(true);
            jrbXdia.setEnabled(true);
            jrbEdia.setEnabled(true);
            jrbXhora.setEnabled(true);
        }
    }
    
    public void pedidosTotal(){
        modelo.setRowCount(0);
        for(Pedido pedido: pedD.listaPedidosTotal()){
            
            modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                pedido.getMesero(),
                parseFecha(pedido.getFecha()),
                pedido.getHora()
            });
        }
    }
    
    public String parseFecha(LocalDate fecha){
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(forma);
    }
    
    public void meserosCB(){
        jcbMec.addItem("Todos");
        for(String nombre: pedD.nombreMeseros()){
            jcbMec.addItem(nombre);
        }
        
    }
    
    public void meseroXFecha(){
        
        LocalDate f = jdcXD.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        modelo.setRowCount(0);
                
        for(Pedido pedido:pedD.listarPedidosPorMesero((String)jcbMec.getSelectedItem(), f)){
            
            modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                pedido.getMesero(),
                parseFecha(pedido.getFecha()),
                pedido.getHora()
            });
        }
        
    }
    
    public void entreFechas(){
        if (jdcEDD.getDate() != null && jdcEDH.getDate() != null){
            
            LocalDate fechaD = jdcEDD.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaH = jdcEDH.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            modelo.setRowCount(0);
                
            for(Pedido pedido : pedD.listarPedidosPorPeriodo(fechaD, fechaH)){
                    
                modelo.addRow(new Object[]{
                    pedido.getIdPedido(),
                    pedido.getMesero(),
                    parseFecha(pedido.getFecha()),
                    pedido.getHora()
                });
            }
        }
    }
    
    public void entreHoras(){
        
        String desde;
        String hasta;
        
        if (jdcXD.getDate() != null){
        
            LocalDate f = jdcXD.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            if ((int)jsHD.getValue() < 10){
                desde = "0" + jsHD.getValue() + ":00";
            }else{
                desde = jsHD.getValue() + ":00";
            }
            
            if ((int)jsHH.getValue() < 10){
                hasta = "0" + jsHH.getValue() + ":00";
            }else{
                hasta = jsHH.getValue() + ":00";
            }
            modelo.setRowCount(0);
        
            for(Pedido pedido : pedD.listarPedidosPorHora(f, LocalTime.parse(desde), LocalTime.parse(hasta))){
            
                modelo.addRow(new Object[]{
                        pedido.getIdPedido(),
                        pedido.getMesero(),
                        parseFecha(pedido.getFecha()),
                        pedido.getHora()
                });
            }
        }
    }
    
    
    //*******************************************************************
    // * * * * * * * * * * * * Parte de Ganancias * * * * * * * * * * * *
    //*******************************************************************

    public void titulosGT(){
        
        modeloG.addColumn("Ganancia");
        modeloG.addColumn("Mesero");
        modeloG.addColumn("Fecha");
        modeloG.addColumn("Hora");
        jtGanancia.setModel(modeloG);
        
    }
    
    public void meserosCBG(){
        jcbMeseroG.addItem("Todos");
        for(String nombre: pedD.nombreMeseros()){
            jcbMeseroG.addItem(nombre);
        }
    }
    
    public void pedidosTotalG(){
        modeloG.setRowCount(0);
        for(Pedido pedido: pedD.listaPedidosTotal()){
            
            modeloG.addRow(new Object[]{
                pedido.getImporte(),
                pedido.getMesero(),
                parseFecha(pedido.getFecha()),
                pedido.getHora()
            });
            
            
            
        }
    }
    
    public void meseroXFechaG(){
        
        monto = 0;
        
        LocalDate f = jdcFechaG.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        modeloG.setRowCount(0);
                
        for(Pedido pedido:pedD.listarPedidosPorMesero((String)jcbMeseroG.getSelectedItem(), f)){
                    
            monto = monto + pedido.getImporte();
            
            modeloG.addRow(new Object[]{
                pedido.getImporte(),
                pedido.getMesero(),
                parseFecha(pedido.getFecha()),
                pedido.getHora()
            });
        }
        jlGananciaDiaria.setText("Ingresos del dia por " + (String)jcbMeseroG.getSelectedItem()
        + " = " + monto);
        
    }
    
    
    public void gananciaMesAnterior(){
        
        monto = pedD.gananciaMesAnterior();
        
        jlMesi.setText("Ingresos del mes anterior = " + monto);
        
    }
    
    
    
    
}
