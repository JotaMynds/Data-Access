package Repaso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public static void main(String[] args) {
        //Declarar el directorio, el fr, el br y la linea para guardar lo extraido del documento
        File directorio = new File("C:/Users/Usuario1/Desktop/Testers");
        FileReader fr = null;
        BufferedReader br = null;
        String linea;

        //Comprobar si existe el directorio
        if (directorio.exists()) {
            System.out.println("Se ha encontrado el directorio");
        } else {
            System.out.println("El directorio no existe");
        }

        //Estructura try-catch-finally(try-catch)
        try {
            //Se crea el leedor de archivos que lee archivos para leer el archivo
            fr = new FileReader(directorio);
            br = new BufferedReader(fr);

            //Bucle que lee las lineas del documento y las escribe por consola
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            //Se declaran las excepciones
        } catch (IOException e) {

            System.err.println("Error al leer el directorio" + e.toString());
        } finally {
            try {
                //Se cierran el br y el fe
                br.close();
                fr.close();

            //Se declaran las excepciones
            } catch (IOException e2) {
                System.err.println("Error al cerrar el directorio" + e2.toString());

            }
        }

    }
}
