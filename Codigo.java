package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
  try {
            // Lectura del archivo de texto original
            FileReader fileReader = new FileReader("original.txt");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String linea = bufferReader.readLine();
            String texto = "";
            while (linea != null) {
                texto += linea;
                linea = bufferReader.readLine();
            }
            bufferReader.close();
            fileReader.close();

            // Separación de la cadena de texto letra por letra
            String[] letras = texto.split("");
            // Escritura del resultado en otro archivo de texto
            FileWriter fileWriter = new FileWriter("resultado.txt");
            for (String letra : letras) {
                fileWriter.write(letra + " \n"); //AQUI ESTA EL DATO, SI ESTA COMO "\n" TE LO INTERPRETA COMO CARACTERES RAROS
            }
            fileWriter.close();
            System.out.println("Proceso finalizado con éxito! :)");
        } catch (IOException e) {
            e.printStackTrace();
        }
           }
}
