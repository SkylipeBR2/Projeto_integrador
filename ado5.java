import java.sql.SQLOutput;
import java.util.Scanner;

public class ado5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean x = false;
        do {
            System.out.printf("1 - Instruções \n" +
                    "2 - Jogar \n" +
                    "3 - Créditos \n" +
                    "4 - Sair \n");
            byte result = input.nextByte();
                switch (result) {
                    case 1:
                        System.out.printf("COMO FAZER BOLO \n" +
                                "1 - Bata as claras em neve e reserve. \n" +
                                "2 - Misture as gemas, a margarina e o açúcar até obter uma massa homogênea. \n" +
                                "3 - Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater. \n" +
                                "4 - Por último, adicione as claras em neve e o fermento. \n" +
                                "5 - Despeje a massa em uma forma grande de furo central untada e enfarinhada. \n" +
                                "6 - Asse em forno médio 180 °C, preaquecido, por aproximadamente 40 minutos ou ao furar o bolo com um garfo, este saia limpo.");
                        break;
                    case 2:
                        System.out.printf("VAMOS COMEÇAR! \n" +
                                "Quanto é 2x2? ");
                        int respota1 = 2 * 2;
                        int respota_pergunta = input.nextInt();
                        if (respota_pergunta == respota1) {
                            System.out.println("Você acertou! \n");
                        } else {
                            System.out.println("Você errou! \n");
                        }
                        break;
                    case 3:
                        System.out.println("\n BY Filipe Angelo \n");
                        break;
                    case 4:
                        System.out.println("\nTchau!\n");
                        x = true;
                        break;
                    default:
                        System.out.println("\nNÃO RECONHEÇO!\n");
                }
            } while (!x);
            System.out.println("BYE BYE");
        }
}
