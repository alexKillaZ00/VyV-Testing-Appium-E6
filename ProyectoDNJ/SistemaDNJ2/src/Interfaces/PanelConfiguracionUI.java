/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import BaseDeDatos.CRUD;
import static BaseDeDatos.Conexion.conexion;
import BaseDeDatos.SQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import sistemaDNJ.Usuario;

/**
 *
 * @author ricar
 */
public class PanelConfiguracionUI extends javax.swing.JPanel {
    

    //Variables
    CRUD crud = new CRUD(conexion);
    int idUsuario = 0;
    
    public PanelConfiguracionUI() {
        LoginUI loginUI = new LoginUI();

        initComponents();

        txtNombreUsuarioActualizar.setText(loginUI.nombreUsuario);

        txtNombreTienda.setText(loginUI.nombreTienda);
        txtMensaje.setText(loginUI.mensajeTicket);
        if (loginUI.tipoUsuario.equals("Empleado")) {

            tabbedPaneConfiguracion.setEnabledAt(1, false);
            tabbedPaneConfiguracion.setEnabledAt(2, false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneConfiguracion = new javax.swing.JTabbedPane();
        panelEditarPerfil = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombreUsuarioActualizar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtContraActualActualizar = new javax.swing.JPasswordField();
        btmCambiarNombre = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtContraNueva = new javax.swing.JPasswordField();
        txtContraConfirmActualizar = new javax.swing.JPasswordField();
        jLabel22 = new javax.swing.JLabel();
        btmCambiarContraseña = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        panelAgregarUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAgregarUsuarioNombre = new javax.swing.JTextField();
        txtAgregarContra = new javax.swing.JPasswordField();
        txtAgregarContraConfir = new javax.swing.JPasswordField();
        btmAgregarUsuario = new javax.swing.JButton();
        cmbAgregarTipoUsuario = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        panelEditarUsuario = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarUsuarioActualizar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btmBuscar = new javax.swing.JButton();
        txtActualizarContraseñaUsuario = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        cmbActualizarTipoUsuario = new javax.swing.JComboBox<>();
        txtActualizarContraseñaUsuarioConfirm = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        btmBuscar1 = new javax.swing.JButton();
        txtActualizarNombreUsuario = new javax.swing.JTextField();
        panelEliminarUsuario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBuscarUsuarioEliminar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombreUsuarioEliminar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbTipoUsuarioEliminar = new javax.swing.JComboBox<>();
        btmDatostTicket1 = new javax.swing.JButton();
        btmBuscarUsuarioEliminar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtContraseñaUsuarioEliminar = new javax.swing.JPasswordField();
        panelDatosTienda = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtNombreTienda = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btmDatostTicket = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();

        tabbedPaneConfiguracion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Cambiar nombre");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Nombre:");

        txtNombreUsuarioActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreUsuarioActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActualizarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Contraseña actual:");

        txtContraActualActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btmCambiarNombre.setBackground(new java.awt.Color(0, 204, 0));
        btmCambiarNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmCambiarNombre.setText("Cambiar nombre");
        btmCambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCambiarNombreActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Nueva contraseña:");

        txtContraNueva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtContraConfirmActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Confirmar contraseña:");

        btmCambiarContraseña.setBackground(new java.awt.Color(0, 204, 0));
        btmCambiarContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmCambiarContraseña.setText("Cambiar contraseña");
        btmCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCambiarContraseñaActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Cambiar contraseña");

        javax.swing.GroupLayout panelEditarPerfilLayout = new javax.swing.GroupLayout(panelEditarPerfil);
        panelEditarPerfil.setLayout(panelEditarPerfilLayout);
        panelEditarPerfilLayout.setHorizontalGroup(
            panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                        .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtContraNueva))
                            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtContraActualActualizar))
                            .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btmCambiarNombre)
                                .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtContraConfirmActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10)))
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                        .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btmCambiarContraseña)
                            .addComponent(jLabel21)
                            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreUsuarioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelEditarPerfilLayout.setVerticalGroup(
            panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarPerfilLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuarioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(27, 27, 27)
                .addComponent(btmCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraActualActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(panelEditarPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraConfirmActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(32, 32, 32)
                .addComponent(btmCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        tabbedPaneConfiguracion.addTab("Editar Perfil", panelEditarPerfil);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Agregar Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Confirmar contraseña:");

        txtAgregarUsuarioNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAgregarUsuarioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgregarUsuarioNombreActionPerformed(evt);
            }
        });

        txtAgregarContra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtAgregarContraConfir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btmAgregarUsuario.setBackground(new java.awt.Color(0, 204, 0));
        btmAgregarUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmAgregarUsuario.setText("Agregar");
        btmAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAgregarUsuarioActionPerformed(evt);
            }
        });

        cmbAgregarTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbAgregarTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Administrador", "Empleado" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tipo Usuario:");

        javax.swing.GroupLayout panelAgregarUsuarioLayout = new javax.swing.GroupLayout(panelAgregarUsuario);
        panelAgregarUsuario.setLayout(panelAgregarUsuarioLayout);
        panelAgregarUsuarioLayout.setHorizontalGroup(
            panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmAgregarUsuario)
                    .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtAgregarContraConfir, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtAgregarContra))
                        .addComponent(jLabel2)
                        .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(46, 46, 46)
                            .addComponent(txtAgregarUsuarioNombre))
                        .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(cmbAgregarTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        panelAgregarUsuarioLayout.setVerticalGroup(
            panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAgregarUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAgregarContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAgregarContraConfir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbAgregarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btmAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        tabbedPaneConfiguracion.addTab("Agregar Usuario", panelAgregarUsuario);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Buscar usuario");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");

        txtBuscarUsuarioActualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarUsuarioActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUsuarioActualizarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Contraseña:");

        btmBuscar.setBackground(new java.awt.Color(0, 204, 0));
        btmBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmBuscar.setText("Buscar");
        btmBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarActionPerformed(evt);
            }
        });

        txtActualizarContraseñaUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Tipo Usuario:");

        cmbActualizarTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbActualizarTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Administrador", "Empleado" }));

        txtActualizarContraseñaUsuarioConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Confirmar contraseña:");

        btmBuscar1.setBackground(new java.awt.Color(0, 204, 0));
        btmBuscar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmBuscar1.setText("Actualizar");
        btmBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscar1ActionPerformed(evt);
            }
        });

        txtActualizarNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtActualizarNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarNombreUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditarUsuarioLayout = new javax.swing.GroupLayout(panelEditarUsuario);
        panelEditarUsuario.setLayout(panelEditarUsuarioLayout);
        panelEditarUsuarioLayout.setHorizontalGroup(
            panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarUsuarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelEditarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addGap(18, 18, 18)
                            .addComponent(txtActualizarContraseñaUsuarioConfirm))
                        .addGroup(panelEditarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txtActualizarContraseñaUsuario))
                        .addGroup(panelEditarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txtBuscarUsuarioActualizar))
                        .addGroup(panelEditarUsuarioLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtActualizarNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEditarUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(cmbActualizarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btmBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        panelEditarUsuarioLayout.setVerticalGroup(
            panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditarUsuarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscarUsuarioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btmBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtActualizarNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtActualizarContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtActualizarContraseñaUsuarioConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cmbActualizarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btmBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        tabbedPaneConfiguracion.addTab("Editar Usuario", panelEditarUsuario);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Eliminar usuario");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Buscar usuario:");

        txtBuscarUsuarioEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscarUsuarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUsuarioEliminarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Nombre:");

        txtNombreUsuarioEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreUsuarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioEliminarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Tipo Usuario:");

        cmbTipoUsuarioEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbTipoUsuarioEliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Administrador", "Empleado" }));

        btmDatostTicket1.setBackground(new java.awt.Color(255, 0, 0));
        btmDatostTicket1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmDatostTicket1.setText("Aceptar");
        btmDatostTicket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmDatostTicket1ActionPerformed(evt);
            }
        });

        btmBuscarUsuarioEliminar.setBackground(new java.awt.Color(0, 204, 0));
        btmBuscarUsuarioEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmBuscarUsuarioEliminar.setText("Aceptar");
        btmBuscarUsuarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmBuscarUsuarioEliminarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Contraseña");

        txtContraseñaUsuarioEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelEliminarUsuarioLayout = new javax.swing.GroupLayout(panelEliminarUsuario);
        panelEliminarUsuario.setLayout(panelEliminarUsuarioLayout);
        panelEliminarUsuarioLayout.setHorizontalGroup(
            panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarUsuarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEliminarUsuarioLayout.createSequentialGroup()
                        .addGroup(panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelEliminarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTipoUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btmDatostTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addGroup(panelEliminarUsuarioLayout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBuscarUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEliminarUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(73, 73, 73)
                                .addGroup(panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContraseñaUsuarioEliminar)
                                    .addComponent(txtNombreUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btmBuscarUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        panelEliminarUsuarioLayout.setVerticalGroup(
            panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEliminarUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtBuscarUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmBuscarUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombreUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtContraseñaUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoUsuarioEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(btmDatostTicket1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        tabbedPaneConfiguracion.addTab("Eliminar usuario", panelEliminarUsuario);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setText("Datos de la tienda");

        txtNombreTienda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTiendaActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Nombre establecimiento:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Mensaje de ticket:");

        btmDatostTicket.setBackground(new java.awt.Color(0, 204, 0));
        btmDatostTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmDatostTicket.setText("Aceptar");
        btmDatostTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmDatostTicketActionPerformed(evt);
            }
        });

        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMensaje.setRows(5);
        jScrollPane1.setViewportView(txtMensaje);

        javax.swing.GroupLayout panelDatosTiendaLayout = new javax.swing.GroupLayout(panelDatosTienda);
        panelDatosTienda.setLayout(panelDatosTiendaLayout);
        panelDatosTiendaLayout.setHorizontalGroup(
            panelDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosTiendaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(panelDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btmDatostTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDatosTiendaLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(panelDatosTiendaLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        panelDatosTiendaLayout.setVerticalGroup(
            panelDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosTiendaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addGroup(panelDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosTiendaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel26))
                    .addGroup(panelDatosTiendaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelDatosTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addComponent(btmDatostTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        tabbedPaneConfiguracion.addTab("Datos", panelDatosTienda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneConfiguracion)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPaneConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActualizarActionPerformed

    private void btmCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCambiarNombreActionPerformed

        editarNombre();

    }//GEN-LAST:event_btmCambiarNombreActionPerformed

    private void btmCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCambiarContraseñaActionPerformed

        if (txtContraActualActualizar.getText().isEmpty()
            || txtContraNueva.getText().isEmpty()
            || txtContraConfirmActualizar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necesita insertar rellenar los campos ");
        }else{
            editarContra();
        }
    }//GEN-LAST:event_btmCambiarContraseñaActionPerformed

    private void txtAgregarUsuarioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgregarUsuarioNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgregarUsuarioNombreActionPerformed

    private void btmAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAgregarUsuarioActionPerformed

        AgregarUsuario();
    }//GEN-LAST:event_btmAgregarUsuarioActionPerformed

    private void txtBuscarUsuarioActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarUsuarioActualizarActionPerformed

    private void btmBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarActionPerformed

        if (!txtBuscarUsuarioActualizar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(panelDatosTienda,"info");
            buscarUsuario(txtBuscarUsuarioActualizar, txtNombreUsuarioActualizar, txtActualizarContraseñaUsuario, cmbActualizarTipoUsuario);
        }else{
            JOptionPane.showMessageDialog(panelDatosTienda, "Necesita ingresar un usuario");
        }
        
    }//GEN-LAST:event_btmBuscarActionPerformed

    private void btmBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscar1ActionPerformed

        editarUsuario();
    }//GEN-LAST:event_btmBuscar1ActionPerformed

    private void txtActualizarNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizarNombreUsuarioActionPerformed

    private void txtNombreTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTiendaActionPerformed

    private void btmDatostTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmDatostTicketActionPerformed

        actualizarInfoTicket();
    }//GEN-LAST:event_btmDatostTicketActionPerformed

    private void txtBuscarUsuarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarUsuarioEliminarActionPerformed

    private void txtNombreUsuarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioEliminarActionPerformed

    private void btmDatostTicket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmDatostTicket1ActionPerformed

        if (txtNombreUsuarioEliminar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(panelDatosTienda,"Necesita buscar un usuario");
            return;
        }
        eliminarUsuario();

    }//GEN-LAST:event_btmDatostTicket1ActionPerformed

    private void btmBuscarUsuarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmBuscarUsuarioEliminarActionPerformed

        
        if (!txtBuscarUsuarioEliminar.getText().isEmpty()) {
            buscarUsuario(txtBuscarUsuarioEliminar, txtNombreUsuarioEliminar, txtContraseñaUsuarioEliminar, cmbTipoUsuarioEliminar);
        }else{
            JOptionPane.showMessageDialog(panelDatosTienda, "Necesita ingresar un usuario");
        }
        
        
    }//GEN-LAST:event_btmBuscarUsuarioEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmAgregarUsuario;
    private javax.swing.JButton btmBuscar;
    private javax.swing.JButton btmBuscar1;
    private javax.swing.JButton btmBuscarUsuarioEliminar;
    private javax.swing.JButton btmCambiarContraseña;
    private javax.swing.JButton btmCambiarNombre;
    private javax.swing.JButton btmDatostTicket;
    private javax.swing.JButton btmDatostTicket1;
    private javax.swing.JComboBox<String> cmbActualizarTipoUsuario;
    private javax.swing.JComboBox<String> cmbAgregarTipoUsuario;
    private javax.swing.JComboBox<String> cmbTipoUsuarioEliminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAgregarUsuario;
    private javax.swing.JPanel panelDatosTienda;
    private javax.swing.JPanel panelEditarPerfil;
    private javax.swing.JPanel panelEditarUsuario;
    private javax.swing.JPanel panelEliminarUsuario;
    private javax.swing.JTabbedPane tabbedPaneConfiguracion;
    private javax.swing.JPasswordField txtActualizarContraseñaUsuario;
    private javax.swing.JPasswordField txtActualizarContraseñaUsuarioConfirm;
    private javax.swing.JTextField txtActualizarNombreUsuario;
    private javax.swing.JPasswordField txtAgregarContra;
    private javax.swing.JPasswordField txtAgregarContraConfir;
    private javax.swing.JTextField txtAgregarUsuarioNombre;
    private javax.swing.JTextField txtBuscarUsuarioActualizar;
    private javax.swing.JTextField txtBuscarUsuarioEliminar;
    private javax.swing.JPasswordField txtContraActualActualizar;
    private javax.swing.JPasswordField txtContraConfirmActualizar;
    private javax.swing.JPasswordField txtContraNueva;
    private javax.swing.JPasswordField txtContraseñaUsuarioEliminar;
    private javax.swing.JTextArea txtMensaje;
    private javax.swing.JTextField txtNombreTienda;
    private javax.swing.JTextField txtNombreUsuarioActualizar;
    private javax.swing.JTextField txtNombreUsuarioEliminar;
    // End of variables declaration//GEN-END:variables

    
    
    

    public void AgregarUsuario(){
    
        Usuario user = new Usuario();
        
        String nombre = txtAgregarUsuarioNombre.getText();
        String contra = txtAgregarContra.getText();
        String confir = txtAgregarContraConfir.getText();
        String tipo = cmbAgregarTipoUsuario.getSelectedItem().toString();
        
        if ("-----".equals(tipo) || "".equals(nombre) || "".equals(contra) || "".equals(confir)) {
            JOptionPane.showMessageDialog(null, "Debe rellenar los campos");
            return;
        }
        
        if (!confir.equals(contra)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return;
        }
        
        user.setNombreUsuario(nombre);
        user.setContraseña(contra);
        user.setTipoUsuario(tipo);
        
        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar Agregar un nuevo usuario?", "Confirmación", JOptionPane.YES_NO_OPTION);

        boolean esInsertado = false;
        
        if (confirm == JOptionPane.YES_OPTION) {
           
            esInsertado = this.crud.insertar(SQL.insertarUsuario(user));        
        
        } else {
            return;
        }
                
        if (esInsertado) {
            JOptionPane.showMessageDialog(null,"Usuario Registrado");
            txtAgregarUsuarioNombre.setText("");
            txtAgregarContra.setText("");
            txtAgregarContraConfir.setText("");
            cmbAgregarTipoUsuario.setSelectedItem("-----");
        } else {
            JOptionPane.showMessageDialog(null,"Usuario no insertado");
        }
        
    }
    
    
    //Metodo cambiar contraseña
    public void editarNombre(){
    
        LoginUI loginUI = new LoginUI();
        Usuario user = new Usuario();
        MenuUI menuUI = new MenuUI();
        
        int idUser = loginUI.idUser;
        
        String nuevoNombre = null;
        
        nuevoNombre = txtNombreUsuarioActualizar.getText();
        
        user.setIdUsuario(idUser);
        user.setNombreUsuario(nuevoNombre);
                
        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar esta acción?", "Confirmación", JOptionPane.YES_NO_OPTION);

        boolean esActualizado = false;
        
        if (confirm == JOptionPane.YES_OPTION) {
           
            esActualizado = this.crud.actualizar(SQL.actualizarNombreUsuario(user));
        
        } else {
            
            txtNombreUsuarioActualizar.setText(loginUI.nombreUsuario);
            return;
        
        }
        
        if (esActualizado) {
            
            JOptionPane.showMessageDialog(null, "Usuario actualizado, para visualizar los cambios, reinicie la aplicacion");
            loginUI.nombreUsuario = nuevoNombre;
           
            txtNombreUsuarioActualizar.setText(nuevoNombre);

        }else{
            JOptionPane.showMessageDialog(null, "No se realizaron cambios");
        }
        
    }//Cierra editar nombre
    
    public void editarContra(){
        
        LoginUI loginUI = new LoginUI();
        Usuario user = new Usuario();
    
        int idUser = loginUI.idUser;
        
        String contraAcual = txtContraActualActualizar.getText();
        
        if (!loginUI.contrase.equals(contraAcual)) {
            JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            return;
        }
        
        String contraNueva = txtContraNueva.getText();
        
        String contraNuevaCon = txtContraConfirmActualizar.getText();
        
        if (!contraNueva.equals(contraNuevaCon)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return;
        }
        
        user.setIdUsuario(idUser);
        user.setContraseña(contraNueva);
        
        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de realizar esta acción?", "Confirmación", JOptionPane.YES_NO_OPTION);

        boolean esActualizado = false;
        
        if (confirm == JOptionPane.YES_OPTION) {
           
            esActualizado = this.crud.actualizar(SQL.actualizarContraseña(user));
        
        } else {
            return;
        }
        
        
        if (esActualizado) {
            
            JOptionPane.showMessageDialog(null, "Contraseña actualizada");
            loginUI.contrase = contraNueva;
            
            txtContraActualActualizar.setText("");
            txtContraNueva.setText("");
            txtContraConfirmActualizar.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
    }

    public JTabbedPane getTabbedPaneConfiguracion() {
        return tabbedPaneConfiguracion;
    }

 
    public void buscarUsuario(JTextField buscarUsuario, JTextField nombre, JTextField contraseña, JComboBox comboTipo){
    
        Usuario user = new Usuario();
        
        String nombreUsuario = buscarUsuario.getText();
        
        user.setNombreUsuario(nombreUsuario);
        
        ResultSet resul = this.crud.seleccionar(SQL.selectUsuario(user));
        
        String usu[] = new String[4];
        
        try {
            while (resul.next()) {                
                usu[0] = resul.getString(1);//idUsuario
                usu[1] = resul.getString(2);//NombreUsuario
                usu[2] = resul.getString(3);//Contraseña
                usu[3] = resul.getString(4);//TipoUsuario
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el usuario" + e.getMessage());
        }
        
        if (usu[0] == null) {
            JOptionPane.showMessageDialog(null, "Usuario no existe");
            return;
        }
        
        idUsuario = Integer.parseInt(usu[0]);
        nombre.setText(usu[1]);
        contraseña.setText(usu[2]);
        comboTipo.setSelectedItem(usu[3]);

    }
    

    public void editarUsuario(){
        
        Usuario user = new Usuario();
        
        String nombre = txtActualizarNombreUsuario.getText();
        String contra = txtActualizarContraseñaUsuario.getText();
        String confir = txtActualizarContraseñaUsuarioConfirm.getText();
        String tipo = cmbActualizarTipoUsuario.getSelectedItem().toString();
        
        if (idUsuario == 1) {
            JOptionPane.showMessageDialog(null, "No es posible modificar este usuario");
            return;
        }
        
        if (!confir.equals(contra)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return;
        } 
        
       user.setIdUsuario(idUsuario);
       user.setNombreUsuario(nombre);
       user.setContraseña(contra);
       user.setTipoUsuario(tipo);
       
       boolean esAcutalizado = this.crud.actualizar(SQL.actualizarNombreUsuario(user));
       
       boolean esActualizado2 = this.crud.actualizar(SQL.actualizarContraseña(user));
       
       boolean esActualizado3 = this.crud.actualizar(SQL.actualizarTipoUsuario(user));
       
        if (!esAcutalizado) {
            JOptionPane.showMessageDialog(null, "Error al actualizar nombre");
            return;
        }else if (!esActualizado2) {
            JOptionPane.showMessageDialog(null, "Error al actualizar contraseña");
            return;
        }else if (!esActualizado3) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el tipo de usuario");
            return;
        }
        
        MenuUI menuUI = new MenuUI();
                
        JOptionPane.showMessageDialog(null, "Datos actualizado correctamente");
       
    }
    
    
    
    public void actualizarInfoTicket(){
    
        LoginUI loginUI = new LoginUI();
        String tienda = txtNombreTienda.getText();
        String mensaje = txtMensaje.getText();
        
        boolean esActualizado = this.crud.actualizar(SQL.actualizarConfiguracion(tienda, mensaje));
        
        if (esActualizado) {
            JOptionPane.showMessageDialog(null, "Informacion actualizada");
            loginUI.nombreTienda = tienda;
            loginUI.mensajeTicket = mensaje;    
        }else{
            JOptionPane.showMessageDialog(null,"Error al actualizar informacion");
        }
        
    }
 
    
    public void eliminarUsuario(){
  
        Usuario user = new Usuario();
        
        String nombre = txtNombreUsuarioEliminar.getText();
        
        if (idUsuario == 1) {
            JOptionPane.showMessageDialog(null, "No es posible eliminar este usuario");
            return;
        }
        
        user.setIdUsuario(idUsuario);
        
        boolean esEliminado = this.crud.eliminar(SQL.eliminarUsuario(user));

        if (!esEliminado) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Usuario Eliminado");
    }
}
