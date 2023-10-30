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
        this.setSize(600, 665);
        jTabbedPane1.setEnabledAt(2, false);
        cargarComboMesas();
        cargarComboMeseros();
        cabeceraTabla1();
        cabeceraTabla2();        
        cargarTabla1();
        cabeceraTabla3();
        int[] anchos = {35, 200, 55, 40};
        for(int i=0; i<4;i++){
            jTablETicket.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);            
        }
                

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jComboBoxMesas = new javax.swing.JComboBox<>();
        jComboBoxMeseros = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBCrear = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
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
        jPanel5 = new javax.swing.JPanel();
        jBImprimir = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLMesero = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablETicket = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLHora = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelNro = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setClosable(true);

        jTabbedPane1.setBackground(new java.awt.Color(80, 70, 42));
        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mesa:");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mesero:");

        jBCrear.setBackground(new java.awt.Color(204, 204, 204));
        jBCrear.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBCrear.setText("Crear Pedido");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(204, 204, 204));
        jBSalir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jBCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jBSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addComponent(jBCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jBSalir)
                .addGap(72, 72, 72))
        );

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\Raton dorado.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel20)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingreso Pedidos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECCIONE UN PEDIDO:");

        jTablePedidos.setBackground(new java.awt.Color(204, 204, 204));
        jTablePedidos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
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
        jTablePedidos.setGridColor(new java.awt.Color(0, 0, 0));
        jTablePedidos.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTablePedidos.setShowGrid(true);
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedidos);

        jButtonBebidas.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBebidas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonBebidas.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\bebidas.png")); // NOI18N
        jButtonBebidas.setText("Bebidas");
        jButtonBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBebidasActionPerformed(evt);
            }
        });

        jButtonComidas.setBackground(new java.awt.Color(204, 204, 204));
        jButtonComidas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonComidas.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\food.png")); // NOI18N
        jButtonComidas.setText("Comidas");
        jButtonComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComidasActionPerformed(evt);
            }
        });

        jButtonPostres.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPostres.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonPostres.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\helado.png")); // NOI18N
        jButtonPostres.setText("Postres");
        jButtonPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPostresActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListProductos);

        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad");

        jButtonAgregar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAgregar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\masIcono.png")); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
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
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable2.setShowGrid(true);
        jScrollPane3.setViewportView(jTable2);

        jBQuitar.setBackground(new java.awt.Color(204, 204, 204));
        jBQuitar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBQuitar.setText("Quitar");
        jBQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitarActionPerformed(evt);
            }
        });

        jBCobrar.setBackground(new java.awt.Color(204, 204, 204));
        jBCobrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jBCobrar.setText("Cobrar");
        jBCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCobrarActionPerformed(evt);
            }
        });

        jBSalir2.setBackground(new java.awt.Color(204, 204, 204));
        jBSalir2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(187, 187, 187))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jBQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jBCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jButtonPostres, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButtonComidas, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(jButtonBebidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(28, 28, 28)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                            .addGap(30, 30, 30))))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonBebidas)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonComidas)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonPostres))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );

        jTabbedPane1.addTab("Carga Pedidos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(580, 629));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(560, 610));

        jBImprimir.setBackground(new java.awt.Color(102, 102, 102));
        jBImprimir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jBImprimir.setForeground(new java.awt.Color(255, 255, 255));
        jBImprimir.setText("Imprimir ticket");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Atendido por:");

        jLMesero.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLMesero.setForeground(new java.awt.Color(0, 0, 0));
        jLMesero.setText("mesero");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("TOTAL: ");

        jLabelTotal.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotal.setText("total");

        jTablETicket.setBackground(new java.awt.Color(255, 255, 255));
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
        jTablETicket.setEnabled(false);
        jScrollPane4.setViewportView(jTablETicket);

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("CONSUMIDOR FINAL");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("FECHA:");

        jLabelFecha.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFecha.setText("fecha");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("HORA:");

        jLHora.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLHora.setForeground(new java.awt.Color(0, 0, 0));
        jLHora.setText("hora");

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("NRO TICKET:");

        jLabelNro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelNro.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNro.setText("nro");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("FACTURA B");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("------------------------------------------------------------------------------------------------------------------------------------------------");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("IVA RESPONSABLE INSCRIPTO");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Av. San Martín 1255 - San Luis");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("0266 4569999");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CUIT Nro 30-11111111-9");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("RESTÓ EL RATA");

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\veron\\OneDrive\\Escritorio\\Proyectos etapa 3 AP\\ProyectoFinalGrupo48\\src\\imagenes\\Raton blanco.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFecha)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLHora)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNro))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)))))
                        .addGap(61, 61, 61))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotal))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel5)
                                .addGap(152, 152, 152)
                                .addComponent(jLabel21))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel11))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel14))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel21))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabelFecha)
                    .addComponent(jLabel15)
                    .addComponent(jLHora)
                    .addComponent(jLabel17)
                    .addComponent(jLabelNro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLMesero))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
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
        for (Producto bebida : proData.listaProducto5(nombre)) {
            modeloJLi.addElement(bebida);
        }
    }//GEN-LAST:event_jButtonBebidasActionPerformed

    private void jButtonComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComidasActionPerformed
        modeloJLi.removeAllElements();
        jListProductos.setModel(modeloJLi);
        String nombre = "Comidas";
        for (Producto bebida : proData.listaProducto5(nombre)) {
            modeloJLi.addElement(bebida);
        }
    }//GEN-LAST:event_jButtonComidasActionPerformed

    private void jButtonPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPostresActionPerformed
        modeloJLi.removeAllElements();
        jListProductos.setModel(modeloJLi);
        String nombre = "Postres";
        for (Producto bebida : proData.listaProducto5(nombre)) {
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
