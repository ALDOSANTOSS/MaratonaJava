package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Pratica10PraticaSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dia = sc.nextLine();
        switch (dia){
            case "Sabado":
                System.out.println("Sabado");
                break;
            case "Domingo":
                System.out.println("Domingo");
                break;
            case "Segunda":
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
