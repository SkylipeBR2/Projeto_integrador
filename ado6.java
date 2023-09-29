import java.util.Random;
import java.util.Scanner;

public class ado6 {
    public static void main(String[] args) {
        boolean acerto = false;
        byte tentativas = 3;
        do {
            System.out.printf("Questão 1: \n" +
                    "Qual a raiz quadrada de 4? \n" +
                    "(A) - 8 \n" +
                    "(B) - 5 \n" +
                    "(C) - 4 \n" +
                    "(D) - 10 \n" +
                    "(E) - 30 \n");
            Scanner input = new Scanner(System.in);
            char result = input.next().charAt(0);

            switch (result) {
                case 'A':
                case 'a':
                    System.out.println("Você errou! \n \n");
                    acerto = false;
                    tentativas--;
                    break;
                case 'B':
                case 'b':
                    System.out.println("Parabéns, você acertou!");
                    System.out.println("Você acertou!");
                    acerto = true;
                    break;
                case 'C':
                case 'c':
                    System.out.println("Você errou!");
                    acerto = false;
                    tentativas--;
                    break;
                case 'D':
                case 'd':
                    System.out.println("Você errou!");
                    acerto = false;
                    tentativas--;
                    break;
                case 'E':
                case 'e':
                    System.out.println("Você errou!");
                    acerto = false;
                    tentativas--;
                    break;
                default:
                    System.out.println("Não tem alternativa");
                    acerto = false;
                    tentativas--;
                    break;
            }
        } while (!acerto && tentativas > 0);
            System.out.println("Resposta incorreta nas 3 tentativas");
            System.out.println("NÚMERO DE TENTATIVAS SOBRANDO: " + tentativas);
    }
}
