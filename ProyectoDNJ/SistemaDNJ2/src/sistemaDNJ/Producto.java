package sistemaDNJ;

public class Producto {
    
    int idProducto;
    String codigoBarra;
    String nombreProducto;
    String descripcion;
    int cantidadInv;
    int cantidadMin;
    float precioCosto;
    float precioVenta;
    int idCategoria;

    public Producto() {
    }

    public Producto(int idProducto, String codigoBarra, String nombreProducto, String descripcion, int cantidadInv, int cantidadMin, float precioCosto, float precioVenta, int idCategoria) {
        this.idProducto = idProducto;
        this.codigoBarra = codigoBarra;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.cantidadInv = cantidadInv;
        this.cantidadMin = cantidadMin;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.idCategoria = idCategoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadInv() {
        return cantidadInv;
    }

    public void setCantidadInv(int cantidadInv) {
        this.cantidadInv = cantidadInv;
    }

    public int getCantidadMin() {
        return cantidadMin;
    }

    public void setCantidadMin(int cantidadMin) {
        this.cantidadMin = cantidadMin;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    
    
}
