package Boletin1;

import java.io.*;
import java.util.Arrays;

public class MoverArchivos {
    public static void main(String[] args) {

        //Se crea el directorio
        File directorio = new File("C:/Test");
        File [] Arr = directorio.listFiles();

        for (int i = 1; i < Arr.length; i++){
            File directorio2 = new File("C:/Test1/" + Arr[i].getName());
            Arr[i].renameTo(directorio2);
        }
    }
}