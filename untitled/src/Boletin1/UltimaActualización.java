package Boletin1;

import java.io.File;
import java.text.SimpleDateFormat;

public class UltimaActualización {
    public static void main(String[] args) {

        File archivo = new File("C:/Test1/Escribir.txt");

        if(archivo.exists()){
           //Obtener ultima modificación
           long UltimaModificación = archivo.lastModified();

           //Cambiamos el formato a fecha y hora
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Para cambiar el
            // formato y transformarlo en una fecha

            String fecha = formatoFecha.format(UltimaModificación);

            System.out.println("La ultima modificación del archivo con ruta: '" + archivo.getAbsolutePath()
                    + "' fue el: " + fecha);
        }else {
            System.out.println("No existe el archivo");
        }
    }
}
