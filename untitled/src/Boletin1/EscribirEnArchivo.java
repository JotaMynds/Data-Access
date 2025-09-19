package Boletin1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirEnArchivo {
    public static void main(String[] args) {
        File archivo = new File("C:/Test1/Escribir.txt");
        FileWriter fw = null;
        PrintWriter pw = null;

        try{
            fw = new FileWriter(archivo);
            pw = new PrintWriter(fw);
            pw.println("Linea 1");
            pw.println("Linea 2");
            pw.println("Linea 3");
            pw.println("Linea 4");
            pw.println("Linea 5");

        }catch(IOException e){
            System.out.println("Error al abrir el archivo" + e.getMessage());
        }finally{
            try{
                fw.close();
            }catch(IOException e2){
                System.out.println("Error al cerrar el fichero" + e2.getMessage());
            }
        }
    }
}
