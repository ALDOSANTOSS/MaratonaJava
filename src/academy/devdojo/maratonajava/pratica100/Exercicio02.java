package academy.devdojo.maratonajava.pratica100;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digete um numero");

        int numero = sc.nextInt();

        for (numero = 0; numero <= 100; numero++){

            if (numero == 10){
                System.out.println("Voce acertou");
            } else {
                System.out.println("Voce erro");
            }

        }
    }
}


