package sistemaDNJ;

public class Ventas {
    
    int idVentas;
    int numeroVenta;
    String fechaVenta;
    float pagoVenta;
    float montoVenta;
    int idUsuario;

    public Ventas() {
    }

    public Ventas(int idVentas, int numeroVenta, String fechaVenta, float pagoVenta, float montoVenta, int idUsuario) {
        this.idVentas = idVentas;
        this.numeroVenta = numeroVenta;
        this.fechaVenta = fechaVenta;
        this.pagoVenta = pagoVenta;
        this.montoVenta = montoVenta;
        this.idUsuario = idUsuario;
    }

    public int getIdVentas() {
        return idVentas; 
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getPagoVenta() {
        return pagoVenta;
    }

    public void setPagoVenta(float pagoVenta) {
        this.pagoVenta = pagoVenta;
    }

    public float getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(float montoVenta) {
        this.montoVenta = montoVenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    
}
