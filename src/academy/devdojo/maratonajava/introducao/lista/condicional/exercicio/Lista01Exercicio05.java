package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista01Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = sc.nextDouble();
        double altura = sc.nextDouble();
        double imc;
        imc = peso / (altura * altura);

        if(peso < 18.5){
            System.out.println("Magreza");
        } else if (imc > 18.6 && imc < 24.5){
            System.out.println("Normal");
        } else if (imc > 25 && imc < 29) {
            System.out.println("Sobrepeso");
        } else if (imc > 30 && imc < 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc > 35 && imc < 39.9) {
            System.out.println("Obesidade grau II");
        } else  {
            System.out.println("Obesidade grau III");
        }




    }



}
