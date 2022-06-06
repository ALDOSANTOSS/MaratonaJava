package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista11PraticaWhile03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero= sc.nextInt();
        while (numero < 10){
            numero+=2;
            System.out.println(numero);
        }

    }
}
