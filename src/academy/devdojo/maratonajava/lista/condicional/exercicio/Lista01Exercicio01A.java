package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista01Exercicio01A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ana = sc.nextInt();
        int davi = sc.nextInt();
        int lucas = sc.nextInt();
        int joao = sc.nextInt();
        int pedro = sc.nextInt();
        int idade = ana + davi + lucas + joao + pedro;
        System.out.println(idade);


    }
}
