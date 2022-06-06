package academy.devdojo.maratonajava.lista.condicional.exercicio;

// 1) Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
//que C.

import java.util.Scanner;

public class Lista05Pratica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int soma = a + b;

        if (soma > c) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }
    }

}



