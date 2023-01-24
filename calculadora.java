package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int primerNumero;
        int segundoNumero;
        int resultado;

        // Se le pide al usuario el primer numero
        System.out.println("Bienvenido a una calculador de 2 numeros!" + "\n");
        System.out.println("Ingresa el primer numero: ");
        primerNumero = scanner.nextInt();

        // Se le pide al usuario el segundo numero
        System.out.println("Ingresa el segundo numero: ");
        segundoNumero = scanner.nextInt();

        scanner.close(); // se cierra el scanner para evitar leaks

        resultado = suma(primerNumero, segundoNumero);

        System.out.println("El resultado de la suma seria: " + resultado);
    }

    /**
     * Funcion para la suma de 2 numeros
     * 
     * @param PrimerNumero  primer numero a sumar
     * @param segundoNumero segundo numero a sumar
     * @return resultado
     */
    private static int suma(int PrimerNumero, int segundoNumero) {
        return PrimerNumero + segundoNumero;
    }
}
