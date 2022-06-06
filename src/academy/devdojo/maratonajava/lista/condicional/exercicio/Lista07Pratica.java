package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista07Pratica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int rada = 60;
        int velocidade = scanner.nextInt();
        if (velocidade > rada){
            System.out.println("Mutado");
        } else {
            System.out.println("Certo");
        }

    }
}


