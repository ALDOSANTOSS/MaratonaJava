package introducao.javacore.introducaoclasses.dominio;

public class Calculadora {


    public void somaDoisnumeros() {
        System.out.println(10 + 10);

    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);


    }

    public double diviveDoisNumeros(double num1, double num2) {
        if (num2 == 0) {

            return 0;

        }
        return num1 / num1;
    }





}
