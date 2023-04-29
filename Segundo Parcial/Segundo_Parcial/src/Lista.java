import java.io.File;
import java.io.FilenameFilter;

public class Lista {
    protected Nodo inicio;
    protected Nodo fin;
    protected int tamaño;

    public Lista(){
       inicio = null;
       tamaño = 0;
    }
    public void agregar(String rutaCarpeta){
        File carpeta = new File(rutaCarpeta);
        if(carpeta.isDirectory()){
            File[] archivos = carpeta.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String nombreArchivo) {
                    return nombreArchivo.toLowerCase().endsWith(".mp3");
                }
            });
            for(File archivo : archivos){
                agregar(archivo.getAbsolutePath());
            }
        }else if(carpeta.isFile() && carpeta.getName().toLowerCase().endsWith(".mp3")){
            Nodo nuevoNodo = new Nodo(carpeta.getName(), null);
            if(inicio == null){
                inicio = nuevoNodo;
                fin = nuevoNodo;
            }else{
                fin.siguiente = nuevoNodo;
                fin = nuevoNodo;
            }
            tamaño++;
        }
    }
    public int getTamaño(){
        return tamaño;
    }
    public String get(int indice){
        if(indice >= 0 && indice < tamaño){
            Nodo actual = inicio;
            for(int i = 0; i < indice; i++){
                actual = actual.siguiente;
            }
            return actual.nombreArchivo;
        }
        return null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void eliminar(int indice){
        if(indice >= 0 && indice < tamaño){
            if(indice == 0){
                inicio = inicio.siguiente;
            }else{
                Nodo actual = inicio;
                for(int i = 0; i < indice - 1; i++){
                    actual = actual.siguiente;
                }
                actual.siguiente = actual.siguiente.siguiente;
            }
            tamaño--;
        }
    }
}
