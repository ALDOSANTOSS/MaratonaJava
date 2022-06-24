package academy.devdojo.maratonajava.pratica100.poo;

public abstract class Pessoa {
    private String nome;
    private String cpf;

    Pessoa(){

    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimi(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
    }

    public abstract void imprme();
}

