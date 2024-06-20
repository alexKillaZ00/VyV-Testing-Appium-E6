
package Interfaces;

import BaseDeDatos.CRUD;
import BaseDeDatos.Conexion;
import static BaseDeDatos.Conexion.conexion;
import BaseDeDatos.SQL;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import sistemaDNJ.Categoria;

public class PanelCategoriaUI extends javax.swing.JPanel {

    //Variables
    Connection con;
    CRUD crud;
    Categoria categoria;
    List<Categoria> categoriasLista; //Esta lista contendra todos los departamentos de la base de datos

    

    public PanelCategoriaUI() {
        initComponents();
        this.crud = new CRUD(conexion);
        cargarCategoria(cmbEliminarCategoria);
        cargarCategoria(cmbActualizarCategoria);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombreCat = new javax.swing.JTextField();
        btmAgregarDep = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbActualizarCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNuevoNombre = new javax.swing.JTextField();
        btmActualizarCategoria = new javax.swing.JButton();
        lblNombre3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbEliminarCategoria = new javax.swing.JComboBox<>();
        btmEliminarCategoria = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombre.setText("Nombre:");

        txtNombreCat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCatActionPerformed(evt);
            }
        });

        btmAgregarDep.setBackground(new java.awt.Color(0, 204, 0));
        btmAgregarDep.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmAgregarDep.setText("Agregar");
        btmAgregarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAgregarDepActionPerformed(evt);
            }
        });

        lblNombre1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre1.setText("Insertar categoria");

        lblNombre2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre2.setText("Eliminar categoria");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        cmbActualizarCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbActualizarCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nuevo nombre:");

        txtNuevoNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btmActualizarCategoria.setBackground(new java.awt.Color(0, 204, 51));
        btmActualizarCategoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmActualizarCategoria.setText("Actualizar");
        btmActualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmActualizarCategoriaActionPerformed(evt);
            }
        });

        lblNombre3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre3.setText("Actualizar categoria");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nombre:");

        cmbEliminarCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbEliminarCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btmEliminarCategoria.setBackground(new java.awt.Color(255, 0, 0));
        btmEliminarCategoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btmEliminarCategoria.setText("Eliminar");
        btmEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEliminarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmbActualizarCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtNuevoNombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(txtNombreCat, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)
                                .addComponent(cmbEliminarCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btmActualizarCategoria, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btmAgregarDep, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btmEliminarCategoria, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(346, 346, 346))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombre1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addComponent(btmAgregarDep)
                .addGap(51, 51, 51)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbActualizarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btmActualizarCategoria)
                .addGap(54, 54, 54)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbEliminarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btmEliminarCategoria)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Categoria", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCatActionPerformed

    private void btmAgregarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAgregarDepActionPerformed

        if (txtNombreCat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
            return;
        }

        this.categoria = new Categoria();

        String nombreDepar = txtNombreCat.getText();

        this.categoria.setNombre(nombreDepar);

        //        con = Conexion.iniciar();

        //Guardar en la base de datos
        if(Conexion.iniciar() != null){

            CRUD crud = new CRUD(Conexion.iniciar());

            boolean esInsertado = crud.insertar(SQL.insertCategoria(this.categoria));

            if(esInsertado){

                JOptionPane.showMessageDialog(null, "Insertado correctamente.");
                cargarCategoria(cmbEliminarCategoria);
                cargarCategoria(cmbActualizarCategoria);
            }else {
                JOptionPane.showMessageDialog(null, "No insertado.");
            }
        }
    }//GEN-LAST:event_btmAgregarDepActionPerformed

    private void btmActualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmActualizarCategoriaActionPerformed

        if (txtNuevoNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
            return;
        }

        String nuNombre = txtNuevoNombre.getText();

        int indice = cmbActualizarCategoria.getSelectedIndex();
        int idCat = categoriasLista.get(indice).getIdCategoria();

        if (!"".equals(nuNombre)) {

            this.categoria = new Categoria();

            this.categoria.setNombre(nuNombre);
            this.categoria.setIdCategoria(idCat);

            //Guardar en la base de datos

            boolean esActualizado = crud.actualizar(SQL.actualizarCategoria(this.categoria));

            if(esActualizado){

                JOptionPane.showMessageDialog(null, "Actualizado correctamente");

            }else {
                JOptionPane.showMessageDialog(null, "No actualizado.");
            }

            //Carga nuevamente los cambios que se hicieron en los departamentos
            txtNuevoNombre.setText("");
            cargarCategoria(cmbEliminarCategoria);
            cargarCategoria(cmbActualizarCategoria);

        }

        else {
            JOptionPane.showMessageDialog(null, "El campo debe contener texto");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btmActualizarCategoriaActionPerformed

    private void btmEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEliminarCategoriaActionPerformed

        int indice = cmbEliminarCategoria.getSelectedIndex();
        int idCat = categoriasLista.get(indice).getIdCategoria();

        this.categoria = new Categoria();

        this.categoria.setIdCategoria(idCat);

        boolean esEliminado = crud.eliminar(SQL.eliminarCategoria(this.categoria));

        if (esEliminado) {

            JOptionPane.showMessageDialog(null, "Eliminado Correctamente.");

        } else {
            JOptionPane.showMessageDialog(null, "No eliminado, no debe tener productos asignados a esta categoria.");
        }

        //Carga nuevamente los cambios que se hicieron en los departamentos
        cargarCategoria(cmbEliminarCategoria);
        cargarCategoria(cmbActualizarCategoria);
        
        
    }//GEN-LAST:event_btmEliminarCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmActualizarCategoria;
    private javax.swing.JButton btmAgregarDep;
    private javax.swing.JButton btmEliminarCategoria;
    private javax.swing.JComboBox<String> cmbActualizarCategoria;
    private javax.swing.JComboBox<String> cmbEliminarCategoria;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JTextField txtNombreCat;
    private javax.swing.JTextField txtNuevoNombre;
    // End of variables declaration//GEN-END:variables

    
    //METODOS
    public void cargarCategoria(JComboBox cmbDep){
        
        cmbDep.removeAllItems();

        try {
            
            //obtenemos los resultados
            ResultSet rst = this.crud.seleccionar(SQL.selectCategoria());

            //objeto clase Departamento
            Categoria Cat;
            
            //Instancia de la lista
            this.categoriasLista = new ArrayList();
                while (rst.next()) {
                    
                    cmbDep.addItem(rst.getString(2));
                
                    Cat = new Categoria();
                    Cat.setIdCategoria(rst.getInt(1));
                    Cat.setNombre(rst.getString(2));
                    
                    categoriasLista.add(Cat);
                }
            
        } catch (SQLException e) {
            System.err.println("Error al cargar:"+ e.getMessage());
        }
        
        
    }//cargarDepartamentos

    

    
}
