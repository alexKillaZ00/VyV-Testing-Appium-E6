package BaseDeDatos;

import java.util.ArrayList;
import sistemaDNJ.Categoria;
import sistemaDNJ.DetalleVentas;
import sistemaDNJ.Producto;
import sistemaDNJ.Usuario;
import sistemaDNJ.Ventas;


public class SQL {

    public static String selectCountConfiguracion(){
        return "SELECT COUNT(*) FROM configuracion";
    }
     
    public static String selectInforConfiguracion(){
        return "SELECT configuracion.nombreEstablecimiento, configuracion.Mensaje FROM `configuracion` WHERE 1";
    }
        
    public static String insertConfiguracion(){
        return "INSERT INTO `configuracion` (`idConfiguracion`,`nombreEstablecimiento`, `Mensaje`) "
                + "VALUES ('1', 'Nombre establecimiento', 'Gracias por su preferencia!!')";
    }//Cierra insertConfiguracion
    
    public static String actualizarConfiguracion(String nombreEsta, String mensaje){
        return "UPDATE `configuracion` SET `nombreEstablecimiento` = '" + nombreEsta + "', `Mensaje` = '" + mensaje + "' WHERE `configuracion`.`idConfiguracion` = 1";
    }
    
    public static String selectUsuarioAdmin(){
        return "SELECT COUNT(*) FROM usuario WHERE idUsuario = '1' AND tipo = 'administrador'";
    }
    
    public static String insertAdmin(){
        return "INSERT INTO `usuario` (`idUsuario`, `nombreUsuario`, `contraseña`, `tipo`) VALUES ('1', 'admin', '1', 'Administrador')";
    }
    
    public static String insertCategoria(Categoria categoria) {

        return "INSERT INTO categoria VALUES (NULL, '"
                + categoria.getNombre()
                + "'); ";

    }//Cierra llava InsertarDepartamento
        
    public static String selectCategoria(){
        return"SELECT * FROM Categoria;";
    }//Cierra llave Selecionar departamentos
    
    
    public static String actualizarCategoria(Categoria categoria) {
        return "UPDATE `categoria` SET `nombre` = '"
                + categoria.getNombre() + "' WHERE `categoria`.`idCategoria` = "
                + categoria.getIdCategoria();
    }
    
    public static String eliminarCategoria(Categoria categoria){
        return "DELETE FROM `categoria` WHERE `categoria`.`idCategoria` = " + categoria.getIdCategoria();
    }
    
    public static String insertarProducto(Producto producto){
        return "INSERT INTO `producto` VALUES (NULL, "
                + "'"+producto.getCodigoBarra()+"', "
                + "'"+producto.getNombreProducto()+"', "
                + "'"+producto.getDescripcion()+"', "
                + "'"+producto.getCantidadInv()+"', "
                + "'"+producto.getCantidadMin()+"', "
                + "'"+producto.getPrecioCosto()+"', "
                + "'"+producto.getPrecioVenta()+"', "
                + "'"+producto.getIdCategoria()+"')";
    }//Insetar Producto
    
    //Buscar Productos por nombre
    public static String buscarProductosUINombre(String nombre){
        return " SELECT producto.idProducto, producto.codigoBarra, producto.nombreProducto, producto.descripcion, producto.precioCosto, producto.precioVenta, categoria.Nombre, producto.cantidadInv, producto.cantidadMin FROM producto JOIN categoria ON producto.idCategoria = categoria.idCategoria WHERE producto.nombreProducto LIKE '%" + nombre + "%';";
    }
        
    //Buscar productos por codigo
    public static String buscarProductosUICodigo(String codigo){
        return "SELECT producto.idProducto, producto.codigoBarra, producto.nombreProducto, producto.descripcion, producto.precioCosto, producto.precioVenta, categoria.Nombre, producto.cantidadInv, producto.cantidadMin FROM producto JOIN categoria ON producto.idCategoria = categoria.idCategoria WHERE producto.codigoBarra LIKE '%"+codigo+"%';";
    }
   
    public static String validarUsuario(Usuario usuario){
        return "SELECT * FROM usuario WHERE NombreUsuario = '"+usuario.getNombreUsuario()+"' AND Contraseña = '"+usuario.getContraseña()+"';";       
    }//Cierra validar usuario
    
    
    public static String idUsuario(Usuario usuario){
        return "SELECT idUsuario FROM usaurio where ";
    }
    
    public static String buscarIDEliminar(String codigoBuscarEliminar){
        return "SELECT idProducto " 
                + "FROM producto " 
                + "WHERE codigoBarra = '" + codigoBuscarEliminar + "';";
    }
    
    public static String eliminarProducto(String idProd){
        return "DELETE FROM `producto` WHERE `producto`.`idProducto` = '" + idProd + "';";    
    }//Cierra eliminarProdcuto
    
    
    //Actualizar producto
    
    public static String selectIdProdCat(String codigoBuscarActualizar){
        return "SELECT idProducto, idCategoria " 
                + "FROM producto " 
                + "WHERE codigoBarra = '" + codigoBuscarActualizar + "';";
    }
   
