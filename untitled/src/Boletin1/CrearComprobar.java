package Boletin1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CrearComprobar {
    public static void main(String[] args) {
        File directorio = new File("C:/Users/Usuario1/Desktop/Tester");

        if (directorio.mkdirs()) {
            System.out.println("Directorio creado correctamente");
        }else  {
            System.out.println("Directorio ya existente o no se ha podido crear");
        }
    }
}
