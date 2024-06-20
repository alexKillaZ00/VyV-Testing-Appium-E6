package sistemaDNJ;

public class Categoria {
    int idCategoria;
    String Nombre;

    public Categoria() {
    }

    public Categoria(int idCategoria, String Nombre) {
        this.idCategoria = idCategoria;
        this.Nombre = Nombre;
    }

    //Categoria
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    //Nombre
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   
    
    
}
