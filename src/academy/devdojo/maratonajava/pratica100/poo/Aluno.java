package academy.devdojo.maratonajava.pratica100.poo;

public class Aluno extends Pessoa {
    private int ra;

    public Aluno(String nome, String cpf, int ra){

        super(nome, cpf);
        this.ra = ra;

    }

    @Override
    public void imprme(){
        System.out.println("Nome: " + this.ra);
    }

}
