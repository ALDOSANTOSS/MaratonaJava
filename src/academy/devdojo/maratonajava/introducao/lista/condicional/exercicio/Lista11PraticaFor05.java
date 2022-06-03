package academy.devdojo.maratonajava.introducao.lista.condicional.exercicio;

public class Lista11PraticaFor05 {
    public static void main(String[] args) {
        for (int carro = 0; carro <= 10; carro++){
            if(carro == 4)
                continue;
            System.out.println(carro);
        }
    }
}
