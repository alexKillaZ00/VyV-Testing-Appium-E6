package sistemaDNJ;

public class DetalleVentas {

    int idDetalleVenta;
    String codigBarra;
    int cantidadProducto;
    float precioCosto;
    float precioVenta;
    int idVenta;
    int idProducto;
    String nombreProducto;

    public DetalleVentas() {
    }

    public DetalleVentas(int idDetalleVenta, String codigBarra, int cantidadProducto, float precioCosto, float precioVenta, int idVenta, int idProducto, String nombreProducto) {
        this.idDetalleVenta = idDetalleVenta;
        this.codigBarra = codigBarra;
        this.cantidadProducto = cantidadProducto;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }


    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public String getCodigBarra() {
        return codigBarra;
    }

    public void setCodigBarra(String codigBarra) {
        this.codigBarra = codigBarra;
    }
    
    

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
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
    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    
    
    
    
    
    
    

    
}
