package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05OperadoresTenarios {

    // O operador ternário é um recurso para tomada de decisões com objetivo similar
    // ao do if/else, mas que é codificado em apenas uma linha.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroDias = scanner.nextInt();

                System.out.println((numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");

    }



}



