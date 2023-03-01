package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner archivo;
    try {
      archivo = new Scanner(new File("tabla.txt"));
      String currentLine;
      String[] partes;
      String matriz[][] = new String[97][47];
      int fila = 0;

      while (archivo.hasNextLine()) {

        currentLine = archivo.nextLine();

        partes = currentLine.split("\\s");

        for (int i = 0; i < partes.length; i++) {
          matriz[fila][i] = partes[i];
        }
        fila++;
      }

      // for (int i = 0; i < matriz.length; i++) {
      // for (int j = 0; j < matriz[i].length; j++) {
      // System.out.print(matriz[i][j] + " ");
      // }
      // System.out.println();
      // }

      String valor;
      valor = cellValue("14", "8", matriz);

      System.out.println(valor);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }

  static String cellValue(String tokenType, String row, String matriz[][]) {
    final int COLUMNAS_MATRIZ = 47;
    final int FILAS_MATRIZ = 97;
    int columnIndex = 0;
    int rowIndex = 0;

    for (int i = 0; i < COLUMNAS_MATRIZ; i++) {
      if (matriz[0][i].equals(tokenType)) {
        columnIndex = i;
      }

      for (int j = 0; j < FILAS_MATRIZ; j++) {
        if (matriz[j][columnIndex].equals(row)) {
          rowIndex = j;
        }
      }
    }

    return matriz[rowIndex][columnIndex];

  }
}
