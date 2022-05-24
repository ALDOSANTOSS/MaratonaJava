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


    }


}

