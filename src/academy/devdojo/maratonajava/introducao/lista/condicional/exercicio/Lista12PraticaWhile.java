package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista12PraticaWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        while (numero < 100) {
            numero+=2;
            if (numero == 10)
                continue;
            System.out.println(numero);
        }
    }
}
