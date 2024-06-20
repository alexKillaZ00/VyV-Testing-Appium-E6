package Interfaces;

import BaseDeDatos.CRUD;
import BaseDeDatos.Conexion;
import static BaseDeDatos.Conexion.conexion;
import BaseDeDatos.SQL;
import com.mysql.jdbc.Statement;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import sistemaDNJ.DetalleVentas;
import sistemaDNJ.Producto;
import sistemaDNJ.Ticket;
import sistemaDNJ.Usuario;
import sistemaDNJ.Ventas;

public class VentasUI extends javax.swing.JFrame {
    //Variables
    LoginUI loginUI = new LoginUI();
    Ticket ticket = new Ticket();
    int idUser = loginUI.idUser;//id usuario
    
    CRUD crud = new CRUD(conexion);
    int r = 0;
    PanelProductoUI prod;
    Statement st;
    ResultSet rst;
    Calendar calendario = new GregorianCalendar();
    Ventas ventas;
    DetalleVentas ventaHijo;
    Usuario usuario = new Usuario();
    int filaseleccionada;
    int valorMaximo = 0;


    public VentasUI() {
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono.png")));

        String tipo = loginUI.tipoUsuario;
        
        System.out.println("soy un " + tipo);

        txtFecha.setText("" + calendario.get(Calendar.YEAR) + "-" + (calendario.get(Calendar.MONTH) + 1) + "-" + calendario.get(Calendar.DAY_OF_MONTH));
        
        numeroVenta();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false); // Evitar que el usuario redimensione la ventana
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBuscar = new javax.swing.JTable();
        btmAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        btmCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblMontoTotal = new javax.swing.JLabel();
        btmVender = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        spinNumeroVenta = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        btmReducir = new javax.swing.JButton();
        btmAumentar = new javax.swing.JButton();
        txtBuscarCodigo = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        btmBuscarProducto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemAyuda = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema DNJ - Venta");
        setExtendedState(6);

        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 608));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Buscar producto:");

        txtBuscarNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyReleased(evt);
            }
        });

        tablaBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CÓDIGO BARRA", "PRODUCTO", "DESCRIPCIÓN", "PRECIO", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBuscarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaBuscar);

        btmAgregar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btmAgregar.setText("Agregar");
        btmAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAgregarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Fecha:");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFecha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFecha.setEnabled(false);
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodigo.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Producto:");

        txtProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProducto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtProducto.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Precio:");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrecio.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Cantidad:");

        spinnerCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spinnerCantidad.setValue(1);

        tablaVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "CÓDIGO BARRA", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVenta);

        btmCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btmCancelar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btmCancelar.setText("CANCELAR");
        btmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCancelarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("TOTAL A PAGAR:");

        lblMontoTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMontoTotal.setForeground(new java.awt.Color(0, 51, 204));
        lblMontoTotal.setText("0.0");

        btmVender.setBackground(new java.awt.Color(0, 204, 0));
        btmVender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmVender.setText("VENDER");
        btmVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmVenderActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Número Venta");

        spinNumeroVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spinNumeroVenta.setEnabled(false);
        spinNumeroVenta.setValue(1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("EFECTIVO:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("CAMBIO:");

        lblCambio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCambio.setForeground(new java.awt.Color(0, 51, 204));
        lblCambio.setText("0.0");

        btmReducir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btmReducir.setText("Menos");
        btmReducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmReducirActionPerformed(evt);
            }
        });

        btmAumentar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btmAumentar.setText("Más");
        btmAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAumentarActionPerformed(evt);
            }
        });

        txtBuscarCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarCodigoKeyReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setText("Buscar código:");

        txtEfectivo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEfectivoKeyReleased(evt);
            }
        });

        btmBuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmBuscarProducto.setText("Buscar");
        btmBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmBuscarProducto)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(spinNumeroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btmCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(lblMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(152, 152, 152)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(109, 109, 109)
                        .addComponent(btmVender, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btmReducir)
                        .addGap(36, 36, 36)
                        .addComponent(btmAumentar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btmAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9)
                        .addComponent(spinNumeroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)
                        .addComponent(btmBuscarProducto)
                        .addComponent(jLabel3)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmAgregar))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmReducir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btmAumentar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCambio)
                            .addComponent(lblMontoTotal)
                            .addComponent(txtEfectivo))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btmCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmVender, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("Sistema");
        jPanel1.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 51));
        jLabel15.setText("D");
        jPanel1.add(jLabel15);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setText("N");
        jPanel1.add(jLabel18);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 51, 255));
        jLabel16.setText("J");
        jPanel1.add(jLabel16);

        jMenu1.setText("File");

        menuItemAyuda.setText("Ayuda");
        menuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAyudaActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemAyuda);

        menuItemCerrarSesion.setText("Cerrar sesion");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemCerrarSesion);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAumentarActionPerformed

        aumentarCantidad();
    }//GEN-LAST:event_btmAumentarActionPerformed

    private void btmReducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmReducirActionPerformed

        reducirCantidad();
    }//GEN-LAST:event_btmReducirActionPerformed

    private void txtEfectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEfectivoKeyReleased
        totalConEfectivo();
    }//GEN-LAST:event_txtEfectivoKeyReleased

    private void btmVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmVenderActionPerformed

        int fila = tablaVenta.getRowCount();
        boolean resul = fila>0;
        
        if (!resul) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione productos para vender");
            return;
        }
        
        if (txtEfectivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Necesita insertar la cantidad a pagar");
            return;
        }
        
        String efectivoText = txtEfectivo.getText();
        float efectivo = 0;

        efectivo = Float.parseFloat(efectivoText);

        float monto = Float.parseFloat(lblMontoTotal.getText());

        if (efectivo < monto) {
            JOptionPane.showMessageDialog(rootPane, "El efectivo es menor al monto de la compra");
            return;
        }

        insertarVenta();

        numeroVenta();
        
        DefaultTableModel buscar = (DefaultTableModel) tablaBuscar.getModel();
        buscar.setRowCount(0);
                
        DefaultTableModel venta = (DefaultTableModel) tablaBuscar.getModel();
        venta.setRowCount(0);
       
        txtBuscarCodigo.setText("");
        txtBuscarNombre.setText("");
        txtEfectivo.setText("");
        lblMontoTotal.setText("");
        lblCambio.setText("");
    }//GEN-LAST:event_btmVenderActionPerformed

    private void btmCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btmCancelarActionPerformed

    private void txtFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyReleased

    private void btmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAgregarActionPerformed


        if (!"".equals(txtCodigo.getText())) {

            insertarVender(tablaVenta, txtCodigo);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Necesita seleccionar un producto");

        }

        totaPagar();
    }//GEN-LAST:event_btmAgregarActionPerformed

    private void tablaBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBuscarMouseClicked
        int fila = tablaBuscar.getSelectedRow();
        if (fila >= 0) {

            txtCodigo.setText(tablaBuscar.getValueAt(fila, 1).toString());
            txtProducto.setText(tablaBuscar.getValueAt(fila, 2).toString());
            txtPrecio.setText(tablaBuscar.getValueAt(fila, 4).toString());

            valorMax();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione fila");
        }
    }//GEN-LAST:event_tablaBuscarMouseClicked

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased

        if (!txtBuscarNombre.getText().isEmpty()) {
            buscar(1,txtBuscarNombre.getText(), txtBuscarCodigo.getText(), tablaBuscar);
        }
    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void txtBuscarCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigoKeyReleased

        if (!txtBuscarCodigo.getText().isEmpty()) {
            buscar(0,txtBuscarNombre.getText(), txtBuscarCodigo.getText(), tablaBuscar);
        }
        
    }//GEN-LAST:event_txtBuscarCodigoKeyReleased

    private void btmBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarProductoActionPerformed

        insertarVender(tablaVenta, txtBuscarCodigo);
       
        totaPagar();


    }//GEN-LAST:event_btmBuscarProductoActionPerformed

    private void txtBuscarCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCodigoKeyPressed

        
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            
            insertarVender(tablaVenta, txtBuscarCodigo);
            
            totaPagar();
            
            DefaultTableModel model = (DefaultTableModel) tablaBuscar.getModel();
            txtBuscarCodigo.setText("");
            txtBuscarNombre.setText("");
            model.setRowCount(0);
            
            
        }
        
    }//GEN-LAST:event_txtBuscarCodigoKeyPressed

    private void menuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAyudaActionPerformed

        MenuUI menuUI = new MenuUI();
        
        try {
            File pdfFile = new File(menuUI.PDF_FILE_PATH);
            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.err.println("Desktop no soportado");
                }
            } else {
                System.err.println("Archivo no existe");
            }
        } catch (IOException ex) {
            System.err.println("No se pudo mostrar el pdf" + ex.getMessage());
        }

    }//GEN-LAST:event_menuItemAyudaActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed

        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window instanceof JFrame) {
                window.dispose();
            }
        }

        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
        loginUI.setLocationRelativeTo(null);

    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_menuItemSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmAgregar;
    private javax.swing.JButton btmAumentar;
    private javax.swing.JButton btmBuscarProducto;
    private javax.swing.JButton btmCancelar;
    private javax.swing.JButton btmReducir;
    private javax.swing.JButton btmVender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JMenuItem menuItemAyuda;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JSpinner spinNumeroVenta;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTable tablaBuscar;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables

    //METODOS

    //con este metodo seleccionas un valor de la tabla y se agrega a las cajas de texto
    public void insertarVender(JTable tabla, JTextField codigoBarra) {
    DefaultTableModel modelo = (DefaultTableModel) tablaVenta.getModel();
    Producto prod = new Producto();
    prod.setCodigoBarra(codigoBarra.getText());
    ResultSet resultado = this.crud.seleccionar(SQL.selectIdCoBNomPre(prod));
    Object[] fila = new Object[6]; // 5 es el número de columnas que tenga la tabla

    try {
        boolean encontrado = false; // flag para saber si el producto ya está en la tabla
        int index = -1; // variable para guardar el índice de la fila donde se encuentra el producto

        while (resultado.next()) {
            String idProducto = resultado.getString("idProducto");
            String codigo = resultado.getString("codigoBarra");
            String nombre = resultado.getString("nombreProducto");
            float pVenta = resultado.getFloat("precioventa");
            int cantidadDisponible = resultado.getInt("cantidadInv");

            for (int i = 0; i < modelo.getRowCount(); i++) {
                // si el producto ya está en la tabla, se actualiza la cantidad y el total
                if (idProducto.equals(modelo.getValueAt(i, 0))) {
                    int cantidadActual = Integer.parseInt(modelo.getValueAt(i, 3).toString());
                    int nuevaCantidad = cantidadActual + Integer.parseInt(spinnerCantidad.getValue().toString());

                    // verifica si la nueva cantidad supera la cantidad disponible
                    if (nuevaCantidad > cantidadDisponible) {
                        JOptionPane.showMessageDialog(rootPane, "No hay suficiente stock del producto");
                        return; // sale del método sin agregar el producto
                    }

                    float nuevoTotal = nuevaCantidad * pVenta;

                    modelo.setValueAt(nuevaCantidad, i, 3); // actualiza la cantidad
                    modelo.setValueAt(nuevoTotal, i, 5); // actualiza el total
                    encontrado = true;
                    break;
                }
            }

            // si el producto no está en la tabla, se agrega una nueva fila
            if (!encontrado) {
                fila[0] = idProducto; // Agregamos al array el id del producto
                fila[1] = codigo; // Agregamos al Array los datos de codigo de barra
                fila[2] = nombre; // Agregamos al Array los datos de nombre
                fila[3] = spinnerCantidad.getValue().toString(); // Agregamos a la tablaVentas el valor del spinner

                // verifica si la cantidad supera la cantidad disponible
                if (Integer.parseInt(fila[3].toString()) > cantidadDisponible) {
                    JOptionPane.showMessageDialog(rootPane, "No hay suficiente stock del producto");
                    return; // sale del método sin agregar el producto
                }

                fila[4] = pVenta; // Agregamos al Array los datos de precio venta

                // obtenemos el valor total multiplicando la cantidad del producto por el precio de venta del producto
                float total = Float.parseFloat(spinnerCantidad.getValue().toString()) * pVenta;

                fila[5] = total; // agregamos el valor total de los productos a la fila Total de la tabla
                modelo.addRow(fila);
            }
        }

        txtCodigo.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
        txtBuscarNombre.setText("");
        spinnerCantidad.setValue(1);
    } catch (SQLException e) {
        // manejar la excepción
    }
}

    
    
