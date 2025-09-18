package Repaso;

import java.io.*;

public class Escribir {
    public static void main(String[] args) {

        //Declaración de directorio para acceder y trabajar en él
        File directorio = new File("C:/Users/Usuario1/Desktop/Testers");
        FileWriter fw = null;
        PrintWriter pw = null;

        //Comprobación de existencia
        if(directorio.mkdirs()){
            System.out.println("Directorio creado correctamente");
        } else {
            System.out.println("El directorio ya existe o no se ha podido crear");
        }

        //Estructura try-catch-finally(try-catch)
        // para realizar correctamente la interacción de los archivos teniendo en cuenta sus excepciones
        try{

            //Se declaran los fw y pw con sus respectivas rutas para escribir en el archivo
            fw = new FileWriter("C:/Users/Usuario1/Desktop/Testers/Escribir.txt");
            pw = new PrintWriter(fw);

            //Bucle para testear el escribir en el archivo
            for(int i = 1; i <= 50; i++){
                pw.println("Línea número: " + i);
            }

        }catch (IOException e){

            //Se manda el mensaje de error
            System.err.println("Error al crear el archivo" + e.toString());

        }finally {
            try{
                //Se cierran los pw y fw para asegurar una salida del archivo limpio
                pw.close();
                fw.close();

            }catch (IOException e2){
                System.err.println("Error al cerrar el fichero: " + e2.toString());
            }
        }
    }
}
