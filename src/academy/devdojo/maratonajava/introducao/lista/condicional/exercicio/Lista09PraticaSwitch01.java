package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista09PraticaSwitch01 {

    // qual o dia da semama

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dia = scanner.nextLine();


        switch (dia){
            case "Domingo":
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");

        }

    }
}
