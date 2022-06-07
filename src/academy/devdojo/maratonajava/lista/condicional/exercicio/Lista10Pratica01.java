package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista10Pratica01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informme seu peso");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura");
        double altura = sc.nextDouble();
        double imc;
        imc = peso / (altura * altura);
        if (imc <= 18.5){
            System.out.println("Magreza");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc > 25.0 && imc <= 29.9) {
            System.out.println("SOBREPESO");
        }else if (imc > 30.0 && imc <= 39.9) {
            System.out.println("OBESIDADE");
        } else {
            System.out.println("OBESIDADE GRAVE");
        }

    }
}