//    public void insertarVender(JTable tabla, JTextField codigoBarra) {
//
//        DefaultTableModel modelo = (DefaultTableModel) tablaVenta.getModel();
//
//        Producto prod = new Producto();
//
//        prod.setCodigoBarra(codigoBarra.getText());
//
//        ResultSet resultado = this.crud.seleccionar(SQL.selectIdCoBNomPre(prod));
//
//        Object[] fila = new Object[6]; // 5 es el número de columnas que tenga la tabla
//
//        try {
//
//            boolean encontrado = false; // flag para saber si el producto ya está en la tabla
//            int index = -1; // variable para guardar el índice de la fila donde se encuentra el producto
//
//            while (resultado.next()) {
//                String idProducto = resultado.getString("idProducto");
//                String codigo = resultado.getString("codigoBarra");
//                String nombre = resultado.getString("nombreProducto");
//                float pVenta = resultado.getFloat("precioventa");
//
//                for (int i = 0; i < modelo.getRowCount(); i++) {
//                    // si el producto ya está en la tabla, se actualiza la cantidad y el total
//                    if (idProducto.equals(modelo.getValueAt(i, 0))) {
//                        int cantidadActual = Integer.parseInt(modelo.getValueAt(i, 3).toString());
//                        int nuevaCantidad = cantidadActual + Integer.parseInt(spinnerCantidad.getValue().toString());
//
//                        float nuevoTotal = nuevaCantidad * pVenta;
//
//                        modelo.setValueAt(nuevaCantidad, i, 3); // actualiza la cantidad
//                        modelo.setValueAt(nuevoTotal, i, 5); // actualiza el total
//                        encontrado = true;
//                        break;
//                    }
//                }
//
//                // si el producto no está en la tabla, se agrega una nueva fila
//                if (!encontrado) {
//                    fila[0] = idProducto; // Agregamos al array el id del producto
//                    fila[1] = codigo; // Agregamos al Array los datos de codigo de barra
//                    fila[2] = nombre; // Agregamos al Array los datos de nombre
//                    fila[3] = spinnerCantidad.getValue().toString(); // Agregamos a la tablaVentas el valor del spinner
//                    fila[4] = pVenta; // Agregamos al Array los datos de precio venta
//
//                    //obtenemos el valor total multiplicanto la cantidad del producto por el precio de venta del producto
//                    float total = Float.parseFloat(spinnerCantidad.getValue().toString()) * pVenta;
//
//                    fila[5] = total; //agregamos el valor total de los productos a la fila Total de la tabla
//                    modelo.addRow(fila);
//                }
//            }
//
//            txtCodigo.setText("");
//            txtPrecio.setText("");
//            txtProducto.setText("");
//            txtBuscarNombre.setText("");
//            spinnerCantidad.setValue(1);
//        } catch (SQLException e) {
//
//        }
//
//    }//Cierra insertarVender



    //Metodo parra buscar producto
    //si bus = 1 se buscara por nombre y si es 0 se buscara por codigo
    public void buscar(int bus, String nombre, String codigo, JTable tabla){
        
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        modelo.setRowCount(0);
        
        ResultSet resul = null;
        
        if (bus == 1) {//busqueda por nombre
            resul = this.crud.seleccionar(SQL.buscarProductoVentaUI(nombre));
        }else if (bus == 0) {//busqueda por codigo
            resul = this.crud.seleccionar(SQL.buscarProductosCodigoVentasUI(codigo));
        }
            
        String Productos[] = new String[6];

        try {
            while (resul.next()) {                
                Productos[0] = resul.getString(1);
                Productos[1] = resul.getString(2);
                Productos[2] = resul.getString(3);
                Productos[3] = resul.getString(4);
                Productos[4] = resul.getString(5);
                Productos[5] = resul.getString(6);
                
                modelo.addRow(Productos);
            }

            tabla.setModel(modelo);
 
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"No se pudo mostrar" + e.toString());
        }
    }// Cierra buscar productos
    

    
    
    public void totaPagar() {
        float total = 0;
        float cambio = 0; 
        float tProducto = 0;
        for (int i = 0; i < tablaVenta.getRowCount(); i++) {
            // si el producto ya está en la tabla, se actualiza la cantidad y el total
                tProducto = Float.parseFloat(tablaVenta.getValueAt(i, 5).toString());
                total = total + tProducto;
        }
        lblMontoTotal.setText(Float.toString(total));
        totalConEfectivo();
    }// Cierra totalPagar   
    
    
     public void insertarVenta(){
        float total = Float.parseFloat(lblMontoTotal.getText());
        String fecha = txtFecha.getText();
               
        int nuVenta = Integer.parseInt(spinNumeroVenta.getValue().toString());
        float pago = Float.parseFloat(txtEfectivo.getText());
        
        DefaultTableModel modelo = (DefaultTableModel) tablaVenta.getModel();

             if ("0.0".equals(lblMontoTotal.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Necesita insertar un producto");
            } else {
                this.ventas = new Ventas();
                this.ventas.setNumeroVenta(nuVenta);
                this.ventas.setFechaVenta(fecha);
                this.ventas.setPagoVenta(pago);
                this.ventas.setMontoVenta(total);
                this.ventas.setIdUsuario(idUser);
                
                boolean esVendido = crud.insertar(SQL.insetarVenta(ventas));
                
                 if (esVendido) {
                    DefaultTableModel modeloHijo = (DefaultTableModel) tablaVenta.getModel();
                    ArrayList<DetalleVentas> ventaHijo = new ArrayList();
                    
                    DetalleVentas vhAux;
                    
                     for (int i = 0; i < modelo.getRowCount(); i++) {
                         vhAux = new DetalleVentas();
                         
                        ResultSet rs = this.crud.seleccionar(SQL.maxIdVentasPadre());
                        
                         try {
                             if (rs.next()) {
                            int idVentas = rs.getInt(1);
                            vhAux.setIdVenta(idVentas);
                        }    
                         } catch (SQLException e) {
                             System.err.println("Error al obtener idVenta");
                         }

                         vhAux.setIdProducto(Integer.parseInt(modelo.getValueAt(i, 0).toString()));
                         vhAux.setCantidadProducto(Integer.parseInt(modelo.getValueAt(i, 3).toString()));
                         vhAux.setCodigBarra(modelo.getValueAt(i, 1).toString());
                         vhAux.setPrecioVenta(Float.parseFloat(modelo.getValueAt(i, 4).toString()));
                         vhAux.setNombreProducto(modelo.getValueAt(i, 2).toString());
                         
                        //para obtener el precioCosto

                         int idProducto = Integer.parseInt(modelo.getValueAt(i, 0).toString());
                         
                         ResultSet resul = this.crud.seleccionar(SQL.SelectPrecioCosto(idProducto));
                         float PrecioCosto = 0;
                         try {
                             while (resul.next()) {                                 
                                 PrecioCosto = resul.getFloat(1);
                             }
                         } catch (SQLException e) {
                             System.err.println("No se pudo obtener el precioCosto del producto");
                         }
                         
                         vhAux.setPrecioCosto(PrecioCosto);
                         
 
                        
                        
                         ventaHijo.add(vhAux);
                     }
                     
                     boolean resultado2 = this.crud.insertar(SQL.insertarVentaHijo(ventaHijo));
                     System.out.println(SQL.insertarVentaHijo(ventaHijo));

                     if (resultado2) {
                         JOptionPane.showMessageDialog(rootPane, "Venta realizada");
                                                  
                        //Guardar los datos de la tabla venta en la matriz de datos

                         int filas = modelo.getRowCount();
                         
                         int columnas = 3; // 3 columnas: columna 2, 3 y 4

                            String[][] datos = new String[filas][columnas];

                            for (int i = 0; i < filas; i++) {
                                datos[i][0] = modelo.getValueAt(i, 3).toString(); // Valor de la columna 2
                                datos[i][1] = modelo.getValueAt(i, 2).toString(); // Valor de la columna 3
                                datos[i][2] = modelo.getValueAt(i, 4).toString(); // Valor de la columna 4
                            }
                            
                            float iva = (float) (total*0.16);
                            float subtotal = (float) (total-(total*0.16));
                            
                            float cambio = total - pago;
                            
                            int noventa = Integer.parseInt(spinNumeroVenta.getValue().toString());
                            
                         
                            System.out.println(datos);
                         ticket.imprimirPOS80C("XP-80C", loginUI.nombreTienda, loginUI.nombreUsuario, datos, subtotal, iva, total, pago, cambio, loginUI.mensajeTicket, noventa);
                     }
                     
                        actualizarStoc(); 
                        buscar(1,"", "",tablaBuscar);//Actualizamos la tabla buscar para actualizar el stock
                        modelo.setRowCount(0);
                     
                 } else {
                     JOptionPane.showMessageDialog(rootPane, "Falla al vender");
                 }
                
            }
    }//CIERRA INSERTAR VENTAPADRE
     
     
     
    //Metodo que establece el stock del producto a insertar como valor maximo en el spinner
        public void valorMax() {
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        
        Producto producto = new Producto();
        
        producto.setCodigoBarra(txtCodigo.getText());
                
        ResultSet rst = this.crud.seleccionar( SQL.seleccionarInventarioCantidad(producto));
        
        try {
            while (rst.next()) {              
                valorMaximo = rst.getInt(1);
            }
            System.out.println(valorMaximo);
            
            modeloSpinner.setMaximum(valorMaximo);
            modeloSpinner.setValue(1);
            modeloSpinner.setMinimum(0);            
            spinnerCantidad.setModel(modeloSpinner);
            
        } catch (SQLException e) {
           
            JOptionPane.showMessageDialog(rootPane, "No se pudo establecer valor maximo " + e.getMessage());
        
        }
    }//Cierra valor maximo
     
     
     
    public void reducirCantidad() {
    int filaSeleccionada = this.tablaVenta.getSelectedRow();
    
    if (filaSeleccionada != -1) { // Seleccionó una fila válida
        int cantidadAuxiliar = Integer.parseInt(this.tablaVenta.getValueAt(filaSeleccionada, 3).toString());
        
        if (cantidadAuxiliar > 0) { // Hay suficiente cantidad para reducir
            float importeAux = Float.parseFloat(this.tablaVenta.getValueAt(filaSeleccionada, 4).toString());
            cantidadAuxiliar--;
            this.tablaVenta.setValueAt(cantidadAuxiliar, filaSeleccionada, 3);
            this.tablaVenta.setValueAt((cantidadAuxiliar * importeAux), filaSeleccionada, 5);
            totaPagar(); // Actualiza el total a pagar
            
            float Efectivo;
             if (txtEfectivo.getText().isEmpty()) {
                    Efectivo = 0;
                }else{
                    Efectivo = Float.parseFloat(txtEfectivo.getText());

                }
            float total = Float.parseFloat(lblMontoTotal.getText());
            
            float cambio = Efectivo - total;
            
            lblCambio.setText(""+cambio);
        
        }
        if (cantidadAuxiliar == 0) {
            
            ((DefaultTableModel) tablaVenta.getModel()).removeRow(filaSeleccionada);
            
            totaPagar();
            
        }
    }
    }//ReducirCantidad
    
    
    
    public void aumentarCantidad() {
        int filaSeleccionada = tablaVenta.getSelectedRow();

        if (filaSeleccionada != -1) { // Seleccionó una fila válida
            int cantidadAuxiliar = Integer.parseInt(this.tablaVenta.getValueAt(filaSeleccionada, 3).toString());

            if (cantidadAuxiliar > 0 && cantidadAuxiliar < valorMaximo) { // Hay suficiente cantidad 

                float importeAux = Float.parseFloat(this.tablaVenta.getValueAt(filaSeleccionada, 4).toString());
                cantidadAuxiliar++;
                this.tablaVenta.setValueAt(cantidadAuxiliar, filaSeleccionada, 3);
                this.tablaVenta.setValueAt((cantidadAuxiliar * importeAux), filaSeleccionada, 5);
                totaPagar(); // Actualiza el total a pagar
                
                float Efectivo;
                
                if (txtEfectivo.getText().isEmpty()) {
                    Efectivo = 0;
                }else{
                    Efectivo = Float.parseFloat(txtEfectivo.getText());

                }
                 
                float total = Float.parseFloat(lblMontoTotal.getText());

                float cambio = Efectivo - total;

                lblCambio.setText(""+cambio);

            }
            if (cantidadAuxiliar == 0) {

                ((DefaultTableModel) tablaVenta.getModel()).removeRow(filaSeleccionada);
                totaPagar();
            }
        }
    }//aumentarCantidad
    
    
    
    
    
    
    public void actualizarStoc(){
    DefaultTableModel modelo = (DefaultTableModel) tablaVenta.getModel();
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto prod = new Producto();
            
            int stock = 0;
                                    
            String codBarra = modelo.getValueAt(i, 1).toString();
            
            int can = Integer.parseInt(modelo.getValueAt(i, 3).toString());
            
            prod.setCodigoBarra(codBarra);
            
            //obtenemos el inventario
                        
            ResultSet resuInv = this.crud.seleccionar(SQL.seleccionarInventarioCantidad(prod));
            System.out.println(SQL.seleccionarInventarioCantidad(prod));
            
            int inventario = 0;
            
            try {
                while (resuInv.next()) {                    
                    inventario = resuInv.getInt(1);
                }
            } catch (SQLException e) {
                System.err.println("No se puedo obtener la cantidad a restar");
            }

            stock = inventario - can;
            
            prod.setCantidadInv(stock);
            
            boolean actuInv = this.crud.actualizar(SQL.actualizarStock(prod));
            System.out.println(SQL.actualizarStock(prod));
            
            if (actuInv) {
                System.out.println("Stock actualizado");
            } else {
                System.out.println("No se pudo actualizar el stoc");
            }

        }
    }
     
    
    public void numeroVenta(){
        
             ResultSet resul = this.crud.seleccionar(SQL.maxIdVentas());
        
        int numeroVenta = 0;
        
        try {
            while (resul.next()) {                
                numeroVenta = resul.getInt(1);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener numero de venta");
        }
        
        numeroVenta++;
        
        spinNumeroVenta.setValue(numeroVenta);
    }//Cierra numeroVenta
    
    public void buscarInsertarProducto(){
    
        String codigoBarra = txtBuscarCodigo.getText();
        
        ResultSet resul = this.crud.seleccionar(SQL.buscarProductoCodigoVentasUIDos(codigoBarra));

    }

    public void totalConEfectivo(){
            
        if (!txtEfectivo.getText().matches("\\d*(\\.\\d*)?")) {
            JOptionPane.showMessageDialog(rootPane, "El efectivo no es válido");
            return;
        }
        float total = 0;
        float efectivo = 0;

        if (txtEfectivo.getText().isEmpty()) {
            lblCambio.setText(""+total);
        }else{

            total = Float.parseFloat(lblMontoTotal.getText());
            efectivo = Float.parseFloat(txtEfectivo.getText());

            float cambio = efectivo-total;
            lblCambio.setText(""+cambio);

        }
    }
    
    
    public void imprimirTicket(){
    
    }

}
