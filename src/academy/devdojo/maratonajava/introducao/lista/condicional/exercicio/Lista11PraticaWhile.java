package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

/*
Numeros pares

 */

import java.util.Scanner;

public class Lista11PraticaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        while (numero < 10){
            numero+=2;
            System.out.println(numero);
        }



    }
}
