import java.util.Random;
import java.util.Scanner;

public class ado6 {
    public static void main(String[] args) {
        System.out.printf("Questão 1: \n" +
                "Qual a raiz quadrada de 4? \n" +
                "(A) - 8 \n" +
                "(B) - 5 \n" +
                "(C) - 4 \n " +
                "(D) - 10 \n" +
                "(E) - 30");
        Scanner input = new Scanner(System.in);
        char result = input.next().charAt(0);

        boolean acerto = false;

        do {
            switch (result) {
                case 'A':
                case 'a':
                    System.out.println("Você errou!");
                    acerto = false;
                    break;
                case 'B':
                case 'b':
                    System.out.println("Você acertou!");
                    acerto = true;
                    break;
                case 'C':
                case 'c':
                    System.out.println("Você errou!");
                    acerto = false;
                    break;
                case 'D':
                case 'd':
                    System.out.println("Você errou!");
                    acerto = false;
                    break;
                case 'E':
                case 'e':
                    System.out.println("Você errou!");
                    acerto = false;
                    break;
                default:
                    System.out.println("Não tem alternativa");
                    acerto = false;
            }
        } while (!acerto);
            System.out.println("Parabéns");

    }
}
