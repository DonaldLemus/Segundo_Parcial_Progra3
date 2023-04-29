public class Nodo {
    public String nombreArchivo;
    public Nodo siguiente;
    public Nodo(String nombreArchivo, Nodo siguiente){
        this.nombreArchivo = nombreArchivo;
        this.siguiente = siguiente;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
