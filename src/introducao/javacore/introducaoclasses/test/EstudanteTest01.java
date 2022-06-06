package introducao.javacore.introducaoclasses.test;

import introducao.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {


        Estudante estudante = new Estudante();
        estudante.nome = "Aldo";
        estudante.idade = 26;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);




    }
}
