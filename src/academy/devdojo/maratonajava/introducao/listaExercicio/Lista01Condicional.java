package academy.devdojo.maratonajava.introducao.listaExercicio;

import java.util.Scanner;

public class Lista01Condicional {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int permitido = 60;
        int velocidade = scanner.nextInt();

        if (permitido <= velocidade) {
            System.out.println("multado");
        } else {
            System.out.println("ok");
        }

    }
}


