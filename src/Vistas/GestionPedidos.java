package Vistas;

import accesoADatos.Conexion;
import accesoADatos.MesaData;
import accesoADatos.PedidoData;
import accesoADatos.PedidoProductoData;
import accesoADatos.ProductoData;
import entidades.Mesa;
import entidades.Pedido;
import entidades.PedidoProducto;
import entidades.Producto;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionPedidos extends javax.swing.JInternalFrame {

    private Connection conn = null;
    MesaData mData = new MesaData();
    PedidoData peData = new PedidoData();
    ProductoData proData = new ProductoData();
    PedidoProductoData ppData = new PedidoProductoData();
    private DefaultListModel<Producto> modeloJLi = new DefaultListModel<>();

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modelo2 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private DefaultTableModel modelo3 = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public GestionPedidos() {
        initComponents();
        conn = Conexion.getConexion();
        this.setSize(600, 670);
        jTabbedPane1.setEnabledAt(2, false);
        cargarComboMesas();
        cargarComboMeseros();
        cabeceraTabla1();
        cabeceraTabla2();
        cargarTabla1();
        int[] anchos = {35, 200, 55, 40};
        for(int i=0; i<4;i++){
            jTablETicket.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);            
        }
        cabeceraTabla3();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBCrear = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jComboBoxMesas = new javax.swing.JComboBox<>();
        jComboBoxMeseros = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jButtonBebidas = new javax.swing.JButton();
        jButtonComidas = new javax.swing.JButton();
        jButtonPostres = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProductos = new javax.swing.JList<>();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jBQuitar = new javax.swing.JButton();
        jBCobrar = new javax.swing.JButton();
        jBSalir2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLHora = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelNro = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablETicket = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jBImprimir = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLMesero = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("Mesa:");

        jLabel2.setText("Mesero:");

        jBCrear.setText("Crear Pedido");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBCrear)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jBSalir))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jComboBoxMeseros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jBCrear)
                .addGap(64, 64, 64)
                .addComponent(jBSalir)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingreso Pedidos", jPanel1);

        jLabel3.setText("SELECCIONE UN PEDIDO:");

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedidos);

        jButtonBebidas.setText("Bebidas");
        jButtonBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBebidasActionPerformed(evt);
            }
        });

        jButtonComidas.setText("Comidas");
        jButtonComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComidasActionPerformed(evt);
            }
        });

        jButtonPostres.setText("Postres");
        jButtonPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPostresActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListProductos);

        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel4.setText("Cantidad");

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        jBQuitar.setText("Quitar");
        jBQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitarActionPerformed(evt);
            }
        });

        jBCobrar.setText("Cobrar");
        jBCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCobrarActionPerformed(evt);
            }
        });

        jBSalir2.setText("Salir");
        jBSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonComidas)
                            .addComponent(jButtonBebidas)
                            .addComponent(jButtonPostres))
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregar)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jBQuitar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBCobrar)
                                .addGap(139, 139, 139)
                                .addComponent(jBSalir2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel3)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonBebidas)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonComidas)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonPostres))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonAgregar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBQuitar)
                    .addComponent(jBSalir2)
                    .addComponent(jBCobrar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Carga Pedidos", jPanel2);

        jLabel5.setText("RESTÓ EL RATA");

        jLabel6.setText("Av. San Martín 1255 - San Luis");

        jLabel7.setText("0266 4569999");

        jLabel8.setText("CUIT Nro 30-11111111-9");

        jLabel9.setText("IVA RESPONSABLE INSCRIPTO");

        jLabel10.setText("------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel11.setText("FACTURA B");

        jLabel12.setText("------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel13.setText("FECHA:");

        jLabelFecha.setText("fecha");

        jLabel15.setText("HORA:");

        jLHora.setText("hora");

        jLabel17.setText("NRO TICKET:");

        jLabelNro.setText("nro");

        jLabel14.setText("CONSUMIDOR FINAL");

        jLabel16.setText("------------------------------------------------------------------------------------------------------------------------------------------------");

        jTablETicket.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTablETicket);

        jLabel18.setText("TOTAL: ");

        jLabelTotal.setText("total");

        jBImprimir.setText("Imprimir ticket");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
            }
        });

        jLabel19.setText("Atendido por:");

        jLMesero.setText("mesero");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(44, 44, 44))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                        .addContainerGap(11, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelTotal)
                            .addGap(90, 90, 90)
                            .addComponent(jBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFecha)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLHora)
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelNro))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabelFecha)
                    .addComponent(jLabel15)
                    .addComponent(jLHora)
                    .addComponent(jLabel17)
                    .addComponent(jLabelNro))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabelTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLMesero))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBImprimir)
                        .addGap(37, 37, 37))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(jLabel16)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Factura", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        if (jTablePedidos.getSelectedRow() >= 0 && jListProductos.getSelectedIndex() >= 0
                && jSpinnerCantidad.getValue() != null) {
            Pedido pedido = peData.buscarPedido((int) modelo.getValueAt(jTablePedidos.getSelectedRow(), 0));
            Producto producto = (Producto) jListProductos.getSelectedValue();
            int cant = (int) jSpinnerCantidad.getValue();
            PedidoProducto pepro = new PedidoProducto(pedido, producto, cant);
            int stockActual = producto.getStock() - cant;
            if (stockActual >= 0) {
                ppData.nuevoPedidoProducto(pepro);
                producto.setStock(stockActual);//restamos el consumo en la BDD
                proData.modificarProducto(producto);
                modeloJLi.removeAllElements();//limpiamos la lista
                jSpinnerCantidad.setValue(1);//siempre vuelve a 1 luego de agregar 
            } else {
                JOptionPane.showMessageDialog(this, "Stock insuficiente, disminuya la cantidad");
            }
            modelo2.setRowCount(0);
            for (PedidoProducto pp : ppData.listarProductosPorPedido(pedido.getIdPedido())) {
                modelo2.addRow(new Object[]{pedido.getIdPedido(), pp.getIdPedidoProd(), pp.getProducto(), pp.getCantidad(),
                    pp.getProducto().getPrecio(), ppData.calcularSubtotal(pp.getIdPedidoProd())});
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione pedido, producto y cantidad");
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBebidasActionPerformed
        modeloJLi.removeAllElements();
        jListProductos.setModel(modeloJLi);
        String nombre = "Bebidas";
        for (Producto bebida : proData.listaProducto4(nombre)) {
            modeloJLi.addElement(bebida);
        }
    }//GEN-LAST:event_jButtonBebidasActionPerformed

    private void jButtonComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComidasActionPerformed
        modeloJLi.removeAllElements();
        jListProductos.setModel(modeloJLi);
        String nombre = "Comidas";
        for (Producto bebida : proData.listaProducto4(nombre)) {
            modeloJLi.addElement(bebida);
        }
    }//GEN-LAST:event_jButtonComidasActionPerformed

    private void jButtonPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPostresActionPerformed
        modeloJLi.removeAllElements();
        jListProductos.setModel(modeloJLi);
        String nombre = "Postres";
        for (Producto bebida : proData.listaProducto4(nombre)) {
            modeloJLi.addElement(bebida);
        }
    }//GEN-LAST:event_jButtonPostresActionPerformed

    private void jBQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitarActionPerformed
        if (jTable2.getSelectedRow() >= 0) {
            int idpp = (int) modelo2.getValueAt(jTable2.getSelectedRow(), 1);
            int idPedido = (int) modelo.getValueAt(jTablePedidos.getSelectedRow(), 0);
            ppData.eliminarPedidoProducto(idpp);
            Producto producto = (Producto) modelo2.getValueAt(jTable2.getSelectedRow(), 2);
            int cant = (int) modelo2.getValueAt(jTable2.getSelectedRow(), 3);
            int stockActual = producto.getStock() + cant;
            producto.setStock(stockActual);
            proData.modificarProducto(producto);
            modeloJLi.removeAllElements();
            modelo2.setRowCount(0);
            for (PedidoProducto pp : ppData.listarProductosPorPedido(idPedido)) {
                modelo2.addRow(new Object[]{idPedido, pp.getIdPedidoProd(), pp.getProducto(), pp.getCantidad(),
                    pp.getProducto().getPrecio(), ppData.calcularSubtotal(pp.getIdPedidoProd())});
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el producto que quiera eliminar");
        }
    }//GEN-LAST:event_jBQuitarActionPerformed

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        if (jTablePedidos.getSelectedRow() >= 0) {
            int idPedido = (int) modelo.getValueAt(jTablePedidos.getSelectedRow(), 0);
            modelo2.setRowCount(0);
            for (PedidoProducto pp : ppData.listarProductosPorPedido(idPedido)) {
                modelo2.addRow(new Object[]{idPedido, pp.getIdPedidoProd(), pp.getProducto(), pp.getCantidad(),
                    pp.getProducto().getPrecio(), ppData.calcularSubtotal(pp.getIdPedidoProd())});
            }

        }
    }//GEN-LAST:event_jTablePedidosMouseClicked

    private void jBCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCobrarActionPerformed
        if (jTablePedidos.getSelectedRow() >= 0) {
            jTabbedPane1.setSelectedIndex(2);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaticket = LocalDate.now();
            jLabelFecha.setText(fechaticket.format(formato));
            LocalTime hora = LocalTime.now();
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
            jLHora.setText(hora.format(formatoHora));
            int nro = (int) (Math.random() * (999999 - 100000 + 1) + 100000);
            jLabelNro.setText(nro + "");
            modelo3.setRowCount(0);
            int idPedido = (int) modelo.getValueAt(jTablePedidos.getSelectedRow(), 0);
            for (PedidoProducto pp : ppData.listarProductosPorPedido(idPedido)) {
                modelo3.addRow(new Object[]{pp.getCantidad(), pp.getProducto(), pp.getProducto().getPrecio(),
                    ppData.calcularSubtotal(pp.getIdPedidoProd())});
            }
            double total = peData.sumarSubtotales(idPedido);
            jLabelTotal.setText("$ " + total);
            String mesero = modelo.getValueAt(jTablePedidos.getSelectedRow(), 2).toString();
            jLMesero.setText(mesero);
            peData.actualizarImporte(idPedido);
            peData.cobrarPedido(idPedido);
            int idMesa = (int) modelo.getValueAt(jTablePedidos.getSelectedRow(), 1);
            mData.desocuparMesa(idMesa);
            cargarTabla1();
            modelo2.setRowCount(0);
            jComboBoxMesas.removeAllItems();
            cargarComboMesas();

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione el pedido a cobrar");

        }
    }//GEN-LAST:event_jBCobrarActionPerformed

    private void jBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalir2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalir2ActionPerformed

    private void jBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearActionPerformed
        if (jComboBoxMesas.getSelectedItem() != null && jComboBoxMeseros.getSelectedItem() != null) {
            Mesa mesa = (Mesa) jComboBoxMesas.getSelectedItem();
            Pedido pedido = new Pedido();
            pedido.setMesa(mesa);
            pedido.setMesero((String) jComboBoxMeseros.getSelectedItem());
            pedido.setFecha(LocalDate.now());
            pedido.setHora(LocalTime.now());
            peData.pedidoNuevo(pedido);
            mData.ocuparMesa(mesa.getIdMesa());
            jComboBoxMesas.removeAllItems();
            jComboBoxMeseros.removeAllItems();
            cargarComboMesas();
            cargarComboMeseros();
            cargarTabla1();//actualizo la tabla de la segunda pestaña
            JOptionPane.showMessageDialog(this, "Se creó el PEDIDO NRO: " + pedido.getIdPedido());
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una mesa y un mesero");
        }
    }//GEN-LAST:event_jBCrearActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
       jTabbedPane1.setSelectedIndex(1);  
    }//GEN-LAST:event_jBImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCobrar;
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JButton jBQuitar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSalir2;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBebidas;
    private javax.swing.JButton jButtonComidas;
    private javax.swing.JButton jButtonPostres;
    private javax.swing.JComboBox<Mesa> jComboBoxMesas;
    private javax.swing.JComboBox<String> jComboBoxMeseros;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLMesero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNro;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JList<Producto> jListProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablETicket;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTablePedidos;
    // End of variables declaration//GEN-END:variables

    private void cargarComboMesas() {
        for (Mesa mesa : mData.listarMesasLibres()) {
            jComboBoxMesas.addItem(mesa);
        }
        jComboBoxMesas.setSelectedItem(null);
    }

    private void cargarComboMeseros() {
        jComboBoxMeseros.addItem("Castro, Martín");
        jComboBoxMeseros.addItem("González, Carolina");
        jComboBoxMeseros.addItem("Ramos, Leticia");
        jComboBoxMeseros.addItem("Luque, Luis");
        jComboBoxMeseros.addItem("Furriel, Joaquín");
        jComboBoxMeseros.addItem("Solda, Malena");
        jComboBoxMeseros.setSelectedItem(null);
    }

    private void cabeceraTabla1() {
        modelo.addColumn("Nro Pedido");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        jTablePedidos.setModel(modelo);

    }

    private void cabeceraTabla2() {
        modelo2.addColumn("Nro Pedido");
        modelo2.addColumn("Código");
        modelo2.addColumn("Producto");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio unit.");
        modelo2.addColumn("Subtotal");
        jTable2.setModel(modelo2);
    }

    public void cargarTabla1() {
        modelo.setRowCount(0);
        for (Pedido p : peData.listarPedidosActuales()) {
            modelo.addRow(new Object[]{p.getIdPedido(), p.getMesa().getIdMesa(), p.getMesero(),
                p.getFecha(), p.getHora()});
        }
    }

    private void cabeceraTabla3() {
        modelo3.addColumn("Cantidad");
        modelo3.addColumn("Descripción");
        modelo3.addColumn("Precio unitario");
        modelo3.addColumn("Importe");
        jTablETicket.setModel(modelo3);
    }

}
