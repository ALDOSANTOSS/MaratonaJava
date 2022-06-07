package academy.devdojo.maratonajava.lista.condicional.exercicio.Poo.Exercico.test;

import academy.devdojo.maratonajava.lista.condicional.exercicio.Poo.Exercico.dominio.PcGamer;

public class PcGamerTest {

    public static void main(String[] args) {
        PcGamer pcGamer = new PcGamer();
        pcGamer.marca = "Asus";
        pcGamer.valor = 1000;
        pcGamer.ano = 2022;

        System.out.println(pcGamer.ano);
        System.out.println(pcGamer.marca);
        System.out.println(pcGamer.valor);
    }

}
