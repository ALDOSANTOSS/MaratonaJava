package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista01Exercicio01B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 0;
        int total = 0;
        int i = 0;
        System.out.println("Programa que soma a idades");
        while (i < 5){
            i++;
            System.out.println("Informe a idade da"+i+"Pessoa");
            idade = sc.nextInt();
            total = total+idade;
        }
        System.out.println("Total da soma :" +total);

    }
}
