package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista06Pratica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int carro = scanner.nextInt();
        int rada = 60;
        if (carro > rada) {
            System.out.println("Mutado");
        } else {
            System.out.println("Certo");
        }
    }
}