    public static String actualizarProducto(Producto prod, int idProduc){
        return "UPDATE `producto` SET "
                + "`codigoBarra` = '"+ prod.getCodigoBarra() +"', "
                + "`nombreProducto` = '"+ prod.getNombreProducto() +"', "
                + "`descripcion` = '"+ prod.getDescripcion() +"', "
                + "`precioCosto` = '"+ prod.getPrecioCosto() +"', "
                + "`precioVenta` = '"+ prod.getPrecioVenta() +"', "
                + "`idCategoria` = '"+ prod.getIdCategoria() +"', "
                + "`cantidadMin` = '"+ prod.getCantidadMin() +"' "
                + "WHERE `producto`.`idProducto` = '"+ idProduc +"';";
    }
    
    //Actualizar Stock
    public static String actualizarStock(Producto prod, int idProduc){
        return "UPDATE `producto` SET "
                + "`cantidadInv` = '"+ prod.getCantidadInv() +"' "
                + "WHERE `producto`.`idProducto` = '"+ idProduc +"';";
    }
    
    

//VENTAS
        public static String buscarProductoVentaUI(String nombre){
        return "SELECT producto.idProducto, producto.codigoBarra, producto.nombreProducto, producto.descripcion, producto.precioVenta, producto.cantidadInv FROM producto WHERE producto.nombreProducto LIKE '%"+nombre+"%' AND producto.cantidadInv > 0;";
    }
    
    public static String buscarProductosCodigoVentasUI(String codigoBarra){
        return "SELECT producto.idProducto, producto.codigoBarra, producto.nombreProducto, producto.descripcion, producto.precioVenta, producto.cantidadInv FROM producto WHERE producto.codigoBarra LIKE '%" + codigoBarra + "%' AND producto.cantidadInv > 0;";    
    }
    
    public static String buscarProductoCodigoVentasUIDos(String codigoBarra){
        return "SELECT producto.idProducto, producto.codigoBarra, producto.nombreProducto, producto.descripcion, producto.precioVenta, producto.cantidadInv FROM producto WHERE producto.codigoBarra LIKE '%" + codigoBarra + "%' AND producto.cantidadInv > 0;";
    }
              
    public static String maxIdVentasPadre(){
        return "SELECT MAX(idVentas) FROM ventas";
    }
    
    public static String maxIdVentas(){
        return "SELECT MAX(numeroVenta) FROM ventas";
    }// 
    
    public static String insetarVenta(Ventas padre){
        return "INSERT INTO `ventas` (`idVentas`, `numeroVenta`, `fechaVenta`,`horaVenta`, `pagoVenta`, `montoVenta`, `idUsuario`) "
                + "VALUES (NULL, "
                + "'"+padre.getNumeroVenta()+"', "
                + "'"+padre.getFechaVenta()+"', "
                + " NOW(), "                
                + "'"+padre.getPagoVenta()+"', "
                + "'"+padre.getMontoVenta()+"', "
                + "'"+padre.getIdUsuario()+"')";
    }//Cierra insertar venta

        public static String insertarVentaHijo(ArrayList<DetalleVentas> hijo){

        String sentencia ="INSERT INTO `detalleventasaux` VALUES ";
        
        for (int i = 0; i < hijo.size(); i++) {
         
            sentencia += "(NULL,";
            sentencia += "'"+ hijo.get(i).getCodigBarra()+ "', ";
            sentencia += "'"+ hijo.get(i).getNombreProducto() +"',";            
            sentencia += hijo.get(i).getCantidadProducto()+ ", ";
            sentencia += hijo.get(i).getPrecioCosto()+", ";
            sentencia += hijo.get(i).getPrecioVenta() +", ";
            sentencia += hijo.get(i).getIdVenta()+ ", ";            
            sentencia += hijo.get(i).getIdProducto()+ " ";

            sentencia += ")";
            
            sentencia += (i+1<hijo.size() ? "," : ";");
        }
        
        return sentencia;
    }
        
    public static String SelectPrecioCosto(int idProd){
        return "SELECT producto.precioCosto " +
               "FROM producto " +
               "WHERE producto.idProducto = "+idProd+";";
    }
    
    
    public static String seleccionarInventarioCantidad(Producto prod){
                return "SELECT cantidadInv "
                        + "FROM producto "
                        + "WHERE codigoBarra = '" + prod.getCodigoBarra()+ "';";
    }//Cierra Seleccionar Inventario Cantidad
    
    
    public static String actualizarStock(Producto prod) {
       
        return "UPDATE `producto` "
                + "SET `cantidadInv` = '"+prod.getCantidadInv()+"'"
                + "WHERE codigoBarra = '"+prod.getCodigoBarra()+"';";
        
    }//Cierra actualizarStock
    
    
    
