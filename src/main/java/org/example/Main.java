package org.example;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        int contador=0;
        int totalPrimos=0;
        int numInicial=0;
        int numFinal =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("BUSCADOR DE PRIMOS");
        System.out.println("==================");
        System.out.println("Escriba el n\u00FAmero inicial (0 para salir) :");


        numInicial = sc.nextInt();

        if (numInicial == 0) {
            exit(0);
        }

        System.out.println("Escriba el n\u00FAmero final :");
        numFinal = sc.nextInt();

        System.out.println("Buscando primos... :");

        for (int i = numInicial; i <= numFinal; i++) {
            if (esPrimo(i)) {
                contador++;
                System.out.print(String.valueOf(i) + "\n");
            }
        }
        System.out.printf("Se han encontrado " + contador +" numeros primos en el intervalo");
        sc.close();

    }
    public static boolean esPrimo(int numero) {

        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int j = 2; j < numero / 2; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}

