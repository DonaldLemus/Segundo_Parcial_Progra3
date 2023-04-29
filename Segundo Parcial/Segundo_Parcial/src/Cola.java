public class Cola {
    protected Nodo cabeza;
    protected Nodo cola;
    protected int tamaño;

    public Cola(){
        cabeza = null;
        cola = null;
        tamaño = 0;
    }
    public void encolar(String nombreArchivo){
        Nodo nuevo = new Nodo(nombreArchivo, null);

        if(cola == null){
            cabeza = nuevo;
        }else{
            cola.siguiente = nuevo;
        }
        cola = nuevo;
        tamaño++;
    }
    public int getTamaño(){
        return tamaño;
    }
    public String desencolar(){
        if(cabeza == null){
            return null;
        }
        String nombreArchivo = cabeza.nombreArchivo;
        cabeza = cabeza.siguiente;
        if(cabeza == null){
            cabeza = null;
        }
        tamaño--;
        return nombreArchivo;
    }
    public void llenar(Lista lista){
        for(int i = 0; i < lista.getTamaño(); i++){
            encolar(lista.get(i));
        }
    }

}
