package academy.devdojo.maratonajava.lista.condicional.exercicio;

import java.util.Scanner;

public class Lista09PraticaSwitch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruta = sc.nextLine();
        switch (fruta){
            case "Maca":
                System.out.println("Aqui está,sao 3 reais do quilo");
                break;
            case "Kiwi":
                System.out.println("Estamos com escassez de kiwis");
                break;
            default:
                System.out.println("Nao vendemos esta fruta aqui");
        }

    }
}
