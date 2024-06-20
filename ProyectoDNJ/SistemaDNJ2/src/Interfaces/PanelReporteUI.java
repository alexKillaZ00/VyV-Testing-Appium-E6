package Interfaces;

import BaseDeDatos.CRUD;
import static BaseDeDatos.Conexion.conexion;
import BaseDeDatos.SQL;
import com.mysql.jdbc.Statement;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Window; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class PanelReporteUI extends javax.swing.JPanel {


    //Variables
    LoginUI loginUI = new LoginUI();
    int idUser = loginUI.idUser;
    CRUD crud;
    public static int numeroVenta = 0;
    public static String fechaVenta = null;
    public static String horaVenta = null;
    public static float montoVenta = 0;
    public static float pagoVenta = 0;
    public static String usuarioVenta = null;
    
    public PanelReporteUI() {
        crud = new CRUD(conexion);
        PanelProductoUI productosUI = new PanelProductoUI();

        initComponents();
        productosUI.cargarCategorias(cmbFiltroCat);
        productosUI.buscar(true, "", "", tablaProductosVisualizar);
        
        mostrarVentas(false); //No se toma encuenta las fechas
        
        //Busca los productos mas vendidos
        buscarProdFecha(false);
        //Grafica a los productos mas vendidos
        graficarDosValores(tablaProductosVendidos, panelGraficoProductos, "Productos mas vendidos", "Productos", "Cantidad");
        //Busca los usuarios con mas ventas
        buscarUsuariosVentas(false);
        //Grafica a los usuarios con mas ventas
        graficarDosValores(tablaUsuariosVentas, panelGraficoUsuarios, "Mejores vendedores", "Vendedores", "Candidad de ventas");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneVisualizar = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductosVisualizar = new javax.swing.JTable();
        txtBuscarProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btmBuscarCategoria = new javax.swing.JButton();
        cmbFiltroCat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPeriodoVentasFin = new javax.swing.JTextField();
        txtPeriodoVentasInicio = new javax.swing.JTextField();
        btmBuscarVentaPeriodo = new javax.swing.JButton();
        jCalendarVentasPeriodo = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btmBorrarPeriodoVentasFin = new javax.swing.JButton();
        btmBorrarPeriodoVentasInicio = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtTotalVendido = new javax.swing.JTextField();
        btmMostrarVenta = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jCalendarGraficaProductos = new com.toedter.calendar.JCalendar();
        txtFechaInicio = new javax.swing.JTextField();
        txtfechaFin = new javax.swing.JTextField();
        btmBuscarVenta = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProductosVendidos = new javax.swing.JTable();
        btmBorrarFechaInicio = new javax.swing.JButton();
        btmBorrarFechaFin = new javax.swing.JButton();
        panelGraficoProductos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jCalendarGraficaUsuarios = new com.toedter.calendar.JCalendar();
        txtFechaInicioUsuarios = new javax.swing.JTextField();
        btmBorrarFechaInicioUsuarios = new javax.swing.JButton();
        txtfechaFinUsuarios = new javax.swing.JTextField();
        btmBorrarFechaFinUsuarios = new javax.swing.JButton();
        btmBuscarUsuarios = new javax.swing.JButton();
        panelGraficoUsuarios = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaUsuariosVentas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jTabbedPaneVisualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tablaProductosVisualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaProductosVisualizar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaProductosVisualizar);

        txtBuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Buscar:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("PRODUCTOS");

        btmBuscarCategoria.setBackground(new java.awt.Color(0, 204, 0));
        btmBuscarCategoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmBuscarCategoria.setText("Buscar");
        btmBuscarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarCategoriaActionPerformed(evt);
            }
        });

        cmbFiltroCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbFiltroCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Categoria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmbFiltroCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btmBuscarCategoria))
                                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 503, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiltroCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmBuscarCategoria)
                    .addComponent(jLabel7))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPaneVisualizar.addTab("Productos", jPanel2);

        jPanel4.setPreferredSize(new java.awt.Dimension(946, 690));

        tablaVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de venta", "Fecha", "Hora", "Monto Venta", "Pago", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaVentas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PERIODO");

        txtPeriodoVentasFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPeriodoVentasInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btmBuscarVentaPeriodo.setBackground(new java.awt.Color(0, 204, 0));
        btmBuscarVentaPeriodo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmBuscarVentaPeriodo.setText("Buscar");
        btmBuscarVentaPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarVentaPeriodoActionPerformed(evt);
            }
        });

        jCalendarVentasPeriodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCalendarVentasPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendarVentasPeriodoMouseClicked(evt);
            }
        });
        jCalendarVentasPeriodo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarVentasPeriodoPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Inicio:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Fin:");

        btmBorrarPeriodoVentasFin.setBackground(new java.awt.Color(255, 51, 51));
        btmBorrarPeriodoVentasFin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btmBorrarPeriodoVentasFin.setText("DEL");
        btmBorrarPeriodoVentasFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarPeriodoVentasFinActionPerformed(evt);
            }
        });

        btmBorrarPeriodoVentasInicio.setBackground(new java.awt.Color(255, 51, 51));
        btmBorrarPeriodoVentasInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btmBorrarPeriodoVentasInicio.setText("DEL");
        btmBorrarPeriodoVentasInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarPeriodoVentasInicioActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Total Vendido:");

        txtTotalVendido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalVendido.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btmMostrarVenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmMostrarVenta.setText("Mostra venta");
        btmMostrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmMostrarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jCalendarVentasPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(txtPeriodoVentasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btmBorrarPeriodoVentasInicio)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(txtPeriodoVentasFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)
                                                .addComponent(btmBorrarPeriodoVentasFin))))
                                    .addComponent(btmBuscarVentaPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmMostrarVenta)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendarVentasPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btmBorrarPeriodoVentasFin)
                                    .addComponent(btmBorrarPeriodoVentasInicio)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPeriodoVentasInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeriodoVentasFin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btmBuscarVentaPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTotalVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmMostrarVenta))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPaneVisualizar.addTab("Ventas", jPanel4);

        jPanel7.setPreferredSize(new java.awt.Dimension(946, 690));

        jCalendarGraficaProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCalendarGraficaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendarGraficaProductosMouseClicked(evt);
            }
        });
        jCalendarGraficaProductos.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarGraficaProductosPropertyChange(evt);
            }
        });

        txtFechaInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtfechaFin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btmBuscarVenta.setBackground(new java.awt.Color(0, 204, 0));
        btmBuscarVenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmBuscarVenta.setText("Buscar");
        btmBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarVentaActionPerformed(evt);
            }
        });

        tablaProductosVendidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaProductosVendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Cantidad vendida"
            }
        ));
        jScrollPane4.setViewportView(tablaProductosVendidos);

        btmBorrarFechaInicio.setBackground(new java.awt.Color(255, 51, 51));
        btmBorrarFechaInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btmBorrarFechaInicio.setText("DEL");
        btmBorrarFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarFechaInicioActionPerformed(evt);
            }
        });

        btmBorrarFechaFin.setBackground(new java.awt.Color(255, 51, 51));
        btmBorrarFechaFin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btmBorrarFechaFin.setText("DEL");
        btmBorrarFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarFechaFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGraficoProductosLayout = new javax.swing.GroupLayout(panelGraficoProductos);
        panelGraficoProductos.setLayout(panelGraficoProductosLayout);
        panelGraficoProductosLayout.setHorizontalGroup(
            panelGraficoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficoProductosLayout.setVerticalGroup(
            panelGraficoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("PERIODO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jCalendarGraficaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btmBorrarFechaFin)
                    .addComponent(btmBorrarFechaInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelGraficoProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCalendarGraficaProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(btmBorrarFechaInicio)
                            .addGap(19, 19, 19)
                            .addComponent(btmBorrarFechaFin)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtfechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btmBuscarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panelGraficoProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPaneVisualizar.addTab("Productos mas vendidos", jPanel7);

        jPanel9.setPreferredSize(new java.awt.Dimension(946, 690));

        jCalendarGraficaUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCalendarGraficaUsuarios.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarGraficaUsuariosPropertyChange(evt);
            }
        });

        txtFechaInicioUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btmBorrarFechaInicioUsuarios.setBackground(new java.awt.Color(255, 51, 51));
        btmBorrarFechaInicioUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btmBorrarFechaInicioUsuarios.setText("DEL");
        btmBorrarFechaInicioUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarFechaInicioUsuariosActionPerformed(evt);
            }
        });

        txtfechaFinUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfechaFinUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechaFinUsuariosKeyTyped(evt);
            }
        });

        btmBorrarFechaFinUsuarios.setBackground(new java.awt.Color(255, 51, 51));
        btmBorrarFechaFinUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btmBorrarFechaFinUsuarios.setText("DEL");
        btmBorrarFechaFinUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBorrarFechaFinUsuariosActionPerformed(evt);
            }
        });

        btmBuscarUsuarios.setBackground(new java.awt.Color(0, 204, 0));
        btmBuscarUsuarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmBuscarUsuarios.setText("Buscar");
        btmBuscarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGraficoUsuariosLayout = new javax.swing.GroupLayout(panelGraficoUsuarios);
        panelGraficoUsuarios.setLayout(panelGraficoUsuariosLayout);
        panelGraficoUsuariosLayout.setHorizontalGroup(
            panelGraficoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficoUsuariosLayout.setVerticalGroup(
            panelGraficoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        tablaUsuariosVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaUsuariosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Usuarios", "Ventas realizadas"
            }
        ));
        jScrollPane5.setViewportView(tablaUsuariosVentas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("PERIODO");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(panelGraficoUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jCalendarGraficaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaInicioUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfechaFinUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btmBorrarFechaInicioUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmBorrarFechaFinUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txtFechaInicioUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtfechaFinUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btmBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btmBorrarFechaInicioUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btmBorrarFechaFinUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCalendarGraficaUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(panelGraficoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPaneVisualizar.addTab("Usuarios", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVisualizar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVisualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        PanelProductoUI productosUI = new PanelProductoUI();
        productosUI.buscar(true, txtBuscarProducto.getText(), "",tablaProductosVisualizar);
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void btmBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarCategoriaActionPerformed

        filtroCategoria();
    }//GEN-LAST:event_btmBuscarCategoriaActionPerformed

    private void btmBuscarVentaPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarVentaPeriodoActionPerformed
        String fechaI = txtPeriodoVentasInicio.getText();
        String fechaF = txtPeriodoVentasFin.getText();

        if (txtPeriodoVentasInicio.getText().isEmpty() && txtPeriodoVentasFin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un intervalo de fechas", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (!fechaI.matches("\\d{4}/\\d{2}/\\d{2}")) {
            // Muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Formato de fecha no válido. Utilice yyyy/mm/dd");
            return;
        }else if (!fechaF.matches("\\d{4}/\\d{2}/\\d{2}")) {
            // Muestra un mensaje de error
            JOptionPane.showMessageDialog(this, "Formato de fecha no válido. Utilice yyyy/mm/dd");
            return;
        }

        mostrarVentas(true);

    }//GEN-LAST:event_btmBuscarVentaPeriodoActionPerformed

    private void jCalendarVentasPeriodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarVentasPeriodoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCalendarVentasPeriodoMouseClicked

    private void jCalendarVentasPeriodoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarVentasPeriodoPropertyChange
        
        Date fechaInicio = new Date(Long.MIN_VALUE);
        Date fechaFin = null;
        SimpleDateFormat ff = new SimpleDateFormat("yyyy/MM/dd");

        try {
            if (evt.getOldValue() != null) {

                if (txtPeriodoVentasInicio.getText().isEmpty()) {

                    txtPeriodoVentasInicio.setText(ff.format(jCalendarVentasPeriodo.getCalendar().getTime()));

                }else if(txtPeriodoVentasFin.getText().isEmpty()){

                    txtPeriodoVentasFin.setText(ff.format(jCalendarVentasPeriodo.getCalendar().getTime()));

                    fechaInicio = ff.parse(txtPeriodoVentasInicio.getText());
                    fechaFin = ff.parse(txtPeriodoVentasFin.getText());

                    if (fechaFin.before(fechaInicio)) {

                        JOptionPane.showMessageDialog(null, "Error al seleccionar la fecha", "Error", JOptionPane.ERROR_MESSAGE);
                        // Aquí puadmedes realizar otras acciones en caso de error
                        txtPeriodoVentasFin.setText("");
                    }
                }
            }
        }catch (ParseException  ex) {

            ex.printStackTrace();

        }

    }//GEN-LAST:event_jCalendarVentasPeriodoPropertyChange

    private void btmBorrarPeriodoVentasFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarPeriodoVentasFinActionPerformed

        txtPeriodoVentasFin.setText("");

    }//GEN-LAST:event_btmBorrarPeriodoVentasFinActionPerformed

    private void btmBorrarPeriodoVentasInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarPeriodoVentasInicioActionPerformed

        txtPeriodoVentasInicio.setText("");
    }//GEN-LAST:event_btmBorrarPeriodoVentasInicioActionPerformed

    private void btmMostrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmMostrarVentaActionPerformed

        DefaultTableModel model = (DefaultTableModel) tablaVentas.getModel();

        int selectedRow = tablaVentas.getSelectedRow();
        if (selectedRow != -1) {

            System.out.println("Fila seleccionada: " + selectedRow);

            numeroVenta = Integer.parseInt(model.getValueAt( selectedRow,0).toString());
            fechaVenta = model.getValueAt(selectedRow, 1).toString();
            horaVenta = model.getValueAt(selectedRow, 2).toString();
            montoVenta = Float.parseFloat(model.getValueAt(selectedRow, 3).toString());
            pagoVenta = Float.parseFloat(model.getValueAt(selectedRow,4).toString());
            usuarioVenta = model.getValueAt(selectedRow,5).toString();

            MostrarVentaUI mostrarVentaUI = new MostrarVentaUI();
            mostrarVentaUI.setVisible(true);
            mostrarVentaUI.setLocationRelativeTo(null);

        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }

    }//GEN-LAST:event_btmMostrarVentaActionPerformed

    private void jCalendarGraficaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarGraficaProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCalendarGraficaProductosMouseClicked

    private void jCalendarGraficaProductosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarGraficaProductosPropertyChange

        Date fechaInicio = new Date(Long.MIN_VALUE);
        Date fechaFin = null;
        SimpleDateFormat ff = new SimpleDateFormat("yyyy/MM/dd");

        try {
            if (evt.getOldValue() != null) {

                if (txtFechaInicio.getText().isEmpty()) {

                    txtFechaInicio.setText(ff.format(jCalendarGraficaProductos.getCalendar().getTime()));

                }else if(txtfechaFin.getText().isEmpty()){

                    txtfechaFin.setText(ff.format(jCalendarGraficaProductos.getCalendar().getTime()));

                    fechaInicio = ff.parse(txtFechaInicio.getText());
                    fechaFin = ff.parse(txtfechaFin.getText());

                    if (fechaFin.before(fechaInicio)) {

                        JOptionPane.showMessageDialog(null, "Error al seleccionar la fecha", "Error", JOptionPane.ERROR_MESSAGE);
                        // Aquí puedes realizar otras acciones en caso de error
                        txtfechaFin.setText("");
                    }
                }
            }
        }catch (ParseException  ex) {

            ex.printStackTrace();

        }

    }//GEN-LAST:event_jCalendarGraficaProductosPropertyChange

    private void btmBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarVentaActionPerformed
        
        String fechaI =(txtFechaInicio).getText();
        String fechaF = txtfechaFin.getText();

        if (!fechaI.matches("\\d{4}/\\d{2}/\\d{2}")) {
            // Muestra un mensaje de error o realiza alguna acción
            JOptionPane.showMessageDialog(this, "Formato de fecha no válido. Utilice yyyy/mm/dd");
            return;
        }else if (!fechaF.matches("\\d{4}/\\d{2}/\\d{2}")) {
            // Muestra un mensaje de error o realiza alguna acción
            JOptionPane.showMessageDialog(this, "Formato de fecha no válido. Utilice yyyy/mm/dd");
            return;
        }

        if (txtFechaInicio.getText().isEmpty() && txtfechaFin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un intervalo de fechas", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
            buscarProdFecha(true);
            graficarDosValores(tablaProductosVendidos, panelGraficoProductos, "Productos mas vendidos", "Productos", "Cantidad");

    }//GEN-LAST:event_btmBuscarVentaActionPerformed

    private void btmBorrarFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarFechaInicioActionPerformed

        txtFechaInicio.setText("");

    }//GEN-LAST:event_btmBorrarFechaInicioActionPerformed

    private void btmBorrarFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarFechaFinActionPerformed

        txtfechaFin.setText("");
    }//GEN-LAST:event_btmBorrarFechaFinActionPerformed

    private void jCalendarGraficaUsuariosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarGraficaUsuariosPropertyChange

        Date fechaInicioUsuarios = new Date(Long.MIN_VALUE);
        Date fechaFinUsuarios = null;
        SimpleDateFormat ffU = new SimpleDateFormat("yyyy/MM/dd");

        try {
            if (evt.getOldValue() != null) {

                if (txtFechaInicioUsuarios.getText().isEmpty()) {
                    txtFechaInicioUsuarios.setText(ffU.format(jCalendarGraficaUsuarios.getCalendar().getTime()));
                } else {
                    txtfechaFinUsuarios.setText(ffU.format(jCalendarGraficaUsuarios.getCalendar().getTime()));
                    fechaInicioUsuarios = ffU.parse(txtFechaInicioUsuarios.getText());
                    fechaFinUsuarios = ffU.parse(txtfechaFinUsuarios.getText());

                    if (fechaFinUsuarios.before(fechaInicioUsuarios)) {
                        JOptionPane.showMessageDialog(null, "Error al seleccionar la fecha", "Error", JOptionPane.ERROR_MESSAGE);
                        txtfechaFinUsuarios.setText("");
                    }
                }

            }
        }catch (ParseException  ex) {

            ex.printStackTrace();

        }
    }//GEN-LAST:event_jCalendarGraficaUsuariosPropertyChange

    private void btmBorrarFechaInicioUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarFechaInicioUsuariosActionPerformed

        txtFechaInicioUsuarios.setText("");
    }//GEN-LAST:event_btmBorrarFechaInicioUsuariosActionPerformed

    private void txtfechaFinUsuariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaFinUsuariosKeyTyped

    }//GEN-LAST:event_txtfechaFinUsuariosKeyTyped

    private void btmBorrarFechaFinUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBorrarFechaFinUsuariosActionPerformed

        txtfechaFinUsuarios.setText("");
    }//GEN-LAST:event_btmBorrarFechaFinUsuariosActionPerformed

    private void btmBuscarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarUsuariosActionPerformed
        String fechaI =(txtfechaFinUsuarios).getText();
        String fechaF = txtfechaFinUsuarios.getText();

        if (!fechaI.matches("\\d{4}/\\d{2}/\\d{2}")) {
            // Muestra un mensaje de error o realiza alguna acción
            JOptionPane.showMessageDialog(this, "Formato de fecha no válido. Utilice yyyy/mm/dd");
            return;
        }else if (!fechaF.matches("\\d{4}/\\d{2}/\\d{2}")) {
            // Muestra un mensaje de error o realiza alguna acción
            JOptionPane.showMessageDialog(this, "Formato de fecha no válido. Utilice yyyy/mm/dd");
            return;
        }

        if (txtFechaInicioUsuarios.getText().isEmpty() && txtfechaFinUsuarios.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un intervalo de fechas", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            buscarUsuariosVentas(true);
            graficarDosValores(tablaUsuariosVentas, panelGraficoUsuarios, "Mejores vendedores", "Vendedores", "Candidad de ventas");
        }

    }//GEN-LAST:event_btmBuscarUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmBorrarFechaFin;
    private javax.swing.JButton btmBorrarFechaFinUsuarios;
    private javax.swing.JButton btmBorrarFechaInicio;
    private javax.swing.JButton btmBorrarFechaInicioUsuarios;
    private javax.swing.JButton btmBorrarPeriodoVentasFin;
    private javax.swing.JButton btmBorrarPeriodoVentasInicio;
    private javax.swing.JButton btmBuscarCategoria;
    private javax.swing.JButton btmBuscarUsuarios;
    private javax.swing.JButton btmBuscarVenta;
    private javax.swing.JButton btmBuscarVentaPeriodo;
    private javax.swing.JButton btmMostrarVenta;
    private javax.swing.JComboBox<String> cmbFiltroCat;
    private com.toedter.calendar.JCalendar jCalendarGraficaProductos;
    private com.toedter.calendar.JCalendar jCalendarGraficaUsuarios;
    private com.toedter.calendar.JCalendar jCalendarVentasPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPaneVisualizar;
    private javax.swing.JPanel panelGraficoProductos;
    private javax.swing.JPanel panelGraficoUsuarios;
    private javax.swing.JTable tablaProductosVendidos;
    private javax.swing.JTable tablaProductosVisualizar;
    private javax.swing.JTable tablaUsuariosVentas;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtFechaInicioUsuarios;
    private javax.swing.JTextField txtPeriodoVentasFin;
    private javax.swing.JTextField txtPeriodoVentasInicio;
    private javax.swing.JTextField txtTotalVendido;
    private javax.swing.JTextField txtfechaFin;
    private javax.swing.JTextField txtfechaFinUsuarios;
    // End of variables declaration//GEN-END:variables

    
    //Metodos
    public JTabbedPane getjTabbedPaneVisualizar() {
        return jTabbedPaneVisualizar;
    }

    
    //Metodo parra buscar Categoria
    public void buscarCategoria(String nombre, JTable tabla){
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id Categoria");
        modelo.addColumn("Categoria");

        
        tabla.setModel(modelo);
        
        String sql = "";
            if (nombre.equals("")) {

                sql = "SELECT * FROM categoria;";

            } else {
                sql = "SELECT * FROM categoria WHERE Nombre LIKE '%"+nombre+"%';";
            }
            
        String Productos[] = new String[9];

        try {
            Statement set = (Statement) conexion.createStatement();
            
            ResultSet resul = set.executeQuery(sql);
            while (resul.next()) {                
                Productos[0] = resul.getString(1);
                Productos[1] = resul.getString(2);

                modelo.addRow(Productos);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"No se pudo mostrar" + e.toString());
        }
    }// Cierra buscar productos
    
    
    public void filtroCategoria(){
        
    String categoria = cmbFiltroCat.getSelectedItem().toString();
    
    DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id producto");
        modelo.addColumn("Codigo Barra");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Precio Venta");
        modelo.addColumn("Categoria");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Cantidad minima");
        
        tablaProductosVisualizar.setModel(modelo);
    
    
        ResultSet resul = this.crud.seleccionar(SQL.selectBuscarProdCat(categoria));
    
       String Productos[] = new String[9];

        try {
            while (resul.next()) {                
                Productos[0] = resul.getString(1);
                Productos[1] = resul.getString(2);
                Productos[2] = resul.getString(3);
                Productos[3] = resul.getString(4);
                Productos[4] = resul.getString(5);
                Productos[5] = resul.getString(6);
                Productos[6] = resul.getString(7);
                Productos[7] = resul.getString(8);
                Productos[8] = resul.getString(9);
                
                modelo.addRow(Productos);
            }
            tablaProductosVisualizar.setModel(modelo);
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"No se pudo mostrar" + e.toString());
        }
    }
    
    public void mostrarVentas(boolean estado){
        DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();
        
        //Si la tabla tiene algun valor, lo borramos
        modelo.setRowCount(0);
        
        String fechaInicio = txtPeriodoVentasInicio.getText();
        String fechaFin = txtPeriodoVentasFin.getText();
        
        ResultSet resul = null;
        
        //si el estado es true, significa que llamara a la sentencia tomado encuenta las fechas inicio y fechas fin y si el falso se saltara las fechas
        if (estado) {
            resul = this.crud.seleccionar(SQL.selectTodasVentasUser(estado, fechaInicio, fechaFin));
        }else{
            resul = this.crud.seleccionar(SQL.selectTodasVentasUser(estado, fechaInicio, fechaFin));
        }
        
        Object datos[] = new Object[6];
        
        try {
            while (resul.next()) {                
                datos[0] = resul.getInt(1);     //Numero Ventas
                datos[1] = resul.getString(2);  //Fecha Venta
                datos[2] = resul.getString(3);  //Nombre Usuario                
                datos[3] = resul.getFloat(4);   //Monto Venta
                datos[4] = resul.getFloat(5);   //Pago Venta
                datos[5] = resul.getString(6);  //Nombre Usuario
                
                modelo.addRow(datos);
            }
        } catch (SQLException e) {
            System.err.println("No se obtuvieron las ventas" + e.getMessage());
        }
                
        //Creamos un array del tamaño de la tabla
        int numFilas = modelo.getRowCount();
        Float total[] = new Float[numFilas];
        float vendido = 0;
        
        for (int fila = 0; fila < numFilas; fila++) {
            total[fila] = Float.valueOf(modelo.getValueAt(fila, 3).toString());
            vendido +=total[fila]; 
        }
        
        txtTotalVendido.setText("$" + vendido);
    }//Cierra mostrarVentas
    
    
    public void buscarProdFecha(boolean estado){
            
        //Creamos un nuevo modelo para la tabla - tablaProductosVendidos
        DefaultTableModel modelo = (DefaultTableModel) tablaProductosVendidos.getModel();
        
        //Si la tabla tiene algun valor, lo borramos
        modelo.setRowCount(0);
        
        //Inicializamos las variables
        String fechaIni = null;
        String fechaFin = null;
        
        //Asignamos el valor de los txt a las variables
        fechaIni = txtFechaInicio.getText();
        fechaFin = txtfechaFin.getText();
        
        //Inicializamos Resulset
        ResultSet resul = null;
               
        //si el estado es true, significa que llamara a la sentencia tomado encuenta las fechas inicio y fechas fin y si el falso se saltara las fechas
        if (estado) {
            resul = this.crud.seleccionar(SQL.selectVentasProdFecha(estado, fechaIni, fechaFin));
        }else{
            resul = this.crud.seleccionar(SQL.selectVentasProdFecha(estado, fechaIni, fechaFin));
        }

        //Creamos array
        Object datos[] = new Object[6];
        
        //Asignamos los valores de la sentencia al array
        try {
            while (resul.next()) {                
                datos[0] = resul.getString(1);  //Nombre Producto
                datos[1] = resul.getInt(2);     //Cantidad Vendida
              
                modelo.addRow(datos);
            }
        } catch (SQLException e) {
            System.err.println("No se obtuvieron las ventas" + e.getMessage());
        }
    }//Cierra buscarProdFecha
    
 
    public void graficarDosValores(JTable tabla, JPanel pane, String tituloGrafica, String barrasGrafica, String numeracionGrafica) {

        pane.removeAll();
        
        //Creamos un nuevo modelo para la tabla
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();

        //Declaramos el numero de filas y columnas en la tabla
        int filasCount = model.getRowCount();
        int columCount = model.getColumnCount();

        //Creamos una variable llamada nombre Producto
        String nombreProducto;

        //Creamos una variable para guardar los datos de la grafica
        DefaultCategoryDataset datosGraf = new DefaultCategoryDataset();

        //Contamos los datos dentro de la tabla
        for (int fila = 0; fila < filasCount; fila++) {
            //Ciclo de filas

            //obtenemos el nombre del producto
            nombreProducto = model.getValueAt(fila, 0).toString();
            //Asignamos el valor de la fila a la variable datosGraf
            datosGraf.setValue(Integer.parseInt(model.getValueAt(fila, 1).toString()), "Producto", nombreProducto);
        }

        //Creamos una nueva grafica
        JFreeChart graficoBarra = ChartFactory.createBarChart3D(
                //Argumentos que se necesitan:
                tituloGrafica, //- Nombre del grafico
                barrasGrafica, //- Nombre de las barras o columnas
                numeracionGrafica, //- Nombre de la numeracion
                datosGraf, //- Datos del grafico
                PlotOrientation.VERTICAL, //- Orientacion
                true, //- Leyenda de barras individuales por color
                true, //- Herramientas
                false //- Url del grafico
        );

        ChartPanel panel = new ChartPanel(graficoBarra);
        //Habilita la funcionalidad de rueda de desplazamiento del mouse
        panel.setMouseWheelEnabled(true);

        //dividimos el espacio del panel en cinco regiones
        pane.setLayout(new BorderLayout());
        //Agregamos el chartPanel al jPanel
        pane.add(panel, BorderLayout.NORTH);
        
        //Solicita a la ventana que se repinte
        panel.revalidate();
        panel.repaint();
    
    }//Cierra graficarProductos
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void buscarUsuariosVentas(boolean estado){
        //Creamos un nuevo modelo para la tabla - tablaProductosVendidos
        DefaultTableModel modelo = (DefaultTableModel) tablaUsuariosVentas.getModel();
        
        //Si la tabla tiene algun valor, lo borramos
        modelo.setRowCount(0);
               
        //Inicializamos las variables
        String fechaIni = null;
        String fechaFin = null;
        
        //Asignamos el valor de los txt a las variables
        fechaIni = txtFechaInicioUsuarios.getText();
        fechaFin = txtfechaFinUsuarios.getText();
        
        //Declaramos ResulSet
        ResultSet resul;
                        
        //si el estado es true, significa que llamara a la sentencia tomado encuenta las fechas inicio y fechas fin y si el falso se saltara las fechas
        if (estado) {
            resul = this.crud.seleccionar(SQL.selectVentasUsuarios(estado, fechaIni, fechaFin));
        }else{
            resul = this.crud.seleccionar(SQL.selectVentasUsuarios(estado, fechaIni, fechaFin));
        }
        
        Object datos[] = new Object[6];
        
        //Asignamos los valores de la sentencia al array
        
        try {
            while (resul.next()) {                
                datos[0] = resul.getString(1);  //Nombre Producto
                datos[1] = resul.getInt(2);     //Cantidad Vendida 
                
                modelo.addRow(datos);
            }
        } catch (SQLException e) {
            System.err.println("No se obtuvieron los datos " + e.getMessage());
        }

    }//Cierra buscarUsuariosVentas

    
}
