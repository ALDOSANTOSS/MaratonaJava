package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista10PraticaSwitch04 {

    public static void main(String[] args) {
        System.out.println("Informe o dia");
        Scanner sc = new Scanner(System.in);

        String dia = sc.nextLine();
        switch (dia){
            case "Sol":
                System.out.println("Dia de sol");
                break;
            case "Chuva":
                System.out.println("Dia de chuva");
                break;
            default:
                System.out.println("Dia invaladido");
        }

    }
}
