package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;
/*
Exercício 2:
Um homem decidiu ir à uma revenda comprar um carro.
Ele deseja comprar um carro hatch, e a revenda possui, além de carros hatch, sedans,
motocicletas e caminhonetes. Utilizando uma estrutura switch/case, caso o comprador queira o hatch,
retorne: “Compra efetuada com sucesso”. Nas outras opções, retorne:
 “Tem certeza que não prefere este modelo?”. Caso seja especificado um modelo que não está disponível,
 retorne no console: “Não trabalhamos com este tipo de automóvel aqui”.

 https://www.mundojs.com.br/2019/08/19/exercicio-facil-switch/
 */


import java.util.Scanner;

public class Lista09Switch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carro = sc.nextLine();

        switch (carro){
            case "hatch":
                System.out.println("Compra efetuada com sucesso");
                break;
            case "sedan":
                System.out.println("Tem certeza que não prefere este modelo?");
                break;
            case "motocilentas":
                System.out.println("Tem certeza que não prefere este modelo?");
                break;
            case "caminhonetes":
                System.out.println("Tem certeza que não prefere este modelo?");
                break;
            default:
                System.out.println("Não trabalhamos com este tipo de automóvel aqui");
        }


    }
}
