package academy.devdojo.maratonajava.pratica100.poo;

import java.util.Scanner;

public class ContatoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do contato :");
        String nome = sc.next();
        System.out.println("Informe o nome do telefone :");
        String fone = sc.next();

        Contato c1 = new Contato();
        c1.setNome(nome);
        c1.setTelefone(fone);
        c1.exebirContato();








    }
}
