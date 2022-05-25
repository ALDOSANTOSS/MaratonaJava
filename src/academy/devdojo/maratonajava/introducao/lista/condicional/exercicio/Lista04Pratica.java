package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista04Pratica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int carro = scanner.nextInt();
        int velocidade = 50;

        if (carro > velocidade){
            System.out.println("Mutado");
        } else {
            System.out.println("Certo");
        }
    }
}
