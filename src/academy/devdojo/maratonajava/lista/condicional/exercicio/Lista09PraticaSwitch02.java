package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista09PraticaSwitch02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();

        switch (dia) {
            case "Chuva":
                System.out.println("Chuva");
                break;
            case "Sol":
                System.out.println("Sol");
                break;
            default:
                System.out.println("Dia invalido");

        }
    }


}


