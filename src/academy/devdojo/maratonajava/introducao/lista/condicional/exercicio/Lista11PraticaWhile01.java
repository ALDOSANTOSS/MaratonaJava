package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista11PraticaWhile01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        while (numero < 100 ){
            numero+=3;
            System.out.println(numero);

        }
    }
}
