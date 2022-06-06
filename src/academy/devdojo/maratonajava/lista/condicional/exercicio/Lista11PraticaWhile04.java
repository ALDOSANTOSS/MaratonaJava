package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista11PraticaWhile04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros = sc.nextInt();
        while (numeros < 10){
            numeros++;
            System.out.println(numeros);
        }
    }
}
