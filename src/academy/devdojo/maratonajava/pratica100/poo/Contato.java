package academy.devdojo.maratonajava.pratica100.poo;

public class Contato {

    private String nome;
    private String telefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exebirContato(){
        System.out.println("Telefone: " + this.nome);
        System.out.println("Nome " +this.telefone);
    }


}
