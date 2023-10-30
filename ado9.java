import java.util.Random;
import java.util.Scanner;
public class ado9 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite um valor mínimo: ");
            int min = entrada.nextInt();
            System.out.println("Digite um valor máximo: ");
            int max = entrada.nextInt();

            if (max < min) {
                int temp = max;
                max = min;
                min = temp;
            }
            Random aleatorio = new Random();
            int a = aleatorio.nextInt((max - min + 1)) + min;
            int b = aleatorio.nextInt((max - min + 1)) + min;

            System.out.println("A equação é: " + a + "x + " + b + " = 0");

            if(a != 0) {
                float resultado = -b / (float) a;
                System.out.println("O valor de X é: " + resultado);
            } else {
                System.out.println("'a' é igual a zero. ");
            }
            entrada.close();
        }
    }

