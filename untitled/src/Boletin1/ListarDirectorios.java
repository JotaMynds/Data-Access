package Boletin1;

import java.io.*;
import java.util.Arrays;

public class ListarDirectorios {
    public static void main(String[] args) {

        //Se crea el directorio
        File directorio = new File("C:/Users/Usuario1/Desktop/Testers");
        File [] Arr = directorio.listFiles();
        int NumD = 0;
        int NumF = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].isDirectory()) {
                System.out.println(Arr[i].getName());
                NumD++;
            }else if(Arr[i].isFile()) {
                System.out.println(Arr[i].getName());
                NumF++;
            }
        }
        System.out.println("Numero de Directorios: " + NumD);
        System.out.println("Numero de Archivos: " + NumF);
    }
}
