package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista03Pratica01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int velecidade = scanner.nextInt();
        int rada = 60;

        if (velecidade > rada) {
            System.out.println("Mutado");
        } else {
            System.out.println("Certo");
        }
    }
}

