import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Lista lista = new Lista();
        lista.agregar("C:\\Users\\ASUS\\Downloads\\Descarga Musica");

        Cola cola = new Cola();
        cola.llenar(lista);

        Scanner scanner = new Scanner(System.in);



        while(cola.getTamaño() > 0){
            String nombreArchivo = cola.desencolar();
            System.out.println("Desapilando cancion: "+nombreArchivo);

            System.out.print("Para pasar a la siguiente canción presione 1: ");
            int respuesta = scanner.nextInt();

            while (respuesta != 1){
                System.out.print("Por favor, si desea cambiar presione 1: ");
                respuesta = scanner.nextInt();
            }
        }
        System.out.println("Fin");
    }
}