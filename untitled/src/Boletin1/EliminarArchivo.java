package Boletin1;

import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {
        File archivo = new File("C:/Test1/Escribir - copia.txt");

        if(archivo.exists()){
            archivo.delete();
            System.out.println("Archivo Eliminado");
        }else {
            System.out.println("No existe el archivo");
        }

    }
}
