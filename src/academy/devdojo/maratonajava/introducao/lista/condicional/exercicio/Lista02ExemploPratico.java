package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista02ExemploPratico {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 19) {
            System.out.println("Verdade");
        } else {
            System.out.println("Mentira");
        }
    }
}


