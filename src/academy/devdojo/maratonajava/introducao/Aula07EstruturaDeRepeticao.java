package academy.devdojo.maratonajava.introducao;

public class Aula07EstruturaDeRepeticao {
    public static void main(String[] args) {

        // while, do while, for

        int numero = 0;
        while (numero < 100) {
            System.out.println(numero);
            numero = numero + 2;
        }
        do {
            System.out.println("Dentro do While");

        } while (numero > 100);

        for (int numero1=0; numero1 < 10; numero1++){
            System.out.println("Respota do for "+numero1);
        }



    }

}