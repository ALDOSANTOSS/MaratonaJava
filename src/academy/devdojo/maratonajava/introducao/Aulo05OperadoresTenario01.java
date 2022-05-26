package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aulo05OperadoresTenario01 {

    public static void main(String[] args) {
        // doar se salario > 5000

        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextInt();
        String mensagemDoar = "Eu vou doar 500 pra Aldo";
        String mensagemNaoDoar = "Ainda nao tenho condiçao, mais vou ter!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
