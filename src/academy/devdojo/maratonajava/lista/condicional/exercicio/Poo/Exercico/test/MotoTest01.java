package academy.devdojo.maratonajava.lista.condicional.exercicio.Poo.Exercico.test;

import academy.devdojo.maratonajava.lista.condicional.exercicio.Poo.Exercico.dominio.Moto;

public class MotoTest01 {
    public static void main(String[] args) {

        Moto moto = new Moto();
        moto.nome = "Honda";
        moto.ano = 2021;
        moto.valor = 2000;
        System.out.println(moto.nome);
        System.out.println(moto.ano);
        System.out.println(moto.valor);
    }
}
