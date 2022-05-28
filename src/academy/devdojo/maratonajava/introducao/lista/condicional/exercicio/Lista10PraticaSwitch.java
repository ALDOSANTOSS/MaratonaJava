package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista10PraticaSwitch {

    public static void main(String[] args) {
        // Dia de sol ou chuva

        Scanner scanner = new Scanner(System.in);

        String dia = scanner.nextLine();

        switch (dia) {
            case "Sol":
                System.out.println("Dia de sol");
                break;
            case "Chuva":
                System.out.println("Dia de chuva");
                break;
            default:
            System.out.println("Dia invalido");
        }
    }
}

