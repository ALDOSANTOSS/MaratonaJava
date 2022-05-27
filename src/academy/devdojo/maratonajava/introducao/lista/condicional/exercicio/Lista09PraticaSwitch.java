package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista09PraticaSwitch {
    // faça um teste
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o estado do dia");

        String dia = scanner.nextLine();

        switch (dia){
            case "Sol":
                System.out.println("Sair de casa");
                break;
            case "Chuva":
                System.out.println("Ficar em casa");
                break;
            default:
                System.out.println("Opcao invalida");
        }

    }
}

