package unicauca.edu.co.dulcespopayan;

public class listDulces {

    private String titulo;
    private String descripcion;
    private int imagenDulce;

    public listDulces(String titulo, String descripcion, int imagenDulce) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagenDulce = imagenDulce;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagenDulce() {
        return imagenDulce;
    }

    public void setImagenDulce(int imagenDulce) {
        this.imagenDulce = imagenDulce;
    }
}