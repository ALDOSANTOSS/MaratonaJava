package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista08Pratica11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Float peso = sc.nextFloat();
        Float altura = sc.nextFloat();
        Float resultado = peso / (altura * altura);

        if (resultado < 18) {
            System.out.println("Magreza");
        } else if (resultado > 18) {
            System.out.println("Normal");


        } else if (resultado < 24) {
            System.out.println("Normal");
        } else if (resultado > 30){
            System.out.println("Obesidade");
        }


    }
}
