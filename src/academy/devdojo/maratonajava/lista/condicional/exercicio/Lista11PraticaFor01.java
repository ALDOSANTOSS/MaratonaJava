package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista11PraticaFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for (numero = 0; numero < 10; numero++) {
            System.out.println(numero);
        }do {
            System.out.println("Fora os 10");

        } while(numero > 100);
    }
}




