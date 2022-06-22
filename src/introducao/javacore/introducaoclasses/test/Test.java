package introducao.javacore.introducaoclasses.test;

public class Test {

    private static Integer dias;

    private static Double salarioBruto;

    private static Double salarioLiquido;

    public Test() {


    }

    public static void main(String[] args) {


        salarioBruto = Double.valueOf(1000.00);

        salarioLiquido = salarioBruto / dias.intValue();

        System.out.println(salarioLiquido);

    }

}
