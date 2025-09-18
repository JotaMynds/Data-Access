package Boletin1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerPorLinea {
    public static void main(String[] args) {
        File archivo = new File("C:/Test1/Escribir.txt");
        FileReader fr = null;
        BufferedReader br = null;

        try{
            //Función principal
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            //Declaramos linea para asignar las lineas del documento
            String linea;

            //While para recorrer el documento, asigna las lineas a la variable linea y si no hubiera linea se pararía
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }

        }catch(IOException e){
            System.out.println("Error al leer el archivo: " + e.toString());
        }finally{
            try{
                br.close();
                fr.close();
            }catch(IOException e2){
                System.out.println("Error al cerrar el archivo: " + e2.toString());
            }
        }
    }
}