    public static String selectIdCoBNomPre(Producto prod){
         return " SELECT idProducto, codigoBarra, nombreProducto, precioVenta,  cantidadInv FROM producto WHERE codigoBarra = '" + prod.getCodigoBarra()+ "';";
    }
    
    
    public static String insertarUsuario(Usuario user){
    
        return "INSERT INTO `usuario` (`idUsuario`, `NombreUsuario`, `Contraseña`, `Tipo`) "
                + "VALUES (NULL, '"+user.getNombreUsuario()+"', "
                + "'"+user.getContraseña()+"', "
                + "'"+user.getTipoUsuario()+"')";
    }
    
    
    //Visualizacion
    
    
    //Metodo par buscar productos por las categorias
    public static String selectBuscarProdCat(String nombreCategoria){      
        return "SELECT producto.idProducto, producto.codigoBarra, producto.nombreProducto, producto.descripcion, producto.precioCosto, producto.precioVenta, categoria.Nombre, producto.cantidadInv, producto.cantidadMin FROM producto JOIN categoria ON producto.idCategoria = categoria.idCategoria WHERE categoria.Nombre LIKE '% " + nombreCategoria + "%'";
    }
    
    
    //Metodo para visualizar las ventas
    public static String selectTodasVentasUser(boolean fechasSeleccionadas, String fechaInicio, String fechaFin){
        return "SELECT ventas.numeroVenta, ventas.fechaVenta, ventas.horaVenta, ventas.montoVenta, ventas.pagoVenta, usuario.nombreUsuario "
                + "FROM ventas JOIN usuario "
                + "ON ventas.idUsuario = usuario.idUsuario "
                + (fechasSeleccionadas ? "WHERE ventas.fechaVenta >= '" + fechaInicio + "' AND ventas.fechaVenta <= '" + fechaFin + "' " : "")
                + ";";
    }//Cierra selectTodasVentasUser
    
    public static String selectVentasProdFecha(boolean fechasSeleccionadas, String fechaInicio, String fechaFin){
     return "SELECT detalleventasaux.nombreProducto, SUM(detalleventasaux.cantidadProducto) AS TotalVendido " +
             "FROM detalleventasaux " +
             "JOIN ventas ON ventas.idVentas = detalleventasaux.idVenta " +
             (fechasSeleccionadas ? "WHERE ventas.fechaVenta >= '" + fechaInicio + "' AND ventas.fechaVenta <= '" + fechaFin + "' " : "") +
             "GROUP BY detalleventasaux.nombreProducto " +
             "ORDER BY TotalVendido DESC " +
             "LIMIT 10;";   
    }//Cierra selectVentasProdFecha
    
    public static String selectVentasUsuarios(boolean fechasSeleccionadas, String fechaInicio, String fechaFin){
    
        return "SELECT usuario.nombreUsuario, COUNT(ventas.idUsuario) AS totalVentas " +
                "FROM usuario JOIN ventas " +
                "ON usuario.idUsuario = ventas.idUsuario " +
                (fechasSeleccionadas ? "WHERE ventas.fechaVenta >= '" + fechaInicio + "' AND ventas.fechaVenta <= '" + fechaFin + "' " : "") +
                "GROUP BY usuario.nombreUsuario;";
        
    }
    
    
    //Usuarios
    
    public static String actualizarNombreUsuario(Usuario user){
        return "UPDATE `usuario` "
                + "SET `NombreUsuario` = '"+user.getNombreUsuario()+"' "
                + "WHERE `usuario`.`idUsuario` = '"+user.getIdUsuario()+"';";
    }//Cierra actualizarNombreUsuerio
    
    public static String actualizarContraseña(Usuario user){
        return "UPDATE `usuario` "
                + "SET "
                + "`Contraseña` = '"+user.getContraseña()+"' "
                + "WHERE `usuario`.`idUsuario` = '"+user.getIdUsuario()+"';";
    }//Cierra actualizarContraseña
    
    public static String selectUsuario(Usuario user){
        return "SELECT * FROM usuario WHERE NombreUsuario = '"+user.getNombreUsuario()+"';";
    }//Cierra selectUsuario
    
    public static String actualizarTipoUsuario(Usuario user){
        return "UPDATE `usuario` SET `tipo` = '"+user.getTipoUsuario()+"' WHERE `usuario`.`idUsuario` = '"+user.getIdUsuario()+"'";
    }//Cierra actualizarTipoUsurario

    public static String eliminarUsuario(Usuario user) {
        
        return "DELETE FROM `usuario` WHERE `usuario`.`idUsuario` = "+user.getIdUsuario()+";";
        
    }
    
    
    //Mostrar venta
    public static String selectVenta(int numVenta) {
        return "SELECT detalleventasaux.codigoBarra, detalleventasaux.nombreProducto, "
                + "detalleventasaux.cantidadProducto AS Vendido, detalleventasaux.precioCosto, "
                + "detalleventasaux.precioVenta,  (detalleventasaux.cantidadProducto)*detalleventasaux.precioVenta AS Total, "
                + "(detalleventasaux.precioVenta * detalleventasaux.cantidadProducto) - (detalleventasaux.precioCosto * detalleventasaux.cantidadProducto) AS Ganancia \n"
                + "FROM detalleventasaux JOIN ventas \n"
                + "ON detalleventasaux.idVenta = ventas.idVentas "
                + "WHERE ventas.numeroVenta = '" + numVenta + "';";
    }//Cierra mostrar Venta
    

}
