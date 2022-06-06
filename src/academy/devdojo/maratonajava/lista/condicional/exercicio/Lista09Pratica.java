package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista09Pratica {
    /*
    Rada
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velocidade = sc.nextInt();
        int rada = 60;
        if (velocidade > rada){
            System.out.println("Mutado");
        } else {
            System.out.println("Certo");
        }
    }
}
