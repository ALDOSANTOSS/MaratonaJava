package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista10Pratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Imforme seu peso");
        double peso = sc.nextDouble();
        System.out.println("Imforme sua altura");
        double altura = sc.nextDouble();
        double imc;
        imc = peso / (altura * altura);

        if (imc <= 18.5){
            System.out.println("Magreza");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc > 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        } else if (imc > 30 && imc <= 34.9){
            System.out.println("Obesidade grau 1");
        } else if (imc > 35 && imc <= 39.9){
            System.out.println("Obesidade grau 2");
        } else  {
            System.out.println("Obesidade grau 3");
        }



    }
}
