import java.sql.SQLOutput;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1) Qual é o significado de POO?");
        System.out.println("A) Programa Orçamento");
        System.out.println("B) Programa Orientado a Objetos");
        System.out.println("C) Programa Objeto Orientável");
        System.out.println("D) Paradigma Orientado a Objeto");
        System.out.println("E) Programação de Objeto Ordenado");

        for (int i = 0; i <= 2; i++){
            System.out.println(".");
        }

        System.out.println("Qual alternativa está correta? ");
        char report = input.next().charAt(0);

        switch (report){
            case 'b':
            case 'B':
                System.out.println("Resposta Correta, Parabéns!");
                break;
            default:
                System.out.println("Resposta Incorreta!");
        }
    }
}
