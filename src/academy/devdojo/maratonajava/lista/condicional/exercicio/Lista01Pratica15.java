package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista01Pratica15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Imforme a velocidade");
        int velocidade = sc.nextInt();
        int rada = 50;
        if (velocidade > rada){
            System.out.println("Mutado");
        } else {
            System.out.println("Na medida");
        }
    }
}
