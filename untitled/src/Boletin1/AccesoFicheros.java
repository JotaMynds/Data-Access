package Boletin1;

import java.io.*;

public class AccesoFicheros {
    public static void main(String[] args) {
        RandomAccessFile archivo = null;
        try {

            archivo = new RandomAccessFile("C:/Test1/Escribir.txt", "rw");
            archivo.seek(20);
            archivo.writeUTF("B");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                archivo.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
