package academy.devdojo.maratonajava.introducao;

public class Aula06Switch {
    public static void main(String[] args) {

        // O switch case é uma estrutura de decisão usada quando
        // precisamos testar condições para determinar qual função será executada em seguida

        // switch (expressão): é onde passamos a variável de teste que servirá de referência para as comparações que o
        // programa deve fazer;

        // case: é onde definimos o valor que será comparado com a variável de teste e o código que será executado caso
        // sejam compatíveis;

        // break: é a declaração opcional de quebra;

        // default: é a declaração opcional padrão, na qual definimos o código que deve ser executado, se nenhum dos
        // valores declarados nos cases for compatível com o valor passado na variável de teste.

        // imprimao dia da semana, considerando 1 como domingo

        

        byte dia = 7;
        switch (dia){
                case 1:
                System.out.println("Domingo");
                break;
                case 2:
                System.out.println("Segunda");
                break;
                case 3:
                System.out.println("Ter");
                break;
                case 4:
                System.out.println("Quar");
                break;
                case 5:
                System.out.println("Quin");
                break;
                case 6:
                System.out.println("Sex");
                break;
                case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Dia errado");
        }
    }
}

