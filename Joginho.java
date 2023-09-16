import java.util.Random;
import java.util.Scanner;

public class Joginho {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite um número de 1 até 999: ");
            int valor = input.nextInt();

            Random random = new Random();
            int entrada = random.nextInt(1001);
            System.out.println(entrada);

            if (valor == entrada) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");
            }


    }
}
