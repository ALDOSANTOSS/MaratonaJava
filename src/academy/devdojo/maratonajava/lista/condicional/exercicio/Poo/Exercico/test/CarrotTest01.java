package academy.devdojo.maratonajava.lista.condicional.exercicio.Poo.Exercico.test;

import academy.devdojo.maratonajava.lista.condicional.exercicio.Poo.Exercico.dominio.Carro;

public class CarrotTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Gol";
        carro.ano = 1900;
        carro.valor = 10.000;

        System.out.println(carro.ano);
        System.out.println(carro.nome);
        System.out.println(carro.valor);
    }
}
