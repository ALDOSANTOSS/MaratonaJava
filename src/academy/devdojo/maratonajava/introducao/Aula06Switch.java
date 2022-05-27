package academy.devdojo.maratonajava.introducao;

public class Aula06Switch {
    public static void main(String[] args) {

        // imprimao dia da semana, considerando 1 como domingo

        byte dia = 5;
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

