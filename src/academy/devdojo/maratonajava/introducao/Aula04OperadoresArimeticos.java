package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresArimeticos {
    public static void main(String[] args) {

        // + - / *

        int numero01 = 10;
        int numero02 = 10;
        int resultado = numero01 + numero02;
        System.out.println("Resultado = " + resultado);


        // resto %

        int resto = 21 % 2;
        System.out.println(resto);

        // <> <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // && = e (AND) // (or) !

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4621;
        boolean isDentroDaMenorQueTrinta = idade < 30 && salario >= 3200;
        boolean isDentroDaLei = idade < 30 && salario <= 3000;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaMenorQueTrinta);
        System.out.println(isDentroDaLei);

        // logico OR

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlayCincoCompravel " + isPlayCincoCompravel);

        // Atribuicao += -+ *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --

        int contador = 0;
        contador += 1; // contador = contador
        contador++;
        contador--;
        System.out.println(contador);


    }


}

