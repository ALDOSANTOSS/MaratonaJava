package introducao.javacore.introducaoclasses.metodos.dominio.test;

import introducao.javacore.introducaoclasses.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisnumeros();
        System.out.println("Finalizando");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando");


    }
}
