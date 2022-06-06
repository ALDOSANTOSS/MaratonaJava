package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista01Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int then = sc.nextInt();
        if (then < 20) {
            System.out.println("Weird");
        } else if (then > 5) {
            System.out.println("");
        }


        {
            System.out.println("Not Weird");
        }


    }

}
