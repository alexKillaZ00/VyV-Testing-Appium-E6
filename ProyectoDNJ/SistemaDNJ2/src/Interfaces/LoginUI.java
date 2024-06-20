package Interfaces;

import BaseDeDatos.CRUD;
import static BaseDeDatos.Conexion.conexion;
import BaseDeDatos.SQL;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import sistemaDNJ.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;



public class LoginUI extends javax.swing.JFrame {

    CRUD crud;
    public static String nombreUsuario = null;
    public static String tipoUsuario = null;
    public static String contrase = null;
    public static int idUser = 0;
    public static boolean sesionIniciada; // Variable para controlar si la sesión está iniciada

    
    public static String nombreTienda;
    public static String mensajeTicket;
    

    
    public LoginUI() {   
        Usuario usuario = new Usuario();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono.png")));


        this.crud = new CRUD(conexion);
        initComponents();
        verificarUsuarioAdmin();
        verificarConfiguracion();
        establecerInfor();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btmIniciarSesion = new javax.swing.JButton();
        btmCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesion");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N

        txtContra.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setText("Bienvenido");

        btmIniciarSesion.setBackground(new java.awt.Color(102, 204, 0));
        btmIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btmIniciarSesion.setText("Iniciar sesión");
        btmIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmIniciarSesionActionPerformed(evt);
            }
        });

        btmCerrar.setBackground(new java.awt.Color(255, 0, 51));
        btmCerrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btmCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btmCerrar.setText("Cerrar");
        btmCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCerrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtContra))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel5)))))
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btmCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmIniciarSesion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtContra)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmIniciarSesion)
                    .addComponent(btmCerrar))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 530, 380));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoLogin.jpg"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, 0, 1250, 500));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCerrarActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_btmCerrarActionPerformed

    private void btmIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmIniciarSesionActionPerformed

        if (txtUsuario.getText().equals("")||txtContra.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar los datos");
            txtUsuario.requestFocus();
        }
        else{
            ValidarUsuario();
            System.out.println("nombreUsuario: " + nombreUsuario); // agrega esta línea
            System.out.println("tipoUsuario: " + tipoUsuario); // agrega esta línea

            
        }
        
    }//GEN-LAST:event_btmIniciarSesionActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtContra.requestFocus();
        }

    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btmIniciarSesion.doClick();
        }
        
    }//GEN-LAST:event_txtContraKeyPressed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCerrar;
    private javax.swing.JButton btmIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void ValidarUsuario(){
        Usuario usuario = new Usuario();

        String user = txtUsuario.getText();
        String password = txtContra.getText();
        
        //establecemos el usuario y contraseña
        usuario.setNombreUsuario(user);
        usuario.setContraseña(password);
        
        ResultSet rst = crud.validar(SQL.validarUsuario(usuario));
        
        String use[] = new String[4];
        try {
            while (rst.next()) {
                use[0] = rst.getString(1); //Id Usuario
                use[1] = rst.getString(2); //Nombre usuario
                use[2] = rst.getString(3); //Contraseña
                use[3] = rst.getString(4); //Tipo usuario
            }
            
            if (user.equals(use[1]) && password.equals(use[2])) {
                
                idUser = Integer.parseInt(use[0]);
                nombreUsuario = use[1];
                contrase = use[2];
                tipoUsuario = use[3];
                usuario.setNombreUsuario(nombreUsuario);
                usuario.setTipoUsuario(tipoUsuario);
                sesionIniciada = true;

                MenuUI menuUI = new MenuUI();
//                VentasUI ventasUI = new VentasUI();
                menuUI.setVisible(true);
//                ventasUI.setVisible(true);
//                ventasUI.setLocationRelativeTo(null);
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(rootPane, "Datos incorrectos");
                txtUsuario.requestFocus();
            }
            
        } catch (SQLException e) {
            System.err.println("Error al validar");
        }   
    }

      
    public void verificarUsuarioAdmin() {
        
        ResultSet resul = this.crud.seleccionar(SQL.selectUsuarioAdmin());

        try {
            if (resul.next()) {
                int count = resul.getInt(1);
                
                if (count == 0) {
                    //si no se encontro un administrador, se inserta uno por default
                    this.crud.insertar(SQL.insertAdmin());
                }
            }
        } catch (SQLException e) {
            System.err.println("No se pudo insertar/verificar el administrador" + e.getMessage());
            e.printStackTrace();
        }
    }

        public void verificarConfiguracion() {
        
        ResultSet resul = this.crud.seleccionar(SQL.selectCountConfiguracion());

        try {
            if (resul.next()) {
                int count = resul.getInt(1);
                
                if (count == 0) {
                    //si no se encontro un administrador, se inserta uno por default
                    this.crud.insertar(SQL.insertConfiguracion());
                }
            }
        } catch (SQLException e) {
            System.err.println("No se pudo insertar/verificar la configuracion" + e.getMessage());
            e.printStackTrace();
        }
    }
        
           
    public void establecerInfor() {
        ResultSet resul = this.crud.seleccionar(SQL.selectInforConfiguracion());
        try {
            while (resul.next()) {

                nombreTienda = resul.getString(1);
                mensajeTicket = resul.getString(2);
            }
        } catch (SQLException e) {
            System.err.println("No se pudo establecer la informacion" + e.getMessage());
        }
    }

    

}
