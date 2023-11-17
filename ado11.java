import java.util.Random;
import java.util.Scanner;

public class ado11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Caminho Minado!");
        System.out.print("Informe o tamanho do caminho: ");
        int tamanhoCaminho = scanner.nextInt();

        while (tamanhoCaminho <= 1) {
            System.out.println("O tamanho do caminho deve ser maior que 1. Tente novamente.");
            System.out.print("Informe o tamanho do caminho: ");
            tamanhoCaminho = scanner.nextInt();
        }

        System.out.print("Informe a quantidade de bombas: ");
        int quantidadeBombas = scanner.nextInt();

        while (quantidadeBombas <= 0 || quantidadeBombas >= tamanhoCaminho) {
            System.out.println("A quantidade de bombas deve ser maior que 0 e menor que o tamanho do caminho. Tente novamente.");
            System.out.print("Informe a quantidade de bombas: ");
            quantidadeBombas = scanner.nextInt();
        }

        int[] caminho = new int[tamanhoCaminho];
        inicializarCaminho(caminho, quantidadeBombas);

        int pontuacao = 0;
        boolean jogoEncerrado = false;

        while (!jogoEncerrado) {
            imprimirCaminho(caminho);

            System.out.print("Escolha uma posição: ");
            int escolha = scanner.nextInt();

            if (caminho[escolha] == 0) {
                if (temBombaProxima(caminho, escolha)) {
                    System.out.println("Cuidado: bomba próxima!");
                }

                caminho[escolha] = 1;
                pontuacao++;
            } else {
                System.out.println("Você já escolheu essa posição. Tente novamente.");
            }

            if (caminho[escolha] == -1) {
                jogoEncerrado = true;
                System.out.println("Game Over!");
            } else if (pontuacao == (tamanhoCaminho - quantidadeBombas)) {
                jogoEncerrado = true;
                System.out.println("Parabéns, você ganhou o jogo!");
            }
        }

        imprimirCaminhoCompleto(caminho);
        System.out.println("Pontuação: " + pontuacao + " de " + (tamanhoCaminho - quantidadeBombas));
        scanner.close();
    }

    private static void inicializarCaminho(int[] caminho, int quantidadeBombas) {
        Random random = new Random();

        for (int i = 0; i < quantidadeBombas; i++) {
            int posicaoBomba = random.nextInt(caminho.length);

            while (caminho[posicaoBomba] == -1) {
                posicaoBomba = random.nextInt(caminho.length);
            }

            caminho[posicaoBomba] = -1;
        }
    }

    private static void imprimirCaminho(int[] caminho) {
        for (int valor : caminho) {
            if (valor == 0) {
                System.out.print("_ ");
            } else if (valor == 1) {
                System.out.print("x ");
            } else if (valor == -1) {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    private static void imprimirCaminhoCompleto(int[] caminho) {
        for (int valor : caminho) {
            if (valor == 0) {
                System.out.print("_ ");
            } else if (valor == 1) {
                System.out.print("x ");
            } else if (valor == -1) {
                System.out.print("b ");
            }
        }
        System.out.println();
    }

    private static boolean temBombaProxima(int[] caminho, int escolha) {
        if (escolha > 0 && caminho[escolha - 1] == -1) {
            return true;
        }

        if (escolha < caminho.length - 1 && caminho[escolha + 1] == -1) {
            return true;
        }

        return false;
    }
}
