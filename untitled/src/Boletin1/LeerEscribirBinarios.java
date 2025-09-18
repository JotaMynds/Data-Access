package Boletin1;

import java.io.*;

public class LeerEscribirBinarios {
    public static void main(String[] args) {
        File archivo = new File("C:/Test1/EscribirBinarios.bin");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(archivo);
            fos = new FileOutputStream("C:/Test1/EscribirBinarios - copia.bin");
            int i;

            //Leer los bytes y transformarlos
            while ((i = fis.read()) != -1) {

                //convertir los bits en letras
                fos.write((char)i);
            }

        }catch(IOException e){
            //Si pasa algun error nos lo dirá
            System.out.println("Error al abrir el archivo" + e.toString());
        }
    }
}
