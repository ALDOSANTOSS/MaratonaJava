package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista11PraticaWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        while (numero < 100) {
            numero++;
            System.out.println("Resultado " + numero);
        }
        do {
            System.out.println("Dentro do While");

        } while (numero > 100);
    }
}


