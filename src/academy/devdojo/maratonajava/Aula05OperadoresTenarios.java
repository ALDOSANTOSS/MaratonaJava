package academy.devdojo.maratonajava;

import java.util.Scanner;

public class Aula05OperadoresTenarios {

    // O operador ternário é um recurso para tomada de decisões com objetivo similar
    // ao do if/else, mas que é codificado em apenas uma linha.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroDias = scanner.nextInt();

                System.out.println((numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");

        double salario = scanner.nextInt();
        String mensagemDoar = "Eu vou doar 500 pra Aldo";
        String mensagemNaoDoar = "Ainda nao tenho condiçao, mais vou ter!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }



}



