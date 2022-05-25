package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista03Prartica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aluno = scanner.nextInt();
        int nota = 5;
        if (aluno > nota){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
