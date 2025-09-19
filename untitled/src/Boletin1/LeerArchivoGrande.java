package Boletin1;

import java.io.*;

public class LeerArchivoGrande {
    public static void main(String[] args) {
        FileInputStream fis =null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try{

            //Se abre la lectura
            fis = new FileInputStream("C:/Test1/Escribir.txt");
            bis = new BufferedInputStream(fis);
            fos =  new FileOutputStream("C:/Test1/Escribir2.txt");
            bos = new  BufferedOutputStream(fos);

            //Se crea un array de bytes de tamaño 8192, es el tamaño que lee en cada interacción
            byte[] buffer = new byte[8192];
            int bytesLeidos;

            //Lee el número de bytes y los guarda, posteriormente, Devuelve el número de bytesLeidos,
            while((bytesLeidos = bis.read(buffer)) != -1){
                bos.write(buffer,0,bytesLeidos); //Con .write se escribe en el archivo de destino
                //unicamente la cantidad de bytes leídos aunque sea menor del número de bits asignados
            }

            bos.flush(); //Vacía el buffer de salida para que todo se escriba bien en el archivo

        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try{
                bos.close();
                fos.close();
                bis.close();
                fis.close();
            }catch(Exception e2){
                System.out.println(e2.getMessage());
            }
        }
    }
}
