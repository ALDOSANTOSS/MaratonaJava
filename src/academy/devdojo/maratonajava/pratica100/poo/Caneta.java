package academy.devdojo.maratonajava.pratica100.poo;

public class Caneta {

    String marca;
    String cor;
    boolean tampada;

    void tampa(){
        tampada = true;

    }
    void destampada(){
        tampada = false;
    }

    void escrevendo(){
        if (tampada == true){
            System.out.println("Caneta esta tampada");
        } else {
            System.out.println("Esta destampada");
        }

    }
}
