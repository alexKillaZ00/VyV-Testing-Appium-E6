package Interfaces;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuUI extends javax.swing.JFrame {

    //Variables
        //Obtener la ruta absoluta del directorio de la aplicación
        public static final String appDir = new File("").getAbsolutePath();

        // Construir la ruta al archivo PDF
        public static final String PDF_FILE_PATH = appDir + File.separator + "Manual_De_Usuario.PDF";

    
    public MenuUI() {
        initComponents();
                
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono.png")));

        LoginUI loginUI = new LoginUI();
        
        if (loginUI.tipoUsuario.equals("Empleado")) {

            //Desactivamos las ventanas que el empleado no puede visualizar
            btmCategoria.setEnabled(false);
            btmProducto.setEnabled(false);
            btmReporte.setEnabled(false);
            btmConfiguracion.setEnabled(false);
            
        }
        
        lblNombreTienda.setText(loginUI.nombreTienda);

        String nombreUser = loginUI.nombreUsuario;
        String tipoUser = loginUI.tipoUsuario;
        
        lblnombreUsuario.setText(nombreUser);
        lblTipoUsuario.setText(tipoUser);
        
        this.setResizable(false); // Evitar que el usuario redimensione la ventana
        this.setExtendedState(MAXIMIZED_BOTH); // Configurar la ventana en pantalla completa
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btmVenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btmCategoria = new javax.swing.JButton();
        btmProducto = new javax.swing.JButton();
        btmReporte = new javax.swing.JButton();
        btmConfiguracion = new javax.swing.JButton();
        btmSalir = new javax.swing.JButton();
        lblnombreUsuario = new javax.swing.JLabel();
        lblTipoUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelContenedor = new javax.swing.JPanel();
        panelBienvenida = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        panelBienvenida1 = new javax.swing.JPanel();
        lblNombreTienda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema DNJ");

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        btmVenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmVenta.setText("Venta");
        btmVenta.setBorder(null);
        btmVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmVentaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        btmCategoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmCategoria.setText("Categoria");
        btmCategoria.setBorder(null);
        btmCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCategoriaActionPerformed(evt);
            }
        });

        btmProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmProducto.setText("Producto");
        btmProducto.setBorder(null);
        btmProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmProductoActionPerformed(evt);
            }
        });

        btmReporte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmReporte.setText("Reporte");
        btmReporte.setBorder(null);
        btmReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmReporteActionPerformed(evt);
            }
        });

        btmConfiguracion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmConfiguracion.setText("Configuracion");
        btmConfiguracion.setBorder(null);
        btmConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmConfiguracionActionPerformed(evt);
            }
        });

        btmSalir.setBackground(new java.awt.Color(255, 51, 51));
        btmSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmSalir.setText("Salir");
        btmSalir.setBorder(null);
        btmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSalirActionPerformed(evt);
            }
        });

        lblnombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblnombreUsuario.setText("Usernarm");

        lblTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTipoUsuario.setText("TipoUsuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tipo de usuario:");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btmSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btmVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btmConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnombreUsuario)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblTipoUsuario)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblnombreUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipoUsuario)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btmVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btmCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btmProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btmReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btmConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btmSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("Bienvenido");
        panelBienvenida.add(jLabel15);

        lblNombreTienda.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblNombreTienda.setText("Bienvenido");
        panelBienvenida1.add(lblNombreTienda);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addComponent(panelBienvenida1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(panelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBienvenida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Sistema");
        jPanel1.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 51));
        jLabel14.setText("D");
        jPanel1.add(jLabel14);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 255));
        jLabel18.setText("N");
        jPanel1.add(jLabel18);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 51, 255));
        jLabel16.setText("J");
        jPanel1.add(jLabel16);

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setText("Ayuda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

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
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmProductoActionPerformed

        mostrarPanelProductos();
        
    }//GEN-LAST:event_btmProductoActionPerformed

    private void btmCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCategoriaActionPerformed

        mostrarPanelCategoria();
        
    }//GEN-LAST:event_btmCategoriaActionPerformed

    private void btmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSalirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_btmSalirActionPerformed

    private void btmVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmVentaActionPerformed

        VentasUI ventasUI = new VentasUI();
        ventasUI.setVisible(true);
        

    }//GEN-LAST:event_btmVentaActionPerformed

    private void btmReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmReporteActionPerformed

        mostrarPanelReporte();
        
    }//GEN-LAST:event_btmReporteActionPerformed

    private void btmConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmConfiguracionActionPerformed

        mostrarPanelConfiguracion();

    }//GEN-LAST:event_btmConfiguracionActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed

        System.exit(0);

        
    }//GEN-LAST:event_menuItemSalirActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        try {
            File pdfFile = new File(PDF_FILE_PATH);
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
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCategoria;
    private javax.swing.JButton btmConfiguracion;
    private javax.swing.JButton btmProducto;
    private javax.swing.JButton btmReporte;
    private javax.swing.JButton btmSalir;
    private javax.swing.JButton btmVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombreTienda;
    public javax.swing.JLabel lblTipoUsuario;
    public javax.swing.JLabel lblnombreUsuario;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JPanel panelBienvenida;
    private javax.swing.JPanel panelBienvenida1;
    private javax.swing.JPanel panelContenedor;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables

    
    
       private void mostrarPanelProductos() {

            // Crear una instancia del panel ProductoUI
        PanelProductoUI panelProductoUI = new PanelProductoUI();
        
        panelProductoUI.setSize(panelContenedor.getWidth(), panelContenedor.getHeight());
        
           // Remover cualquier componente previo del panel contenedor
        panelContenedor.removeAll();
        
//        // Establecer GridLayout con 1 fila y 1 columna
//        panelProductoUI.setLayout(new GridLayout(1, 1)); 

        //hacemos visible el panel
        panelProductoUI.setVisible(true);
        
        // Agregar el panel ProductoUI al panel contenedor
        panelContenedor.add(panelProductoUI, BorderLayout.CENTER);
                
        // Validar y redibujar el panel contenedor
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }

             
       private void mostrarPanelCategoria() {

           // Crear una instancia del panel ProductoUI
        PanelCategoriaUI panelCategoriaUI = new PanelCategoriaUI();
        
        panelCategoriaUI.setSize(panelContenedor.getWidth(), panelContenedor.getHeight());
        
           // Remover cualquier componente previo del panel contenedor
        panelContenedor.removeAll();
        
        // Establecer GridLayout con 1 fila y 1 columna
//        panelCategoriaUI.setLayout(new GridLayout(1, 1)); 

        //hacemos visible el panel
        panelCategoriaUI.setVisible(true);
        
        // Agregar el panel ProductoUI al panel contenedor
        panelContenedor.add(panelCategoriaUI, BorderLayout.CENTER);
                
        // Validar y redibujar el panel contenedor
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }
       
       
       

       private void mostrarPanelReporte() {

            // Crear una instancia del panel ProductoUI
        PanelReporteUI panelReportUI = new PanelReporteUI();
        
        panelReportUI.setSize(panelContenedor.getWidth(), panelContenedor.getHeight());
        
           // Remover cualquier componente previo del panel contenedor
        panelContenedor.removeAll();
        
//        // Establecer GridLayout con 1 fila y 1 columna
//        panelProductoUI.setLayout(new GridLayout(1, 1)); 

        //hacemos visible el panel
        panelReportUI.setVisible(true);
        
        // Agregar el panel ProductoUI al panel contenedor
        panelContenedor.add(panelReportUI, BorderLayout.CENTER);
                
        // Validar y redibujar el panel contenedor
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }
       
       
       private void mostrarPanelConfiguracion() {

            // Crear una instancia del panel ProductoUI
        PanelConfiguracionUI panelConfiguracionUI = new PanelConfiguracionUI();
        
        panelConfiguracionUI.setSize(panelContenedor.getWidth(), panelContenedor.getHeight());
        
           // Remover cualquier componente previo del panel contenedor
        panelContenedor.removeAll();
        
//        // Establecer GridLayout con 1 fila y 1 columna
//        panelProductoUI.setLayout(new GridLayout(1, 1)); 

        //hacemos visible el panel
        panelConfiguracionUI.setVisible(true);
        
        // Agregar el panel ProductoUI al panel contenedor
        panelContenedor.add(panelConfiguracionUI, BorderLayout.CENTER);
                
        // Validar y redibujar el panel contenedor
        panelContenedor.revalidate();
        panelContenedor.repaint();
    }


       
}
