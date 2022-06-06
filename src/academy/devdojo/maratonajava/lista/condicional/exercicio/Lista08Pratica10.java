package academy.devdojo.maratonajava.lista.condicional.exercicio;
// 1) Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
//que C.

import java.util.Scanner;

public class Lista08Pratica10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a + b;

        if (c < d) {
            System.out.println("verdade");
        } else {
            System.out.println("Mentira");
        }


    }
}
