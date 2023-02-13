package test;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class App {
  public static void main(String[] args) {

    String cadena = "cadena de test,1 vamos a ver si el test funciona, test 111";
    String actualToken = "";
    String typeOfToken;

    Dictionary dictionary = new Dictionary();
    dictionary.createDictionary();

    StringTokenizer tokenizer = new StringTokenizer(cadena, "\s,", true);

    try {
      FileWriter fileWriter = new FileWriter("output.txt");

      while (tokenizer.hasMoreTokens()) {
        actualToken = tokenizer.nextToken();
        typeOfToken = dictionary.tableOfSymbols.get(actualToken);

        if (typeOfToken == null) {
          typeOfToken = "";
        }

        if (!actualToken.equals(" ")) {

          fileWriter.write(actualToken + " --> " + typeOfToken + "\n");
        }

      }
      fileWriter.close();
      System.out.println("todo gud");

    } catch (

    Exception e) {
      System.out.println(e);
    }

  }
}

/**
 * test
 */
class Dictionary {
  Map<String, String> tableOfSymbols = new HashMap<>();

  void createDictionary() {

    tableOfSymbols.put("1", "numero");
    tableOfSymbols.put("test", "token test");
  }
}
